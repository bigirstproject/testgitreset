package com.sunsun.testgitrest;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class BActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        showLog();
    }
    @Override
    protected void onRestart() {
        super.onRestart();
    }

    private void showLog(){

    }
}
