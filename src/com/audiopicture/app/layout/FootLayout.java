package com.audiopicture.app.layout;

import com.audiopicture.app.activity.MainActivity;
import com.audiopicture.app.activity.NewWorksActivity;
import com.audiopicture.app.activity.R;
import com.audiopicture.app.activity.SystemSettingActivity;

import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

/**
 * @author zlw
 * 自定义底部选择栏
 */
public class FootLayout extends LinearLayout {
	public FootLayout(Context context, AttributeSet attrs){
		super(context, attrs);
		LayoutInflater.from(context).inflate(R.layout.foot, this);
		//作品展示
		Button footShow = (Button) findViewById(R.id.works_show);
		//新建作品
		Button footNew = (Button) findViewById(R.id.new_works);
		//系统设置
		Button footSetting = (Button) findViewById(R.id.system_setting);
		//点击作品展示
		footShow.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(getContext(), MainActivity.class);
				getContext().startActivity(intent);
			}
		});
		//点击新建作品
		footNew.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(getContext(), NewWorksActivity.class);
				getContext().startActivity(intent);
			}
		});
		//点击系统设置
		footSetting.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(getContext(), SystemSettingActivity.class);
				getContext().startActivity(intent);
			}
		});
	}
}
