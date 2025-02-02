package collection.map.test;

import java.util.HashMap;
import java.util.Map;

public class ArrayToMapTest {

    public static void main(String[] args) {
        String[][] productArr = {{"Java","10000"},{"Spring","20000"},{"JPA","30000"}};

        // 주어진 배열로 부터 Map 생성
        Map<String,Integer> map = new HashMap<>();
        for (String[] product : productArr) {
            map.put(product[0], Integer.valueOf(product[1]));
        }

        // Map 의 모든 데이터 출력
        for (String key : map.keySet()) {
            System.out.println("제품: "+key+", 가격: "+map.get(key));
        }
    }
}
