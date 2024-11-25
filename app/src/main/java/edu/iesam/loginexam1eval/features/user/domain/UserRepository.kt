package edu.iesam.loginexam1eval.features.user.domain

interface UserRepository {
    suspend fun getUser(name: String): User?
    suspend fun getUsers(): List<User>
}