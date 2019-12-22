package com.cingu.laptop.dua.activity;

import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.cingu.laptop.dua.R;
import com.cingu.laptop.dua.fragment.CommentFragment;
import com.cingu.laptop.dua.fragment.HomeFragment;
import com.cingu.laptop.dua.fragment.UserFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.firebase.iid.FirebaseInstanceId;

public class MainActivity extends AppCompatActivity {
    //    public static final String URL = "http://10.10.23.142:8000/";
//    public static final String URL = "http://192.168.43.102:8000/";
    public static final String URL = "http://10.10.22.128:8000/";


    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = item -> {
                Fragment selectedFragment = null;
                switch (item.getItemId()) {
                    case R.id.navigation_home:
                        selectedFragment = new HomeFragment();
                        break;
                    case R.id.navigation_user:
                        selectedFragment = new UserFragment();
                        break;
                    case R.id.navigation_comment:
                        selectedFragment = new CommentFragment();
                        break;
                }
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, selectedFragment).commit();
                return true;
            };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        Log.i("Tokensaya", FirebaseInstanceId.getInstance().getToken());
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new HomeFragment()).commit();
    }
}

