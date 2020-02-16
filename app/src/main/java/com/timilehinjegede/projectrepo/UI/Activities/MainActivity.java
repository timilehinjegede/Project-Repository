package com.timilehinjegede.projectrepo.UI.Activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.timilehinjegede.projectrepo.R;
import com.timilehinjegede.projectrepo.UI.Fragments.AccountFragment;
import com.timilehinjegede.projectrepo.UI.Fragments.HomeFragment;
import com.timilehinjegede.projectrepo.UI.Fragments.UploadProjectFragment;

public class MainActivity extends AppCompatActivity {

    FrameLayout mainFrameLayout;
    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainFrameLayout = findViewById(R.id.mainFrameLayout);
        bottomNavigationView = findViewById(R.id.bottomNav);

        getSupportFragmentManager().beginTransaction().replace(R.id.mainFrameLayout,new HomeFragment()).commit();

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()){
                    case R.id.home:
                        getSupportFragmentManager().beginTransaction().replace(R.id.mainFrameLayout,new HomeFragment()).commit();
                        break;
                    case R.id.upload:
                        getSupportFragmentManager().beginTransaction().replace(R.id.mainFrameLayout,new UploadProjectFragment()).commit();
                        break;
                    case R.id.account:
                        getSupportFragmentManager().beginTransaction().replace(R.id.mainFrameLayout,new AccountFragment()).commit();
                        break;
                }

                return false;
            }
        });
    }
}
