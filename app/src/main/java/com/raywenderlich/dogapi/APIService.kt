package com.raywenderlich.dogapi

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Url


// Create the method to access our service


interface APIService {
    @GET
   suspend fun getDocsByBreeds(@Url url:String):Response<DogResponse>
}