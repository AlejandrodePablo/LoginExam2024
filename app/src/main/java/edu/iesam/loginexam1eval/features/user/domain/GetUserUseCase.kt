package edu.iesam.loginexam1eval.features.user.domain

class GetUserUseCase(private val userRepository: UserRepository) {
    suspend operator fun invoke(name: String): User? {
        return userRepository.getUser(name)
    }
}