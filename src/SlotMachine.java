import java.util.Random;
import java.util.Scanner;

public class SlotMachine
{

    public static void main(String[] args)
    {
        playGame();
    }


    public static void playGame()
    {
        int slot1 = 0;
        int slot2 = 0;
        int slot3 = 0;

        int betInitial = 0;
        int bet = 0;

        int currentTotal = 0;
        int newTotal = 0;

        boolean playAgain = true;

        // INTRODUCTION

        System.out.println("****************************************************************");
        System.out.println("\t\t\t\t\t\t\tJ SLOTS\t\t\t\t\t\t\t");
        System.out.println("****************************************************************\n");
        System.out.println("\t\t\t\t\t\tINSTRUCTIONS?\n\n\t\t\t\t\t\tY\t\t\tN");
        Scanner input = new Scanner(System.in);
        char instructionSwitch = input.next().charAt(0);

        // INSTRUCTIONS

        switch(instructionSwitch)
        {
            case 'Y':
            case 'y':
                printInstructions();
                break;
            case 'N':
            case 'n':
                System.out.println("Let's get started!");
                break;
            default:
                printInstructions();
                break;
        }


        // BET INPUT AND CONFIRMATION

//        boolean betConfirmLoop = true;
//        while(betConfirmLoop = true)
//        {
            System.out.println("Place your bet: "
                                + "\n$1"
                                + "\n$2"
                                + "\n$3"
                                + "\n$4"
                                + "\n$5");
            betInitial = input.nextInt();
            bet = betInitial;

            System.out.println("You are betting $" + bet + ".");
//            char confirmBet = input.next().charAt(0);
//
//            switch(confirmBet)
//            {
//                case 'Y':
//                case 'y':
//                    currentTotal = bet;
//                    betConfirmLoop = false;
//                    break;
//                default:
//                    betConfirmLoop = true;
//                    break;
//            }
//
//        }

        currentTotal = bet;

        // GAME MECHANICS

        while(playAgain == true)
        {
            char crank1 = ' ';
            while(crank1 != 'X' && crank1 != 'x')
            {
                System.out.println("Press X to crank\n");
                crank1 = input.next().charAt(0);
            }



            // SLOT OUTPUT

            Random rand = new Random();
            System.out.println();



            // SLOT 1

            int output1 = rand.nextInt(6);
            slot1 = output1;

            if(output1 == 0)
            {
                System.out.println("| CHERRIES |");
            } else if(output1 == 1) {
                System.out.println("| ORANGES |");
            } else if(output1 == 2) {
                System.out.println("| PLUMS |");
            } else if(output1 == 3) {
                System.out.println("| BELLS |");
            } else if(output1 == 4) {
                System.out.println("| MELONS |");
            } else if(output1 == 5) {
                System.out.println("| BARS |");
            }


            // SLOT 2

            int output2 = rand.nextInt(6);
            slot2 = output2;

            if(output2 == 0)
            {
                System.out.println("| CHERRIES |");
            } else if(output2 == 1) {
                System.out.println("| ORANGES |");
            } else if(output2 == 2) {
                System.out.println("| PLUMS |");
            } else if(output2 == 3) {
                System.out.println("| BELLS |");
            } else if(output2 == 4) {
                System.out.println("| MELONS |");
            } else if(output2 == 5) {
                System.out.println("| BARS |");
            }


            // SLOT 3

            int output3 = rand.nextInt(6);
            slot3 = output3;

            if(output3 == 0)
            {
                System.out.println("| CHERRIES |");
            } else if(output3 == 1) {
                System.out.println("| ORANGES |");
            } else if(output3 == 2) {
                System.out.println("| PLUMS |");
            } else if(output3 == 3) {
                System.out.println("| BELLS |");
            } else if(output3 == 4) {
                System.out.println("| MELONS |");
            } else if(output3 == 5) {
                System.out.println("| BARS |");
            }


            // REWARD STATEMENTS

            while(currentTotal >= 0)
            {

                if ((slot1 == slot2) && (slot2 == slot3))
                {
                    System.out.println("Triple match!");
                    newTotal = currentTotal * 3;
                    currentTotal = newTotal;
                    System.out.println("You have $" + currentTotal);
                    break;
                }
                else if ((slot1 == slot2) || (slot2 == slot3) || (slot1 == slot3))
                {
                    System.out.println("Double match!");
                    newTotal = currentTotal * 2;
                    currentTotal = newTotal;
                    System.out.println("You have $" + currentTotal);
                    break;
                }
                else
                {
                    System.out.println("You lose!");
                    System.out.println("You have $1");
                    newTotal = 1;
                    currentTotal = newTotal;
                    break;
                }

            }

            System.out.println("\t\t\t\t\tPLAY AGAIN?");
            char playAgainSwitch = input.next().charAt(0);

            switch (playAgainSwitch)
            {
                case 'Y':
                case 'y':
                    playAgain = true;
                    break;
                default:
                    playAgain = false;
                    break;
            }

        }

        // EARNINGS OUTPUT
        System.out.println("You began with $" + betInitial + ".");
        System.out.println("Your winnings are $" + currentTotal + ".");
        input.close();
        System.exit(0);

    }

    public static void printInstructions()
    {
        System.out.println("****************************************************************");
        System.out.println("J Slot Machine is an easy to play, high-risk, high-reward game.");
        System.out.println("\nYou place your initial bet and crank the machine, winning if\n"
                + "you can get a combo of items.");
        System.out.println("\nYou have a chance of doubling or even tripling your bet by round!");
        System.out.println("****************************************************************");

        System.out.println("\t\t\t\t\t\t\tREWARDS");
        System.out.println("\nMatch two (2) slots and double your bet!");
        System.out.println("\nMatch three (3) slots and triple your bet!");
        System.out.println("\nRoll over your winnings each round, win all or go bust!");
        System.out.println("****************************************************************");
    }

}
