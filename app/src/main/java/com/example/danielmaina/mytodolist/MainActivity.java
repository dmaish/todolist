package com.example.danielmaina.mytodolist;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
   //declare the ListView
    ListView lvItems;
    //declare an array to store the items
    ArrayList<String> items;
    //declare the adapter
    ArrayAdapter itemsAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //get a handle to list view
        lvItems = (ListView)findViewById(R.id.lvItems);
        //create the arraylist
        items = new ArrayList<>();
        //Atach adapter to the ListView and ArrayList
        itemsAdapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1, items);
        lvItems.setAdapter(itemsAdapter);
        items.add("this are your tasks");


    }

    public void onAddItem(View v){
        EditText etNewItem = (EditText) findViewById(R.id.etNewItem);
        String itemText = etNewItem.getText().toString();
        itemsAdapter.add(itemText);
        etNewItem.setText("");

    }


}
