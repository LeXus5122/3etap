import java.util.*;

public class z51 {
    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> phoneBook = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        int action;

        do {
            System.out.println("Выберите действие: 1 - Добавить, 2 - Показать все, 3 - Выйти");
            action = scanner.nextInt();
            scanner.nextLine(); 

            if (action == 1) {
                System.out.println("Введите имя и номер телефона через пробел:");
                String[] input = scanner.nextLine().split(" ");

                String name = input[0];
                String number = input[1];

                if (phoneBook.containsKey(name)) {
                    phoneBook.get(name).add(number);
                } else {
                    ArrayList<String> numbers = new ArrayList<>();
                    numbers.add(number);
                    phoneBook.put(name, numbers);
                }

            } else if (action == 2) {
                List<Map.Entry<String, ArrayList<String>>> entries = new ArrayList<>(phoneBook.entrySet());

                Collections.sort(entries, new Comparator<Map.Entry<String, ArrayList<String>>>() {
                    public int compare(Map.Entry<String, ArrayList<String>> a, Map.Entry<String, ArrayList<String>> b) {
                        return b.getValue().size() - a.getValue().size();
                    }
                });

                for (Map.Entry<String, ArrayList<String>> entry : entries) {
                    System.out.println("Имя: " + entry.getKey() + ", Номера: " + entry.getValue());
                }
            }

        } while (action != 3);

        scanner.close();
    }
}
