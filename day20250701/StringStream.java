package day20250701;

public class StringStream {   
    public static void main(String[] args) {
        String test = "test한글";
        for (int i = 0; i < test.length(); i++) {
            // 개별 text의 codePoint
            System.out.println(test.codePointAt(test.offsetByCodePoints(0, i))); 
        }
        
        // 각 문자의 코드포인트 배열
        int [] arrays = test.codePoints().toArray();
        System.out.println(arrays);
    
    }
}