import java.util.*;

class NumberGuessingGame2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to NUMBER GUESSING GAME !!!");
        System.out.println("\nGAME RULES ARE GIVEN BELOW:");
        System.out.println("1.YOU NEED TO GUESS A RANDOM NUMBER BETWEEN 1 TO 100");
        System.out.println("2.YOU HAVE 10 CHOICES");
        System.out.println("3.FOR EACH CORRECT GUESS YOU WILL BE GIVEN 10 POINTS");

        Random rand = new Random();
        int chances, score, flag;
        String repeat;
        boolean playAgain;
        System.out.println("\nLET'S BEGIN THE GAME");
        do {
            flag = 0;
            chances = 10;
            score = 100;
            int random_num = rand.nextInt(100) + 1;
            System.out.println();
            int x = 1;
            for (int j = 1; j <= chances; j++) {
                System.out.println("CHANCE:" + x++ + "\n");
                int num1 = in.nextInt();
                if (num1 > random_num)
                    System.out.println("HINT:ENTER A SMALLER NUMBER");
                else if (num1 < random_num)
                    System.out.println("HINT:ENTER A LARGER NUMBER");
                else {
                    if (num1 == random_num) {
                        System.out.println("YOU GUESSED CORRECTLY !!!! KEEP GOING");
                        System.out.println("\nYOUR SCORE IS:" + score);
                        flag = 1;
                        break;
                    }
                }
                score -= 10;
            }
            if (flag == 0) {
                System.out.println("YOU LOST THE GAME :(");
                System.out.println("TRY PLAYING FROM THE BEGINNING");

            }
            System.out.println("\n\nDO YOU WANT TO PLAY AGAIN??\nTYPE Y OR N!!");
            repeat = in.next();
            if (repeat.equals("y")) {
                playAgain = true;
            } else {
                playAgain = false;
                break;
            }
        } while (playAgain);

        System.out.println("THANKS FOR PLAYING THUS GAME..!!");
        in.close();
    }
}