public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        Calculator calculator = new Calculator();

        controller.printMenu();
        char operation = controller.getOperation();
        System.out.println("Введите первое число:");
        int num1 = controller.getNumbers();
        System.out.println("Введите второе число:");
        int num2 = controller.getNumbers();
        switch (operation){
            case '+':
                System.out.println("Результат сложения = "+calculator.adding(num1,num2));
                break;
            case '-':
                System.out.println("Результат вычитания = "+calculator.subtraction(num1,num2));
                break;
            case '*':
                System.out.println("Результат умножения = "+calculator.multiplication(num1,num2));
                break;
            case '/':
                System.out.println("Результат деления = "+calculator.division(num1,num2));
            case '5':
                System.out.println("Доброго дня");
                System.exit(0);
        }
    }
}
