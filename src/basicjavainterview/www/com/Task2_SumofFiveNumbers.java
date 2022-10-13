package basicjavainterview.www.com;

class Sum{
    int a=10;
    float b=90.78f;
    int c=111;
    int d= 8989;
    int e=7876;
    float sum;

    float addition(){
        sum=a+b+c+d+e;
        return sum;


    }




}

public class Task2_SumofFiveNumbers {
    public static void main(String args[]){
        Sum refsum=new Sum();
        float result=refsum.addition();
        System.out.println(result);



    }
}
