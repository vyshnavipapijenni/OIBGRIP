import java.util.*;
class Score{
    void display(int s){
        if(s>=9)
        System.out.println("Excellent!!");
        else if(s==8 || s==7)
        System.out.println("Great!!");
        else if(s==6)
        System.out.println("Average!!");
        else
        System.out.println("Very Poor!!");
    }
}
class onlineexams{
public static void main(String[] args){
      Map map=new HashMap(); 
    String name="",email,password;
Scanner sc=new Scanner(System.in);
    int ch; 
    System.out.println(".....................................................................................Welcome To Online Examination Portal!!.......................................................................................");
    while(true){
System.out.println("Enter your Option:\n1.Sign up\n2.Login\n3.Quit");
ch=sc.nextInt();
switch(ch){
case 1:
    System.out.println(".....Sign Up.....");
    System.out.println("Enter your Name");
    name=sc.next();
    System.out.println("Enter your Email");
    email=sc.next();
    System.out.println("Enter your Password");
    password=sc.next();
    map.put(email,password);
     System.out.println("------Registration successful------");
     break;
case 2:int k=0;
    System.out.println(".....Login In.....");
    System.out.println("Enter your Email");
    email=sc.next();
    System.out.println("Enter your Password");
    password=sc.next();
    Set set=map.entrySet();
    Iterator itr=set.iterator();  
        while(itr.hasNext()){  
        Map.Entry entry=(Map.Entry)itr.next();  
        if(email.equals(entry.getKey()) && password.equals(entry.getValue())){
    System.out.println("-------Login Successful-------");
    int choice;
    boolean a=true;
    while(a){
    System.out.println("Enter your Option:\n1.My Account\n2.Exam\n3.Quit");
    choice=sc.nextInt();
    switch(choice){
    case 1:
        System.out.println("Name: "+name);
        System.out.println("Email: "+email);
        int c;
        System.out.println("Enter your Option:\n1.Back\n2.Exit");
        c=sc.nextInt();
        switch(c){
        case 1:
        break;
        case 2:
         System.out.println("Exit the Portal..?\nYes\nNo");
        String e=sc.next();
        if(e.equalsIgnoreCase("Yes"))
        java.lang.System.exit(0);
        else
        break;
        }
        break;
    case 2:
        Score s=new Score();
        boolean b=true;
        while(b){
        int sub;
        System.out.println("Enter Subject:\n1.Java\n2.Web Development\n3.Python\n4.Back\n5.Exit");
        sub=sc.nextInt();
        switch(sub){
        case 1:
            int score=0;
            String opt;
            System.out.println("1. Who invented Java Programming?\na) Guido van Rossum\nb) James Gosling\nc) Dennis Ritchie\nd) Bjarne Stroustrup");
            opt=sc.next();
            if(opt.equals("b")){
            System.out.println("Correct Answer!!");
            score++;
            }
            else{
                 System.out.println("Incorrect Answer!!");
                  System.out.println("Correct Answer is : "+"b");
            }
            System.out.println("2. Which component is used to compile, debug and execute the java programs?\na) JRE\nb) JIT\nc) JDK\nd) JVM");
            opt=sc.next();
            if(opt.equals("c"))
            {
            System.out.println("Correct Answer!!");
            score++;
            }
             else{
                 System.out.println("Incorrect Answer!!");
                  System.out.println("Correct Answer is : "+"c");
            }
             System.out.println("3. Which one of the following is not a Java feature?\na) Object-oriented\nb) Use of pointers\nc) Portable\nd) Dynamic and Extensible");
            opt=sc.next();
            if(opt.equals("d"))
            {
            System.out.println("Correct Answer!!");
            score++;
            }
             else{
                 System.out.println("Incorrect Answer!!");
                  System.out.println("Correct Answer is : "+"d");
            }
            System.out.println("4. Which of these cannot be used for a variable name in Java?\na) identifier & keyword\nb)identifier\nc) keyword\nd) none of the mentioned");
            opt=sc.next();
            if(opt.equals("c"))
            {
            System.out.println("Correct Answer!!");
            score++;
            }
             else{
                 System.out.println("Incorrect Answer!!");
                  System.out.println("Correct Answer is : "+"c");
            }
            System.out.println("5. What is the extension of java code files?\na) .js\nb) .txt\nc) .class\nd) .java");
            opt=sc.next();
            if(opt.equals("d"))
            {
            System.out.println("Correct Answer!!");
            score++;
            }
             else{
                 System.out.println("Incorrect Answer!!");
                  System.out.println("Correct Answer is : "+"d");
            }
            System.out.println("6. Which environment variable is used to set the java path?\na) MAVEN_Path\nb) JavaPATH\nc) JAVA\nd) JAVA_HOME");
            opt=sc.next();
            if(opt.equals("d"))
            {
            System.out.println("Correct Answer!!");
            score++;
            }
             else{
                 System.out.println("Incorrect Answer!!");
                  System.out.println("Correct Answer is : "+"d");
            }
            System.out.println("7. Which statement is true about Java?\na) Java is a sequence-dependent programming language\nb) Java is a code dependent programming language\nc) Java is a platform-dependent programming language\nd) Java is a platform-independent programming language");
            opt=sc.next();
            if(opt.equals("d"))
            {
            System.out.println("Correct Answer!!");
            score++;
            }
             else{
                 System.out.println("Incorrect Answer!!");
                  System.out.println("Correct Answer is : "+"d");
            }
            System.out.println("8. Which of the following is not an OOPS concept in Java?\na) Polymorphism\nb) Inheritance\nc) Compilation\nd) Encapsulation");
            opt=sc.next();
            if(opt.equals("c"))
           {
            System.out.println("Correct Answer!!");
            score++;
            }
             else{
                 System.out.println("Incorrect Answer!!");
                  System.out.println("Correct Answer is : "+"c");
            }
            System.out.println("9. What is not the use of this keyword in Java?\na) Referring to the instance variable when a local variable has the same name\nb) Passing itself to the method of the same class\nc) Passing itself to another method\nd) Calling another constructor in constructor chaining");
            opt=sc.next();
            if(opt.equals("b"))
            {
            System.out.println("Correct Answer!!");
            score++;
            }
             else{
                 System.out.println("Incorrect Answer!!");
                  System.out.println("Correct Answer is : "+"b");
            }
            System.out.println("10. Which of the following is a type of polymorphism in Java Programming?\na) Multiple polymorphism\nb) Compile time polymorphism\nc) Multilevel polymorphism\nd) Execution time polymorphism");
            opt=sc.next();
            if(opt.equals("b"))
            {
            System.out.println("Correct Answer!!");
            score++;
            }
             else{
                 System.out.println("Incorrect Answer!!");
                  System.out.println("Correct Answer is : "+"b");
            }
            System.out.println("Your score is "+score+" out of 10");
            s.display(score);
            break;
        case 2:
            score=0;
            System.out.println("1.Which of the following can read and render HTML web pages\na)Server\nb)head Tak\nc)web browser\nd)empty");
            opt=sc.next();
            if(opt.equals("c"))
            {
            System.out.println("Correct Answer!!");
            score++;
            }
             else{
                 System.out.println("Incorrect Answer!!");
                  System.out.println("Correct Answer is : "+"c");
            }
             System.out.println("2. Who is the father of HTML?\na) Rasmus Lerdorf\nb) Tim Berners-Lee\nc) Brendan Eich\nd) Sergey Brin");
            opt=sc.next();
            if(opt.equals("b"))
            {
            System.out.println("Correct Answer!!");
            score++;
            }
             else{
                 System.out.println("Incorrect Answer!!");
                  System.out.println("Correct Answer is : "+"b");
            }
             System.out.println("3. HTML stands for ____\na) HyperText Markup Language\nb) HyperText Machine Language\nc) HyperText Marking Language\nd) HighText Marking Language");
            opt=sc.next();
            if(opt.equals("a"))
            {
            System.out.println("Correct Answer!!");
            score++;
            }
            else{
                 System.out.println("Incorrect Answer!!");
                  System.out.println("Correct Answer is : "+"a");
            }
             System.out.println("4. What is the correct syntax of doctype in HTML5?\na) </doctype html>\nb) <doctype html>\nc) <doctype html!>\nd) <!doctype html>");
            opt=sc.next();
            if(opt.equals("d"))
            {
            System.out.println("Correct Answer!!");
            score++;
            }
            else{
                 System.out.println("Incorrect Answer!!");
                  System.out.println("Correct Answer is : "+"d");
            }
             System.out.println("5. Which of the following is used to read an HTML page and render it?\na) Web server\nb) Web network\nc) Web browser\nd) Web matrix");
            opt=sc.next();
            if(opt.equals("c"))
            {
            System.out.println("Correct Answer!!");
            score++;
            }
            else{
                 System.out.println("Incorrect Answer!!");
                  System.out.println("Correct Answer is : "+"c");
            }
             System.out.println("6. Which of the following tag is used for inserting the largest heading in HTML?\na) head\nb) <h1>\nc) <h6>\nd) heading");
            opt=sc.next();
            if(opt.equals("b"))
            {
            System.out.println("Correct Answer!!");
            score++;
            }
            else{
                 System.out.println("Incorrect Answer!!");
                  System.out.println("Correct Answer is : "+"b");
            }
             System.out.println("7. In which part of the HTML metadata is contained?\na) head tag\nb) title tag\nc) html tag\nd) body tag");
            opt=sc.next();
            if(opt.equals("a"))
            {
            System.out.println("Correct Answer!!");
            score++;
            }
            else{
                 System.out.println("Incorrect Answer!!");
                  System.out.println("Correct Answer is : "+"a");
            }
             System.out.println("8. Which element is used to get highlighted text in HTML5?\na) <u>\nb) <mark>\nc) <highlight>\nd) <b>");
            opt=sc.next();
            if(opt.equals("b"))
            {
            System.out.println("Correct Answer!!");
            score++;
            }
            else{
                 System.out.println("Incorrect Answer!!");
                  System.out.println("Correct Answer is : "+"b");
            }
             System.out.println("9. Which of the following is not a HTML5 tag?\na) <track>\nb) <video>\nc) <slider>\nd) <source>");
            opt=sc.next();
            if(opt.equals("c"))
            {
            System.out.println("Correct Answer!!");
            score++;
            }
            else{
                 System.out.println("Incorrect Answer!!");
                  System.out.println("Correct Answer is : "+"c");
            }
            System.out.println("10. Which element is used for or styling HTML5 layout?\na) CSS\nb) jQuery\nc) JavaScript\nd) PHP");
            opt=sc.next();
            if(opt.equals("a"))
            {
            System.out.println("Correct Answer!!");
            score++;
            }
            else{
                 System.out.println("Incorrect Answer!!");
                  System.out.println("Correct Answer is : "+"a");
            }
            System.out.println("Your score is "+score+" out of 10");
            s.display(score);
            break;
        case 3:
            score=0;
            System.out.println("1. Who developed Python Programming Language?\na) Wick van Rossum\nb) Rasmus Lerdorf\nc) Guido van Rossum\nd) Niene Stom");
            opt=sc.next();
            if(opt.equals("c"))
            {
            System.out.println("Correct Answer!!");
            score++;
            }
            else{
                 System.out.println("Incorrect Answer!!");
                  System.out.println("Correct Answer is : "+"c");
            }
             System.out.println("2. Which type of Programming does Python support?\na) object-oriented programming\nb) structured programming\nc) functional programming\nd) all of the mentioned");
            opt=sc.next();
            if(opt.equals("d"))
            {
            System.out.println("Correct Answer!!");
            score++;
            }
            else{
                 System.out.println("Incorrect Answer!!");
                  System.out.println("Correct Answer is : "+"d");
            }
             System.out.println("3. Is Python case sensitive when dealing with identifiers?\na) no\nb) yes\nc) machine dependent\nd) none of the mentioned");
            opt=sc.next();
            if(opt.equals("b"))
            {
            System.out.println("Correct Answer!!");
            score++;
            }
            else{
                 System.out.println("Incorrect Answer!!");
                  System.out.println("Correct Answer is : "+"b");
            }
             System.out.println("4. Which of the following is the correct extension of the Python file?\na) .python\nb) .pl\nc) .py\nd) .p");
            opt=sc.next();
            if(opt.equals("c"))
            {
            System.out.println("Correct Answer!!");
            score++;
            }
            else{
                 System.out.println("Incorrect Answer!!");
                  System.out.println("Correct Answer is : "+"c");
            }
             System.out.println("5. All keywords in Python are in ___\na) Capitalized\nb) lower case\nc) UPPER CASE\nd) None of the mentioned");
            opt=sc.next();
            if(opt.equals("d"))
            {
            System.out.println("Correct Answer!!");
            score++;
            }
            else{
                 System.out.println("Incorrect Answer!!");
                  System.out.println("Correct Answer is : "+"d");
            }
             System.out.println("6. What will be the value of the following Python expression?\n4 + 3 % 5\na) 7\nb) 2\nc) 4\nd) 1");
            opt=sc.next();
            if(opt.equals("a"))
            {
            System.out.println("Correct Answer!!");
            score++;
            }
            else{
                 System.out.println("Incorrect Answer!!");
                  System.out.println("Correct Answer is : "+"a");
            }
             System.out.println("7. Which of the following is used to define a block of code in Python language?\na) Indentation\nb) Key\nc) Brackets\nd) All of the mentioned");
            opt=sc.next();
            if(opt.equals("a"))
            {
            System.out.println("Correct Answer!!");
            score++;
            }
            else{
                 System.out.println("Incorrect Answer!!");
                  System.out.println("Correct Answer is : "+"a");
            }
             System.out.println("8. Which keyword is used for function in Python language?\na) Function\nb) def\nc) Fun\nd) Define");
            opt=sc.next();
            if(opt.equals("b"))
            {
            System.out.println("Correct Answer!!");
            score++;
            }
            else{
                 System.out.println("Incorrect Answer!!");
                  System.out.println("Correct Answer is : "+"b");
            }
             System.out.println("9. Which of the following character is used to give single-line comments in Python?\na) //\nb) #\nc) !\nd) /*");
            opt=sc.next();
            if(opt.equals("b"))
            {
            System.out.println("Correct Answer!!");
            score++;
            }
            else{
                 System.out.println("Incorrect Answer!!");
                  System.out.println("Correct Answer is : "+"b");
            }
             System.out.println("10. Which of the following functions is a built-in function in python?\na) factorial()\nb) print()\nc) seed()\nd) sqrt()");
            opt=sc.next();
            if(opt.equals("b"))
            {
            System.out.println("Correct Answer!!");
            score++;
            }
            else{
                 System.out.println("Incorrect Answer!!");
                  System.out.println("Correct Answer is : "+"b");
            }
            System.out.println("Your score is "+score+" out of 10");
            s.display(score);
            break;
        case 4:
        b=false;
            break;
        case 5:
        System.out.println("Exit the Portal..?\nYes\nNo");
        String e=sc.next();
        if(e.equalsIgnoreCase("Yes"))
        java.lang.System.exit(0);
        else
        break;
        }
        }
        break;
    case 3:
    a=false;
    }
    }
    k=1;
    break;
        }
        }
        if(k==0)
        System.out.println("Invalid details....!");
    break;
case 3:
    System.out.println("Exit the Portal..?\nYes\nNo");
    String e=sc.next();
    if(e.equalsIgnoreCase("Yes"))
     java.lang.System.exit(0);
     else
     break;
}
}
}
}
