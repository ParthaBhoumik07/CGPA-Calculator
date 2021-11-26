import java.util.Scanner;
public class CgpaCalculator_V2{
     public static void main (String[] args) {
          Scanner scanner = new Scanner (System.in);
          double multiple_2_7 = 0, multiple_3 = 0, multiple_3_3 = 0, multiple_3_7 = 0 ,multiple_4 = 0 ;
          double sumOfMultiples = 0 , sumOfCredits = 0;

          System.out.println("In how many courses you got 3 ?");
          double cgpa_3 = scanner.nextDouble();
          System.out.println("In how many courses you got 3.3 ?");
          double cgpa_3_3 = scanner.nextDouble();
          System.out.println("In how many courses you got 3.7 ?");
          double cgpa_3_7 = scanner.nextDouble();
          System.out.println("In how many courses you got 4 ?");
          double cgpa_4 = scanner.nextDouble();
          sumOfCredits = 3 * (cgpa_3 + cgpa_3_3 + cgpa_3_7 + cgpa_4 ) ;
          multiple_3 += 3 * 3 *  cgpa_3 ;
          multiple_3_3 += 3.3 * 3 * cgpa_3_3 ;
          multiple_3_7 += 3.7 * 3 * cgpa_3_7 ;
          multiple_4 += 4 * 3 * cgpa_4 ;
          
          sumOfMultiples =multiple_3 + multiple_3_3 + multiple_3_7 + multiple_4 ;
          
          System.out.println( "Total cgpa is " + sumOfMultiples / sumOfCredits );
     }
}