package com.aboulfalah.quizapp_c;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        //Initialize fragment
        Fragment fragment = new MaapFragment();
        //open fragment
        getSupportFragmentManager()
                .beginTransaction().replace(R.id.frame_layoot,fragment)
                .commit();
    }
}