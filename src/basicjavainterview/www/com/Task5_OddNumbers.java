package basicjavainterview.www.com;
class OddNumber{

    void printOddNumber(){
        for(int i=1;i<=50;i++){

            if(i%2!=0){
                System.out.println(i);
            }
        }


    }


}

public class Task5_OddNumbers {
    public static void main(String args[]){
        OddNumber refoddnumb=new OddNumber();
        refoddnumb.printOddNumber();




    }
}
