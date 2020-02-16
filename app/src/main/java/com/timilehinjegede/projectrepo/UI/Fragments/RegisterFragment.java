package com.timilehinjegede.projectrepo.UI.Fragments;


import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.provider.MediaStore;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.timilehinjegede.projectrepo.R;
import com.timilehinjegede.projectrepo.UI.Activities.MainActivity;


/**
 * A simple {@link Fragment} subclass.
 */
public class RegisterFragment extends Fragment {


    private static final int REQUEST_IMAGE_CAPTURE = 1;

    public RegisterFragment() {
        // Required empty public constructor
    }

    Button signUpButton,takePictureButton;
    TextView logInTextView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_register, container, false);

        signUpButton = view.findViewById(R.id.signUpButton);
        logInTextView = view.findViewById(R.id.logInTextView);
        takePictureButton = view.findViewById(R.id.takePictureButton);

        signUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getContext(), MainActivity.class));
            }
        });


        String logInString = "Already have an account? SignIn";

        SpannableString spannableString = new SpannableString(logInString);

        ClickableSpan clickableSpan = new ClickableSpan() {
            @Override
            public void onClick(@NonNull View widget) {
                Fragment fragment = new LoginFragment();
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

        takePictureButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(intent,REQUEST_IMAGE_CAPTURE);
            }
        });

        spannableString.setSpan(clickableSpan, 25,31, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        logInTextView.setText(spannableString);
        logInTextView.setMovementMethod(LinkMovementMethod.getInstance());

        return view;
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
    }
}
