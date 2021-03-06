package com.timilehinjegede.projectrepo.UI.Fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.timilehinjegede.projectrepo.Adapters.ProjectAdapter;
import com.timilehinjegede.projectrepo.Model.Project;
import com.timilehinjegede.projectrepo.R;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {


    View view;
    RecyclerView projectRecyclerView;
    ProjectAdapter projectAdapter;
    ArrayList<Project> projectList;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_home, container, false);

        projectList = new ArrayList<>();

        projectRecyclerView = view.findViewById(R.id.projectRecyclerView);

        //Dummy Data
        projectList.add(
                new Project("This is a project to detect fake number plates in Nigeria","This is a project to detect fake number plates in Nigeria,This is a project to detect fake number plates in NigeriaThis is a project to detect fake number plates in NigeriaThis is a project to detect fake number plates in Nigeria,This is a project to detect fake number plates in NigeriaThis is a project to detect fake number plates in Nigeria","","","Technology",""));
        projectList.add(
                new Project("This is a project to detect fake number plates in Nigeria","This is a project to detect fake number plates in Nigeria,This is a project to detect fake number plates in NigeriaThis is a project to detect fake number plates in NigeriaThis is a project to detect fake number plates in Nigeria,This is a project to detect fake number plates in NigeriaThis is a project to detect fake number plates in Nigeria","","","Technology",""));
        projectList.add(
                new Project("This is a project to detect fake number plates in Nigeria","This is a project to detect fake number plates in Nigeria,This is a project to detect fake number plates in NigeriaThis is a project to detect fake number plates in NigeriaThis is a project to detect fake number plates in Nigeria,This is a project to detect fake number plates in NigeriaThis is a project to detect fake number plates in Nigeria","","","Technology",""));

        projectList.add(
                new Project("This is a project to detect fake number plates in Nigeria","This is a project to detect fake number plates in Nigeria,This is a project to detect fake number plates in NigeriaThis is a project to detect fake number plates in NigeriaThis is a project to detect fake number plates in Nigeria,This is a project to detect fake number plates in NigeriaThis is a project to detect fake number plates in Nigeria","","","Technology",""));

        projectList.add(
                new Project("This is a project to detect fake number plates in Nigeria","This is a project to detect fake number plates in Nigeria,This is a project to detect fake number plates in NigeriaThis is a project to detect fake number plates in NigeriaThis is a project to detect fake number plates in Nigeria,This is a project to detect fake number plates in NigeriaThis is a project to detect fake number plates in Nigeria","","","Technology",""));

        projectList.add(
                new Project("This is a project to detect fake number plates in Nigeria","This is a project to detect fake number plates in Nigeria,This is a project to detect fake number plates in NigeriaThis is a project to detect fake number plates in NigeriaThis is a project to detect fake number plates in Nigeria,This is a project to detect fake number plates in NigeriaThis is a project to detect fake number plates in Nigeria","","","Technology",""));

        projectList.add(
                new Project("This is a project to detect fake number plates in Nigeria","This is a project to detect fake number plates in Nigeria,This is a project to detect fake number plates in NigeriaThis is a project to detect fake number plates in NigeriaThis is a project to detect fake number plates in Nigeria,This is a project to detect fake number plates in NigeriaThis is a project to detect fake number plates in Nigeria","","","Technology",""));

        projectList.add(
                new Project("This is a project to detect fake number plates in Nigeria","This is a project to detect fake number plates in Nigeria,This is a project to detect fake number plates in NigeriaThis is a project to detect fake number plates in NigeriaThis is a project to detect fake number plates in Nigeria,This is a project to detect fake number plates in NigeriaThis is a project to detect fake number plates in Nigeria","","","Technology",""));

        projectList.add(
                new Project("This is a project to detect fake number plates in Nigeria","This is a project to detect fake number plates in Nigeria,This is a project to detect fake number plates in NigeriaThis is a project to detect fake number plates in NigeriaThis is a project to detect fake number plates in Nigeria,This is a project to detect fake number plates in NigeriaThis is a project to detect fake number plates in Nigeria","","","Technology",""));

        projectList.add(
                new Project("This is a project to detect fake number plates in Nigeria","This is a project to detect fake number plates in Nigeria,This is a project to detect fake number plates in NigeriaThis is a project to detect fake number plates in NigeriaThis is a project to detect fake number plates in Nigeria,This is a project to detect fake number plates in NigeriaThis is a project to detect fake number plates in Nigeria","","","Technology",""));


        projectAdapter = new ProjectAdapter(projectList,getContext());
        projectRecyclerView.setLayoutManager(new LinearLayoutManager(getContext(),RecyclerView.VERTICAL,false));
        projectRecyclerView.setAdapter(projectAdapter);

        return view;
    }

}
