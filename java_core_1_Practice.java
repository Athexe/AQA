public class Main {
    public static void main(String[] args) {
        System.out.println(new Main().plus(24,12));
        System.out.println(numberOfWords(str));
        System.out.println(numberOfCharsInWord(str,4));
    }

    double plus(double a, double b){
        return a+b;
    }
    double minus(double a, double b){
        return a-b;
    }
    double mult(double a, double b){
        return a*b;
    }
    double div(double a, double b){
        return a/b;
    }

    static String str = "One sentence for practice task";

    public static int numberOfWords(String s){
       int a = 0;
       int index = 0;
       while(index<s.length()){
           if(s.charAt(index)==' '){
               a++;
           }
           index++;
       }

       return a+1;
    };

    public static int numberOfCharsInWord(String s,int number){
        int result=0;
        int a = 1;
        int index = 0;
        while(index<s.length()){
            if(s.charAt(index)==' '){
                a++;
            }
            if(a==number){
                result++;
            }
            index++;
        }

        return result-1;
    };


}
