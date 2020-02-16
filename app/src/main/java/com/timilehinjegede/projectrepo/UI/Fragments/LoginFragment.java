package com.timilehinjegede.projectrepo.UI.Fragments;


import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.timilehinjegede.projectrepo.R;
import com.timilehinjegede.projectrepo.UI.Activities.MainActivity;


/**
 * A simple {@link Fragment} subclass.
 */
public class LoginFragment extends Fragment {

    TextView registerTextView;
    Button singInButton;

    public LoginFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_login, container, false);

        registerTextView = view.findViewById(R.id.registerTextView);
        singInButton = view.findViewById(R.id.singInButton);

        String registerString = "Already have an account? SignUp";

        SpannableString spannableString = new SpannableString(registerString);

        //handle clicks
        ClickableSpan clickableSpan = new ClickableSpan() {
            @Override
            public void onClick(@NonNull View view) {
                Fragment fragment = new RegisterFragment();
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.mFrameLayout,fragment);
                fragmentTransaction.commit();
            }

            @Override
            public void updateDrawState(@NonNull TextPaint ds) {
                super.updateDrawState(ds);
                ds.setColor(getResources().getColor(R.color.colorPrimary));
                ds.setUnderlineText(false);
                ds.bgColor = Color.WHITE;
            }
        };

        singInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), MainActivity.class));
            }
        });

        spannableString.setSpan(clickableSpan,25, 31, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        registerTextView.setText(spannableString);
        registerTextView.setMovementMethod(LinkMovementMethod.getInstance());
        return view;
    }

}
