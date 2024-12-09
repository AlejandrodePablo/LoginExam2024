package edu.iesam.loginexam1eval

import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.NavHostFragment
import edu.iesam.loginexam1eval.databinding.ActivityMainBinding
import edu.iesam.loginexam1eval.features.login.presentation.UserViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel
import kotlin.math.log


class MainActivity : AppCompatActivity() {

    private var _binding: ActivityMainBinding? = null
    val binding get() = _binding!!


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupNavigation()
    }

    /**
     * Método de prueba para acceder a los elementos de la vista
     */
    private fun setupView() {
        val username = findViewById<EditText>(R.id.username).text.toString()
        val password = findViewById<EditText>(R.id.password).text.toString()
        val reminderIsChecked = findViewById<CheckBox>(R.id.reminder).isChecked
        findViewById<Button>(R.id.action).setOnClickListener {
            //Hago algo con los datos
        }
    }

    private fun setupNavigation() {
        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.nav_main) as NavHostFragment
    }
}