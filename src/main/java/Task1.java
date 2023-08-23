import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String readString = scanner.nextLine();
        List<Integer> inputData;
        try {
            inputData = Stream.of(readString.split(" ")).mapToInt(Integer::parseInt).boxed().toList();

        } catch (NumberFormatException e) {
            System.out.println("invalid input");
            return;
        }
        inputData.stream().sorted().distinct().map(o -> o + " ").forEach(System.out::print);
        System.out.println();
        System.out.println("count: " + inputData.stream().count() + "\n"
                + "distinct: " + inputData.stream().distinct().count() + "\n"
                + "min: " + inputData.stream().min(Integer::compare).orElse(null) + "\n"
                + "max: " + inputData.stream().max(Integer::compare).orElse(null)
        );
    }
}
