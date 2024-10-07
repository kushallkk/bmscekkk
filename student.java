import java.util.Scanner;
class studentdet{
int marks[] = new int[3];
String usn,name,grade;
int credits = 12;
int scgpa;
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

void calcscgpa(){
int sum=0;
for(int i=0;i<3;i++){
sum = marks[i] + sum;
}
scgpa = sum/credits;
if(scgpa<100){
grade = "S";
}
else if(scgpa<90){
grade = "A+";
}
else if(scgpa<80){
grade = "A";
}
else if(scgpa<70){
grade = "B+";
}
else if(scgpa<60){
grade = "B";}
else{
grade="F";
}
System.out.println("the scgpa and grade is "+scgpa+" and "+grade);
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
s1[j].calcscgpa();
}
}
}