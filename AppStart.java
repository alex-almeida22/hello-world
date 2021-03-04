import java.util.Scanner;
/**
 * Write a description of class AppStart here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AppStart
{
    public static void main(String args[])
    {
        Size sizesmall = Size.SMALL;
        Size sizemedium = Size.MEDIUM;
        Size sizelarge = Size.LARGE;
        
        Scanner input = new Scanner(System.in);
        
        int inputs = input.nextInt();
        
        
        if(inputs == 32)
        {
            System.out.println("Name         : SMALL" );
            System.out.println("toString()   : " + sizesmall.getDescription());
            System.out.println("Ordem        : " + sizesmall.getCounter());
            System.out.println("Valor minimo : " + sizesmall.getMinValue());
            System.out.println("Valor maximo : " + sizesmall.getMaxValue());
            System.out.println("Código       : " + sizesmall.getCode());
        }
        
        if(inputs == 37)
        {
            System.out.println("Name         : MEDIUM" );
            System.out.println("toString()   : " + sizemedium.getDescription());
            System.out.println("Ordem        : " + sizemedium.getCounter());
            System.out.println("Valor minimo : " + sizemedium.getMinValue());
            System.out.println("Valor maximo : " + sizemedium.getMaxValue());
            System.out.println("Código       : " + sizemedium.getCode());
        }
        
        if(inputs == 45)
        {
            System.out.println("Name         : LARGE" );
            System.out.println("toString()   : " + sizelarge.getDescription());
            System.out.println("Ordem        : " + sizelarge.getCounter());
            System.out.println("Valor minimo : " + sizelarge.getMinValue());
            System.out.println("Valor maximo : " + sizelarge.getMaxValue());
            System.out.println("Código       : " + sizelarge.getCode());
        }
    }
}
