package com.audiopicture.app.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener {
	
	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.main_layout);
	}
	/* µ×²¿²Ëµ¥Ïî
	@Override
	public boolean onCreateOptionsMenu(Menu menu){
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item){
		switch (item.getItemId()) {
		case R.id.works_show:
			Toast.makeText(MainActivity.this, "works_show", Toast.LENGTH_SHORT).show();
			break;
		case R.id.new_works:
			Toast.makeText(MainActivity.this, "new_works", Toast.LENGTH_SHORT).show();
			break;
		case R.id.system_setting:
			Toast.makeText(MainActivity.this, "system_setting", Toast.LENGTH_SHORT).show();
			break;
		default:
			break;
		}
		return true;
	}*/
	
	@Override
	public void onClick(View v){
		switch (v.getId()) {
		
		default:
			break;
		}
	}

}
