package com.example.myandroidproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class dashboard extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
    }
    public void cPlusPlusCard(View view)
    {
        String subject;
        subject="c++";
        Intent intent=new Intent(this,sub_dashboard.class);
        intent.putExtra("subject",subject);
        startActivity(intent);
    }
    public void cCard(View view)
    {
        String subject;
        subject="c";
        Intent intent=new Intent(this,sub_dashboard.class);
        intent.putExtra("subject",subject);
        startActivity(intent);
    }
    public void javaCard(View view)
    {
        String subject;
        subject="java";
        Intent intent=new Intent(this,sub_dashboard.class);
        intent.putExtra("subject",subject);
        startActivity(intent);
    }
    public void pythonCard(View view)
    {
        String subject;
        subject="python";
        Intent intent=new Intent(this,sub_dashboard.class);
        intent.putExtra("subject",subject);
        startActivity(intent);
    }


}
