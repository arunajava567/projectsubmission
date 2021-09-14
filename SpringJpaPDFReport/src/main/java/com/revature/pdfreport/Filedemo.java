package com.revature.pdfreport;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

class DepositException extends Exception {
	
	DepositException(String msg) {
		super(msg);
	}
}

public class Filedemo {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
   int b[]= {5,6,7};
   int deposit=999;
   
   if(deposit<1000)
	   throw new DepositException(" Minimum deposit is 1000/-");
   
   try {
		 try {
			int x=10/0;
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 finally {
			 
		 }
		 
		 
		 try {
			System.out.println(b[4]);
			 try {
				System.out.println("java".substring(5,9));
			} catch (StringIndexOutOfBoundsException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 finally {
				 
			 }
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 finally {
			 
		 }
		 
		
   }
   catch(ArrayIndexOutOfBoundsException e) {
	   
   }
   finally {
	   
   }
			Thread.sleep(500);
		//Compiler checked  ,compiletime
		String s=null;
		
			System.out.println(s.length());//JVM  , Runtime
		
		System.out.println(" thank you");
		
	}

}
