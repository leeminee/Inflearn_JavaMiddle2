package generic.test.ex5;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class WildCardMain1 {

    public static void main(String[] args) {
        Box<Object> objectBox = new Box<>();
        Box<Dog> dogBox = new Box<>();
        Box<Cat> catBox = new Box<>();

        dogBox.set(new Dog("멍멍이", 100));

        WildCardEx.printGenericV1(dogBox);
        WildCardEx.printWildCard(dogBox);

        WildCardEx.printGenericV2(dogBox);
        WildCardEx.printWildCard2(dogBox);

        Dog dog = WildCardEx.printAndReturnGeneric(dogBox);
        Animal animal = WildCardEx.printAndReturnWild(dogBox);

    }
}
