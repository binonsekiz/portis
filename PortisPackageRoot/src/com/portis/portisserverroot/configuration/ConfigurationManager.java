package com.portis.portisserverroot.configuration;

import java.io.File;

public class ConfigurationManager {

	public static final int defaultServerPort = 10180;
	
	public static int serverPort = defaultServerPort;
	
	public static int getServerPort(){
		return serverPort;
	}
	
}
