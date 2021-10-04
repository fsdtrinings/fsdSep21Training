package coll;


import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Demo2 {

	public static void main(String[] args) {


		String fileBaseLocation = "C:\\Users\\ashis\\OneDrive\\Desktop\\RupiPay Batch\\Module1-WS\\Module1-CoreJava\\src\\arr\\day2";
		File f = new File(fileBaseLocation); // folder
		List<String> javaFileList = new ArrayList<>();
		
		File arr[] = f.listFiles();

		for (File file : arr) {

			if (file.isFile()) {
				boolean isJavaFile = file.getName().endsWith(".java");
				if(isJavaFile)
				{
					javaFileList.add(file.getName());
				}

			} //end of if
		}//end of for
		
		new Demo2().uiLayer(javaFileList);
		
		Set<String> mySet = new HashSet<>();
		mySet.addAll(javaFileList);
		new Demo2().uiLayer(mySet);

	}//end of main
	
	public void uiLayer(Collection<?> list)
	{
		// approach 1 - iteration 
		
		for (Object data : list) {
			System.out.println(data);
			System.out.println("--------------");
		}
		
		
	}

}//end class











