package com.example.android.popupmenue;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button button1;

    @SuppressLint("NonConstantResourceId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = findViewById(R.id.button1);
        button1.setOnClickListener(v -> {
            //Creating the instance of PopupMenu
            PopupMenu popup = new PopupMenu(MainActivity.this, button1);
            //Inflating the Popup using xml file
            popup.getMenuInflater()
                    .inflate(R.menu.popup_menu, popup.getMenu());

            //registering popup with OnMenuItemClickListener
            popup.setOnMenuItemClickListener(item -> {
                Toast.makeText(
                        MainActivity.this,
                        "You Clicked : " + item.getTitle(),
                        Toast.LENGTH_SHORT
                ).show();
                switch(item.getItemId()) {
                    case R.id.email:
                        Intent intent = new Intent(this, EmailActivity.class);
                        this.startActivity(intent);
                        break;
                    case R.id.share:
                        // another startActivity, this is for item with id "share"
                        Intent intent1 = new Intent(this, ShareActivity.class);
                        this.startActivity(intent1);
                        break;
                    case R.id.sms:
                        // another startActivity, this is for item with id "sms"
                        Intent intent2 = new Intent(this, SmsActivity.class);
                        this.startActivity(intent2);
                        break;
                    default:
                        return super.onOptionsItemSelected(item);
                }
                return true;
            });

            popup.show(); //showing popup menu
        }); //closing the setOnClickListener method
    }

}
