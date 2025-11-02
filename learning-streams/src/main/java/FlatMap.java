import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class FlatMap {

    public static void main(String[] args) {

        record City(String name, int population) {}
        record Country(String name, List<City> cities) {}

        City newYork= new City("New York", 8_258);
        City losAngeles = new City("Los Angeles", 3_821);
        Country usa = new Country("USA", List.of(newYork, losAngeles));

        City london = new City("London", 8_866);
        City manchester = new City("Manchester", 568);
        Country uk = new Country("United Kindgom", List.of(london, manchester));

        City paris = new City("Paris", 2_103);
        City marseille = new City("Marseille", 877);
        Country france = new Country("France", List.of(paris, marseille));

        List<Country> countries = List.of(usa, uk, france);

        int totalPopulation = countries
                .stream()
                .flatMap(country -> country.cities().stream())
                .mapToInt(country -> country.population)
                .sum();

        System.out.println("total population = " + totalPopulation);




        List<Integer> ints = List.of(1, 4, 2, 1, 3, 3);

        List<Integer>  distincts = ints.stream()
                        .distinct()
                        .toList();
        System.out.println("distinct ints: " + distincts);


        List<String> strings = List.of("one", "two", "three", "four");

        List<String> naturalSort =
                strings.stream()
                        .sorted()
                        .toList();
        System.out.println("natural sort: " + naturalSort);

        List<String> shortestFirst =
                strings.stream()
                        .sorted(Comparator.comparingInt(String::length))
                        .toList();
        System.out.println("shortest first: " + shortestFirst);

        List<Integer> list0 = List.of(1, 2, 3);
        List<Integer> list1 = List.of(4, 5, 6);
        List<Integer> list2 = List.of(7, 8, 9);

        // 1st pattern: concat
        List<Integer> concat =
                Stream.concat(list0.stream(), list1.stream())
                        .toList();

        // 2nd pattern: flatMap
        List<Integer> flatMap =
                Stream.of(list0.stream(), list1.stream(), list2.stream())
                        .flatMap(Function.identity())
                        .toList();

        System.out.println("concat  = " + concat);
        System.out.println("flatMap = " + flatMap);


        List<String> strings1 = List.of("one", "two", "three", "four");

        List<String> result =
                strings1.stream()
                        .peek(s -> System.out.println("Starting with = " + s))
                        .filter(s -> s.startsWith("t"))
                        .peek(s -> System.out.println("Filtered = " + s))
                        .map(String::toUpperCase)
                        .peek(s -> System.out.println("Mapped = " + s))
                        .toList();
        System.out.println("result = " + result);
    }
}
