package com.example.smash4.ui.camera;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.smash4.R;
import com.google.zxing.integration.android.IntentIntegrator;
import com.google.zxing.integration.android.IntentResult;

public class CameraFragment extends Fragment  {

    private CameraViewModel homeViewModel;




@Override
    public View onCreateView( LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_camera, container, false);





        Button cameraButton = (Button)v. findViewById (R.id.cameraButton);
        cameraButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {



                IntentIntegrator integrator= IntentIntegrator.forSupportFragment(CameraFragment.this);
                integrator.initiateScan();

            }
        });
        homeViewModel =
              new ViewModelProvider(this).get(CameraViewModel.class);



    return v;

    }






    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {



        IntentResult result = IntentIntegrator.parseActivityResult(requestCode, resultCode, data);
        if (result != null) {

        } else {
            super.onActivityResult(requestCode, resultCode, data);
        }
    }
}

