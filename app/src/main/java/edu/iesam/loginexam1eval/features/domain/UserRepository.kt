package edu.iesam.loginexam1eval.features.domain

interface UserRepository {
    suspend fun getUser(id: String): User
}