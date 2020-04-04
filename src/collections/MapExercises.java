package collections;

import java.util.*;
import java.util.Map.Entry;

public class MapExercises {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //stworz mape w ktorej kluczem bedzie nazwa państwa a wartości kontynent (kilka par)
        Map<String, String> countriesWithContinents = new HashMap<>();
        countriesWithContinents.put("Niemcy", "Europa");
        countriesWithContinents.put("Polska", "Europa");
        countriesWithContinents.put("Kazachstan", "Azja");
        countriesWithContinents.put("Chile", "Ameryka Południowa");
        countriesWithContinents.put("Chiny", "Azja");
        countriesWithContinents.put("Kanada", "Ameryka Północna");
        countriesWithContinents.put("Brazylia", "Ameryka Południowa");
        countriesWithContinents.put("Algieria", "Afryka");
        countriesWithContinents.put("RPA", "Afryka");
        countriesWithContinents.put("Australia", "Australia i Oceania");
        countriesWithContinents.put("Belgia", "Europa");
        countriesWithContinents.put("Mongolia", "Azja");

        /*Map<String, String> lands = Map.of(
                "Lublin", "lubelskie",
                "Warszawa", "mazowieckie");
        lands.remove("Lublin");*/ //TODO ciekawostka z Mapą (listy i sety też)

        //wyswietl kontynent dla danego kraju
        System.out.println("Wybierz kraj");
        String choosenCountry = scanner.next();
        findContinent(countriesWithContinents, choosenCountry);

        // wyswietl wszystkie panstwa
        System.out.println(countriesWithContinents.keySet());

        // wyswietl wszystkie kontynenty (bez powtórzen)
        List<String> continentsList = showAllContinents(countriesWithContinents);
        System.out.println("W liście użyto kontynenty: " + continentsList);

        // sprawdz czy mapa zawiera Polskę
        System.out.println("Czy lista zawiera kraj Polska? " + countriesWithContinents.containsKey("Polska"));

        // podaj rozmiar mapy
        System.out.println("Mapa zawiera " + countriesWithContinents.keySet().size() + " krajów oraz " +
                continentsList.size() + " kontynentów.");

        // wyswietl wszystkie państwa alfabetycznie
        // DISCLAIMER przy TreeMap sortowanie wykonuje się samo; countreies.keySet()
        System.out.println("Używane państwa to: " + showAllCountries(countriesWithContinents));

        // znajdz kontynent dla którego mamy najwiecej panstw w mapie
        showMostUsedContinents(countriesWithContinents);

        // dodaj listę z kontynentami które chcesz wyszukac. następnei sprawdz ile razy kazdy kontynent z danej listy wystepuje w mapie
        // pobierz kontynent
        // dodaj do listy (pętla)
        // iteracja i sprawdzenie z listą policzonych kontynentów
        // wyświetlenie wybranych par
        showUsageOfTypedContinents(countriesWithContinents);


