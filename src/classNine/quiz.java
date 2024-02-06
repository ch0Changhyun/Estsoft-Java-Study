package classNine;

// 1. 예외에 대한 설명 중 틀린것은? 4) 자바 표준 예외만 프로그램에서 처리할 수 있다

// 2. try-catch-finally 블록에 대한 설명 중 틀린 것은? 3) try { } 블록에서 return문을 사용하면 finally { } 블록은 실행되지 않는다.

// 3. throws에 대한 설명으로 틀린 것은? 4) 새로운 예외를 발생시키기 위해 사용된다.

// 4. throw에 대한 설명으로 틀린 것은? 2) 예외를 호출한 곳으로 떠넘기기 위해 메소드 선언부에 작성된다.

// 5. 다음과 같은 메소드가 있을 때 예외를 잘못 처리한 것은 무엇입니까?  3) try { method1(); } catch(Exception e) { } catch(ClassNotFoundException e) { }
//public void method1() throws NumberFormatException, ClassNotFoundException { ... }

// 6. 다음 코드가 실행되었을 때 출력 결과는 무엇입니까?
//10
//숫자로 변환할 수 없음
//10
public class quiz {
    public static void main(String[] args) {
        String strArray[] = {"10", "23b"};
        int value = 0;
        for (int i = 0; i < 2; i++) {
            try {
                value = Integer.parseInt(strArray[i]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("인덱스를 초과하였음");
            } catch (NumberFormatException e) {
                System.out.println("숫자로 변환할 수 없음");
            } finally {
                System.out.println(value);
            }
        }
    }

}
// 7. 빈칸 답
//public class quiz {
//    public static void login(String id, String password) throws NotExistIDException, WrongPasswordException {
//        if (!id.equals("blue")) {
//            throw new NotExistIDException("아이디가 존재하지 않습니다.");
//        }
//
//        if (!password.equals("12345")) {
//            throw new WrongPasswordException("패스워드가 틀립니다.");
//        }
//    }
//}
//
//public WrongPasswordException(String message) {
//    super(message);
//
//}
//public NotExistIDException(String message){
//    super(message);
//}

