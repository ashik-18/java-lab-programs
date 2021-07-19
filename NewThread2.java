package class_programs;					// Creating multiple Threads

class NewThread2 implements Runnable 
{
	  String name; 																	// name of thread
	  Thread t;									// Ramesh.t					// Obj1.t

	  NewThread2(String threadname) 
	  {
				    name = threadname;
				    t = new Thread(this,name);		
				    System.out.println("New thread: " + t);
				    t.start(); 																			// Start the thread
	  }

	  // This is the entry point for thread.
	  public void run() 
	  {
			    try 
			    {
					      for(int i = 5; i > 0; i--) 
					      {	
					    	  System.out.println("fhoweifh");
							        System.out.println(name + ": " + i);
							        Thread.sleep(1000);
					      }
			    } 
	    
			    catch (InterruptedException e) 
			    {
			    			System.out.println(name + "Interrupted");
			    }
	    System.out.println(name + " exiting.");
	  }
	}

	class Thread4 
	{
	  public static void main(String args[]) 					// Thread Scheduler
	  {
			NewThread2 obj1=new NewThread2("one");
			NewThread2 obj2=new NewThread2("two");

		  
		  
	    try 
	    {
	    																						// wait for other threads to end
	    				Thread.sleep(1000);
	    } 
	    catch (InterruptedException e) 
	    {
	    			System.out.println("Main thread Interrupted");
	    }

	    System.out.println("Main thread exiting.");
	  }
	}
