import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		StudentLinkedList sl=new StudentLinkedList();
		sl.create();
		while(true) {
			System.out.println("************MENU************");
			System.out.println("0:exit");
			System.out.println("1:display student details");
			System.out.println("2:topper of class");
			System.out.println("3:List of faileed students");
			System.out.println("4:sorting from highest marks to lowest");
			System.out.println("*****************************");
			System.out.println("input your choice");
			int ch=sc.nextInt();
			switch(ch) {
			case 0: return;
			case 1: sl.DisplayLinkedList();
			break;
			case 2:sl.FindTopper();
			break;
			case 3:sl.DisplayFailedList();
			break;
			case 4:sl.sort();
			break;
			default: System.out.println("Invalid input");
			}
		}

	}

}
