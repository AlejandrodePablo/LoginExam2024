package edu.iesam.loginexam1eval.features.login.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import edu.iesam.loginexam1eval.features.login.domain.SignInUseCase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import org.koin.android.annotation.KoinViewModel

@KoinViewModel
class UserViewModel(private val signInUseCase: SignInUseCase) : ViewModel() {
    private val _uiState = MutableLiveData<UiState>()
    val uiState: LiveData<UiState> get() = _uiState

    fun userCreated(username: String, password: String) {
        viewModelScope.launch(Dispatchers.IO) {
            val response = signInUseCase.invoke(username, password)
            _uiState.postValue(UiState(isSuccess = response))

        }
    }

    data class UiState(
        val isSuccess: Boolean? = false
    )
}