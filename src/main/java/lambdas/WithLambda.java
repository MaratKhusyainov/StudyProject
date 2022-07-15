package lambdas;

import java.util.ArrayList;
import java.util.List;

public class WithLambda {
    public static void main(String[] args) {

        List<Animal> animals = new ArrayList<>();

        animals.add(new Animal("Fish", false, true));
        animals.add(new Animal("Kangaroo", true, false));
        animals.add(new Animal("Rabbit", true, false));
        animals.add(new Animal("Turtle", false, true));

        print(animals, a -> a.canSwim());
    }


    private static void print(List<Animal> animals, CheckTrait checker) {

        for(Animal animal : animals) {
            if (checker.test(animal)) {
                System.out.println(animal + " ");
            }
        }
        System.out.println();
    }
}
