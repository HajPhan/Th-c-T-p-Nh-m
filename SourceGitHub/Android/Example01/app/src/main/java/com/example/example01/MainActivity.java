package com.example.example01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    /* Activity launched -> onCreate() -> onStart() -> onResume() -> Activity running -> onPause() -> onStop() -> onDestroy()*/

    // Khởi tạo activity
    /* onCreate -> onStart -> onResume */

    // Khi màn hình ko hiển thị tại thời điểm người dùng sử dụng (khi người dùng chuyển sang activity mới - những vẫn còn trong stack)
    /* onPause */

    // Khi có cuộc gọi điện thoại tới được sử dụng thì activity sẽ
    /* onResume */

    // Khi thiết bị sleep (khóa màn hình)
    /* onPause -> onStop */

    // Khi thiết bị thức (mở khóa màn hình)
    /* onRestart -> onStart -> onResume */

    // Khi thoát activity (khi sử dụng phím back thoát màn hình hiện tại)
    /* onPause -> onStop -> onDestroy */

    Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        /*
         */
        /* hide title *//*

        requestWindowFeature(Window.FEATURE_NO_TITLE);  // will hide the title
        getSupportActionBar().hide();   // hide the title bar

        */
        /* full screen *//*

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);   //enable full screen
*/

        setContentView(R.layout.activity_main);
        Log.i("Example1", "onCreate");
        //TODO

        button1 = findViewById(R.id.button1);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("Example1", "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("Example1", "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("Example1", "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("Example1", "onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("Example1", "onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("Example1", "onDestroy");
    }

    public void onClick(View view) {
        Intent intent = new Intent(MainActivity.this, SeccondActivity.class);
        startActivity(intent);
    }

}
