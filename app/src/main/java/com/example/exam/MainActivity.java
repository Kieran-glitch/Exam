package com.example.exam;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ExamAdapter examAdapter;
    private List<ExamModel> examList;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.RV);
        examList = generateexamList();
        examAdapter = new ExamAdapter(examList);
        recyclerView.setAdapter(examAdapter);
    }
    private List<ExamModel> generateexamList() {
        List<ExamModel> exams = new ArrayList<>();
        String[] examNames = {"Maths", "English", "Biology", "Sinhala", "Hindi", "Psychology", "Chemistry", "ICT", "Computer Science", "Physics", "Accounts", "Economics"};
        for (String examName : examNames) {
            exams.add(new ExamModel(examName));
        }
        return exams;

    }

}