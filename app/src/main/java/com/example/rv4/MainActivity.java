package com.example.rv4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rv;
    private List<Contact> myList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rv = findViewById(R.id.rv01);

        myList.add(new Contact("Aliyev Valijon", "+998977777777", R.drawable.user02));
        myList.add(new Contact("Hakimova Zilola", "+998941112233", R.drawable.user01));
        myList.add(new Contact("Hasanov Husanjon", "+998909996633", R.drawable.user03));
        myList.add(new Contact("Aliyev Valijon", "+998977777777", R.drawable.user02));
        myList.add(new Contact("Hakimova Zilola", "+998941112233", R.drawable.user01));
        myList.add(new Contact("Hasanov Husanjon", "+998909996633", R.drawable.user03));
        myList.add(new Contact("Aliyev Valijon", "+998977777777", R.drawable.user02));
        myList.add(new Contact("Hakimova Zilola", "+998941112233", R.drawable.user01));
        myList.add(new Contact("Hasanov Husanjon", "+998909996633", R.drawable.user03));
        myList.add(new Contact("Aliyev Valijon", "+998977777777", R.drawable.user02));
        myList.add(new Contact("Hakimova Zilola", "+998941112233", R.drawable.user01));
        myList.add(new Contact("Hasanov Husanjon", "+998909996633", R.drawable.user03));

        ContactAdapter adapter = new ContactAdapter(myList);

        rv.setAdapter(adapter);
    }
}