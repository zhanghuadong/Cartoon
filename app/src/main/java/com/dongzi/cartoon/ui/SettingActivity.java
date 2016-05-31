package com.dongzi.cartoon.ui;

import android.annotation.TargetApi;
import android.app.FragmentManager;
import android.os.Build;
import android.os.Bundle;
import android.preference.PreferenceFragment;

import com.dongzi.cartoon.R;


public class SettingActivity extends BaseFrameWorkActivity {

    private SettingsFragment mSettingsFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_setting);
        if (savedInstanceState == null) {
            mSettingsFragment = new SettingsFragment();
            replaceFragment(R.id.fl_setting, mSettingsFragment);
        }
    }


    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public void replaceFragment(int viewId, android.app.Fragment fragment) {
        FragmentManager fragmentManager = getFragmentManager();
        fragmentManager.beginTransaction().replace(viewId, fragment).commit();
    }

    public static class SettingsFragment extends PreferenceFragment {

        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            addPreferencesFromResource(R.xml.preferences);
        }
    }
}
