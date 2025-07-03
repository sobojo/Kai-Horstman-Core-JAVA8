package day20250703;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Arg {
    public static void main(String[] args) {

        // 참조로 전달되면 원본이 변경!
        // 값이 전달되면 원본이 변경 안됨.
        
        // 매개변수의 주소값!!! 을 직접 변경함. - 뭔본 변경 안됨
        Man man = new Man("Bong");
        setMan(man);

        System.out.println(man.getName());

        HashMap<String, String> map = new HashMap<>();
        map.put("Bong", "Bong");
        setHashMap(map);
        System.out.println(map.toString());

        // 매개변수의 주소값!!! 을 직접 변경함.

        // 여기는 매개변수 로 전달된 내부의 값!! 을 변경함 - 뭔본 변경
        List<String> list = new ArrayList<>();
        list.add("Bong");

        setListValue(list);
        System.out.println(list.get(0));
        // 여기는 매개변수 로 전달된 내부의 값!! 을 변경함

    }

    // 즉 
    // 자바에서 매개변수는 메모리의 주소와 값까지 넘겨서 전달

    
    private static void setMan (Man man) {
        man = new Man("Jo");
    }

    private static void setHashMap (HashMap<String, String> map) {
        map = new HashMap<>();
        map.put("Jo", "Jo");
    }

    private static void setListValue (List<String> list) {
        list.set(0, "Jo");
    }
}

class Man {
    private String name;
    public Man (String name) {
        this.name = name;
    }

    public String getName () {
        return this.name;
    }
}