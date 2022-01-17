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

        boolean betConfirmLoop = true;
        while(betConfirmLoop = true)
        {
            System.out.println("Place your bet: "
                                + "\n$1"
                                + "\n$2"
                                + "\n$3"
                                + "\n$4"
                                + "\n$5");
            bet = betInitial = input.nextInt();

            System.out.println("You are betting $" + bet + ". Confirm?");
            char confirmBet = input.next().charAt(0);

            switch(confirmBet)
            {
                case 'Y':
                case 'y':
                    currentTotal = bet;
                    betConfirmLoop = false;
                    break;
                default:
                    betConfirmLoop = true;
                    break;
            }

        }

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

            int output1 = rand.nextInt();

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
    }

}
