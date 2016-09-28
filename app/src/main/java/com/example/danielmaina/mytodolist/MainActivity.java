package com.example.danielmaina.mytodolist;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {
  /** //declare the ListView
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
*/

  //adding recycler view,adapter and layout manager.
    RecyclerView tasks;
    RecyclerView.Adapter adapter_tasks;
    RecyclerView.LayoutManager LayoutManager_tasks;

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //if the recycler view has a fixed size
        tasks.setHasFixedSize(true);
        //using linearLayout manager
        LayoutManager_tasks = new LinearLayoutManager(this);
        //connecting recyclerview to LinearLayoutManager
        tasks.setLayoutManager(LayoutManager_tasks);
    }
}

























