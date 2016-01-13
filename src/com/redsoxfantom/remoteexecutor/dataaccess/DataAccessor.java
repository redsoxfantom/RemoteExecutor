package com.redsoxfantom.remoteexecutor.dataaccess;

import org.json.JSONException;
import org.json.JSONObject;

import com.redsoxfantom.remoteexecutor.data.LoadedData;

import android.content.Context;
import android.content.SharedPreferences;

public class DataAccessor 
{
	LoadedData fileContents;
	
	SharedPreferences.Editor editor;
	
	public DataAccessor(Context context) throws JSONException
	{
		loadFile(context);
	}
	
	public void SaveData(LoadedData dataToSave)
	{
		
	}
	
	private void loadFile(Context context) throws JSONException
	{
		fileContents = new LoadedData();
		JSONObject fileContentsJson = new JSONObject();
		fileContentsJson.put("UserData", fileContents);
		
		SharedPreferences pref = context.getSharedPreferences("com.redsoxfantom.remoteexecutor.stored_user_data_file", Context.MODE_PRIVATE);
		editor = pref.edit();
		
		String loadedData = pref.getString("stored_user_data", fileContentsJson.toString());
	}
}
