package com.example.loginsamplemvvm.service;

import com.example.loginsamplemvvm.model.PlacesModel;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface PlacesAPI {

    @GET("reverse")
    Call<PlacesModel> getPlaces(@Query("access_key") String key, @Query("query") String query );
}
