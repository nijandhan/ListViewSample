package com.ninja.listviewsample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    ListView mListView;
    ListViewAdapter mListViewAdapter;
    private ArrayList<String> mListViewData = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mListView = (ListView) findViewById(R.id.list_view);
        mListViewAdapter = new ListViewAdapter(mListViewData);
        mListView.setAdapter(mListViewAdapter);
        setListData();
        mListViewAdapter.notifyDataSetChanged();
    }

    private void setListData(){
        mListViewData.add("row 1");
        mListViewData.add("row 2");
        mListViewData.add("row 3");
        mListViewData.add("row 4");
        mListViewData.add("row 5");
        mListViewData.add("row 6");
        mListViewData.add("row 7");
        mListViewData.add("row 8");
        mListViewData.add("row 9");
        mListViewData.add("row 10");
        mListViewData.add("row 11");
        mListViewData.add("row 12");
        mListViewData.add("row 13");
        mListViewData.add("row 14");
        mListViewData.add("row 15");
        mListViewData.add("row 16");
        mListViewData.add("row 17");
        mListViewData.add("row 18");
        mListViewData.add("row 19");
        mListViewData.add("row 20");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
