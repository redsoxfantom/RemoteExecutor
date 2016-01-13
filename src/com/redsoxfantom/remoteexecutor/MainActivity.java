package com.redsoxfantom.remoteexecutor;

import android.os.Bundle;
import android.util.Log;

import org.json.JSONException;

import com.redsoxfantom.remoteexecutor.dataaccess.DataAccessor;

import android.app.Activity;
import android.view.Menu;

public class MainActivity extends Activity 
{
	DataAccessor mAccessor;

    @Override
    protected void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
		mAccessor = new DataAccessor(getBaseContext());
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) 
    {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
