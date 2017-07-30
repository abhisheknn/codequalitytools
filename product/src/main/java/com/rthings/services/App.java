package com.rthings.services;

/**
 * Hello world!
 *
 */
public class App 
{
	public String getStatus(String status){
			
			switch(status){
				
				case "RED":
				return "RED";
				
				case "YELLOW":
				return "YELLOW";
				
				case "GREEN":
				return "GREEN";
				
				
			}
		
		return null;
		
	}
	

}
