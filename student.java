import java.util.Scanner;
class studentdet{
int marks[] = new int[3];
String usn,name;
Scanner sc = new Scanner(System.in);

void getdetails(){
usn=sc.next();
name=sc.next();
for(int i = 0;i<3;i++){
marks[i]=sc.nextInt();
}
}
void display(){
System.out.println("usn: "+usn);
System.out.println("name: "+name);
for(int i = 0; i<3;i++){
System.out.println("the marks of the three subjects are: "+marks[i]);
}
}
}

class student{
public static void main(String args[]){
studentdet s1[]=new studentdet[3];
for(int j = 0; j<3 ; j++){
s1[j] = new studentdet();
}
for(int i = 0 ; i<3;i++){
System.out.println("enter the marks of student"+i+1);
s1[i].getdetails();
}

for(int j =0;j<3;j++){
s1[j].display();
}
}
}