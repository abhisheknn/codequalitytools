package com.rthings.services;
import com.rthings.services.*;
import org.junit.Test;
import junit.framework.Assert;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
@Test 
 public void testGetStatusRed()
    {
       
	  App app= new App();
	   String status=app.getStatus("RED");
	   Assert.assertEquals(status,"RED");
	}
	
	@Test 
 public void testGetStatusYellow()
    {
       
	  App app= new App();
	   String status=app.getStatus("YELLOW");
	   Assert.assertEquals(status,"YELLOW");
	}
	
	
		@Test 
 public void testGetStatusGreen()
    {
       
	  App app= new App();
	   String status=app.getStatus("GREEN");
	   Assert.assertEquals(status,"GREEN");
	}
	
}
