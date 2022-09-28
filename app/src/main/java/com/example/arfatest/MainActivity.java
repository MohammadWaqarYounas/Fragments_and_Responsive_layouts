package com.example.arfatest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

import com.example.arfatest.Fragments.FirstFragment;
import com.example.arfatest.Fragments.SeocndFragment;
import com.example.arfatest.Fragments.ThirdFragment;

public class MainActivity extends AppCompatActivity {

    FrameLayout linear;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        linear=findViewById(R.id.linear);
    }
    public void home(View v){
        FirstFragment f1= new FirstFragment();
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.linear, f1);
        ft.commit();
    }
    public void loginpage(View v){
        SeocndFragment f2= new SeocndFragment();
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.linear, f2);
        ft.commit();
    }
    public void settings(View v){
        ThirdFragment f3= new ThirdFragment();
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.linear, f3);
        ft.commit();
    }


}