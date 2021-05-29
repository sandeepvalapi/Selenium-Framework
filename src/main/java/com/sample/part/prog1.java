package com.sample.part;
import org.testng.annotations.Test;
import java.io.IOException;

public class prog1 extends base
{
	
 @Test
 public void display() throws IOException
 { 
	 initializedriver();
	 driver.get("https://www.google.com/");
	 System.out.println("Started working on frameworks");
 }
}
