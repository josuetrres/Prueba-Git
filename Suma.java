import java.util.Scanner;
//pilot branch
public class Suma
{
    public static void main( String[] args )
    {
        int n1, n2, n3, suma;

        Scanner teclado = new Scanner( System.in );
        

        //loop this
        System.out.print( "n1: " );
        n1 = teclado.nextInt();

        System.out.print( "n2: " );
        n2 = teclado.nextInt();

        System.out.print( "n3: " );
        n3 = teclado.nextInt();

        suma = n1 + n2 + n3;

        System.out.println( "La suma de " + n1 + " más " + n2 + " mas " + n3 + " es " + suma + "." );
    }
}