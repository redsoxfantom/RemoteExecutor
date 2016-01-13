package com.redsoxfantom.remoteexecutor.data;

import java.util.List;

public class LoadedData 
{
	List<Host> hostList;
	
	List<Command> commandList;
	
	public void setHostList(List<Host> hostList)
	{
		this.hostList = hostList;
	}
	
	public List<Host> getHostList()
	{
		return hostList;
	}
	
	public void setCommandList(List<Command> commandList)
	{
		this.commandList = commandList;
	}
	
	public List<Command> getCommandList()
	{
		return commandList;
	}
}
