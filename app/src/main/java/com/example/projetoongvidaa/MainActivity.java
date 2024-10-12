package com.example.projetoongvidaa;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    // ViewPager2 viewPagerCarousel;
    //private CarouselAdapter carouselAdapter;

    private Button toAdocao1;
    private Button toAdocao2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toAdocao1 = findViewById(R.id.adotar1);
        toAdocao1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Adocao.class);
                startActivity(intent);
            }
        });

        toAdocao2 = findViewById(R.id.adotar2);
        toAdocao2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Adocao.class);
                startActivity(intent);
            }
        });



        // Initialize ViewPager2
        //viewPagerCarousel = findViewById(R.id.viewPagerCarousel);

        // List of images to display in the carousel
        //List<Integer> images = new ArrayList<>();
        //images.add(R.drawable.image1);  // Ensure these images exist in drawable folder
        //images.add(R.drawable.image2);

        // Set up the adapter and attach it to the ViewPager2
        //carouselAdapter = new CarouselAdapter(this, images);
        //viewPagerCarousel.setAdapter(carouselAdapter);
    }
}
