package com.example.exam;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ExamAdapter extends RecyclerView.Adapter<ExamAdapter.ViewHolder> {
    private List<ExamModel> ExamList;

    public ExamAdapter(List<ExamModel> ExamList) {
        this.ExamList = ExamList;
    }

    @NonNull
    @Override
    public ExamAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.e1,parent,false);
        return new ViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull ExamAdapter.ViewHolder holder, int position) {
        ExamModel monthModel = ExamList.get(position);
        holder.TextView.setText(monthModel.getExam());
    }
    @Override
    public int getItemCount() {
        return ExamList.size();
    }
    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView TextView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            TextView = itemView.findViewById(R.id.textView);
        }
    }
}