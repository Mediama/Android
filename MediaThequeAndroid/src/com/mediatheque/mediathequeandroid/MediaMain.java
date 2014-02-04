package com.mediatheque.mediathequeandroid;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.TextView;

public class MediaMain extends Activity{
	
	String loginName;
	TextView logName;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_mediatheque_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.log, menu);
		return true;
	}
	
	protected void onStart(){
		super.onStart();
		
		logName = (TextView)findViewById(R.id.tvLoginName);
		
		loginName = this.getIntent().getExtras().getString("login");
		
		logName.setText(loginName);
	}
	
}
