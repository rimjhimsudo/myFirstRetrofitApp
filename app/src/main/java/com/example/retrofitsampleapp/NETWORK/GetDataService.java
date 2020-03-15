package com.example.retrofitsampleapp.NETWORK;

import com.example.retrofitsampleapp.MODEL.RetroPhoto;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

//in medium, it ia.java file
public interface GetDataService {
    @GET("/photos")

    //Call<List<RetroPhoto>> getallPhotos();

    Call<List<RetroPhoto>> getAllPhotos();
}
