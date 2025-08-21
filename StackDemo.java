import java.util.Scanner;
import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner sc = new Scanner(System.in);
          int choice;

        do {
            System.out.println("\n--- Stack Operations ---");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek (Top Element)");
            System.out.println("4. Display Stack");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch(choice) {
                case 1:
                    System.out.print("Enter number to push: ");
                    int num = sc.nextInt();
                    stack.push(num);
                    System.out.println(num + " pushed to stack.");
                    break;
                case 2:
                    if (stack.isEmpty()) {
                        System.out.println("Stack is empty. Cannot pop.");
                    } else {
                        int popped = stack.pop();
                        System.out.println(popped + " popped from stack.");
                    }
                    break;
                case 3:
                    if (stack.isEmpty()) {
                        System.out.println("Stack is empty.");
                    } else {
                        System.out.println("Top element: " + stack.peek());
                    }
                    break;
                case 4:
                    if (stack.isEmpty()) {
                        System.out.println("Stack is empty.");
                    } else {
                        System.out.println("Stack elements (Top → Bottom):");
                        for (int i = stack.size() - 1; i >= 0; i--) {
                            System.out.println(stack.get(i));
                        }
                    }
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 5);

      }
       sc.close();
    }
    /* public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();

        System.out.println("Enter integers to push onto the stack (type 'exit' to stop):");

        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("exit")) {
                break;
            }
            try {
                int number = Integer.parseInt(input);
                stack.push(number);
                System.out.println("Pushed: " + number);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter an integer.");
            }
        }

        System.out.println("Current stack: " + stack);

        if (!stack.isEmpty()) {
            System.out.println("Popping elements from the stack:");
            while (!stack.isEmpty()) {
                System.out.println("Popped: " + stack.pop());
            }
        } else {
            System.out.println("The stack is empty.");
        }

        scanner.close();                   
    }                       */

