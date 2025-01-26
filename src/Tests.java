//Name: Sean Vizcarrondo

public class Tests {
    public static void main(String[] args) {
        //Double is a data type to store decimal numbers other than float. These grades will be for storing grade values to use later.
        double grade1 = 88.2;
        double grade2 = 78.9;
        double grade3 = 97.6;
        //The averageGrades takes the previous grades and averages them out.
        double averageGrades = (grade1 + grade2 + grade3) / 3;
        //roundedGrade will take the averageGrades and create a double with 2 decimal thanks to Math.round.
        //Math.ceil was giving an incorrect answer since it always rounds up even if the decimal is below 5.
        double roundedGrade = Math.round(averageGrades * 100) / 100.0;
        //System.out.println will print each variable onto a seperate line in accordance with the requirments.
        System.out.println("Test score 1: " + grade1);
        System.out.println("Test score 2: " + grade2);
        System.out.println("Test score 3: " + grade3);
        System.out.println("The average of 3 test scores is: " + roundedGrade);
    }
}