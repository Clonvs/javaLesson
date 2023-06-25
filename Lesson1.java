// Семинар 1

// 1. Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

import java.util.Scanner;

public class Lesson1 {
    
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

        while (true) {
            System.out.println("\nВыберите задачу:");
            System.out.println("1 - Поиск треугольного числа");           
            System.out.println("2 - Вывод простых чисел");
            System.out.println("3 - Простой калькулятор");
            System.out.println("0 - Выход");

            int userInput = scan.nextInt();

            if (userInput == 1)
                numberSearch();              
            else if (userInput == 2)
                primeNumber();              
            else if (userInput == 3)
                simpleCalculator();    
            else if (userInput == 0)
                break;          
            
        }
    }

    static void numberSearch(){    
        
        System.out.print("Введите число: ");

        int num = scan.nextInt();
        int work = 1;
        int i = 1;
        int j = 0;
        int T = 0;

        while (i <= num){
            T = j + (T + 1);
            work = i * work;
            i++;
            j++;
        } 
        System.out.printf("Произведение чисел %d -> %d \n", num, work);
        System.out.printf("Треугольное число %d -> %d\n", num, T);
        }


// 2) Вывести все простые числа от 1 до 1000

    static void primeNumber(){

    System.out.println("простые числа от 1 до 1000:");
    int i, j;

      for(i = 1; i <= 1000;i++){ 
         for(j = 2; j <= i- 1; j++){  
            if(i % j==0){    
               break;
            }
         }
         if(i == j){
            System.out.printf("%d ", i);
         }         
      }
      System.out.println();
    
    }


// 3) Реализовать простой калькулятор

    static void simpleCalculator(){
    
        System.out.print("Введите первое число: ");
        int num1 = scan.nextInt();
        
        System.out.print("Введите второе число: ");
        int num2 = scan.nextInt();

        int res;

        System.out.print("Выбор действий из + - * / : " );
        String action = scan.nextLine();
        action = scan.nextLine();

        switch(action){
            case "+":
                res = num1 + num2;
                System.out.printf("Результат: %d \n", res);
                break;
            case "-":
                res = num1 - num2;
                System.out.printf("Результат: %d \n", res);
                break;
            case "*":
                res = num1 * num2;
                System.out.printf("Результат: %d \n", res);
                break;
            case "/":
                if(num2 == 0)
                    System.out.println("На ноль делить нельзя!");
                else{
                    res = num1 / num2;
                    System.out.printf("Результат: %d \n", res);
                }
                break;
            default:
                System.out.println("Введите цифры!");
        } 
    }
    
}


