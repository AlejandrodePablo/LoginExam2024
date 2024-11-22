package edu.iesam.loginexam1eval.features.domain

import org.koin.core.annotation.Single

@Single
class GetUserUseCase(val userRepository: UserRepository) {

    suspend operator fun invoke(id: String): User{
        return userRepository.getUser(id)
    }
}