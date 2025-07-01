package day20250701;

public class Label {
    public static void main(String[] args) {
        
        System.out.println("시작");
        
        outer: while (true) {
            int i = 0;
            while (true) {
                System.out.println(i++);
                if (i > 3) break outer; 
            }
        }

        System.out.println("시스템 종료");
    }
}
