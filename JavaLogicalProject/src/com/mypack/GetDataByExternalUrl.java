package com.mypack;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

public class GetDataByExternalUrl 
{
	public static void main(String[] args) 
	{
		URL url;
		String line;
		int count = 0;
		try 
		{
			url = new URL("https://raw.githubusercontent.com/CSSEGISandData/COVID-19/master/archived_data/archived_daily_case_updates/01-23-2020_1200.csv");
			
			URLConnection conn = url.openConnection();

			// open the stream and put it into BufferedReader
			BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			
			
			while ((line = br.readLine()) != null)
			{
				// use comma as separator
                String[] headers = line.split(",");

              //  System.out.println(headers[0] + " "+ headers[1]+" "+headers[headers.length-2]+" "+headers[headers.length-1]);
                
                if(count >=  1)
                {
                	System.out.println(headers[headers.length-2]+" "+headers[headers.length-1]);
                	
                	if(headers[headers.length-1] != null && headers[headers.length-2] != null)
                	{
                		System.out.println((Integer.parseInt(headers[headers.length-1].trim()) - Integer.parseInt(headers[headers.length-2].trim()))); 
                	}
                }
                
                count++;
			}
			
		} 
		catch (MalformedURLException e)
		{
			e.printStackTrace();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
	
}
