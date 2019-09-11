package com.example.myandroidproject;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;


/**
 * A simple {@link Fragment} subclass.
 */
public class web_nav_bottom_three_fragment extends Fragment {


    public web_nav_bottom_three_fragment() {
        // Required empty public constructor
    }


    WebView webView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v=inflater.inflate(R.layout.fragment_web_nav_bottom_three, container, false);


        String path=getArguments().getString("path_three");

        webView=v.findViewById(R.id.nav_web_three);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebChromeClient(new WebChromeClient());
        webView.loadUrl(path);


        return v;
    }

}
