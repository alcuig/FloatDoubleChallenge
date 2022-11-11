//Challenge

//Convert a given number of pounds to kilograms.
//STEPS:
//1. Create a variable with the appropriate type to store the number of pounds to be converted to kilograms.
//2. Calculate the result i.e. the number of kilograms based on the contents of the variable above
// and store the result in a 2nd appropriate variable.
//3. Print out the result.

// HINT : 1 pound is equal to 0.45359237 of a kilogram.


public class Main {
    public static void main(String[] args) {
        double numberOfPounds = 33d;
        double convertedKilograms = numberOfPounds * 0.45359237d;
        System.out.println("Your number of kilos is " + convertedKilograms);
    }
}

