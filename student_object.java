package class_programs;


class Student{
	
	String USN,name,branch;
	long phone;
		Student(String USN,String name,String branch,long phone){
		
		this.USN=USN;
		this.name=name;
		this.branch=branch;
		this.phone=phone;

		}
}


public class student_object {

	public static void main(String[] args) {
		
		System.out.println("This program is written by Ashik MR, 4NI19IS017, B section");

		Student[] obj=new Student[5];
		
		obj[0]=new Student("4ni19is017","Ashik","ISE",9110874851l);
		obj[1]=new Student("4ni19cs018","Joe","CSE",9534489790l);
		obj[2]=new Student("4ni19is011","Betty","ISE",8990282800l);
		obj[3]=new Student("4ni19is090","Taylor","ISE",7282920729l);
		obj[4]=new Student("4ni19ec074","Ben","ECE",8928292729l);
		
		System.out.println("The Student details are :");
			
		for(int i=0;i<5;i++) {
			
			System.out.println(obj[i].USN +" "+ obj[i].name + " "+ obj[i].branch+ " " + obj[i].phone);
			
		}

	}

}
