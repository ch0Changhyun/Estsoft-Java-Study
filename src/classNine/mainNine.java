// 예회처리 연습
package classNine;

//import java.io.BufferedReader;
//import java.io.FileReader;
//import java.io.IOException;

//public class mainNine {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new FileReader("존재 x"));
//        br.readLine();
//        br.close();
//    }
//}
// 예외처리 후
//public class mainNine {
//    public static void main(String[] args) {
//        try {
//            BufferedReader br = new BufferedReader(new FileReader("존재하지_않는_파일"));
//            br.readLine();
//            br.close();
//        } catch (IOException e) {
//            System.out.println("error message: " + e.getMessage());
//        }
//    }
//}

//public class mainNine {
//    public static void main(String[] args) {
//        int result = 5 / 0;
//    }
//}

public class mainNine {
    public static void main(String[] args) {
        int[] array = {3, 4, 5, 6};
        System.out.println(array[5]);
    }
}
