
package altq2;
/* NAME : BINUYO SIMEON OLAJIDE
DEPT : COMPUTER SCIENCE
MATRIC NO : CSC/15/3045
*/
import static java.lang.Math.sqrt;
import java.util.Scanner;
public class Altq2 {

    
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double total = 0;
    double average;
    int counter = 0;
    int score;
   double dev = 0;
    System.out.println("enter 10 numbers: ");
    while(counter < 10){
        score = input.nextInt();
        total = total + score;
        dev = dev + (score*score);
        counter++;
    }
    average = total/10;
    System.out.println("the average of these numbers is: ");
    System.out.println(average);
   
    double sqr;
    sqr = (total*total)/10;
    
    double SD;
    SD = sqrt((dev -sqr)/9);
    System.out.println("the standard deviation of these numbers is: ");
    System.out.println(SD);
    }
    
}
