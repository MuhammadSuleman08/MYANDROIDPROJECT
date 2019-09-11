package com.example.myandroidproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class web_nav_activity extends AppCompatActivity {

    private String subject;
    private String pathTutorialsPoint,pathW3Schools,pathGeeksForGeeks;
    web_nav_bottom_one_fragment one;
    web_nav_bottom_two_fragment two;
    web_nav_bottom_three_fragment three;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_nav_activity);

        Intent intent=getIntent();
        subject=intent.getStringExtra("path");


        pathTutorialsPoint="";
        pathW3Schools="";
        pathGeeksForGeeks="";
        //deciding the subject and setting the links according to it
        subjectDecide(subject);

        //creating the fragment
        one=new web_nav_bottom_one_fragment();
        two=new web_nav_bottom_two_fragment();
        three=new web_nav_bottom_three_fragment();

        Bundle args=new Bundle();

        args.putString("path_one",pathTutorialsPoint);
        args.putString("path_two",pathW3Schools);
        args.putString("path_three",pathGeeksForGeeks);
        one.setArguments(args);
        two.setArguments(args);
        three.setArguments(args);

        //setting the bottom navigation bar
        BottomNavigationView bottomNavigationView=findViewById(R.id.nav_activity);
        bottomNavigationView.setOnNavigationItemSelectedListener(navListener);

        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,one).commit();

    }

    //function to decide the subject
    private void subjectDecide(String subject)
    {


        if(subject.equals("c++"))
        {
            pathTutorialsPoint="https://www.tutorialspoint.com/cplusplus/index.htm";
            pathW3Schools="https://www.w3schools.com/cpp/";
            pathGeeksForGeeks="https://www.geeksforgeeks.org/c-plus-plus/";

        }
        else
        {
            if(subject.equals("c"))
            {
                pathTutorialsPoint="https://www.tutorialspoint.com/cprogramming/";
                pathW3Schools="https://www.w3schools.in/c-tutorial/intro/";
                pathGeeksForGeeks="https://www.geeksforgeeks.org/c-programming-language/";
            }
            else
            {
                if(subject.equals("java"))
                {
                    pathTutorialsPoint="https://www.tutorialspoint.com/java/index.htm#";
                    pathW3Schools="https://www.w3schools.com/java/";
                    pathGeeksForGeeks="https://www.geeksforgeeks.org/java/";
                }else
                {
                    pathTutorialsPoint="https://www.tutorialspoint.com/python/index.htm";
                    pathW3Schools="https://www.w3schools.com/python/";
                    pathGeeksForGeeks="https://www.geeksforgeeks.org/python-programming-language/";
                }
            }
        }
    }
    //one=tutorials point
    //two=w3 schools
    //three=geeks for geeks
    private  BottomNavigationView.OnNavigationItemSelectedListener navListener=
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                    switch (menuItem.getItemId())
                    {
                        case R.id.nav_tutorialpoint:
                            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,one).commit();
                            break;
                        case R.id.nav_w3schools:
                            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,two).commit();
                            break;
                        case R.id.nav_geeeks:
                            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,three).commit();
                            break;
                    }
                    return true;

                }
            };



}
