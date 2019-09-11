package com.example.myandroidproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class youtube_tutorials_sub extends AppCompatActivity {

    String subject;
    TextView subName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_youtube_tutorials_sub);

        Intent intent=getIntent();
        subject=intent.getStringExtra("subject_name");
        subName=findViewById(R.id.text_sub_name);
        subName.setText(subject);



    }
    public void beginnerButton(View view)
    {
        String path ="";
        Intent intent=new Intent(this,youtube_web_view_activity.class);
        if(subject.equals("c++"))
        {
            path="https://www.youtube.com/results?search_query=c%2B%2B+beginner+cources";
            intent.putExtra("path",path);
            startActivity(intent);


        }
        else
        {
            if(subject.equals("c"))
            {
                path="https://www.youtube.com/results?search_query=c+beginner+cources";
                intent.putExtra("path",path);
                startActivity(intent);
            }
            else
            {
                if(subject.equals("java"))
                {
                    path="https://www.youtube.com/results?search_query=java+beginner+cources";
                    intent.putExtra("path",path);
                    startActivity(intent);
                }
                else
                {
                    if(subject.equals("python"))
                    {
                        path="https://www.youtube.com/results?search_query=python+beginner+cources";
                        intent.putExtra("path",path);
                        startActivity(intent);
                    }
                }
            }

        }
    }

    public void intermediateButon(View view)
    {
        String path ="";
        Intent intent=new Intent(this,youtube_web_view_activity.class);
        if(subject.equals("c++"))
        {
            path="https://www.youtube.com/results?search_query=c%2B%2B+intermediate+course";
            intent.putExtra("path",path);
            startActivity(intent);


        }
        else
        {
            if(subject.equals("c"))
            {
                path="https://www.youtube.com/results?search_query=c+intermediate+course";
                intent.putExtra("path",path);
                startActivity(intent);
            }
            else
            {
                if(subject.equals("java"))
                {
                    path="https://www.youtube.com/results?search_query=java+intermediate+course";
                    intent.putExtra("path",path);
                    startActivity(intent);
                }
                else
                {
                    if(subject.equals("python"))
                    {
                        path="https://www.youtube.com/results?search_query=python+intermediate+course";
                        intent.putExtra("path",path);
                        startActivity(intent);
                    }
                }
            }

        }
    }

    public void expertButton(View view)
    {
        String path ="";
        Intent intent=new Intent(this,youtube_web_view_activity.class);
        if(subject.equals("c++"))
        {
            path="https://www.youtube.com/results?search_query=c%2B%2B+expert+course";
            intent.putExtra("path",path);
            startActivity(intent);


        }
        else
        {
            if(subject.equals("c"))
            {
                path="https://www.youtube.com/results?search_query=c+expert+course";
                intent.putExtra("path",path);
                startActivity(intent);
            }
            else
            {
                if(subject.equals("java"))
                {
                    path="https://www.youtube.com/results?search_query=java+expert+course";
                    intent.putExtra("path",path);
                    startActivity(intent);
                }
                else
                {
                    if(subject.equals("python"))
                    {
                        path="https://www.youtube.com/results?search_query=python+expert+course";
                        intent.putExtra("path",path);
                        startActivity(intent);
                    }
                }
            }

        }
    }
}
