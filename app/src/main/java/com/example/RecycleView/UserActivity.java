package com.example.RecycleView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class UserActivity extends AppCompatActivity {
    ArrayList<User> userList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);

        RecyclerView rvUser = findViewById(R.id.rvUser);

        userList = new ArrayList<>();
        userList.add(new User("NguyenTT", "Tran Thanh Nguyen", "Nguyentt@fpt.edu.vn"));
        userList.add(new User("AnTV", "Tran Van An", "antv@fpt.edu.vn"));
        userList.add(new User("BangTT", "Tran Thanh Bang", "bangtt@fpt.edu.vn"));
        userList.add(new User("KhangTT", "Tran Thanh Khang", "kangtt@fpt.edu.vn"));

        UserAdapter adapter = new UserAdapter(userList);

        rvUser.setAdapter(adapter);

        rvUser.setLayoutManager(new LinearLayoutManager(this));
    }
}