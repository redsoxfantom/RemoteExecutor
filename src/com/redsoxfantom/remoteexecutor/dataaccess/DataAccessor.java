package com.redsoxfantom.remoteexecutor.dataaccess;

import com.redsoxfantom.remoteexecutor.data.LoadedData;

public class DataAccessor 
{
	static DataAccessor instance = null;
	
	LoadedData fileContents;
	
	public static DataAccessor getInstance()
	{
		if(instance == null)
		{
			instance = new DataAccessor();
		}
		return instance;
	}
	
	private DataAccessor()
	{
		
	}
	
	public void SaveData(LoadedData dataToSave)
	{
		
	}
}
