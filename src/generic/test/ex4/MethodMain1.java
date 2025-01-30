package generic.test.ex4;

public class MethodMain1 {

    public static void main(String[] args) {
        Integer i = 10;
        Object obj = GenericMethod.objectMethod(i);

        // 타입 인자 명시적 전달
        System.out.println("명시적 타입 인자 전달");
        Integer result = GenericMethod.<Integer>genericMethod(i);
        Integer integerValue = GenericMethod.<Integer>genericMethod(15);
        Double doubleValue = GenericMethod.<Double>genericMethod(20.5);

        System.out.println("타입 추론");
        Integer result1 = GenericMethod.genericMethod(i);
        Integer integerValue1 = GenericMethod.genericMethod(15);
        Double doubleValue1 = GenericMethod.genericMethod(20.5);

    }
}
