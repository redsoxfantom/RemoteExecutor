package com.redsoxfantom.remoteexecutor.dataaccess;

import java.util.logging.Logger;

import org.json.JSONException;
import org.json.JSONObject;

import com.google.gson.Gson;
import com.redsoxfantom.remoteexecutor.data.LoadedData;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;

public class DataAccessor 
{
	LoadedData fileContents;
	
	SharedPreferences.Editor editor;
	
	Gson parser;
	
	public DataAccessor(Context context)
	{
		parser = new Gson();
		
		loadFile(context);
	}
	
	public void SaveData(LoadedData dataToSave)
	{
		
	}
	
	private void loadFile(Context context)
	{
		fileContents = new LoadedData();
		
		SharedPreferences pref = context.getSharedPreferences("com.redsoxfantom.remoteexecutor.stored_user_data_file", Context.MODE_PRIVATE);
		editor = pref.edit();
		
		String loadedData = pref.getString("stored_user_data", parser.toJson(fileContents, fileContents.getClass()));
		fileContents = parser.fromJson(loadedData, fileContents.getClass());
		
		Log.i("DataAccessor", "Loaded "+loadedData+" from shared preferences");
	}
}
