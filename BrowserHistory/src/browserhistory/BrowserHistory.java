package browserhistory;

import java.util.Scanner;
import java.util.Stack;

public class BrowserHistory {

    static Stack<String> future = new Stack<>();
    static Stack<String> history = new Stack<>();

    public static void show(Stack stack) {
        if (stack.isEmpty()) {
            System.out.println("\nNo data");
        } else {
            System.out.println("\n");
            for (Object object : stack) {
                System.out.print(" | " + object);
            }
        }
    }

    public static void visit(String url) {
        history.push(url);
        future.clear();
    }

    public static String back() {
        if (history.size() > 1) {
            future.push(history.pop());
            return history.peek();
        }
        return "No data";
    }

    public static String forward() {
        if (future.size() >= 1) {
            history.push(future.pop());
            return history.peek();
        }
        return "No data";
    }

    public static void currentPage() {
        if (history.isEmpty()) {
            System.out.println("\nNo data");
        } else {
            System.out.println("\n" + history.peek());
        }
    }

    public static void main(String[] args) {
        int choice;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("\n1.Visit new page\n2.Go back\n3.Go forward\n4.Show history\n5.Show future\n6.Current page\n7.Exit");
            System.out.print("\nYour choice:");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    System.out.print("\nEnter address:");
                    String page = sc.nextLine();
                    visit(page);
                    break;
                case 2:
                    System.out.println("\n" + back() + "\n");
                    break;
                case 3:
                    System.out.println("\n" + forward() + "\n");
                    break;
                case 4:
                    show(history);
                    break;
                case 5:
                    show(future);
                    break;
                case 6:
                    currentPage();
                    break;
                case 7:

                    break;
                default:
                    System.out.print("Wrong choice.Try again!!!");
            }
        } while (choice != 7);
    }
}
