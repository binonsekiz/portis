package com.portis.portispackageroot.network;

import java.io.IOException;
import java.net.ServerSocket;

public class NetworkManager{

	static ServerSocket socket;
	
	public NetworkManager() {
		
	}
	
	public static void startServerSocket() throws IOException{
		socket = new ServerSocket();
	}
}
