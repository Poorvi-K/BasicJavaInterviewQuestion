package basicjavainterview.www.com;
class EvenNumber{

    void printEven(){

        for(int i=1; i<=200;i++){

            if(i%2==0){
                System.out.println(i);
            }


        }


    }




}

public class Task4_EvenNumbers {
    public static void main(String args[]){
        EvenNumber refeven=new EvenNumber();
        refeven.printEven();



    }
}
