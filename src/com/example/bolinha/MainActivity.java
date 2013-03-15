package com.example.bolinha;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends Activity {

	public static final String TAG = "bolinha";

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Log.i(TAG, "on create");
		setContentView(new ViewQuerido(this));
	}

}
