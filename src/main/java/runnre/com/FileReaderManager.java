package runnre.com;

import org.apache.commons.configuration.ConfigurationXMLReader;

public class FileReaderManager {
	 
	 private static FileReaderManager fileReaderManager = new FileReaderManager();
	 private static ConfigurationXMLReader configFileReader;
	 
	 private FileReaderManager() {
	 }
	 
	 public static FileReaderManager getInstance( ) {
	       return fileReaderManager;
	 }
	 
	 public ConfigurationXMLReader getConfigReader() {
	 return configFileReader ;
	 }
	 public ConfigurationXMLReader getReportConfigPath() {
		 return configFileReader ;
		 }
	}

