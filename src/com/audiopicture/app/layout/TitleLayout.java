package com.audiopicture.app.layout;

import com.audiopicture.app.activity.R;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

/**
 * @author zlw
 * �Զ��嶥��ѡ����
 */
public class TitleLayout extends LinearLayout {
	public TitleLayout(Context context, AttributeSet attrs){
		super(context, attrs);
		LayoutInflater.from(context).inflate(R.layout.title, this);
		//���ذ�ť
		Button titleBack = (Button) findViewById(R.id.title_back);
		titleBack.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				((Activity) getContext()).finish();
			}
		});
	}
}
