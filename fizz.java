import java.util.*;
class fizz{
public static void main(String args[]){
try{
int n;
Scanner sc=new Scanner(System.in);
System.out.println("enter the value:");
n=sc.nextInt();
System.out.print("[ ");
for(int i=1;i<=n;i++){
if(i%15==0){
System.out.print(",FIZZBUZZ,");
}
else if(i%5==0){
System.out.print(",FIZZ,");
}
else if(i%3==0){
System.out.print(",BUZZ,");
}
else{
System.out.print(","+i+",");
}
}
System.out.print("] ");
}
catch(Exception e){
System.out.println("data invalid");
}
}
}