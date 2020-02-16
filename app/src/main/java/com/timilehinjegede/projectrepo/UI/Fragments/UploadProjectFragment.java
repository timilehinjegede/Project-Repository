package com.timilehinjegede.projectrepo.UI.Fragments;


import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.timilehinjegede.projectrepo.R;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class UploadProjectFragment extends Fragment {


    private static final int REQUEST_CODE = 1;

    public UploadProjectFragment() {
        // Required empty public constructor
    }

    CheckBox githubCheckBox;
    Spinner levelSpinner, categorySpinner ;
    TextInputEditText gitHubLinkEditText;
    TextView chooseFile;
    TextInputLayout gitHublinkLayout;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_upload_project, container, false);

        githubCheckBox = view.findViewById(R.id.githubCheckBox);
        levelSpinner = view.findViewById(R.id.levelSpinner);
        categorySpinner = view.findViewById(R.id.categorySpinner);
        gitHubLinkEditText =  view.findViewById(R.id.gitHubLinkEditText);
        chooseFile = view.findViewById(R.id.chooseFile);
        gitHublinkLayout = view.findViewById(R.id.gitHublinkLayout);

        levelSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String myLevel = adapterView.getItemAtPosition(i).toString();

                switch (myLevel){
                    case "100":
                        myLevel= "100";
                        break;
                    case "200":
                        myLevel= "200";
                        break;
                    case "300":
                        myLevel= "300";
                        break;
                    case "400":
                        myLevel= "400";
                        break;
                    case "A'Levels":
                        myLevel= "A'Levels";
                        break;
                }
//                Toast.makeText(getContext(),myLevel,Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        List<String> level = new ArrayList<>();
        level.add("100");
        level.add("200");
        level.add("300");
        level.add("400");
        level.add("A'Levels");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(getContext(),
                android.R.layout.simple_spinner_item,
                level);

        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        levelSpinner.setAdapter(arrayAdapter);


        categorySpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String myCategory = adapterView.getItemAtPosition(i).toString();

                switch (myCategory){
                    case "100":
                        myCategory= "100";
                        break;
                    case "200":
                        myCategory= "200";
                        break;
                    case "300":
                        myCategory= "300";
                        break;
                    case "400":
                        myCategory= "400";
                        break;
                    case "A'Levels":
                        myCategory= "A'Levels";
                        break;
                }
//                Toast.makeText(getContext(),myCategory,Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        List<String> category = new ArrayList<>();
        category.add("Marketing");
        category.add("Science");
        category.add("Writing");
        category.add("Technology");
        category.add("Mathematics");
        category.add("Engineering");
        category.add("Social Science");

        ArrayAdapter<String> arrayAdapter1 = new ArrayAdapter<>(getContext(),
                android.R.layout.simple_spinner_item,
                category);

        arrayAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        categorySpinner.setAdapter(arrayAdapter1);

        if (githubCheckBox.isChecked()){
            Log.i("workkk","FUCKIT");
            gitHubLinkEditText.setVisibility(View.VISIBLE);
            gitHublinkLayout.setVisibility(View.VISIBLE);
        }else{
            gitHubLinkEditText.setVisibility(View.GONE);
            gitHublinkLayout.setVisibility(View.GONE);
        }

        chooseFile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showFileChooser();
            }
        });

        return view;
    }

    public void showFileChooser(){
        Intent intent = new Intent(Intent.ACTION_GET_CONTENT);
        intent.setType("*/*");
        intent.addCategory(Intent.CATEGORY_OPENABLE);
        intent.putExtra(Intent.EXTRA_LOCAL_ONLY,true);
        startActivityForResult(intent,REQUEST_CODE);
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
    }
}
