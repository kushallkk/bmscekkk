import java.util.scanner;
import java.lang.Math;
class quadratic{
public static void main(string arg[]){
System.out.println("enter the value of a");
Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
System.out.println("enter the value of b");
int b = sc.nextInt();
System.out.println("enter the value of a");
int c = sc.nextInt();
if(a==0){
System.out.println("there is no quadratic equation");
int d = b*b-4*a*c;
if(d==0){
int r1=((-b)/(2*a));
System.out.println("the roots are real and equal:"+r1);
}
else if(d>0){
int r1=((-b)+(Math.sqrt(d)))/(double)(2*a);
int r2 = ((-b)-(Math.sqrt(d)))/(double)(2*a);
System.out.println("the roots are:"+r1+" and "+r2);
}
else if (d<0){
System.out.println("the roots are imaginary");
int r1 = (-b)/(2*a);
int r2 = Math.sqrt(-d)/(2*a);

}
}

}}