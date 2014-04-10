package com.tkdtech.scorekeeper;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class BlueWin extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_blue_win);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.blue_win, menu);
		return true;
	}

}
