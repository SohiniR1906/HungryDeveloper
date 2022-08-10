package com.example.thehungrydeveloper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class StartersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starters);

        ListView startersList=findViewById(R.id.list_view_starters);

        Dish[] dishes= {
                new Dish("Carbonara Pasta", "Very Delicious!", 899),
        new Dish("Carbonara Pasta", "Very Delicious!", 899),
        new Dish("Aglio Olio Pasta", "Very Delicious!", 899),
        new Dish("Penne pesto", "Very Delicious!", 899),
        new Dish("Mac n cheese", "Very Delicious!", 899),
        new Dish("Chicken Bolognese", "Very Delicious!", 899),
        new Dish("Chicken wings", "Very Delicious!", 899),
        new Dish("French fries", "Very Delicious!", 899),
        new Dish("Fish fry", "Very Delicious!", 899),
        new Dish("Stuffed garlic bread", "Very Delicious!", 899),
        new Dish("mozzarella melt", "Very Delicious!", 899),
        };
        ArrayAdapter<Dish> dishesAdapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1, dishes);

        startersList.setAdapter(dishesAdapter);


    }
}