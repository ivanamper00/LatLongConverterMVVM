package com.example.loginsamplemvvm.repositories;

import android.util.Log;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.example.loginsamplemvvm.model.PlacesModel;
import com.example.loginsamplemvvm.service.PlacesAPI;
import com.example.loginsamplemvvm.service.RetrofitService;
import com.example.loginsamplemvvm.utils.Constant;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Repositories {
    private static Repositories instance;

    public static Repositories getInstance(){
        if(instance == null){
            instance = new Repositories();
        }
        return instance;
    }

    public MutableLiveData<List<PlacesModel.Datum>> getLocation(String latLong){
        Log.d("QWEQWE", latLong);
        MutableLiveData<List<PlacesModel.Datum>> data = new MutableLiveData<>();
        RetrofitService.retrofitService(PlacesAPI.class, Constant.PLACES_BASE_URL)
                        .getPlaces(Constant.PLACES_API_KEY, latLong)
                        .enqueue(new Callback<PlacesModel>() {
            @Override
            public void onResponse(Call<PlacesModel> call, Response<PlacesModel> response) {
                if(response.body() != null){
                    data.setValue(response.body().getData());
                }else{
                    data.setValue(null);
                }
            }

            @Override
            public void onFailure(Call<PlacesModel> call, Throwable t) {
                Log.d("Error", String.valueOf(t.getMessage()));
            }
        });
        return data;
    }
}
