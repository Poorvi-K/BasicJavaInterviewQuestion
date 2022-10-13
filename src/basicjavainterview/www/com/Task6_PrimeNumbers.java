package basicjavainterview.www.com;
class PrintPrime{
    void primeNumbers(){


        for(int i=1;i<=1000;i++){
             int temp=0;

            for(int j=2;j<=i-1;j++){
                if(i%j==0){
                    temp=temp+1;

                }

            }
       if(temp==0){
           System.out.println(i);
       }
        }

    }

}

public class Task6_PrimeNumbers {
    public static void main(String args[]){
        PrintPrime refprime=new PrintPrime();
        refprime.primeNumbers();



    }
}
