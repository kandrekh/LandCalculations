import java.util.Scanner;

/**
 * This programs calculates how much acres are in a square foot
 * */
public class Land {
    public static void main(String[] args) {
        double squareFeet = 389767;
        CalculateAcres acres = new CalculateAcres(squareFeet);

        System.out.printf("Acres of Land: %.3f",acres.acresOfLand());
        System.out.print(" in "+(int)squareFeet); // This might not be the best practice
    }
}
