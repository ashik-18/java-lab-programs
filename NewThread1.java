package class_programs;			// Extending Thread

class NewThread1 extends Thread 		// class A implements Runnable 
{
	// ALL METHODS of Thread class will be visible 
	
//	  NewThread1() 																	// Create a new, second thread
//	  {
//			   	super("Demo Thread");					 							
//			    System.out.println("Child thread: " + this);
//			    start(); 																							// Start the child thread
//	  }

	 
	  public void run() 															 // This is the entry point for the second/child thread.
	  {			
			    try 																								// Thread Scheduler		-> OS
			    {
				      for(int i = 5; i > 0; i--) 
				      {
				    	  System.out.println("fjwoei");
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

	class Thread3 
	{
	  public static void main(String args[]) 
	  {
	    NewThread1 obj = new NewThread1(); 														// create a new thread
	    
	    obj.start();
	    
	    //	main		, Child 	-> both running in parallel
	    	
	    try 
	    {
			      for(int i = 5; i > 0; i--) 
			      {
					        System.out.println("Main Thread: " + i);
					        Thread.sleep(1000);
			      }
	    } 
	    
	    catch (InterruptedException e) 
	    {
	    			System.out.println("Main thread interrupted.");
	    }
	    System.out.println("Main thread exiting.");
	  }
	}