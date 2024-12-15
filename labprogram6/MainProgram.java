import SEE.*;
import CIE.*;
import java.util.*;
class MainProgram
{
	public static void main(String args[])
	{
		int n;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Number of students");
		n=s.nextInt();
		Externals e[]=new Externals[n];
		for(int i=0;i<n;i++)
		{
			e[i]=new Externals();
			System.out.println("Enter Name,USN,Semester");
			e[i].inputStudentDetails();
			System.out.println("Enter the Internals marks of five Courses");
			e[i].inputCIEmarks();
			System.out.println("Enter the SEE marks of five Courses");
			e[i].inputSEEmarks();
			e[i].calculateFinalMarks();
			System.out.println("Student Details and Final Marks");
			e[i].displayStudentDetails();
			e[i].displayFinalMarks();
		}
	}
}