package com.example.myapplication;

import android.graphics.Color;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.myapplication.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
    }

    public void ChangeText(View v){
        TextView tv = (TextView)findViewById(R.id.textview_first);
        tv.setText("Text ChangedAgain");
    }
    public void ChangeColor(View v){
        TextView tv = (TextView)findViewById(R.id.textview_first);
        tv.setTextColor(Color.parseColor(("#E85232")));
    }
}