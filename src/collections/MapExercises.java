package collections;

import java.util.*;

public class MapExercises {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //stworz mape w ktorej kluczem bedzie nazwa państwa a wartości kontynent (kilka par)
        Map<String, String> countries = new TreeMap<>();
        countries.put("Niemcy", "Europa");
        countries.put("Polska", "Europa");
        countries.put("Kazachstan", "Azja");
        countries.put("Chile", "Ameryka Południowa");
        countries.put("Chiny", "Azja");
        countries.put("Kanada", "Ameryka Północna");
        countries.put("Brazylia", "Ameryka Południowa");
        countries.put("Algieria", "Afryka");
        countries.put("RPA", "Afryka");
        countries.put("Australia", "Australia i Oceania");
        countries.put("Belgia", "Europa");

        /*Map<String, String> lands = Map.of(
                "Lublin", "lubelskie",
                "Warszawa", "mazowieckie");
        lands.remove("Lublin");*/ //TODO ciekawostka z Mapą (listy i sety też)

        //wyswietl kontynent dla danego kraju
        System.out.println("Wybierz kraj");
        String choosenCountry = scanner.next();
        findContinent(countries, choosenCountry);

        // wyswietl wszystkie panstwa
        System.out.println(countries.keySet());

        // wyswietl wszystkie kontynenty (bez powtórzen)
        showAllContinents(countries);

        // sprawdz czy mapa zawiera Polskę
        System.out.println("Czy lista zawiera kraj Polska? " + countries.containsKey("Polska"));

        // podaj rozmiar mapy
        int numberOfCountries = showNumberOfCountries(countries);
        int numberOfContinents = showNumberOfContinents(countries);
        System.out.println("Mapa zawiera " + numberOfCountries + " krajów oraz " + numberOfContinents + " kontynentów.");

        // wyswietl wszystkie państwa alfabetycznie
        // już zrobione wyżej countreies.keySet() //TODO zrobić HashSet i wykonać sortowanie

        // znajdz kontynent dla którego mamy najwiecej panstw w mapie
        showMostUsedContinent(countries);

        // dodaj listę z kontynentami które chcesz wyszukac. następnei sprawdz ile razy kazdy kontynent z danej listy wystepuje w mapie

        //TODO KOLEJKI
        //TODO Lista zakupów i paragon

        //TODO ćwiczenia z setami
    }

    private static void findContinent(Map<String, String> countries, String choosenCountry) {
        String checkedChoosenCountry = countries.get(choosenCountry);
        String messageCorrect = checkedChoosenCountry != null ?
                "Kraj " + choosenCountry + " znajduje się w: " + checkedChoosenCountry :
                "Wybrano błędny kraj";
        /*if (checkedChoosenCountry != null) {
            System.out.println("Kraj " + choosenCountry + " znajduje się w: " + checkedChoosenCountry);
        } else {
            System.out.println("Wybrano błędny kraj");
        }*/
        System.out.println(messageCorrect);
    }

    private static void showAllContinents(Map<String, String> countries) {
        List<String> continents = new ArrayList<>(countries.values());
        List<String> continentsWihoutDuplicates = removeDuplicates(continents);

        System.out.println(continentsWihoutDuplicates); //TODO zrobić na przyszłość z setem (bez powtórzeń)
    }

    private static List<String> removeDuplicates(List<String> continents) {
        List<String> continentsListWithoutDuplicates = new ArrayList<>();
        for (String country : continents) {
            if (!continentsListWithoutDuplicates.contains(country)) {
                continentsListWithoutDuplicates.add(country);
            }
        }
        return continentsListWithoutDuplicates;
    }

    private static int showNumberOfCountries(Map<String, String> countries) {
        return countries.keySet().size();
    }

    private static int showNumberOfContinents(Map<String, String> countries) {
        List<String> continents = new ArrayList<>(countries.values());
        List<String> continentsWihoutDuplicates = removeDuplicates(continents);
        return continentsWihoutDuplicates.size();
    }

    private static void showMostUsedContinent(Map<String, String> countries) {
        Map<String, Integer> countedContinents = new HashMap<>();
        List<String> listOfContinents = new ArrayList<>(countries.values());
        for (String continent : listOfContinents) {
            if (!countedContinents.containsKey(continent)) {
                countedContinents.put(continent, 1);
            } else {
                Integer gettedValue = countedContinents.get(continent);
                countedContinents.replace(continent, gettedValue + 1);
            }
        }
        List<Map.Entry<String, Integer>> continentsEntriesList = new ArrayList<>(countedContinents.entrySet());
        continentsEntriesList.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));
        Map<String, Integer> sortedMapByContinentCount = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : continentsEntriesList) {
            sortedMapByContinentCount.put(entry.getKey(), entry.getValue());
        }

        Map.Entry<String, Integer> mostUsedContinent = findMostUsedContinent(sortedMapByContinentCount);
        System.out.println(mostUsedContinent);
    }

    private static Map.Entry<String, Integer> findMostUsedContinent(Map<String, Integer> countedContinents) {
        Map.Entry<String, Integer> mostUsedContinent = null;
        for (Map.Entry<String, Integer> continent : countedContinents.entrySet()) {

            if (mostUsedContinent == null || continent.getValue().compareTo(mostUsedContinent.getValue()) > 0) {
                mostUsedContinent = continent;
            }
            //TODO zmienić z użyciem break
        }
        return mostUsedContinent;
    }
}