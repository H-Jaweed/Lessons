package Lesson18.Practic;

import javax.imageio.stream.FileImageInputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class DictionaryApp {
    static Map<String, String> dictionary = new HashMap<>();


    public static void main(String[] args) {

        dictionary.put("Book", "kitab");
        dictionary.put("Choice", "secim");
        dictionary.put("Dictionary", "luget");
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("1)Show list \n2)Add or update list \n3)Search \n4)Delete\n5)Exit");
            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    showAllWord();
                    break;
                case 2:
                    addOrUpdate();
                    break;
                case 3:
                    search();
                    break;
                case 4:
                    delete();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Wrong operator");
                    break;
            }
        }
    }

    public static void showAllWord() {
        System.out.println("===================================");
        if (!dictionary.isEmpty()) {
            for (Map.Entry entry : dictionary.entrySet()) {
                System.out.println(entry);
            }
        } else {
            System.err.println("Dictionary is empty");
        }
        System.out.println("===================================");
    }

    public static void delete() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the word: ");
        String word = sc.nextLine().toLowerCase();
        dictionary.remove(word);
        System.out.println("Word deleted successfuly!");
        System.out.println("===================================");
    }

    public static void addOrUpdate() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the word: ");
        String word = sc.nextLine().toLowerCase();
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Enter the translation: ");
        String translate = sc1.nextLine().toLowerCase();

        if (dictionary.containsKey(word)) {
            dictionary.replace(word, translate);
            System.out.println("Word updated successfuly!");
        } else {
            dictionary.put(word, translate);
            System.out.println("Word added successfuly!");
        }
        System.out.println("===================================");
    }

    public static void search() {
        if (!dictionary.isEmpty()) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the word: ");
            String word = sc.nextLine().toLowerCase();
            if (dictionary.containsKey(word)) {
                System.out.println(dictionary.get(word));
            } else if (dictionary.containsValue(word)) {
                System.out.println(dictionary.get(word));
            }
        } else {
            System.err.println("Dictionary is empty");
        }
        System.out.println("===================================");
    }
}
