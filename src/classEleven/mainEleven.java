package classEleven;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class mainEleven {
public static void main(String[] args) {
    String filePath = System.getProperty("user.dir");
    BufferedReader br = null;
    try {
        br = new BufferedReader(new FileReader(filePath));
        System.out.println(br.readLine());
        br.close();
    } catch(FileNotFoundException e) {
        //예외처리 로직
    } catch (IOException e) {
        //예외처리 로직
    } finally {
        if(br != null) {
            try {
                br.close();
            } catch(IOException e) {
                // 예외처리
            }
        }

    }
}

}
/*
public static void main(String[] args) {
String filePath = System.getProperty("user.dir");
BufferedReader br = null;
try {
br = new BufferedReader(new FileReader(filePath + "/src/com/res/test.txt"));
System.out.println(br.readLine());
} catch (FileNotFoundException e) {

} catch (IOException e) {

} finally {
if(br != null) {
try {
br.close();
} catch (IOException e) {

}
}
}
}
*/