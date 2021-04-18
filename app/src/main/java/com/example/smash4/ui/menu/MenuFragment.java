package com.example.smash4.ui.menu;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.smash4.R;

public class MenuFragment extends Fragment {

    private MenuViewModel notificationsViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        notificationsViewModel =
                new ViewModelProvider(this).get(MenuViewModel.class);
        View root = inflater.inflate(R.layout.fragment_menu, container, false);
       // final TextView textView = root.findViewById(R.id.text_notifications);
        //notificationsViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
         //   @Override
           // public void onChanged(@Nullable String s) {
             //   textView.setText(s);



        return root;



    }



            public void onButton(View view){
            //Editの取得
                  EditText eT1 = (EditText)view.findViewById(R.id.eT1);
                EditText eT2 = (EditText)view.findViewById(R.id.eT2);

                      //Edit⇒String
                    String str1 = eT1.getText().toString();
                  String str2 = eT2.getText().toString();

                      //数値に変換
                    int num1= Integer.parseInt(str1);
                  int num2= Integer.parseInt(str2);

                      //足し算
                    int sum = num1 + num2;
                  ((TextView)view.findViewById(R.id.tvAns)).setText("a" + sum);
            }

                  public void onClear(View view){
                    ((EditText)view.findViewById(R.id.eT1)).getText().clear();
                  ((EditText)view.findViewById(R.id.eT2)).getText().clear();
                ((TextView)view.findViewById(R.id.tvAns)).setText("Answer");
                   }


}