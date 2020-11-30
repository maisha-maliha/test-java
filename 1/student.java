import java.util.Scanner;

class Student{
  String name;
  int roll;
  int age;
  int marks;
  String subject;
  void divide(){
    if(marks<=40){
      System.out.println(name +"( " + age + ")"+",You failed. You got" + marks);
    } else if (marks>40 && marks <= 59){
      System.out.println(name +"( " + age + ")"+",You got C grade. You got " + marks);
    } else if (marks>59 && marks <= 79){
        System.out.println(name +"( " + age + ")"+",You got B grade. You got " + marks);
    } else {
      System.out.println(name +"( " + age + ")"+",You got A grade. You got " + marks);
    }
  }
}
class Test{
  public static void main(String args[]){
    Scanner inp = new Scanner(System.in);
    Student student = new Student();
    Boolean value = true;
    while(value){
      System.out.println("Enter Name:");
      student.name = inp.nextLine();
      System.out.println("Enter Roll:");
      student.roll = inp.nextInt();
      System.out.println("Enter age:");
      student.age = inp.nextInt();
      System.out.println("Enter Marks:");
      student.marks = inp.nextInt();
      student.divide();
      System.out.println("Do you want to contine: (y/n)");
      char n = 'n';
      char ans = inp.next().charAt(0);
      if(ans == n){
        value = false;
      }
    }
    System.exit(0);
  }
}
