package edu.iesam.loginexam1eval.features.login.domain

interface UserRepository {
    suspend fun findByUsername(username: String): User?

    suspend fun saveUser(user: User)
}