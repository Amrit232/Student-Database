
public class Student {
	String name;
	int roll;
	double mark;
	void SetStudentDetails(String n,int r,double m) {
		name=n;
		roll=r;
		mark=m;
	}
	void DisplayStudent() {
		System.out.println("Name : "+name);
		System.out.println("roll : "+roll);
		System.out.println("mark : "+mark);
	}

}
