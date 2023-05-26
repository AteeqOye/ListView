package com.example.adapterlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    private static final String TAG="MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: Started");
        ListView mListView = (ListView) findViewById(R.id.list_item);

        Person Ateeq = new Person("Ateeq","19 Nov,2002","Male");
        Person Ali = new Person("Ali","31 March,2004","Male");
        Person Dani = new Person("Dani","23 Nov,1999","Male");
        Person Naeem = new Person("Naeem","09 July,1998","Male");
        Person Ailza = new Person("Aliza","10 Dec,2002","Female");
        Person Irfan = new Person("Naeem","09 July,1998","Male");
        Person Abdur = new Person("Naeem","09 July,1998","Male");
        Person Faisal = new Person("Naeem","09 July,1998","Male");
        Person Awais = new Person("Naeem","09 July,1998","Male");
        Person Shahbaz = new Person("Naeem","09 July,1998","Male");
        Person Rafay = new Person("Naeem","09 July,1998","Male");
        Person Hussain = new Person("Naeem","09 July,1998","Male");
        Person Maheen = new Person("Naeem","09 July,1998","Male");
        Person Muddasr = new Person("Naeem","09 July,1998","Male");
        Person Waqar = new Person("Naeem","09 July,1998","Male");
        Person Hamza = new Person("Naeem","09 July,1998","Male");


        ArrayList<Person> people = new ArrayList<>();
        people.add(Ateeq);
        people.add(Ali);
        people.add(Dani);
        people.add(Naeem);
        people.add(Ailza);
        people.add(Irfan);
        people.add(Abdur);
        people.add(Faisal);
        people.add(Awais);
        people.add(Shahbaz);
        people.add(Rafay);
        people.add(Hussain);
        people.add(Maheen);
        people.add(Muddasr);
        people.add(Waqar);
        people.add(Hamza);

        PersonListAdapter adapter = new PersonListAdapter(this , R.layout.list_items,people);
        mListView.setAdapter(adapter);
    }
}