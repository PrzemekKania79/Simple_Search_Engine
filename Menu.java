package search;

import search.strategies.*;
import search.utilities.*;


import java.util.*;

public class Menu {
    Scanner sc = new Scanner(System.in);
    List<String> data = new ArrayList<>();
    Map<String, List<Integer>> keywords = new HashMap<>();
    PrintPerson printPerson = new PrintPerson();
    ContextSelection contextSelection = new ContextSelection();

    public void initialization(String[] args) {
        FileData fileData = new FileData();
        personSearch(fileData.readFile(data, args));
    }

    public void personSearch(List<String> data) {
        int menuChoice;
        do {
            System.out.println("=== Menu === \n1. Find a person\n2. Print all persons\n0. Exit");
            menuChoice = Integer.parseInt(sc.nextLine());

            switch (menuChoice) {
                case 1:
                    System.out.println("Select a matching strategy: ALL, ANY, NONE");
                    String searchMethod = sc.nextLine().toUpperCase();
                    switch (searchMethod) {
                        case "ALL":
                            contextSelection.setSearch(new SearchAll());
                            printPerson.printPerson(contextSelection.searchValue(data, keywords));
                            break;
                        case "ANY":

                            break;

                        case "NONE":

                            break;

                        default:
                            System.out.println("Incorrect option! Try again.");
                            break;
                    }
                    break;
                case 2:
                    contextSelection.setSearch(new PrintAll());
                    printPerson.printPerson(contextSelection.searchValue(data, keywords));
                    break;
                default:
                    if (menuChoice != 0)
                        System.out.println("Incorrect option! Try again.");
                    break;
            }
        } while (menuChoice != 0);
        System.out.println("Bye!");
    }
}
