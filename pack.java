package class_programs;					// Implementing Runnable

class NewThread implements Runnable
{
//	  Thread t  ;						// Student.Swasthik			-> t.TObj1			-> t.obj2

//	  NewThread() 
//	  {
//			  	Thread t = new Thread(this, "Demo Thread");						
//			    System.out.println("Child thread : " + t);
//			    t.start(); 																								// Start the thread
//	  }

	  																											// This is the entry point for the second thread.
	  public void run() 
	  {
	    try 
	    {																												
		      for(int i = 5; i > 0; i--) 																		 
		      {
				        System.out.println("Child Thread: " + i);
				        Thread.sleep(500);				
		      }
	    } 
	    catch (InterruptedException e) 
	    {
	    		System.out.println("Child interrupted.");
	    }
	    	System.out.println("Exiting child thread.");
	  }
	}

	class pack
	{
	  public static void main(String args[]) 
	  {
	    NewThread obj = new NewThread(); 									// create a new child thread
	    
	    Thread t= new Thread(obj);
	    
//	    t.start();
//	    t.setPriority(1);
	    System.out.println("Child thread : " + t);
	    t.start();
	    try 
	    {
	    		for(int i = 5; i > 0; i--)
	    		{
				        System.out.println("Main Thread: " + i);
				        Thread.sleep(1000);											// main
	    		}
	    } 
	   
	    catch (InterruptedException e) 
	    {
	    			System.out.println("Main thread interrupted.");
	    }
	    System.out.println("Main thread exiting.");
	  }
	}
