package com.pradeep.feedpool.api

import com.pradeep.feedpool.models.NewsResponse
import com.pradeep.feedpool.util.Constants.Companion.API_KEY
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface NewsApiService {

    @GET("top-headlines")
    suspend fun getBreakingNews(
        @Query("country") countryCode:String = "in",
        @Query("page") pageNumber: Int=1,
        @Query("apiKey") apiKey:String=API_KEY
    ): Response<NewsResponse>

    @GET("everything")
    suspend fun searchForNews(
        @Query("q") searchQuery:String,
        @Query("page") pageNumber:Int=1,
        @Query("apiKey") apiKey:String=API_KEY
    ): Response<NewsResponse>

}