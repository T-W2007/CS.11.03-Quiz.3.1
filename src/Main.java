public class Main {

    // Question 1 - calculateGrade
    public static char calculateGrade(int score) {
        if (score >= 90) {
            return 'A';
        } else if (score >= 80) {
            return 'B';
        } else if (score >= 70) {
            return 'C';
        } else if (score >= 60) {
            return 'D';
        } else if (score >= 50) {
            return 'E';
        } else {
            return 'F';
        }
    }
    public static String fizzBuzz(int number){
        if(number % 5 ==0 && number % 3 ==0){
            return "fizzbuzz";
        }
        else if(number % 5 ==0){
            return "buzz";
        }
        else if(number % 3 ==0 ){
            return "fizz";
        }
        else{
            return "unlucky";
        }
    }

    public static String frontBack(String str) {
        if (str.length() < 2) {
            return str;
        }
        String front = str.substring(0, 2);
        return front + str + front;
    }

    public static boolean twoAsOne(int a, int b, int c) {
        if (a + b == c || a + c == b || b + c == a) {
            return true;
        } else {
            return false;
        }
    }

    public static String endUp(String str) {
        if (str.length() <= 3) {
            return str.toUpperCase();
        } else {
            String front = str.substring(0, str.length() - 3);
            String end = str.substring(str.length() - 3).toUpperCase();
            return front + end;
        }
    }

    // Question 2 - fizzBuzz

    // Question 3 - frontBack

    // Question 4 - twoAsOne

    // Question 5 - endUp

}
