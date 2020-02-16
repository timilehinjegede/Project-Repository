package com.timilehinjegede.projectrepo.UI.Fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.timilehinjegede.projectrepo.Adapters.ProjectAdapter;
import com.timilehinjegede.projectrepo.Model.Project;
import com.timilehinjegede.projectrepo.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class AccountFragment extends Fragment {

    RecyclerView myProjectsRecyclerView;
    ProjectAdapter projectAdapter;
    ArrayList<Project> projects;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_account, container, false);

        myProjectsRecyclerView = view.findViewById(R.id.myProjectsRecyclerView);

        projects = new ArrayList<>();


        //Dummy Data
        projects.add(
                new Project("This is a project to detect fake number plates in Nigeria","This is a project to detect fake number plates in Nigeria,This is a project to detect fake number plates in NigeriaThis is a project to detect fake number plates in NigeriaThis is a project to detect fake number plates in Nigeria,This is a project to detect fake number plates in NigeriaThis is a project to detect fake number plates in Nigeria","","","Technology",""));
        projects.add(
                new Project("This is a project to detect fake number plates in Nigeria","This is a project to detect fake number plates in Nigeria,This is a project to detect fake number plates in NigeriaThis is a project to detect fake number plates in NigeriaThis is a project to detect fake number plates in Nigeria,This is a project to detect fake number plates in NigeriaThis is a project to detect fake number plates in Nigeria","","","Technology",""));
        projects.add(
                new Project("This is a project to detect fake number plates in Nigeria","This is a project to detect fake number plates in Nigeria,This is a project to detect fake number plates in NigeriaThis is a project to detect fake number plates in NigeriaThis is a project to detect fake number plates in Nigeria,This is a project to detect fake number plates in NigeriaThis is a project to detect fake number plates in Nigeria","","","Technology",""));

        projects.add(
                new Project("This is a project to detect fake number plates in Nigeria","This is a project to detect fake number plates in Nigeria,This is a project to detect fake number plates in NigeriaThis is a project to detect fake number plates in NigeriaThis is a project to detect fake number plates in Nigeria,This is a project to detect fake number plates in NigeriaThis is a project to detect fake number plates in Nigeria","","","Technology",""));

        projects.add(
                new Project("This is a project to detect fake number plates in Nigeria","This is a project to detect fake number plates in Nigeria,This is a project to detect fake number plates in NigeriaThis is a project to detect fake number plates in NigeriaThis is a project to detect fake number plates in Nigeria,This is a project to detect fake number plates in NigeriaThis is a project to detect fake number plates in Nigeria","","","Technology",""));

        projects.add(
                new Project("This is a project to detect fake number plates in Nigeria","This is a project to detect fake number plates in Nigeria,This is a project to detect fake number plates in NigeriaThis is a project to detect fake number plates in NigeriaThis is a project to detect fake number plates in Nigeria,This is a project to detect fake number plates in NigeriaThis is a project to detect fake number plates in Nigeria","","","Technology",""));

        projects.add(
                new Project("This is a project to detect fake number plates in Nigeria","This is a project to detect fake number plates in Nigeria,This is a project to detect fake number plates in NigeriaThis is a project to detect fake number plates in NigeriaThis is a project to detect fake number plates in Nigeria,This is a project to detect fake number plates in NigeriaThis is a project to detect fake number plates in Nigeria","","","Technology",""));

        projects.add(
                new Project("This is a project to detect fake number plates in Nigeria","This is a project to detect fake number plates in Nigeria,This is a project to detect fake number plates in NigeriaThis is a project to detect fake number plates in NigeriaThis is a project to detect fake number plates in Nigeria,This is a project to detect fake number plates in NigeriaThis is a project to detect fake number plates in Nigeria","","","Technology",""));

        projects.add(
                new Project("This is a project to detect fake number plates in Nigeria","This is a project to detect fake number plates in Nigeria,This is a project to detect fake number plates in NigeriaThis is a project to detect fake number plates in NigeriaThis is a project to detect fake number plates in Nigeria,This is a project to detect fake number plates in NigeriaThis is a project to detect fake number plates in Nigeria","","","Technology",""));

        projects.add(
                new Project("This is a project to detect fake number plates in Nigeria","This is a project to detect fake number plates in Nigeria,This is a project to detect fake number plates in NigeriaThis is a project to detect fake number plates in NigeriaThis is a project to detect fake number plates in Nigeria,This is a project to detect fake number plates in NigeriaThis is a project to detect fake number plates in Nigeria","","","Technology",""));




        projectAdapter = new ProjectAdapter(projects,getContext());

        myProjectsRecyclerView.setLayoutManager(new LinearLayoutManager(getContext(),RecyclerView.VERTICAL,false));
        myProjectsRecyclerView.setAdapter(projectAdapter);

        return view;
    }

}
