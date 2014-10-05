package com.example.testapp;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		RadioGroup group1 = (RadioGroup) findViewById(R.id.orientation);
		group1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
		  @Override
		  public void onCheckedChanged(RadioGroup group, int checkedId) {
		    switch (checkedId) {
		      case R.id.horizontal:
		        group.setOrientation(LinearLayout.HORIZONTAL);
		        break;
		      case R.id.vertical:
		        group.setOrientation(LinearLayout.VERTICAL);
		        break;
		    }
		  }
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	public void onClick(View view) {
		EditText input = (EditText) findViewById(R.id.main_input);
		String string = input.getText().toString();
		Toast.makeText(this, string,
				Toast.LENGTH_LONG).show();
	}
}
