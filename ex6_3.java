package lab6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ex6_3 {
    public void ex6_3() throws ArithmeticException
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj liczbe calkowita:");
        int x = scan.nextInt();
        if (x<99 || x>999) throw new ArithmeticException("Liczba spoza zakresu");
        else 
            {
                int result = 0;
                while (x>0)
                {
                    result = result+(x%10)*(x%10);
                    x=x/10;
                }
                System.out.printf("Suma kwadratow jest rowna : %d", result);
            }

    }
    public  void zadanko3()
        {
            try{
            ex6_3();
            }
            catch (InputMismatchException e){
                System.out.println("zle dane, podaj dane jeszcze raz");
                ex6_3();
            }
            catch (ArithmeticException e){
            System.out.println("zle dane, podaj dane jeszcze raz");
                ex6_3();
        }
        }
}
