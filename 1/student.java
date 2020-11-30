import java.util.Scanner;

class Student{
  String name;
  int roll;
  int age;
  int marks;
  String subject;
  void divide(){
    if(marks<=40){
      System.out.printf("You failed");
    } else if (marks>40 && marks <= 59){
      System.out.printf("You got C grade");
    } else if (marks>59 && marks <= 79){
        System.out.printf("You got B grade");
    } else {
      System.out.printf("You got A grade");
    }
  }
}
class Test{
  public static void main(String args[]){
    Scanner inp = new Scanner(System.in);
  }
}
