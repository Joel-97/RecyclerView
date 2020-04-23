package com.abc.recyclerview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //List<Source> == generics
        List<Source> imageList = new ArrayList<>();//Composicion y porlimorfismo al mismo tiempo.
        imageList.add(new MySource("Image 1", R.drawable.imagen1));//Instanciamos un objeto de la clase Source
        imageList.add(new Source("Image 2", R.drawable.imagen2));
        imageList.add(new Source("Image 3", R.drawable.imagen3));
        imageList.add(new Source("Image 4", R.drawable.imagen4));
        imageList.add(new MySource("Image 5", R.drawable.image5));
        imageList.add(new MySource("Image 6", R.drawable.image6));
        imageList.add(new MySource("Image 7", R.drawable.image7));


        RecyclerView container = findViewById(R.id.container);

        container.setItemViewCacheSize(20);
        container.setDrawingCacheEnabled(true);
        container.setHasFixedSize(true);
        LinearLayoutManager layout = new LinearLayoutManager(getApplicationContext());
        layout.setOrientation(LinearLayoutManager.VERTICAL);
        container.setAdapter(new Adapter(imageList));
        container.setLayoutManager(layout);
    }
}
