package basicjavainterview.www.com;

class SwaptwoNumber{
    int a=10;
    int b=20;
    int t;
    void swapNumber(){
        t=a;
        a=b;
        b=t;
        System.out.println("Value of a : " +a);
        System.out.println("Value of b :" +b);

    }





}

public class Task1_SwapNumber {
    public static void main(String args[]){

        SwaptwoNumber refswap=new SwaptwoNumber();
        refswap.swapNumber();


    }
}
