package com.crashdev.buyauser;

import com.actionbarsherlock.app.SherlockActivity;

import android.os.Bundle;
import android.app.SearchManager;
import android.content.Intent;


public class SearchOffertunitiesActivity extends SherlockActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_search_oferrtunities);
		
		/*Intent intent = getIntent();
	    if (Intent.ACTION_SEARCH.equals(intent.getAction())) {
	      String query = intent.getStringExtra(SearchManager.QUERY);
	      //doMySearch(query);
	    }*/

	}

	/*@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.search_oferrtunities, menu);
		return true;
	}*/

}
