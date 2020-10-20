import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to calculator!");
        String input = scanner.nextLine();
        while (!input.toLowerCase().equals("exit")) {
            String[] inputArr = input.split(" ");
            String command = inputArr[0];

            if (command.toLowerCase().equals("add")) {
                System.out.println(calculator.add(Integer.parseInt(inputArr[1]), Integer.parseInt(inputArr[2])));
            } else if (command.toLowerCase().equals("subtract")) {
                System.out.println(calculator.subtract(Integer.parseInt(inputArr[1]), Integer.parseInt(inputArr[2])));
            } else if (command.toLowerCase().equals("multiply")) {
                System.out.println(calculator.multiply(Integer.parseInt(inputArr[1]), Integer.parseInt(inputArr[2])));
            } else if (command.toLowerCase().equals("divide")) {
                System.out.println(calculator.divide(Integer.parseInt(inputArr[1]), Integer.parseInt(inputArr[2])));
            } else if (command.toLowerCase().equals("fibonacci")) {
                System.out.println(calculator.fibonacciNumberFinder(Integer.parseInt(inputArr[1])));
            } else if (command.toLowerCase().equals("binary")) {
                System.out.println(calculator.intToBinaryNumber(Integer.parseInt(inputArr[1])));
            }

            input = scanner.nextLine();
        }
    }
}
