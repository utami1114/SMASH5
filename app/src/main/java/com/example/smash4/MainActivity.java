package com.example.smash4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    private Fragment fragment;
    private FragmentManager fragmentManager;
private Button shareButton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView navView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_camera, R.id.navigation_calculation, R.id.navigation_map, R.id.navigation_history)
                .build();

        NavController navController = Navigation.findNavController(this,R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this,navController,appBarConfiguration);
        NavigationUI.setupWithNavController(navView,navController);

    ;}



    public void onButton (View view){
        //Editの取得
        EditText eT1 = (EditText)findViewById(R.id.eT1);
        EditText eT2 = (EditText)findViewById(R.id.eT2);

        //Edit⇒String
        String str1 = eT1.getText().toString();
        String str2 = eT2.getText().toString();

        //数値に変換
        int num1= Integer.parseInt(str1);
        int num2= Integer.parseInt(str2);

        //足し算
        int sum = num1 + num2;
        ((TextView)findViewById(R.id.tvAns)).setText("" + sum);
    }



    public void onClear (View view){
        ((EditText)findViewById(R.id.eT1)).getText().clear();
        ((EditText)findViewById(R.id.eT2)).getText().clear();
        ((TextView)findViewById(R.id.tvAns)).setText("Answer");
    }}










