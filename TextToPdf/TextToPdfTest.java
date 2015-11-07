package com.text;

import java.io.File;

public class TextToPdfTest {

	public static void main(String[] args) {
		  
		   File file=new File("D:/javaexperiments/fileman/class/emp1.txt");  
		   if(file.getName().endsWith(".txt")) {  
		    if(convertTextfileToPDF.convertTextfilePDF(file))  {  
		     System.out.println("PDF created");  
		    }  
		   }    
		     
		  }  
		  
		 }  
	


