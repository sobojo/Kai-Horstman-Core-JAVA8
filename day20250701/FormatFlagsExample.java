package day20250701;

public class FormatFlagsExample {

    public static void main(String[] args) {
         int positive = 1234;
        int negative = -1234;

        System.out.printf("기본 숫자: %d%n", positive);

        // 부호 항상 표시 (+)
        System.out.printf("부호 표시: %+d, %+d%n", positive, negative);

        // 빈 공간 0으로 채우기 (0)
        System.out.printf("0채우기: %010d%n", positive);

        // 왼쪽 정렬 (-)
        System.out.printf("왼쪽 정렬: %-10d 끝%n", positive);

        // 부호가 없으면 빈칸 추가 (space)
        System.out.printf("빈칸 부호: % d, % d%n", positive, negative);

        // 천 단위 구분 기호 (,)
        System.out.printf("천 단위 구분: %,d%n", 1234567890);

        // 음수 괄호로 감싸기 (()
        System.out.printf("음수 괄호: %(d, %(d%n", positive, negative);

        // 여러 플래그 조합
        System.out.printf("조합: %0,+10d%n", positive);
        System.out.printf("조합 음수: %0,+10d%n", negative);
    }
}