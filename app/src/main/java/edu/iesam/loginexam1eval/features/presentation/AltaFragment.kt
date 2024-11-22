package edu.iesam.loginexam1eval.features.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import edu.iesam.loginexam1eval.databinding.FragmentAltaBinding

class AltaFragment: Fragment() {


    private val _binding: FragmentAltaBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        FragmentAltaBinding.inflate(inflater, container, false)
        return binding.root
    }
    fun showMessage(){
        val text = binding.alta
    }
}