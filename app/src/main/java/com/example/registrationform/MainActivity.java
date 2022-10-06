package com.example.registrationform;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onRegisterbtnClick(View view){
        TextView txtFirstName=findViewById(R.id.tv1);
        TextView txtLastName=findViewById(R.id.tv2 );
        TextView txtEmail=findViewById(R.id.tv3);

        EditText edtTextFirstName=findViewById(R.id.editTextTextPersonName1);
        EditText edtTxtLastName= findViewById(R.id.editTextTextPersonName2);
        EditText edtEmail=findViewById(R.id.editTextTextPersonName3);
        txtFirstName.setText("First Name: " +edtTextFirstName.getText().toString());
        txtLastName.setText("Last Name: "+edtTxtLastName.getText().toString() );
        txtEmail.setText("Email: "+ edtEmail.getText().toString());
    }
}