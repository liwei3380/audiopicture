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
 * �Զ���ײ�ѡ����
 */
public class FootLayout extends LinearLayout {
	public FootLayout(Context context, AttributeSet attrs){
		super(context, attrs);
		LayoutInflater.from(context).inflate(R.layout.foot, this);
		//��Ʒչʾ
		Button footShow = (Button) findViewById(R.id.works_show);
		//�½���Ʒ
		Button footNew = (Button) findViewById(R.id.new_works);
		//ϵͳ����
		Button footSetting = (Button) findViewById(R.id.system_setting);
		//�����Ʒչʾ
		footShow.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(getContext(), MainActivity.class);
				getContext().startActivity(intent);
			}
		});
		//����½���Ʒ
		footNew.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(getContext(), NewWorksActivity.class);
				getContext().startActivity(intent);
			}
		});
		//���ϵͳ����
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
