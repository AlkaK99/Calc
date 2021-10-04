import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        startCalc();

        while (true) {

            System.out.println("Input: ");
            String line = scanner.nextLine();

            if (line.equals("exit")) {
                exitCalc();
                break;
            }

            try {
                String[] symbols = line.split(" ");
                if (symbols.length != 3) throw new Exception("Операция не распознана. Повторите ещё раз");

                Number aNumber = NumberService.parseAndValidate(symbols[0]);
                Number bNumber = NumberService.parseAndValidate(symbols[2], aNumber.getType());
                String result = Action.calculate(aNumber, bNumber, symbols[1]);
                System.out.println("Output: \n" + result);

            } catch (Exception e) {
                System.out.println(e.getMessage());
                exitCalc();
                break;
            }
        }

        scanner.close();
    }

    private static void startCalc() {
        System.out.println(" Вас приветствует консольный Калькулятор");
        System.out.println("Введите числа от 1 до 10");

    }

    private static void exitCalc() {

        System.out.println("Увидимся в следующий раз!");

    }
}


