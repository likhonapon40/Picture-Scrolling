package com.likhon123.assignmenttwo;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class PersonListAdapter extends RecyclerView.Adapter<PersonListAdapter.PersonViewHolder> {



    private Context context;
    private List<Person> personList;

    public PersonListAdapter(Context context, List<Person> personList) {
        this.context = context;
        this.personList = personList;
    }


    @NonNull
    @Override
    public PersonViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater=LayoutInflater.from(context);
        View itemView=layoutInflater.inflate(R.layout.person_list_item,null);
        return new PersonViewHolder(itemView);

    }

    @Override
    public void onBindViewHolder(@NonNull PersonViewHolder personViewHolder, int i) {
     Person currentPerson=personList.get(i);



    }

    @Override
    public int getItemCount() {
        return personList.size();
    }

    class PersonViewHolder extends RecyclerView.ViewHolder{

        TextView nameTv,getNameTv;
        public PersonViewHolder(@NonNull View itemView) {
            super(itemView);


        }
    }

}
