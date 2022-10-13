package basicjavainterview.www.com;

class Star{

    void printStar(){

        for(int i=1; i<=6;i++){

            for(int j=1;j<=i;j++){

                System.out.print("x");
            }
            System.out.println();
        }



    }




}

public class Task7_StarPattern {

public static void main(String args[]){

Star refstar=new Star();
refstar.printStar();

}

}

