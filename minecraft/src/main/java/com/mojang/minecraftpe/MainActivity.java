package com.mojang.minecraftpe;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity implements View.OnKeyListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public boolean onKey(View v, int keyCode, android.view.KeyEvent event) {
        return false;
    }
}
