package com.example.saumya_controller;

import java.util.Arrays;

import android.app.ListActivity;
import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.Toast;

public class MainActivity extends ListActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setTitle("Messaging"); // Nitsukla1
		ListAdapter adapter = createAdapter();
		setListAdapter(adapter);
	}

	private ListAdapter createAdapter() {
		String[] layoutList = getMessage();
		ListAdapter adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, layoutList);

		return adapter;
	}

	private String[] getMessage() {
		String[] ans = new String[20];
		for(int i=0;i<20;i++)
			ans[i]="Test " + (char)(65+i); //Nitsukla1
		return ans;
	}

}