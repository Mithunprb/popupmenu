package com.example.android.popupmenue;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;


import android.Manifest;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SmsActivity extends AppCompatActivity {

    EditText phonenumber,message;
    Button send;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        ActivityCompat.requestPermissions(this,new String[]{
                Manifest.permission.SEND_SMS},1);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sms);
        send=findViewById(R.id.button);
        phonenumber=findViewById(R.id.editText);
        message=findViewById(R.id.editText2);
        send.setOnClickListener((View v) ->  {


                    String number=phonenumber.getText().toString();
                    String msg=message.getText().toString();
                    try {
                        SmsManager smsManager= SmsManager.getDefault();
                        smsManager.sendTextMessage(number,null,msg,null,null);
                        Toast.makeText(getApplicationContext(),"Message Sent", Toast.LENGTH_LONG).show();
                    }catch (Exception e)
                    {
                        Toast.makeText(getApplicationContext(),e + "please try again!",Toast.LENGTH_LONG).show();
                    }
                }
        );
    }

}