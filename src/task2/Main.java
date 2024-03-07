package task2;

import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        String[] names = {"Артём Астапчик",
                "Алина Илькевич",
                "Анастасия Иргалиева",
                "Артём Каральчук",
                "Никита Крайко",
                "Олег Манеев",
                "Иван Михновецкий",
                "Кирилл Паляница",
                "Руслан Рябухин",
                "Евгений Саркисов",
                "Павел Свинко",
                "Руслан Семенчик",
                "Руслан Третяк",
                "Александр Хамицкий",
                "Даниил Чаботько",
                "Алексей Шубин",
                "Владислав Колос"};
        List<String> listOfNames = List.of(names);
        Optional<String> optional = listOfNames.stream().filter((str) -> str.substring(0, 1)
                .equalsIgnoreCase("а")).sorted().findFirst();
        if (optional.isPresent()) {
            System.out.println(optional.get());
        } else {
            System.out.println("нет имён, начинающихся на 'а'");
        }
    }
}
