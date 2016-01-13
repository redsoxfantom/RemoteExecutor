package com.redsoxfantom.remoteexecutor.dataaccess;

import com.redsoxfantom.remoteexecutor.data.LoadedData;

import android.content.Context;
import android.content.SharedPreferences;

public class DataAccessor 
{
	LoadedData fileContents;
	
	Context context;
	
	public DataAccessor(Context context)
	{
		this.context = context;
		loadFile();
	}
	
	public void SaveData(LoadedData dataToSave)
	{
		
	}
	
	private void loadFile()
	{
		SharedPreferences pref = context.getSharedPreferences("com.redsoxfantom.remoteexecutor.stored_user_data", Context.MODE_PRIVATE);
		
	}
}
