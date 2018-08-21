import java.util.Scanner;

public class vacationPlanner {

    public static void main(String[] args){
        greeting();
        timeAndBudget();
        time();
        square();
    }

    public static void greeting(){
        String travelerName;
        String travelToPlace;
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Vacation Planner!");
        System.out.println("What is your name?");
        travelerName = input.nextLine();
        System.out.println("Nice to meet you " + travelerName + ", where are you travelling to?");
        travelToPlace = input.nextLine();
        System.out.println("Great! " + travelToPlace + " sounds like a great trip");
        System.out.println("***********");
        System.out.println("");
    }

    public static void timeAndBudget(){
        double days;
        double money;
        String currency;
        double exchange;
        Scanner input = new Scanner(System.in);
        System.out.println("How many days are going to spend travelling?");
        days = input.nextDouble();
        System.out.println("How much money, in USD, are you planning to spend on your trip?");
        money = input.nextDouble();
        System.out.println("What is the three letter currency symbol for your travel destination?");
        currency = input.next();
        System.out.println("How many " + currency + " are there in USD?");
        exchange = input.nextDouble();
        System.out.println("");

        int dailySpend = (int)(money/days*100);
        System.out.println("If you are travelling for " + days + " days that is the same as " + (int)(days*24.0) + " hours or " + (int)(days*24.0*60.0) + " minutes");
        System.out.println("If you are going to spend $" + (int)(money) + " USD that means per day you can spend up to " + ((double)(dailySpend))/100 + " USD");
        System.out.println("Your total bidget in " + currency + " is " + (money*exchange) + " MXC, which per day is " + (double)((int)(((money*exchange)/days)*100))/100 + " MXC");
        System.out.println("***********");
        System.out.println("");
    }

    public static void time(){
        int timeDiff;
        Scanner input = new Scanner(System.in);
        System.out.println("What is the time difference, in hours, between your home and your destination?");
        timeDiff = input.nextInt();
        System.out.println("That means that when it is midnight at home it will be " + ((timeDiff)%24) + ":00 in your travel destination \n and when it is noon at home it will be " + ((12+(timeDiff))%24) + ":00");
        System.out.println("***********");
        System.out.println("");
    }

    public static void square(){
        double square;
        Scanner input = new Scanner(System.in);
        System.out.println("What is the aquare area of your destination country in km2?");
        square = input.nextDouble();
        System.out.println("In miles 2 that is " + square*0.38610);
        System.out.println("***********");
        System.out.println("");
    }

}
