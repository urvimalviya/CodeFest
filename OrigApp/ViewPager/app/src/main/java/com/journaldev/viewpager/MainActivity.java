package com.journaldev.viewpager;

import android.content.Intent;
import android.support.v4.view.*;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);
        viewPager.setAdapter(new CustomPagerAdapter(this));

        

        Button trainingBtn = (Button) findViewById(R.id.trainingBtn);
        Button nutritionBtn = (Button) findViewById(R.id.nutritionBtn);


        nutritionBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent activityChangeIntent = new Intent(MainActivity.this, NutritionActivity.class);
                MainActivity.this.startActivity(activityChangeIntent);
            }
        }
        );
    }

}
