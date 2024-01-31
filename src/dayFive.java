public class dayFive {
    public static void main(String[] args) {
        add(1, 2);
        add(1,3,1);
        add(1.1,1.1);
    }

    public static int add(int a, int b) {
        int sum = a + b;
        System.out.println("a와 b의 합은 " + sum + " 입니다.");
        return sum;
    }
    public static int add(int a, int b, int c) {
        int sum = a + b + c;
        System.out.println("a와 b와 c의 합은 " + sum + " 입니다.");
        return sum;
    }
    public static double add(double a, double b) {
        double sum = a + b;
        System.out.println("a와 b의 합은 " + sum + " 입니다.");
        return sum;
    }
}

// static x -> Calculator cal = new Calculator

