//public class dayThree {
//    public static void main(String[] args){
//        boolean play = true;
//        System.out.println(play);
//
//        play = !play;
//        System.out.println(play);
//
//        play = !play;
//        System.out.println(play);
//    }
//}

//1
//public class dayThree {
//    public static void main(String[] args){
//        int number1 = 10;
//        double number2 = 2.0;
//        int result1 = number1 + (int)number2;
//        int result2 = number1 - (int)number2;
//        int result3 = number1 * (int)number2;
//        int result4 = number1 / (int)number2;
//        System.out.println(result1);
//        System.out.println(result2);
//        System.out.println(result3);
//        System.out.println(result4);
//    }
//}

//2-1
//public class dayThree {
//    public static void main(String args[]) {
//        // 아래 코드의 출력값은 무엇일까요? 17
//        System.out.println(10 / 2 + 3 * 4);
//    }
//}

//2-2
//public class dayThree {
//    public static void main(String args[]) {
//        // 아래 코드의 출력값은 무엇일까요? 11 10 11 10
//        int number = 10;
//
//        int result1 = number + 1;
//        int result2 = number++;
//        int result3 = number;
//        int result4 = --number;
//
//        System.out.println(result1);
//        System.out.println(result2);
//        System.out.println(result3);
//        System.out.println(result4);
//    }
//}

//2-3
//public class dayThree {
//    public static void main(String args[]) {
//        // 아래 코드의 출력값은 무엇일까요? false true true
//        int num1 = 5;
//        int num2 = 7;
//
//        System.out.println((num1 > 5) && (num2 > 5));
//        System.out.println((num1 > 5) || (num2 > 5));
//        System.out.println(!((num1 > 5) && (num2 > 5)));
//    }
//}

// 3 i는 2의 배수 또는 3의 배수이다.
//public class dayThree {
//    public static void main(String[] args){
//        //int i = ; -> 초기화 선언
//        System.out.println((i % 2 == 0) || (i % 3 == 0));
//    }
//}

//4
//public class dayThree {
//    public static void main(String args[]) {
//        // 아래 코드의 실행 결과가 true가 되도록 수정해보세요.
//        String str1 = "Hello world!";
//        String str2 = "Hello world!";
//
//        System.out.println(str1 == str2);
//    }
//}

//5.1
//class Solution {
//    public int solution(int number, int n, int m) {
//        if (number % n == 0 && number % m == 0){
//            return 1;
//        } else{
//            return 0;
//        }
//    }
//}

//5.2
//class Solution {
//    public int solution(int num, int n) {
//        int answer = 0;
//        return (num % n == 0) ? 1 : answer;
//    }
//}

//5.3
//class Solution {
//    public int solution(int a, int b, boolean flag) {
//        return flag ? (a + b) : (a - b);
//
//    }
//}