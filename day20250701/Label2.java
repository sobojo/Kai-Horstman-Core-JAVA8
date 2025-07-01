package day20250701;

public class Label2 {
    // 이러한 Label의 사용은 코드 가독성을 떨어트려 비권고
    public static void main(String[] args) {
        System.out.println("시작");

        exit: {
            System.out.println("1단계");
            if (true) break exit; // exit 블록 탈출
            System.out.println("2단계 (출력 안 됨)");
        }

        System.out.println("종료");
    }
}
