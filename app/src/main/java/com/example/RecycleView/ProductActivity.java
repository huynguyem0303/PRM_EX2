package com.example.RecycleView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class ProductActivity extends AppCompatActivity {

    ArrayList<Modules> modulesList = new ArrayList<>();
    RecyclerView rvProduct;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);

        rvProduct = findViewById(R.id.rvProduct);
        InitProductList();

        ModuleAdapter adapter = new ModuleAdapter(modulesList, ProductActivity.this);

        rvProduct.setAdapter(adapter);

        rvProduct.setLayoutManager(new LinearLayoutManager(this));
    }

    private void InitProductList() {
        modulesList.add(new Modules("Paris SG", "Lionel Messi",
                "Lionel Andrés Messi (born 24 June 1987), also known as Leo Messi, is an Argentine professional " +
                        "footballer who plays as a forward for Ligue 1 club Paris Saint-Germain and captains the Argentina national team.",
                R.drawable.messi_icon));

        modulesList.add(new Modules("Santos FC", "Pele", "Edson Arantes do Nascimento (23 October 1940 – 29 December 2022), " +
                "better known by his nickname Pelé, was a Brazilian professional footballer who played as a forward.", R.drawable.pele_icon));

        modulesList.add(new Modules("FC Barcelona", "R.Lewandowski", "Robert Lewandowski (born 21 August 1988) is a Polish professional " +
                "footballer who plays as a striker for La Liga club Barcelona and captains the Poland national team.", R.drawable.lewandowski_icon));
    }
}