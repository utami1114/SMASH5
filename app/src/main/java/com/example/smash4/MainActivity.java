package com.example.smash4;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.smash4.ui.camera.CameraFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.zxing.integration.android.IntentIntegrator;
import com.google.zxing.integration.android.IntentResult;

public class MainActivity extends AppCompatActivity {

    private Fragment fragment;
    private FragmentManager fragmentManager;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView navView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_camera, R.id.navigation_history, R.id.navigation_map, R.id.navigation_menu)
                .build();


    }

        private void addFragment(Fragment fragment) {
            // フラグメントマネージャーの取得
            FragmentManager manager = getSupportFragmentManager();
            // フラグメントトランザクションの開始
            FragmentTransaction transaction = manager.beginTransaction();
            // MainFragmentを追加
            transaction.add(R.id.navigation_camera,fragment);
            // フラグメントトランザクションのコミット。コミットすることでFragmentの状態が反映される
            transaction.commit();
        }


        //NavController navController = Navigation.findNavController(this, R.id.nav_fragment);
        //NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        //NavigationUI.setupWithNavController(navView, navController);

    }






