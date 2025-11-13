import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<String> strings = List.of("one","two","three","four");

        var map = strings.stream()
                .collect(Collectors.groupingBy(String::length, Collectors.counting()));
        map.forEach((key, value) -> System.out.println(key + " :: " + value));




        record City(int population) {}

        List<City> cities =
                List.of(
                        new City(100_000),
                        new City(200_000),
                        new City(500_000));

        int sum = cities.stream()
                .mapToInt(city -> city.population())
                .filter(population -> population > 100_000)
                .sum();
        System.out.println("Sum = " + sum);

//        Collection<Integer> populations         = cities.map(city -> city.getPopulation());
//        Collection<Integer> filteredPopulations = populations.filter(population -> population > 100_000);
//        int sum                                 = filteredPopulations.sum();


//        Stream<City> streamOfCities         = cities.stream();
//        Stream<Integer> populations         = streamOfCities.map(city -> city.getPopulation());
//        Stream<Integer> filteredPopulations = populations.filter(population -> population > 100_000);
//        int sum = filteredPopulations.sum(); // in fact this code does not compile; we'll fix it later


        List<String> string1 = List.of("one", "two", "three", "four");

        List<Integer> lengths = string1.stream()
                .map(String::length)
                .toList();

        System.out.println("lengths = " + lengths);

        long count = string1.stream()
                .map(String::length)
                .filter(length -> length == 3)
                .count();

        System.out.println("count = " + count);

        String input = "Java articles are Awesome";

        Character result = input.chars() // IntStream of characters
                .mapToObj(c -> Character.toLowerCase((char) c)) // convert to lowercase char
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())) // count occurrences preserving order
                .entrySet()
                .stream()
                .filter(e -> e.getValue() == 1) // only those that appear once
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(null);

        System.out.println("First non-repeated character: " + result);
    }
}
