import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int score = 0;
            
            //Correct answers are: Q1-c, Q2-a, Q3-d, Q4-a/b
            
            System.out.println("1. Which country held the 2016 Summer Olympics?");
            System.out.println("\ta) China\n\tb) Ireland\n\tc) Brazil\n\td) Italy");
            String country = scanner.nextLine();

            if(country.equalsIgnoreCase("c")){
                score += 5;
            }

            System.out.println("2. Which planet is the hottest?");
            System.out.println("\ta) Venus\n\tb) Saturn\n\tc) Mercury\n\td) Mars");
            String planet = scanner.nextLine();

            if(planet.equalsIgnoreCase("a")){
                score += 5;
            }

            System.out.println("3. What is the rarest blood type?");
            System.out.println("\ta) O\n\tb) A\n\tc) B\n\td) AB-Negative");
            String bloodType = scanner.nextLine();

            if(bloodType.equalsIgnoreCase("d")){
                score += 5;
            }

            System.out.println("4. Which one of these characters is friends with Harry Potter?");
            System.out.println("\ta) Ron Weasley\n\tb) Hermione Granger\n\tc) Draco Malfoy");
            String charactors = scanner.nextLine();

            if(charactors.equalsIgnoreCase("a") || charactors.equalsIgnoreCase("b") ){
                score += 5;
            }

            System.out.println("Your final score is: "+score+"/20");
            if(score >= 15){
                System.out.println("Wow, you know your stuff!");
            }
            else if (score < 15 && score >= 5){
                System.out.println("Not bad!");
            }
            else{
                System.out.println("better luck next time.");
            }
        }
    }    
}
