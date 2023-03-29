package lab6;
import java.util.InputMismatchException;
import java.util.Scanner;
public class ex6_2 {

    private float x;
    
    public static void ex6_2()
    {
        int characteristics;
        float mantissa;
        Scanner scan = new Scanner(System.in);
        try 
        {
        System.out.println("Podaj x: ");
        x = scan.nextFloat();
        characteristics = x/1;
        mantissa = x%1;
        System.out.printf("Cecha : %d Mantysa : %f \n" , characteristics, mantysa);
        System.out.printf("Stosunek cechy do mantysy wynosi : %.3f", characteristics/mantissa);
        } 
        catch (InputMismatchException e)
        {
            System.err.println("Podano zle dane, podaj dane jeszcze raz");
            ex6_2();
        }

    }
}
