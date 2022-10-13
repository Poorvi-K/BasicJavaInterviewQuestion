package basicjavainterview.www.com;

import java.util.Scanner;

class StudentsMarks{

    static void marks(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Please enter the student marks");
        int scrodedmarks=sc.nextInt();

        if(scrodedmarks>80){
            System.out.println("You have scored:"  +scrodedmarks);

        }






    }






        }

public class Task8_StudentMarks {
    public static void main(String args[]){
      StudentsMarks.marks();
    }
}
