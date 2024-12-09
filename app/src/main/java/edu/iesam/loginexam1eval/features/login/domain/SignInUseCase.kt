package edu.iesam.loginexam1eval.features.login.domain

import android.util.Log
import org.koin.core.annotation.Single

@Single
class SignInUseCase(private val userRepository: UserRepository) {
    suspend operator fun invoke(username: String, password: String): Boolean {
        val user: User? = userRepository.findByUsername(username)
        if (user == null) {
            userRepository.saveUser(User(username, username, password))
            return true
        } else {
            Log.d("@dev", "El usuario ya existe")
            return false
        }
    }
}