package com.example.android.popupmenue;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class EmailActivity extends AppCompatActivity {
    EditText sub ,to, message;
    Button send;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email);
        send=findViewById(R.id.button);
        sub=findViewById(R.id.editText);
        to=findViewById(R.id.editText2);
        message = findViewById(R.id.editText3);

        send.setOnClickListener((View v) -> {


                    String email_add = to.getText().toString();
                    String msg = message.getText().toString();
                    String subject = sub.getText().toString();
                    Intent intent = new Intent(Intent.ACTION_SENDTO);
                    intent.setData(Uri.parse("mailto:")); // only email apps should handle this


                    intent.putExtra(Intent.EXTRA_EMAIL, email_add);
                    intent.putExtra(Intent.EXTRA_SUBJECT, subject);
                    intent.putExtra(Intent.EXTRA_TEXT, msg);
                    try {
                        startActivity(intent);
                    } catch (ActivityNotFoundException e) {
                        // Only browser apps are available, or a browser is the default.
                        // So you can open the URL directly in your app, for example in a
                        // Custom Tab.
                        //openInCustomTabs(url);
                        Toast.makeText(this, getString(R.string.activityerr), Toast.LENGTH_SHORT).show();
                    }
                }
        );
    }

}