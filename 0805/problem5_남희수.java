import java.util.Scanner;

public class sol5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("문자열을입력하세요");
            String s = sc.nextLine();

            if (s.length() == 0 || s.length() > 5) {
                System.out.println("길이는 1이상 5이하입니다");
                continue;
            }

            if (s.charAt(0) == '0') {
                System.out.println(" 0으로 시작하지 않습니다");
                continue;
            }
            if ((s.charAt(0) == '-') || (s.charAt(0) == '+')) {
                String result = s.substring(1, s.length());
                if (result.matches("^[0-9]*$")) {
                    System.out.println(s);
                    sc.close();
                    break;
                } else {
                    System.out.println("부호와 숫자로만 이루어져있습니다");
                    continue;
                }
            } else {
                if (s.matches("^[0-9]*$")) {
                    System.out.println(s);
                    sc.close();
                    break;
                } else {
                    System.out.println("부호와 숫자로만 이루어져있습니다");
                    continue;
                }
            }
        }
    }
}
