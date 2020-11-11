package com.example.ltapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG,"onCreate");

    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG,"onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG,"onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG,"onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG,"onStop");
    }


    public void clickHandler(View view) {
        //Toast.makeText(this, "Welcome Pritha", Toast.LENGTH_SHORT).show();
        Log.e(TAG,"clickHandler");
        Intent hIntent = new Intent(MainActivity.this,HomeActivity.class);
        /*EditText nameEditText;
        nameEditText=findViewById(R.id.editTextName);
        String input=nameEditText.getText().toString();
        TextView welcomeTextView;
        welcomeTextView=findViewById(R.id.textViewwelcome);
        welcomeTextView.setText(input);
        */
       /* switch (view.getId()){
            case R.id.buttonLogin:
                startHome();
                break;
            case R.id.button2:
                Intent dialIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:9999999"));
                //"//http://www.google.com"));
                startActivity(dialIntent);
                break;
        }*/



    }

    private void startHome() {
        Intent hIntent =new Intent(MainActivity.this, HomeActivity.class);
        hIntent.putExtra("mykey","Pritha");
        int c = add(10,20);
        startActivity(hIntent);
    }

    private int add(int a,int b) {
        return a+b;
    }
}