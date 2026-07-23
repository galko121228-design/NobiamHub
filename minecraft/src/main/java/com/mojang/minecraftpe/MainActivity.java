package com.mojang.minecraftpe;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity implements View.OnKeyListener {

    // Статическая ссылка для DateTimeHelper
    public static MainActivity mInstance;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mInstance = this;
    }

    // Метод для HardwareInformation
    public boolean isChromebook() {
        return false; // Всегда false, так как мы не на Chromebook
    }

    @Override
    public boolean onKey(View v, int keyCode, android.view.KeyEvent event) {
        return false;
    }
}
