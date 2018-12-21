package com.likhon123.assignmenttwo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class AssignmentTwo extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<Person> personList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assignment_two);

        recyclerView=findViewById(R.id.recyclerViewId);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        personList=new ArrayList<>();



        Person person1=new Person();
        Person person2=new Person();
        Person person3=new Person();
        Person person4=new Person();
        Person person5=new Person();
        Person person6=new Person();

        personList.add(person1);
        personList.add(person2);
        personList.add(person3);

        personList.add(person4);
        personList.add(person5);
        personList.add(person6);

        PersonListAdapter personListAdapter=new PersonListAdapter(this,personList);
        recyclerView.setAdapter(personListAdapter);
    }
}
