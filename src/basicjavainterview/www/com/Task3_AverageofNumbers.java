package basicjavainterview.www.com;

class Average{

    static float add(int a, float b, int c, int d, int e){
        float sum=a+b+c+d+e;
        return sum;
    }


}

public class Task3_AverageofNumbers {
    public static void main(String args[]){
        float result=Average.add(10,90.78f,111,8989,7876);
        float average=result/5;
        System.out.println(average);



    }
}
