import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class exam클로져 {

    List<Integer> 곱셈리스트 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

    private Integer 단 = 2;

    public void main(String[] args) {
        new exam클로져().구구단(단);
    }

    public void 구구단(int y){
        System.out.println(구구단계산(곱셈리스트.stream(), y).collect(Collectors.toList()));
    }

    private Stream<String> 구구단계산(Stream<Integer> stream, Integer y) {
        return stream.map(it -> y + " * " + it + " = "+ it * y);
    }
}
