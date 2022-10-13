package basicjavainterview.www.com;

class MatchingString{

    static void matchString(){

        String[] seleniumlangs={"Java","JavaScript", "Selenium", "Python","Mukesh"};
        for(int i=0;i<seleniumlangs.length;i++){
            if(seleniumlangs[i]=="Selenium"){
                break;
            }
            System.out.println(seleniumlangs[i]);
        }

    }



}

public class Task1_MatchingString {
    public static void main(String args[]){
    MatchingString.matchString();



    }
}
