package edu.iesam.loginexam1eval.features.login.data

import edu.iesam.loginexam1eval.features.login.data.local.LoginXmlLocalDataSource
import edu.iesam.loginexam1eval.features.login.domain.User
import edu.iesam.loginexam1eval.features.login.domain.UserRepository
import org.koin.core.annotation.Single

@Single
class UserDataRepository(private val local: LoginXmlLocalDataSource) : UserRepository {
    override suspend fun findByUsername(username: String): User? {
        return local.findByUsername(username)
    }

    override suspend fun saveUser(user: User) {
        return local.save(user)
    }
}