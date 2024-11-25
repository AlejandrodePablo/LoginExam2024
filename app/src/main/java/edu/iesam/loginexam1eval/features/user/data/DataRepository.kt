package edu.iesam.loginexam1eval.features.user.data

import edu.iesam.loginexam1eval.features.user.data.local.LoginXmlLocalDataSource
import edu.iesam.loginexam1eval.features.user.domain.User
import edu.iesam.loginexam1eval.features.user.domain.UserRepository

class DataRepository(private val local: LoginXmlLocalDataSource) : UserRepository {
    override suspend fun getUser(name: String): User? {
        return local.findByName(name)
    }

    override suspend fun getUsers(): List<User> {
        return local.findAll()
    }

}