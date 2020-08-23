package jpabon.com.countmein.data.remote

import jpabon.com.countmein.data.entities.User
import retrofit2.http.GET

interface CountmeinApi {

    @GET("users")
    suspend fun getAllUsers(): Response<List<User>>

    @GET("users/{user_id}")
    suspend fun getUser(user_id: String): Response<User>
}