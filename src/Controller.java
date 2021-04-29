import java.util.Scanner;

public class Controller {
    Scanner input = new Scanner(System.in);


    public void printMenu(){
        System.out.println("");
        System.out.println(":::::::::::::::: Добро пожаловать. Первое консольнре приложение ::::::::::::");
        System.out.println("");
        System.out.println("============  Выберите одну из математических операции  ==============");
        System.out.println("");
        System.out.println("1.[+]");
        System.out.println("");
        System.out.println("2.[-]");
        System.out.println("");
        System.out.println("3.[*]");
        System.out.println("");
        System.out.println("4.[/]");
        System.out.println("");
        System.out.println("5.Выход");
        System.out.println("");
    }

    public int getNumbers(){
        int num1 = 0;
        boolean repeat = false;
        do{
            if(repeat){
                System.out.println("Это не является числом. Ввидите число:");
                repeat = false;
            }
            if(!input.hasNextInt()){
                repeat = true;
                input.next();
            }else {
                num1 = input.nextInt();
            }
        }while (repeat);
        return num1;
    }
    public char getOperation(){
        char operation;
        boolean repeat = false;
        do{
            if(repeat){
                System.out.println(" Вы допустили ошибку при вводе операции. Попробуйте еще раз:");
                repeat = false;
            }
            System.out.println(" ");
            System.out.print(" Введите операцию указанную в [] скобках:  ");
            operation = input.next().charAt(0);
            repeat = true;

        }while(!isCheckedOperation(operation));
        return operation;
    }


    public boolean isCheckedOperation(char operation){
        switch (operation){
            case '+':
            case '-':
            case '*':
            case '/':
            case '5':
                System.exit(0);
                return true;
            default:
                System.out.println(" Операция не распознана");
                return false;
        }
    }

}
