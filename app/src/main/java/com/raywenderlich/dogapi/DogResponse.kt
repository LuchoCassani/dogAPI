package com.raywenderlich.dogapi

import com.google.gson.annotations.SerializedName

// params in data class, must be the same than te API
//@serializedName is used to modify param names

data class DogResponse (
    @SerializedName ("status") var  status:String,
    @SerializedName("message") var image:List<String>)