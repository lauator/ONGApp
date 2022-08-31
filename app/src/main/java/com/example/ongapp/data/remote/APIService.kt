package com.example.ongapp.data.remote

import com.example.ongapp.data.model.ActivityResponse
import com.example.ongapp.data.model.NewResponse
import com.example.ongapp.data.model.TestimonialResponse
import com.example.ongapp.data.model.WelcomeResponse
import retrofit2.Response
import retrofit2.http.GET

interface APIService {

    @GET("slides")
    suspend fun getWelcomeImages() : Response<WelcomeResponse>

    @GET("news")
    suspend fun getNews() : Response<NewResponse>

    @GET("testimonials")
    suspend fun getTestimonials() : Response<TestimonialResponse>

    @GET("activities")
    suspend fun getActivities() : Response<ActivityResponse>
}