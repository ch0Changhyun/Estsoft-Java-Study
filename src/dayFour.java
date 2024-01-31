//public class dayFour {
//    public static void main(String[] args) {
//        for (int i = 2; i <= 9; i++) {
//
//            for (int j = 1; j <= 9; j++) {
//
//                System.out.println(i + "*" + j + "=" + i * j);
//            }
//        }
//    }
//}
//public class dayFour {
//    public static void main(String[] args) {
//        int coffee = 10;
//        int money = 300;
//        while(money > 0){
//            System.out.println("돈을 받았으니 커피 제공");
//            coffee--;
//            money = money-30;
//            System.out.println("남은 커피의 양은"+coffee+"입니다.");
//            System.out.println("남은 잔액은"+money+"입니다.");
//            if(coffee == 0 || money == 0){
//                System.out.println("커피가 다 떨어졌거나 잔액 부족. 판매 중지!");
//                break;
//            }
//        }
//    }
//}

//public class dayFour {
//        String company;
//        int speed = 100;
//        String sw = "Samsung";
//
//        void speedUp(){
//
//        }
//
//}
// 데일리퀴즈 1
public class dayFour {
    public static void main(String args[]) {
        // for문을 이용해서 a배열의 값을 b배열로 복사해보세요.
        int[][] a = {{1, 2, 3}, {4, 5, 6}};
        int[][] b = new int[3][3];

        // for문 작성하는 부분
//        for(int i=0; i<a.length; i++){
//            for (int j=0; j<a[i].length;j++){
//               b[i][j] = a[i][j];
//            }
//        }

        // a배열과 b배열 출력
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.println("a[" + i + "][" + j + "]: " + a[i][j]);
                System.out.println("b[" + i + "][" + j + "]: " + b[i][j]);
            }
        }
    }
}