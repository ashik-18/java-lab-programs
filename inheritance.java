package class_programs;

import class_programs2.*;            // importing from another package.

class joey extends chandler{
	
	String c;
												//sub class representing single inheritance
	joey(int a ,int b,String c){
		
		super(a,b);
		this.c=c;
	}
	
	
		int show(){											//method overloading
		
		super.show("joey");
		return 0;

	}
	
	
}

class monica extends joey{
	
	String s;
	int t;
	monica(int a,int b,String c){
													//sub class representing multi level inheritance.
		super(a,b,c);
		
	}
	
	void show(int temp) {							//method overloading
		t=temp;
		System.out.print("\nValues stored in the object of class monica: a= "+a+",b= "+b+",c= "+c);
	
	}

}

class rachel extends chandler{
	
	rachel(int a,int b){
		
		super(a,b);										//sub class representing hierarchial inheritance.
	
	}
	
	int show(){											//method overloading
		
		super.show("rachel");
		return 0;

	}
}


public class inheritance {

	public static void main(String[] args) {

		System.out.println("This program is written by\nAshik MR, 4NI19IS017, B section");
		
		chandler bing=new chandler();
		bing.show("chandler");
		
		joey tribbiani=new joey(22,69,"how you doin?");
		tribbiani.show();
		
		
		monica geller=new monica(77,777,"chef");
		geller.show(10);
//		geller.show();
		
		rachel green =new rachel(44,11);
		int t=green.show();
	}

}
