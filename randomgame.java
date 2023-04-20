import java.util.*;
class NumberGuessingGame{
public static void main(String[] args){
Random r=new Random();
Scanner sc=new Scanner(System.in);
int d=0,ch,n=0;
while(true){
System.out.println("Enter your choice:\n1.Start the game\n2.Quit");
ch=sc.nextInt();
int a=r.nextInt(100);
switch(ch){
    case 1:
    n++;
System.out.println("Round "+n+" starts");
int c=0;
while(true){
System.out.println("Guess the Number.....");
int b=sc.nextInt();
if(b==a){
System.out.println(".......................................................................................................Win.......................................................................................................\n"+"Number is "+a);
System.out.println(" * Score is "+(100-(c*10))+" *");
break;
}
else if(b>a){
if(c!=10){
System.out.println("Little Low");
}
}
