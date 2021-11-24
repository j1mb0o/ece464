package com.example.ece464project;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.ece464project.databinding.ActivityFeedbackBinding;

public class Feedback extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;
    private ActivityFeedbackBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityFeedbackBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setSupportActionBar(binding.toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        CheckBox anon = findViewById(R.id.cbAnon);
        EditText editname = findViewById(R.id.etName);
        EditText editmail = findViewById(R.id.etMail);

        anon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(anon.isChecked()){
                    editname.setText(null);
                    editmail.setText(null);
                    editname.setEnabled(false);
                    editmail.setEnabled(false);
                }
                else{
                    editname.setEnabled(true);
                    editmail.setEnabled(true);
                }
            }
        });

        binding.fab1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Intent in = new Intent(this,HomeFragment.class);
//                startActivity(in);
//                Toast.makeText(getApplicationContext(), "Thank you for your feedback", Toast.LENGTH_LONG).show();
            }
        });
    }

}