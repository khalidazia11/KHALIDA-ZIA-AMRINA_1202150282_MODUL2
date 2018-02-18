package com.example.khalidaziaamrina.studycase2;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class SplashScreen extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        Toast.makeText(this, "StudyCase2", Toast.LENGTH_SHORT).show();
        Thread thread = new Thread(){
            public void run(){
                try{
                    sleep(5000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }finally {
                    startActivity(new Intent(SplashScreen.this, MenuUtama.class));
                    finish();
                }
            }
        };
        thread.start();
        Intent intent = new Intent(this, SplashScreen.class);
        Toast.makeText(SplashScreen.this, "Khalida Zia Amrina 1202150282", Toast.LENGTH_SHORT).show();
    }


}

