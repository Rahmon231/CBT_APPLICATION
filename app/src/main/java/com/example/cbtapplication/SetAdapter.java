package com.example.cbtapplication;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class SetAdapter extends BaseAdapter {
    private int num_of_sets;

    public SetAdapter(int num_of_sets) {
        this.num_of_sets = num_of_sets;
    }

    @Override
    public int getCount() {
        return num_of_sets;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View view1;
        if(view == null){
            view1 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.set_item_layout, viewGroup,false);
        }
        else
            view1 = view;
        view1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(viewGroup.getContext(),QuestionsActivity.class);
                viewGroup.getContext().startActivity(intent);

            }
        });

        ((TextView) view1.findViewById(R.id.setNumberTVID)).setText(String.valueOf(i+1));
        return view1;
    }
}
