package day20250702;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ArrayTest {
    public static void main(String[] args) {
        int test[] = {1,2,3,4,5};
        System.out.println(test.length);
        test = new int[] {1,2,3};
        System.out.println(test.length);

        int in1 = 1;
        Integer in2 = 1;

        System.out.println(in1 == in2);
        System.out.println(in2.equals(in1));

        int ints1[] = {1,2,3};
        int ints2[] = {1,2,3};

        System.out.println(ints1[1] == ints2[1]);

        List<Integer> ing1 = new ArrayList<Integer>();
        List<Integer> ing2 = new ArrayList<Integer>();

        ing1.add(1);
        ing1.add(2);
        ing1.add(128);

        ing2.add(1);
        ing2.add(2);
        ing2.add(128);

        System.out.println(ing1.get(1) == ing2.get(1));
        //  128, 1000, 9999 같은 값은 객체가 다르게 생성 (Integer 비교시)
        System.out.println(ing1.get(2) == ing2.get(2));

        ing1 = ing2;

        ing2.set(0, 100);
        // ing1 값 변경됨
        System.out.println(ing1.get(0));

        List<StringObject> st = new ArrayList<>();
        List<StringObject> st2 = new ArrayList<>();
        st.add(new StringObject("bong"));

        st2 = st;

        st2.set(0, new StringObject("JO"));

        System.out.println(st.get(0).getKey());

        List<Integer> init = new ArrayList<>(Arrays.asList(1, 2, 3));
        // Collection 대용량 데이터 병렬 정렬
        init.parallelStream().sorted();
        // 배열 대용량 데이터 병렬 정렬
        String[] sList = {"e", "f"};
        Arrays.parallelSort(sList);
    }
}