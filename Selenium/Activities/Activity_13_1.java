package Selenium;

import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;


public class Activity_13_1 {

	public static void main(String[] args) throws IOException, CsvException {
		//load csv file
		CSVReader reader = new CSVReader(new FileReader("src/resources/sample.csv"));
		//load content of the file
		List<String[]> list = reader.readAll(); 
		//print the values
		System.out.println("Total number of rows are: " + list.size());
		//Create Iterator reference
		Iterator<String[]> itr = list.iterator();

		//Iterate all values
		while(itr.hasNext()) {
		    String[] str = itr.next();

		    System.out.print("Values are: ");
		    for(int i=0;i<str.length;i++) {
		        System.out.print(" " + str[i]);
		    }
		        System.out.println(" ");
		}
		reader.close();

	}

}
