package batch2io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class MyFileManagerClass {

	String fileBaseLocation = "C:\\Users\\ashis\\OneDrive\\Desktop\\RupiPay Batch\\Module1-WS\\Module1-CoreJava\\src\\arr\\day2";

	public void task1(String fileName)throws IOException
	{
		// String fileName = "abc.txt"; // developers code
		File f = new File(fileBaseLocation + "\\" + fileName);

		f.createNewFile(); // force java to create new file
		boolean isValid = f.exists();
		System.out.println(" isValid :- " + isValid);

		System.out.println("All Done");
	}

	public void task2()throws IOException
	{
		File f = new File(fileBaseLocation); // folder
		
		File arr[] = f.listFiles();
		
		for (File file : arr) {
			
			if(file.isFile())
			{
				System.out.println(file.getName()+" - is a File");
				
			}
			else if(file.isDirectory())
			{
				System.out.println(file.getName()+" - is a Folder");
			}
		}
	}
	

	public void task3_createNewFile_Through_PrintWriter(String fileName)
	{
		
		
		File f = new File(fileBaseLocation+"\\"+fileName);
	
		try(FileWriter fw = new FileWriter(f,true)) {
			
			try(PrintWriter pw = new PrintWriter(fw))
			{
				//FileWriter fw = new FileWriter(f,true)		
				pw.append("Tata");
				pw.append("Suzuki");
				
				System.out.println(" All Done ");
				
				//pw.close();
				
			}
			catch(Exception e)
			{
				System.out.println(" Developer's issue- Print Writer"+e);
			}
			
			
		} catch (Exception e) 
		{
			System.out.println(" Developer's issue- File Writer"+e);
		}
		
		
		
	}
	
	
	
	public void task4_ReadFromFile()
	{
		File file = new File(fileBaseLocation+"\\EmployeeRecord.java");
		int i = 1;
		try {
			
			BufferedReader br = new BufferedReader(new FileReader(file));
			
			String line = "";
			
			while((line = br.readLine())!=null)
			{
				System.out.println((i++)+" "+line);
			}
			
			
			br.close();
			
			
		} catch (Exception e) {
			// TODO: handle exception
			
			System.out.println(e);
		}
		
	}
	
	
}



















