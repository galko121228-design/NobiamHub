package org.levimc.launcher.ui.activities;

import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import org.levimc.launcher.R;

public class MainActivityNew extends AppCompatActivity {

    private View homeContent, settingsContent, aboutContent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_new);

        homeContent = findViewById(R.id.home_content);
        settingsContent = findViewById(R.id.settings_content);
        aboutContent = findViewById(R.id.about_content);

        findViewById(R.id.nav_tab_launch).setOnClickListener(v -> showTab(0));
        findViewById(R.id.nav_tab_settings).setOnClickListener(v -> showTab(1));
        findViewById(R.id.nav_tab_about).setOnClickListener(v -> showTab(2));
    }

    private void showTab(int tab) {
        homeContent.setVisibility(tab == 0 ? View.VISIBLE : View.GONE);
        settingsContent.setVisibility(tab == 1 ? View.VISIBLE : View.GONE);
        aboutContent.setVisibility(tab == 2 ? View.VISIBLE : View.GONE);
    }
}
