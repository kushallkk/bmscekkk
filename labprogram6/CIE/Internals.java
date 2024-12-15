package CIE;
import java.util.*;
class Student 
{
	public String usn;
	public String name;
	public int sem;

	public void inputStudentDetails()
	{
		Scanner s=new Scanner(System.in);
		usn=s.nextLine();
		name=s.nextLine();
		sem=s.nextInt();
	}
	public void displayStudentDetails() 
	{
		System.out.println("Name:"+name);
		System.out.println("USN:"+usn);
		System.out.println("Semester:"+sem);
	}
}

public class Internals extends Student
{
	public int marks[] = new int[5];
	public void inputCIEmarks()
	{
		Scanner s=new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
			marks[i]=s.nextInt();
		}
	}

}