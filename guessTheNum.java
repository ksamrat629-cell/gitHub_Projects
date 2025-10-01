import java.util.*;
public class guessTheNum {
    public static int getRandomNum(){
        Random random  = new Random();
        int randomNum = random.nextInt(100)+1;
        return randomNum;
    }
    public static String giveHint(int number , int guess){
        if(guess==number) return"Right";
        else if(Math.abs(guess - number) <= 10) return "Hot";
        else return "Cold";
    }
    public static String lvlMedium(int number , int guess){
        if(guess==number) return"Right";
        else if(Math.abs(guess - number) <= 20) return "Hot";
        else return "Cold";
    }
    public static String lvlHard(int number , int guess){
        if(guess==number) return"Right";
        else if(Math.abs(guess - number) <= 30) return "Hot";
        else return "Cold";
    }
    public static void runGuess() {
        int secretNumber = getRandomNum();
        Scanner sc = new Scanner(System.in);
        int userGuess = 0;
        int count=0;
        System.out.println("if you give up just type 0 at any point");
        System.out.println("Enter the level {Easy-->1 , Medium-->2, Hard-->3}");
        int lvl = sc.nextInt();

        switch (lvl) {
            case 1:
                while(userGuess!=secretNumber){
                count++;
                System.out.print("Enter a number between 1 and 100: ");
                userGuess = sc.nextInt();

                if (userGuess == 0) {
                    System.out.println("You gave up! The number was: " + secretNumber);
                    break;
                }

                String hint = giveHint(secretNumber, userGuess);
                if (hint.equals("Right")) {
                    System.out.println("You guessed it Right!");
                    System.out.println("Tries you took: "+count);

                } else {
                    System.out.println(hint);
                }
            }       
        break;
        case 2:
            while(userGuess!=secretNumber){
                count++;
                System.out.print("Enter a number between 1 and 100: ");
                userGuess = sc.nextInt();

                if (userGuess == 0) {
                    System.out.println("You gave up! The number was: " + secretNumber);
                    break;
                }

                String hint = lvlMedium(secretNumber, userGuess);
                if (hint.equals("Right")) {
                    System.out.println("You guessed it Right!");
                    System.out.println("Tries you took: "+count);

                } else {
                    System.out.println(hint);
                }
            }
        break;
        case 3:
            while(userGuess!=secretNumber){
                count++;
                System.out.print("Enter a number between 1 and 100: ");
                userGuess = sc.nextInt();

                if (userGuess == 0) {
                    System.out.println("You gave up! The number was: " + secretNumber);
                    break;
                }

                String hint = lvlHard(secretNumber, userGuess);
                if (hint.equals("Right")) {
                    System.out.println("You guessed it Right!");
                    System.out.println("Tries you took: "+count);

                } else {
                    System.out.println(hint);
                }
            }
        break;
        
        default:
            System.out.println("Invalid level ");
            break;
        }
        sc.close();
    }
    public static void main(String[] args) {
        runGuess();
    }
}