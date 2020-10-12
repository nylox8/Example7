import java.util.Scanner;
class Example7 {
    public static void main (String [] argv) {
        double miles, meters;
        System.out.println("Enter nautical miles:");

        //Reading value
        Scanner inputValue;
        inputValue = new Scanner(System.in);
        miles = inputValue.nextDouble();

        meters = miles*1.852;
        System.out.println(miles+" nautical miles = " + meters + " meters");
    }
}