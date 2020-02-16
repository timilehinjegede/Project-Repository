package com.timilehinjegede.projectrepo.UI.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.FrameLayout;

import com.timilehinjegede.projectrepo.R;
import com.timilehinjegede.projectrepo.UI.Fragments.LoginFragment;
import com.timilehinjegede.projectrepo.UI.Fragments.RegisterFragment;

public class WelcomeActivity extends AppCompatActivity {

    FrameLayout frameLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        frameLayout = findViewById(R.id.mFrameLayout);

        getSupportFragmentManager().beginTransaction().add(R.id.mFrameLayout, new RegisterFragment()).commit();
    }
}
