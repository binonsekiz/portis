package com.portis.portisserverroot;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {
	
	private static DateFormat dateFormat;
	private static Date date;
	private static File outputFile;
	private static PrintWriter print;
	
	enum LogType{
		Info,
		Warning,
		Error
	}
	
	public Logger(){
		dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		print = new PrintWriter(System.out);
	}
	
	public static void setOutputFile(File file) throws FileNotFoundException
	{
		outputFile = file;
		print = new PrintWriter(file);
	}
	
	public static void log(String message){
		log(message, LogType.Info);
	}
	
	public static void log(String message, LogType type){
		date = new Date();
		print.println(dateFormat.format(date) + "-" + type + " " + message);
	}
	
}
