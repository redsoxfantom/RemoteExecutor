package com.redsoxfantom.remoteexecutor.dataaccess;

import com.redsoxfantom.remoteexecutor.data.LoadedData;

import android.content.Context;

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
		context.getFilesDir();
	}
}
