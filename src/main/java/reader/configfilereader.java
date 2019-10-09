package reader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class configfilereader {
	public String getReportConfigPath(){
		 File file = new File("C:/HaudAPI/cucumberframework/configuration.properties");
		  
			FileInputStream fileInput = null;
			try {
				fileInput = new FileInputStream(file);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			Properties prop = new Properties();
			
		 String reportConfigPath = prop.getProperty("reportConfigPath");
		 if(reportConfigPath!= null) return reportConfigPath;
		 else throw new RuntimeException("Report Config Path not specified in the Configuration.properties file for the Key:reportConfigPath"); 
		}
}
