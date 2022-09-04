package Datadriventest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class dataDriven {
	public static void main(String[] args) throws IOException {
		 Properties p =new Properties();
		 FileInputStream fis = new FileInputStream("./configuration.properties");
		 p.load(fis);
		 //String text = p.getProperty("url");
		 System.out.println(p.getProperty("url"));
	}
}

//create config file by right clicking on SelNew project
