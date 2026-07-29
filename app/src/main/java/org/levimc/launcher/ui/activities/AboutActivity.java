package org.levimc.launcher.ui.activities;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.widget.TextView;

import org.levimc.launcher.R;
import org.levimc.launcher.ui.animation.DynamicAnim;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class AboutActivity extends BaseActivity {


    private final ExecutorService executor = Executors.newSingleThreadExecutor();
    private final OkHttpClient client = new OkHttpClient();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        setupNavBar();
        setupLinks();


        DynamicAnim.applyPressScaleRecursively(findViewById(android.R.id.content));
    }


private void setupLinks() {
        TextView btn = findViewById(R.id.btn_telegram);
        if (btn != null) {
            btn.setOnClickListener(v -> {
                try {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://t.me/NobiamOS")));
                } catch (Exception ignored) {}
            });
        }
    }
    @Override
    protected void onResume() {
        super.onResume();
        setActiveNavTab(R.id.nav_tab_about);
    }
    private void setupNavBar() {
        setActiveNavTab(R.id.nav_tab_about);
        findViewById(R.id.nav_tab_about).setOnClickListener(v -> {});
    }



    private void setupLinkButton(int viewId, String url) {
        TextView btn = findViewById(viewId);
        if (btn == null) return;
        btn.setOnClickListener(v -> {
            try {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(url)));
            } catch (Exception ignored) {}
        });
        DynamicAnim.applyPressScale(btn);
    }
}
