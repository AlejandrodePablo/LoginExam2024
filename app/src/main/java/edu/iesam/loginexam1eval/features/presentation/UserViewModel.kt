package edu.iesam.loginexam1eval.features.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import edu.iesam.loginexam1eval.features.domain.GetUserUseCase
import edu.iesam.loginexam1eval.features.domain.User
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import org.koin.android.annotation.KoinViewModel

@KoinViewModel
class UserViewModel(private val getUserUseCase: GetUserUseCase) : ViewModel() {

    private val _uiState = MutableLiveData<UiState>()
    val uiState: LiveData<UiState> = _uiState

    fun viewCreated(){

        val user = viewModelScope.launch(Dispatchers.IO){
            getUserUseCase.invoke("1")
        }
    }

    data class UiState(
        val isLoading: Boolean = false,
        val user: User
    )
}