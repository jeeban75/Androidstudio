package com.example.myapplication;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

import java.lang.reflect.Array;

public class signup extends AppCompatActivity {

  //  String[] country= {"India","Sri Lanka","Bhutan","Myanmmar","Africa","Ghana","Britan","UK","Greenland","Nepal","Usa","Russia","Azerbizan","Canada","france","israel","Norway","Afghanistan"};

    Button Blogin,Bsignup,Breset;
    RadioGroup gender_select;
    RadioButton selected;
    EditText first_name,last_name,code,mobile_no,email,password,confirm_password;
    Spinner select_country;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        addListenerOnButtom();
        gender_select = findViewById(R.id.gender_id);

        first_name = (EditText)findViewById(R.id.Efirst_name);
        last_name = (EditText)findViewById(R.id.Elast_name);
        code = (EditText)findViewById(R.id.Ecode);
        mobile_no = (EditText)findViewById(R.id.Emobile_no);
        email = (EditText)findViewById(R.id.Eemail);
        password = (EditText)findViewById(R.id.Esignup_password);
        confirm_password = (EditText)findViewById(R.id.Econfirm_password);


    }


    public void checkButton(View v)
    {
        int selection = gender_select.getCheckedRadioButtonId();
        selected = findViewById(selection);
        if(selection ==-1)
        {
            Toast.makeText(getApplicationContext(),"nothing",Toast.LENGTH_SHORT);
        }
        else
        {
            Toast.makeText( getApplicationContext(), selected.getText() ,Toast.LENGTH_SHORT);
        }
    }
    public  void addListenerOnButtom(){
        final Context context = this;
        Blogin= (Button) findViewById(R.id.login_id);

        Blogin.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                Intent intent = new Intent(context, Login.class);
                     startActivity(intent);
            }
        });



        Breset = (Button) findViewById(R.id.reset_id);

        Breset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                 first_name.setText("");
                last_name.setText("");
                email.setText("");
                confirm_password.setText("");
                password.setText("");
                code.setText("");
                mobile_no.setText("");
                first_name.requestFocus();
            }
        });




        Bsignup =(Button) findViewById(R.id.signup_id);
        Bsignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String fname= first_name.getText().toString();
                String lname= last_name.getText().toString();
                String getEmail= email.getText().toString();
                String getPassword= password.getText().toString();
                String confirmPassword= confirm_password.getText().toString();
                if(fname.isEmpty() || lname.isEmpty() || getEmail.isEmpty() || getPassword.isEmpty() || confirmPassword.isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Fill all the details", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(getApplicationContext(), "Sign Up successful", Toast.LENGTH_SHORT).show();
                }
                }
        });

    }
}