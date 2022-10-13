package basicjavainterview.www.com;

class MatchingNumber{

    static void matchingNumber() {

        int[] number = {12, 34, 66, 85, 900};

        for(int i=0;i<number.length;i++){

            if(number[i]==85){


                break;
            }
            System.out.println(number[i]);


        }


    }


}

public class Task9_MatchingNumber {
    public static void main(String args[]){

        MatchingNumber.matchingNumber();
    }
}
