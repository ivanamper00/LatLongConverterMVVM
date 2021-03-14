package com.example.loginsamplemvvm.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.loginsamplemvvm.R;


public class AddressConverterActivity extends AppCompatActivity implements View.OnClickListener {
    private AddressConverterViewModel addressConverterViewModel;
    private EditText latitude;
    private EditText longitude;
    private Button button;
    private TextView place;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initInitialize();
        initComponents();
    }

    private void initInitialize() {
        latitude = findViewById(R.id.latitude);
        longitude = findViewById(R.id.longitude);
        button = findViewById(R.id.button);
        place = findViewById(R.id.place);

        addressConverterViewModel = new ViewModelProvider(this).get(AddressConverterViewModel.class);
        addressConverterViewModel.init(this);
    }

    private void initComponents() {
        button.setOnClickListener(this::onClick);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button :
                String lat = latitude.getText().toString();
                String lon = longitude.getText().toString();
                addressConverterViewModel.getLocation(lat, lon).observe(this, result -> {
                    if(result != null){
                        place.setText(result.get(0).getLabel());
                    }else{
                        Toast.makeText(this, "No Result", Toast.LENGTH_SHORT).show();
                    }
                });
                break;
        }
    }
}