package com.timilehinjegede.projectrepo.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.timilehinjegede.projectrepo.Model.Project;
import com.timilehinjegede.projectrepo.R;

import java.util.ArrayList;

public class ProjectAdapter extends  RecyclerView.Adapter<ProjectAdapter.ProjectViewHolder> {

    private ArrayList<Project> projectArrayList;
    private Context context ;

    public ProjectAdapter(ArrayList<Project> projectArrayList, Context context) {
        this.projectArrayList = projectArrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public ProjectViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(
                R.layout.project_item,
                parent,
                false
        );

        return new ProjectViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProjectViewHolder holder, int position) {
        Project project = projectArrayList.get(position);

        holder.titleTextView.setText(project.getTitle());
        holder.descriptionTextView.setText(project.getDescription());
        holder.uploaderTextView.setText(project.getUploader());
        holder.categoryTextView.setText(project.getCategory());
    }

    @Override
    public int getItemCount() {
        return projectArrayList.size();
    }

    class ProjectViewHolder extends RecyclerView.ViewHolder{

        TextView titleTextView , descriptionTextView , uploaderTextView ,categoryTextView ;

        public ProjectViewHolder(@NonNull View itemView) {
            super(itemView);

            titleTextView = itemView.findViewById(R.id.titleTextView);
            descriptionTextView = itemView.findViewById(R.id.descriptionTextView);
            uploaderTextView = itemView.findViewById(R.id.uploaderTextView);
            categoryTextView = itemView.findViewById(R.id.categoryTextView);
        }
    }
}
