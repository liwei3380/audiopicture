package com.audiopicture.app.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener {
	
	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main_layout);
		Button newPro = (Button) findViewById(R.id.new_pro);
		Button editPro = (Button) findViewById(R.id.edit_pro);
		newPro.setOnClickListener(this);
		editPro.setOnClickListener(this);
	}
	@Override
	public void onClick(View v){
		switch (v.getId()) {
		case R.id.new_pro:
			Intent intent = new Intent(MainActivity.this, SelectPictureActivity.class);
			startActivity(intent);
			break;
		case R.id.edit_pro:
			Toast.makeText(MainActivity.this, "edit_pro", Toast.LENGTH_SHORT).show();
			break;
		default:
			break;
		}
	}

}
