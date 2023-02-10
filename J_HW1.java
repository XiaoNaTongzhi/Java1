import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class J_HW1 {
    public static void main(String[] args) {
    ex3();
    }

    public static int input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи число: ");
        int n = scanner.nextInt();
        scanner.close();
        return n;
    }
    public static String op_input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи операцию: ");
        String str = scanner.nextLine();
        scanner.close();
        return str;
    }

    public static void ex1(){
        // Вычислить n-ое треугольного число(сумма чисел от 1 до n)
       int i = input();
        System.out.printf("Треугольное число: %d\n", triangle(i));
    }

    public static int triangle(int a) {
        return (a * (a + 1)) / 2;
    }


    public static void ex2() {
        // Вычислить n! (произведение чисел от 1 до n)
        int i = input();
        System.out.printf("Факториал: %d\n", factorial(i));
    }


    public static int factorial(int a) {
        // нахождение фактриала               
         // 1! = 1
         // 0! = 1
         if(a == 0 || a == 1) return 1;
         else return a * factorial(a - 1);
        }

        
        static void ex3() {
            // Вывести все простые числа от 1 до 1000
            int input = input();
            List<Integer> primes = new ArrayList<>();
        
            for (int i = 2; i <= input; i++) {
                boolean isPrimeNumber = true;
        
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        isPrimeNumber = false;
                        break;
                    }
                }
                       
                if (isPrimeNumber) {
                    primes.add(i);
                }
        }  
            System.out.println("Простые числа: " + primes);

        }


        static void ex4() {
       
        System.out.println(calc());

        }
    
    
     static int calc(){ // Лучше через switch case делать? А если без него, то как?

        int a = input();
        char op = op_input().charAt(0);  
        int b = input();      
        int res = 0;
        if (op == '+')  res = a + b;
        else if (op == '-') res =  a - b;
        else if (op == '*') res =  a * b;
        else if (op == '/') res =  a / b;
        return res;
        }     
    
// ВОПРОС:
       //   static int calc(){ // Лучше через switch case делать? А если без него, то как?

        // int a = input();
        // char op = op_input(); // Приходит строка, тогда в методе нужен char и кодировку менять, 
        // int b = input();      // а со строками всё, что ниже, не выполняется. Как быть?
        // if (op == '+') return a + b;
        // else if (op == '-') return a - b;
        // else if (op == '*') return a * b;
        // else if (op == '/') return a / b;
        // Почему просит только один return в конце?
        // }      

}
