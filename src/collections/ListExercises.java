package collections;

import java.util.*;

public class ListExercises {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 4, 5, -6, 34, 54, -7, 15, 0, 21);

        //1. wyciagnij z listy liczby parzyste
        System.out.println("Parzyste liczby z listy to: " + showEvenNumbers(numbers));
        System.out.println("Nieparzyste liczby z listy to: " + showOddNumbers(numbers));

        //2. posortuj liste rosnaco/malejaco - poszukaj rozwiazania w internetach (na kilka sposobów)
        System.out.println("Rosnąco: " + sortListAsGrowing(numbers));
        System.out.println("Malejąco: " + sortListAsDeclining(numbers));

        List<String> names = Arrays.asList("Adam", "Stefan", "Marian", "Antoni", "Agnieszka", "James");

        //1. wyciagnij listę imion zaczynajacych sie na litere 'A' i podaj ich liczbe
        List<String> newSortedNamesList = showNamesStartedWithLetter(names);
        System.out.println("Posortowana lista imion: " + newSortedNamesList);

        //2. wyciagnij listę imion dłuższych skaldajacych sie z wiecej niz 5 liter
        System.out.println("Lista imion dłuższych niż 5: " + showNamesWithLengthMoreThan(names, 5));

        //3. sprawdz czy lista zawiera imię "Antoni"
        System.out.println("Czy lista zawiera imię Antoni? " + isContainsName(names, "Antoni"));

        // przy uzyciu listy napisz program ktory sprawdza czy wyraz czytany od tyłu brzmi tak samo np. kajak, potop, mars .... nie mars nie
        System.out.println("Wybrane imię jest panindromem? " + isPalindrome("Mars"));
    }

    private static List<Integer> showEvenNumbers(List<Integer> numbers) {
        List<Integer> evenNumbers = new ArrayList<>();
        for (int i : numbers) {
            int result = i % 2;
            if (result == 0) {
                evenNumbers.add(i);
            }
        }
        return evenNumbers;
    }

    private static List<Integer> showOddNumbers(List<Integer> numbers) {
        List<Integer> oddNumbers = new ArrayList<>();
        for (int i : numbers) {
            int result = i % 2;
            if (result != 0) {
                oddNumbers.add(i);
            }
        }
        return oddNumbers;
    }

    private static List<Integer> sortListAsGrowing(List<Integer> numbers) {
        Collections.sort(numbers);
        return numbers;
    }

    private static List<Integer> sortListAsDeclining(List<Integer> numbers) {
        numbers.sort(Collections.reverseOrder());
        return numbers;
    }

    private static List<String> showNamesStartedWithLetter(List<String> names) {
        System.out.println("Podaj pierwszą literę do filtrowania");
        String letter = scanner.next().toUpperCase();
        List<String> newNamesList = new ArrayList<>();
        for (String name : names) {
            if (name.startsWith(letter)) {
                newNamesList.add(name);
            }
        }
        return newNamesList;
    }

    private static List<String> showNamesWithLengthMoreThan(List<String> names, int length) {
        List<String> newNamesList = new LinkedList<>();
        for (String name : names) {
            if (name.length() > length) {
                newNamesList.add(name);
            }
        }
        return newNamesList;
    }

    private static boolean isContainsName(List<String> names, String name) {
        return names.contains(name);
    }

    private static boolean isPalindrome(String name) {
        String upperCasedName = name.toUpperCase();
        String[] letters = upperCasedName.split("");
        List<String> letterList = Arrays.asList(letters);
        Collections.reverse(letterList);
        StringBuilder builder = new StringBuilder();
        for (String letter : letterList) {
            builder.append(letter);
        }
        return upperCasedName.equals(builder.toString());
    }
}
