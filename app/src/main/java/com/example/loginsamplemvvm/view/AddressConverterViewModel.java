package com.example.loginsamplemvvm.view;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.util.Log;

import androidx.annotation.RequiresApi;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.loginsamplemvvm.model.PlacesModel;
import com.example.loginsamplemvvm.repositories.Repositories;
import com.example.loginsamplemvvm.service.PlacesAPI;

import java.util.List;

public class AddressConverterViewModel extends ViewModel {
    private Repositories repositories;
    private Context context;

    public void init(Context context){
        this.context = context;
        repositories = Repositories.getInstance();
    }

    public LiveData<List<PlacesModel.Datum>> getLocation(String latitude, String longitude){
        return repositories.getLocation(latitude + "," + longitude);
    }
}