        //TODO ćwiczenia z setami
    }

    private static void findContinent(Map<String, String> countriesWithContinents, String choosenCountry) {
        String checkedChoosenCountry = countriesWithContinents.get(choosenCountry);
        String outputMessage = checkedChoosenCountry != null ?
                "Kraj " + choosenCountry + " znajduje się w: " + checkedChoosenCountry :
                "Wybrano błędny kraj";
        /*if (checkedChoosenCountry != null) {
            System.out.println("Kraj " + choosenCountry + " znajduje się w: " + checkedChoosenCountry);
        } else {
            System.out.println("Wybrano błędny kraj");
        }*/
        System.out.println(outputMessage);
    }

    private static List<String> showAllContinents(Map<String, String> countriesWithContinents) {
        List<String> continents = new ArrayList<>(countriesWithContinents.values());
        return (removeDuplicates(continents)); //TODO zrobić na przyszłość z setem (bez powtórzeń)
    }

    private static List<String> removeDuplicates(List<String> inputList) {
        List<String> listWithoutDuplicates = new ArrayList<>();
        for (String listObject : inputList) {
            if (!listWithoutDuplicates.contains(listObject)) {
                listWithoutDuplicates.add(listObject);
            }
        }
        return listWithoutDuplicates;
    }

    private static List<String> showAllCountries(Map<String, String> countriesWithContinents) {
        List<String> countriesOnly = new ArrayList<>(countriesWithContinents.keySet());
        Collections.sort(countriesOnly);
        return countriesOnly;
    }

    private static void showMostUsedContinents(Map<String, String> countriesWithContinents) {
        Map<String, Integer> continentsWithUsage = countUsageOfContinents(countriesWithContinents);
        Map<String, Integer> sortedContinentsByUsage = sortContinentsByUsage(continentsWithUsage);
        Map<String, Integer> mostUsageContinents = findMostUsedContinent(sortedContinentsByUsage);
        System.out.println("Najczęściej użytym kontynentem jest: " + mostUsageContinents);
    }

    private static Map<String, Integer> countUsageOfContinents(Map<String, String> countriesWithContinents) {
        Map<String, Integer> continentsWithUsage = new HashMap<>();
        List<String> listOfContinents = new ArrayList<>(countriesWithContinents.values());
        for (String continent : listOfContinents) {
            if (!continentsWithUsage.containsKey(continent)) {
                continentsWithUsage.put(continent, 1);
            } else {
                Integer continentFromList = continentsWithUsage.get(continent);
                continentsWithUsage.replace(continent, continentFromList + 1);
            }
        }
        return continentsWithUsage;
    }

    private static Map<String, Integer> sortContinentsByUsage(Map<String, Integer> countedContinents) {
        List<Entry<String, Integer>> continentsEntriesList = new ArrayList<>(countedContinents.entrySet());
        continentsEntriesList.sort(Entry.comparingByValue(Comparator.reverseOrder()));
        Map<String, Integer> sortedMapByContinentUsage = new LinkedHashMap<>();
        for (Entry<String, Integer> entry : continentsEntriesList) {
            sortedMapByContinentUsage.put(entry.getKey(), entry.getValue());
        }
        return sortedMapByContinentUsage;
    }

    private static Map<String, Integer> findMostUsedContinent(Map<String, Integer> countedContinents) {
        Entry<String, Integer> mostUsedContinent = null;
        Map<String, Integer> mostUsedContinents = new HashMap<>();
        for (Entry<String, Integer> continentWithUsage : countedContinents.entrySet()) {

            if (mostUsedContinent == null) {
                mostUsedContinent = continentWithUsage;
                mostUsedContinents.put(continentWithUsage.getKey(), continentWithUsage.getValue());
            } else if (continentWithUsage.getValue().compareTo(mostUsedContinent.getValue()) == 0) {
                mostUsedContinents.put(continentWithUsage.getKey(), continentWithUsage.getValue());
            } else if (continentWithUsage.getValue().compareTo(mostUsedContinent.getValue()) < 0) {
                break;
            }
        }
        return mostUsedContinents;
    }

    private static void showUsageOfTypedContinents(Map<String, String> continentsWithCountries) {
        List<String> continentsToCheck = createContinentsListToCheck();
        Map<String, Integer> countedUsageOfContinents = countUsageOfContinents(continentsWithCountries);
        Map<String, Integer> checkedContinentsResult = new HashMap<>();
        for (Entry<String, Integer> continentWithUsage : countedUsageOfContinents.entrySet()) {
            for (String typedCountry : continentsToCheck) {
                if (typedCountry.equals(continentWithUsage.getKey())) {
                    checkedContinentsResult.put(continentWithUsage.getKey(), continentWithUsage.getValue());
                }
            }
        }
        System.out.println("Dla wybranych kontynentów, ich użycie jest następujące: " + checkedContinentsResult);
    }

    private static List<String> createContinentsListToCheck() {
        List<String> continentsToCheck = new ArrayList<>();
        String choice;
        do {
            System.out.println("Wybierz kontynent do wyszukania");
            String typedLine = scanner.next();
            String typedContinent = splitLineBySpacebar(typedLine);
            continentsToCheck.add(typedContinent);
            System.out.println("Czy dodać kolejny kontynent? (T/N)");
            choice = scanner.next().toUpperCase();
        } while (choice.equals("T"));
        return continentsToCheck;
    }

    private static String splitLineBySpacebar(String line) {
        String[] splittedLine = line.split(" ");
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < splittedLine.length; i++) {
            builder.append(splittedLine[i]);
            if (i == splittedLine.length - 1) {
                break;
            }
            builder.append(" ");
        }
        return builder.toString();
    }
}