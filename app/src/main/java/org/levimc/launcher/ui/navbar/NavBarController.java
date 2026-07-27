package org.levimc.launcher.ui.navbar;

import android.app.Activity;
import android.content.Intent;
import android.view.View;

import org.levimc.launcher.R;
import org.levimc.launcher.ui.activities.AboutActivity;
import org.levimc.launcher.ui.activities.InstancesActivity;
import org.levimc.launcher.ui.activities.MainActivity;
import org.levimc.launcher.ui.activities.SettingsActivity;

public class NavBarController {

    private final Activity activity;

    public NavBarController(Activity activity) {
        this.activity = activity;
    }

    public void setup() {

        View launch = activity.findViewById(R.id.nav_tab_launch);
        View instances = activity.findViewById(R.id.nav_tab_instances);
        View about = activity.findViewById(R.id.nav_tab_about);
        View settings = activity.findViewById(R.id.nav_tab_settings);

        if (launch != null) {
            launch.setOnClickListener(v -> {
                if (!(activity instanceof MainActivity)) {
                    Intent intent = new Intent(activity, MainActivity.class);
                    intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP);
                    activity.startActivity(intent);
                }
            });
        }

        if (instances != null) {
            instances.setOnClickListener(v -> {
                if (!(activity instanceof InstancesActivity)) {
                    activity.startActivity(new Intent(activity, InstancesActivity.class));
                }
            });
        }

        if (about != null) {
            about.setOnClickListener(v -> {
                if (!(activity instanceof AboutActivity)) {
                    activity.startActivity(new Intent(activity, AboutActivity.class));
                }
            });
        }

        if (settings != null) {
            settings.setOnClickListener(v -> {
                if (!(activity instanceof SettingsActivity)) {
                    activity.startActivity(new Intent(activity, SettingsActivity.class));
                }
            });
        }
    }

}
