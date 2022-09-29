package StreamApp2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Beasts> beast = getAnimals();

        // Старый подход (Императивный)

//        List<Beasts> predators = new ArrayList<>();
//
//        for (Beasts animal : beast) {
//            if (animal.getClassification().equals(Classification.PREDATOR))
//                predators.add(animal);
//        }



        // Новый подход (Декларативный)
        // Filter
        List<Beasts> herbivore = beast.stream()
                .filter(animal -> animal.getClassification().equals(Classification.HERBIVORE))
                .collect(Collectors.toList());

        // Sort
        List<Beasts> sorted = beast.stream()
                .sorted(Comparator.comparing(Beasts::getAge)
                        .thenComparing(Beasts::getClassification)
                        .reversed())
                        .collect(Collectors.toList());
        // sorted.forEach(System.out::println);
        // All match

        boolean allMatch = beast.stream()
                .allMatch(beasts -> beasts.getAge() > 10);

        // System.out.println(allMatch);
        // Any match
        boolean anyMatch = beast.stream()
                .anyMatch(beasts -> beasts.getAge() > 10);
        System.out.println(anyMatch);
        // None match
        // Max
        // Min
        // Group

    }
    private static List<Beasts> getAnimals() {
        return List.of(
                new Beasts("Elephant", 20, Classification.HERBIVORE),
                new Beasts("Lion", 10, Classification.PREDATOR),
                new Beasts("Wolf", 11, Classification.PREDATOR),
                new Beasts("Giraffe", 7, Classification.HERBIVORE),
                new Beasts("Monkey", 35, Classification.OMNIVOROUS),
                new Beasts("Horse", 36, Classification.HERBIVORE),
                new Beasts("Lynx", 10, Classification.PREDATOR)
        );
    }
}
