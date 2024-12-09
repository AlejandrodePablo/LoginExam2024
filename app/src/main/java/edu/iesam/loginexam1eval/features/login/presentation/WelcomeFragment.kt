package edu.iesam.loginexam1eval.features.login.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import edu.iesam.loginexam1eval.databinding.WelcomeBinding

class WelcomeFragment : Fragment() {

    private var _binding: WelcomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = WelcomeBinding.inflate(inflater, container, false)
        return binding.root
    }
}