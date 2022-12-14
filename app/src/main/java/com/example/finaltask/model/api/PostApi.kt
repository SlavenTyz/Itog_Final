package com.example.finaltask.model.api

import com.example.finaltask.model.database.Post
import retrofit2.Response
import retrofit2.http.GET

interface PostApi {
    @GET("posts")
    suspend fun getPosts(): Response<List<Post>>
}