package task1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Integer> listOfIntegers = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            listOfIntegers.add((int) (Math.random() * 20));
        }
        System.out.println(listOfIntegers);

        Stream<Integer> stream1 = listOfIntegers.stream();
        System.out.print("\nудаляем дубликаты\nрезультат:");
        System.out.println(stream1.distinct().collect(Collectors.toList()));

        Stream<Integer> stream2 = listOfIntegers.stream();
        System.out.print("\nВыводим все четные элементы в диапазоне от 7 до 17 (включительно)\nрезультат:");
        System.out.println(stream2.filter((element) -> element % 2 == 0 && element >= 7 && element <= 17).collect(Collectors.toList()));

        Stream<Integer> stream3 = listOfIntegers.stream();
        System.out.print("\nКаждый элемент умножаем на 2\nрезультат:");
        System.out.println(stream3.map((element) -> element * 2).collect(Collectors.toList()));

        Stream<Integer> stream4 = listOfIntegers.stream();
        System.out.print("\nCортируем и выводим на экран первых 4 элемента\nрезультат:");
        System.out.println(stream4.sorted().limit(4).collect(Collectors.toList()));

        Stream<Integer> stream5 = listOfIntegers.stream();
        System.out.print("\nВыводим количество элементов в стриме\nрезультат:");
        long count = stream5.count();
        System.out.println(count);

        Stream<Integer> stream6 = listOfIntegers.stream();
        System.out.print("\nВыводим среднее арифметическое всех чисел в стриме\nрезультат:");
        System.out.println(stream6.reduce(Integer::sum).get() / count);

        int sum = 0;
        for (Integer intehre : listOfIntegers) {
            sum += intehre;
        }
        System.out.println(sum/20);

    }

}

