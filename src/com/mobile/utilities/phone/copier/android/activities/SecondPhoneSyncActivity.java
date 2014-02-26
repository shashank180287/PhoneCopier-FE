package com.mobile.utilities.phone.copier.android.activities;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class SecondPhoneSyncActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second_phone_sync);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.second_phone_sync, menu);
		return true;
	}

}
