package com.virtusa;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CsvFileReader {
	
	public static void main(String args[]) {
		
		
		try {
			File file = new File(".csv");
			CsvFileReader csv = new CsvFileReader();
			FileInputStream fs = new FileInputStream(file);
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
