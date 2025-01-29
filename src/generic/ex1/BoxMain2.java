package generic.ex1;

public class BoxMain2 {

    public static void main(String[] args) {
        ObjectBox integerBox = new ObjectBox();
        integerBox.set(10);
        Integer integer = (Integer) integerBox.get();
        System.out.println("Integer = " + integer);

        StringBox stringBox = new StringBox();
        stringBox.set("hello");
        String str = (String) stringBox.get();
        System.out.println("str = " + str);

        // 잘못된 타입의 인수 전달시
        integerBox.set("문자열");
        Integer result = (Integer) integerBox.get();
        System.out.println("result = " + result );

    }
}
