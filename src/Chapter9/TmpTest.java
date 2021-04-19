package Chapter9;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class TmpTest {
    public static void main(String[] args) {
        List<String> names = List.of("Peter","Paul","Mary");
        Set<Integer> numbers = Set.of(2,3,5);
        Map<String,Integer> scores = Map.of("Peter",2,"Paul",3,"Mary",5);
        System.out.println(names);
        System.out.println(numbers);
        System.out.println(scores);
    }
}
