package ThinkJava2;

import java.util.Random;
import java.util.Scanner;

public class ExercisesChap5 {
    public static void main(String[] args) {
        
        // boolean result = mainOfTheGame();
        
        // if (!result) {
        //     System.out.println("Let's try one more time ! \n");
        //     boolean secondResult = mainOfTheGame();
        //     if (!secondResult) {
        //         System.out.println("Let's try one more time ! \n");
        //         mainOfTheGame();
                
                
        //     }
        // } 

            boolean flag1 = isHoopy(202);
            boolean flag2 = isFrabjuous(202);
            System.out.println(flag1);
         System.out.println(flag2);
        if (flag1 && flag2) {
            System.out.println("ping!");
        }
        if (flag1 || flag2) {
            System.out.println("pong!");
         } 

    }

    public static boolean isHoopy(int x) {
        boolean hoopyFlag;
         if (x % 2 == 0) {
            hoopyFlag = true;
        } else {
            hoopyFlag = false;
    }
        return hoopyFlag;
    }

    public static boolean isFrabjuous(int x) {
        boolean frabjuousFlag;
        if (x > 0) {
            frabjuousFlag = true;
         } else {
            frabjuousFlag = false;
    }
        return frabjuousFlag;
    }

    public static boolean mainOfTheGame() {
        Scanner in = new Scanner(System.in);
        Random rNumber = new Random();
        boolean gameResult;

        System.out.println(
            "I'm thinking of a nuber between 1 and 100."
            + " Can u guess what is it ?");
        System.out.print("Type your number: ");
        
        // get the number
        int guestNumber = in.nextInt();
        
        //get a random number
        int randomNumberIs = rNumber.nextInt(100);

        System.out.println("Your guess is " + guestNumber);
        System.out.println("The number I was thinking of is " + randomNumberIs);
        
        if (randomNumberIs == guestNumber) {
            System.out.println("Seems you are right!");
            gameResult = true;
            
        } else {
            if (randomNumberIs > guestNumber) {
                System.out.println("You were off on " 
                + (randomNumberIs - guestNumber));
                gameResult = false;
                 
            } else {
                System.out.println("You were off on " 
                + (guestNumber - randomNumberIs));
                gameResult = false;

            }
            
        }
        
        return gameResult;

    }
}