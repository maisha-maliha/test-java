import java.util.Scanner;

class Student{
  String name;
  int roll;
  int age;
  int marks;
  String subject;
}
class Test{
  public static void main(String args[]){
    Scanner inp = new Scanner(System.in);
    System.out.println("Enter Number of student:");
    int number = inp.nextInt();
    Student[] students = new Student[number];
    int i;
    for( i = 0 ; i < number; i++){
      // Student student[i] = new Student();
        System.out.println("Enter Name:");
        String name = inp.next();
        System.out.println("Enter Roll:");
        int roll = inp.nextInt();
        System.out.println("Enter age:");
        int age = inp.nextInt();
        System.out.println("Enter Marks:");
        int marks = inp.nextInt();
        Student student = new Student();
        student.name = name;
        student.roll = roll;
        student.age = age;
        student.marks = marks;
        // student.divide();
        students[i] = student;
    }
    boolean j = true;
    int[] fail = new int[number];
    for(i = 0 ; i < number; i++){
      if(students[i].marks <= 40){
        if(j){
            System.out.println("Students who Failed:");
            j = false;
        }
        System.out.println(students[i].name + " (" + ")  - Failed");
      }
    }
    for(i = 0 ; i < number; i++){
      if(students[i].marks <= 40){
        if(j){
            System.out.println("Students who Failed:");
            j = false;
        }
        System.out.println(students[i].name + " (" + students[i].age + ")  - Failed");
      }
    }
    j = true;
    for(i = 0 ; i < number; i++){
      if(students[i].marks > 40 && students[i].marks < 60){
        if(j){
            System.out.println("Students who got C:");
            j = false;
        }
        System.out.println(students[i].name + " (" + students[i].age + ")  - " + students[i].roll);
      }
    }
    j = true;
    for(i = 0 ; i < number; i++){
      if(students[i].marks > 60 && students[i].marks < 80){
        if(j){
            System.out.println("Students who got B:");
            j = false;
        }
        System.out.println(students[i].name + " (" + students[i].age + ")  - " + students[i].roll);
      }
    }
    j = true;
    for(i = 0 ; i < number; i++){
      if(students[i].marks > 80 && students[i].marks <= 100){
        if(j){
            System.out.println("Students who got A:");
            j = false;
        }
        System.out.println(students[i].name + " (" + students[i].age + ")  - " + students[i].roll);
      }
    }
    System.out.println(students[0].marks);
    System.exit(0);
  }
}
