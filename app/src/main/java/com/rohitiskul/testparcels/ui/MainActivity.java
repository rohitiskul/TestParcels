package com.rohitiskul.testparcels.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.rohitiskul.testparcels.R;
import com.rohitiskul.testparcels.model.Category;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private static final String jsonCategory = "[{\"categoryId\":3,\"name\":\"Clothing\",\"categoryCode\":\"cloth\",\"isActive\":true,\"appImage\":\"Clothing.jpg\"},{\"categoryId\":4,\"name\":\"Fine and Casual Dine\",\"categoryCode\":\"fidine\",\"isActive\":true,\"appImage\":\"finedine.jpg\"},{\"categoryId\":5,\"name\":\"Movies\",\"categoryCode\":\"Movie\",\"isActive\":true,\"appImage\":\"Movie.jpg\"}]";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //In actual project, this list is fetched from server
        Type listType = new TypeToken<List<Category>>() {
        }.getType();

        ArrayList<Category> category = new Gson().fromJson(jsonCategory, listType);
        getSupportFragmentManager().beginTransaction().replace(android.R.id.content,
                HomeFragment.getInstance(category.get(0))).commit();

    }
}
