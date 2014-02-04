package com.mediatheque.mediathequeandroid;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LogActivity extends Activity {

	TextView conn;
	EditText log, pwd;
	Button login;
	Intent intentMediaMain = null;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_log);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.log, menu);
		return true;
	}
	
	@Override
	protected void onStart(){
		super.onStart();
		
		conn = (TextView)findViewById(R.id.tvConnection);
		log = (EditText)findViewById(R.id.etID);
		pwd = (EditText)findViewById(R.id.etPwd);
		login = (Button)findViewById(R.id.btnLog);
		login.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				if(!(pwd.getText().toString().equals(""))){

					if(log.getText().toString().equals("Antoine") && pwd.getText().toString().equals("123")){
						intentMediaMain = new Intent(LogActivity.this, MediaMain.class);
						intentMediaMain.putExtra("login", log.getText().toString());
						startActivity(intentMediaMain);
					}
					else if(log.getText().toString().equals("toto") && pwd.getText().toString().equals("123")){
						conn.setText("Vous êtes connecté en tant que : "+log.getText());
					}
					else{
						conn.setText("Identifiant/Mot de passe incorrect !");
					}
					
				}
				else{
					conn.setText("Mot de passe vide !");
				}
				
			}
		});
		
	}

}
