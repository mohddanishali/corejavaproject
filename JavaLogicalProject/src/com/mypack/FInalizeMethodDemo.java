package com.mypack;

public class FInalizeMethodDemo 
{
	static void m()
	{
	 try
	 { 
           System.out.println("inside B"); 
            return; 
        } 
        finally
        { 
            System.out.println("B's finally"); 
        } 
	}

	
	public static void main(String[] args) 
    { 
        String s = new String("RR"); 
        s = null; 
  
        // Requesting JVM to call Garbage Collector method 
        System.gc(); 
        System.out.println("Main Completes"); 
        
        System.out.println("......."+s);
    } 
	
  
    // Here overriding finalize method 
	@Override
    public void finalize() 
    { 
        System.out.println("finalize method overriden"); 
    } 

}
