package collection.map.test.cart;

import java.util.HashMap;
import java.util.Map;

public class Cart {

    private Map<Product,Integer> cartMap = new HashMap<>();

    public void add(Product product, int quantity) {
//        if (cartMap.containsKey(product)) {
//            cartMap.put(product, cartMap.get(product) + quantity);
//        } else {
//            cartMap.put(product, quantity);
//        }
        Integer existingQuantity = cartMap.getOrDefault(product, 0);
        cartMap.put(product, existingQuantity + quantity);
    }

    public void printAll() {
        System.out.println("== 모든 상품 출력 ==");
        for (Product product : cartMap.keySet()) {
            System.out.println("샹품 : " + product+" 수량: " + cartMap.get(product));
        }
    }

    public void minus(Product product, int quantity) {
        int existingQuantity = cartMap.getOrDefault(product, 0);
        int newQuantity = existingQuantity - quantity;
        if (newQuantity <= 0) {
            cartMap.remove(product);
        } else {
            cartMap.put(product, newQuantity);
        }
    }
}
