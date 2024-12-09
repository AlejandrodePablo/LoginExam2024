package edu.iesam.loginexam1eval.features.login.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import edu.iesam.loginexam1eval.R
import edu.iesam.loginexam1eval.databinding.UserFormFragmentBinding
import edu.iesam.loginexam1eval.databinding.WelcomeBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class UserFormFragment : Fragment() {

    private val viewModel: UserViewModel by viewModel()

    private var _binding: UserFormFragmentBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = UserFormFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.layout.action.setOnClickListener {
            getUser()
        }

    }

    private fun getUser() {
        val username = binding.layout.username.text.toString()
        val password = binding.layout.password.text.toString()
        viewModel.userCreated(username, password)
        val observer = Observer<UserViewModel.UiState> {
            if (it.isSuccess == true) {
                navigateToWelcome()
            }
        }
        viewModel.uiState.observe(viewLifecycleOwner, observer)
    }

    private fun navigateToWelcome() {
        findNavController().navigate(R.id.action_from_login_to_welcome)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}