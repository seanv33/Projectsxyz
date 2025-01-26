//Name: Sean Vizcarrondo

public class Tests {
    public static void main(String[] args) {
        //Double is a data type to store decimal numbers other than float. These grades will be for storing grade values to use later.
        double x = 88.2;
        double y = 78.9;
        double z = 97.6;
        //The averageGrades takes the previous grades and averages them out.
        double averageGrades = (x + y + z) / 3;
        //roundedGrade will take the averageGrades and create a double with 2 decimal thanks to Math.round.
        //Math.ceil was giving an incorrect answer since it always rounds up even if the decimal is below 5.
        double roundedGrade = Math.round(averageGrades * 100) / 100.0;
        //System.out.println will print each variable onto a seperate line in accordance with the requirments.
        System.out.println("Test score 1: " + x);
        System.out.println("Test score 2: " + y);
        System.out.println("Test score 3: " + z);
        System.out.println("The average of 3 test scores is: " + roundedGrade);
    }
}