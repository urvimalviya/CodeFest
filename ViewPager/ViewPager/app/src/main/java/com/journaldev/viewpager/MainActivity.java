package com.journaldev.viewpager;

import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends FragmentActivity {
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = (ViewPager) findViewById(R.id.viewpager);
        /*Button btnViewOne = (Button)findViewById(R.id.button);
        Button btnViewTwo = (Button)findViewById(R.id.button2);*/
        viewPager.setAdapter(new CustomPagerAdapter(getSupportFragmentManager()));

        /*btnViewOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("Hello", viewPager.getCurrentItem()+"");
            }
        });*/

    }

}
