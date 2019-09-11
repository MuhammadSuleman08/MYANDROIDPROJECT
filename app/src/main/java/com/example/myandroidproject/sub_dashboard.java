package com.example.myandroidproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class sub_dashboard extends AppCompatActivity {

    private String subject="a";
    TextView sub;
   @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_dashboard);


        Intent intent=getIntent();
        subject=intent.getStringExtra("subject");
        sub=findViewById(R.id.sub_name);
        // sub.setText(subject);

    }

    public void youtubeCard(View view)
    {
        Intent intent=new Intent(this,youtube_tutorials_sub.class);
        intent.putExtra("subject_name",subject);
        startActivity(intent);
    }
    public void pdfCard(View view)
    {
        String path="";
        Intent intent=new Intent(this,pdf_webview_activity.class);

        if(subject.equals("c++"))
        {
            path="https://www.pdfdrive.com/search?q=c%2B%2B&pagecount=&pubyear=&searchin=";
            intent.putExtra("path",path);
            startActivity(intent);
        }
        else
        {
            if(subject.equals("c"))
            {
                path="https://www.pdfdrive.com/c-programming-books.html";
                intent.putExtra("path",path);
                startActivity(intent);
            }
            else
            {
                if(subject.equals("java"))
                {
                    path="https://www.pdfdrive.com/search?q=java+proramming&pagecount=&pubyear=&searchin=&more=true";
                    intent.putExtra("path",path);
                    startActivity(intent);
                }
                else
                {
                    path="https://www.pdfdrive.com/python-books.html";
                    intent.putExtra("path",path);
                    startActivity(intent);
                }
            }
        }
    }
    public void webContantCard(View view)
    {
        Intent intent=new Intent(this,web_nav_activity.class);
        intent.putExtra("path",subject);
        startActivity(intent);
    }
}
