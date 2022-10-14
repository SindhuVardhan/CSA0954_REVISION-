import java.util.*;
import java.io.*;
import java.lang.*;
class bonus{
public char c;
public String m;
double n;
public void display(){
try{
Scanner sc=new Scanner(System.in);
System.out.println("enter your salary:");
n=sc.nextDouble();
if(n<0){
    System.out.println("***postive numbers only taken***");
    System.exit(1);
    
}
Scanner s=new Scanner(System.in);
System.out.println("enter your grade:");
String g=s.nextLine();
c=g.charAt(0);
}
catch(Exception e){
    System.out.println("invalid data");
}
}
}
class salary extends bonus{
public void money(){
    try{
if(n>10000 && c=='A'|| c=='a'){
double b=n*0.05;
System.out.println("your bonus is:"+b);
}
else if(n>10000 && c=='B'|| c=='b'){
double bn=n*0.1;
System.out.println("your bonus is:"+bn);
}
else{
System.out.println("");
}
}
catch(Exception e){
    System.out.println("invalid data");
}
}
}
class extra extends salary{
public void ex(){
    try{
if(n<10000){
double bno=n*0.07;
System.out.println("your bonus is:"+bno);
}
}
catch(Exception e){
    System.out.println("invalid data");
}
}
}
class emobonus{
public static void main(String args[]){
extra m = new extra();
m.display();
m.money();
m.ex();
}
}







