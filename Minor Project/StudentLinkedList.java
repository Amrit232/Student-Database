import java.util.Scanner;

public class StudentLinkedList {
	Node start;
	Scanner sc=new Scanner(System.in);
	
	void create() {
		Node p=new Node();
		System.out.println("Input name,roll,mark");
		String name=sc.next();
		int roll=sc.nextInt();
		double mark=sc.nextDouble();
		p.stud.SetStudentDetails(name,roll,mark);
		p.link=null;
		start=p;
		System.out.println("Do you want more nodes(1/0)");
		int op=sc.nextInt();
		while(op==1) {
			Node q=new Node();
			System.out.println("Input name,roll,mark");
			name=sc.next();
			roll=sc.nextInt();
			mark=sc.nextDouble();
			q.stud.SetStudentDetails(name,roll,mark);
			q.link=null;
		    p.link=q;
			p=q;
			System.out.println("Do you want more nodes(1/0)");
		    op=sc.nextInt();
			
		}
	}
	
	void DisplayLinkedList() {
		System.out.println("student details are :");
		System.out.println("Start ="+start);
		Node p=start;
		while(p!=null) {
			p.stud.DisplayStudent();
			p=p.link;
		}
		
	}
	
	void FindTopper() {
		Node p=start;
		Student topper = start.stud;
		while(p!=null) {
			if(p.stud.mark > topper.mark) {
				topper=p.stud;
			}
			p=p.link;
		}
		System.out.println("the topper is :");
		topper.DisplayStudent();
	}
	
	void DisplayFailedList() {
		System.out.println("details of failed students are : ");
		Node p=start;
		int i=1;
		while(p!=null) {
			if(p.stud.mark < 40) {
				System.out.println("Student "+i);
				p.stud.DisplayStudent();
				i++;
			}
			p=p.link;
		}
	}
	
	void sort() {
		Node i,j;
		for(i=start;i.link!=null;i=i.link) {
			for(j=start;j.link!=null;j=j.link) {
				if(j.link.stud.mark>j.stud.mark) {
					Student temp=j.stud;
					j.stud=j.link.stud;
					j.link.stud=temp;
					
				}
			}
		}
		System.out.println("list is sorted");
	}

}
