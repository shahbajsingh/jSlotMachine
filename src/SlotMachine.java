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

        int slot1, slot2, slot3, initBet, bet, currentTotal, newTotal;
        initBet = bet = 0;

        boolean playAgain = true;
        boolean betConfirmLoop = true;

        Scanner input = new Scanner(System.in);
        Random rand = new Random();



        printTitle();


        // PLACE AND CONFIRM BET

        while(betConfirmLoop == true)
        {
            System.out.print("\nPlace your bet: $");
            initBet = input.nextInt();
            bet = initBet;

            System.out.println("You are betting $" + bet + ". Confirm?\n");
            char betSwitch = input.next().charAt(0);

            switch(betSwitch)
            {
                case 'Y':
                case 'y':
                    betConfirmLoop = false;
                    break;
                default:
                    betConfirmLoop = true;
                    break;
            }
        }

        currentTotal = bet;     // Add bet money to pool


        // GAME MECHANICS

        while(playAgain == true)
        {

            // TURN CRANK

            char crank = ' ';
            while(crank != 'X' && crank != 'x')
            {
                System.out.println("Press X to crank\n");
                crank = input.next().charAt(0);
                System.out.println();
            }


            // SLOT OUTPUT



            // SLOT 1

            slot1 = rand.nextInt(6);

            if(slot1 == 0)
            {
                System.out.println("| CHERRIES |");
            } else if(slot1 == 1) {
                System.out.println("| ORANGES |");
            } else if(slot1 == 2) {
                System.out.println("| PLUMS |");
            } else if(slot1 == 3) {
                System.out.println("| BELLS |");
            } else if(slot1 == 4) {
                System.out.println("| MELONS |");
            } else if(slot1 == 5) {
                System.out.println("| BARS |");
            }


            // SLOT 2

            slot2 = rand.nextInt(6);

            if(slot2 == 0)
            {
                System.out.println("| CHERRIES |");
            } else if(slot2 == 1) {
                System.out.println("| ORANGES |");
            } else if(slot2 == 2) {
                System.out.println("| PLUMS |");
            } else if(slot2 == 3) {
                System.out.println("| BELLS |");
            } else if(slot2 == 4) {
                System.out.println("| MELONS |");
            } else if(slot2 == 5) {
                System.out.println("| BARS |");
            }


            // SLOT 3

            slot3 = rand.nextInt(6);

            if(slot3 == 0)
            {
                System.out.println("| CHERRIES |");
            } else if(slot3 == 1) {
                System.out.println("| ORANGES |");
            } else if(slot3 == 2) {
                System.out.println("| PLUMS |");
            } else if(slot3 == 3) {
                System.out.println("| BELLS |");
            } else if(slot3 == 4) {
                System.out.println("| MELONS |");
            } else if(slot3 == 5) {
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
        System.out.println("You began with $" + initBet + ".");
        System.out.println("Your left with $" + currentTotal + ".");
        if(currentTotal >= initBet)
            System.out.println("Your total winnings are $" + (currentTotal - initBet) + "!");
        else
            System.out.println("You lost $" + (initBet - currentTotal) + ". Better luck next time!");
        input.close();
        System.exit(0);

    }







    public static void printTitle()
    {
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
        System.out.println("\t\t\t\t\t\tLIMITED TIME OFFER");
        System.out.println("\nThe casino is offering a $1 rebate if you lose, so you can\n"
                            + "keep playing!");
        System.out.println("****************************************************************");
    }



}
