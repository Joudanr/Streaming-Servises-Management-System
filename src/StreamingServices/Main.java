package StreamingServices;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static ArrayList<Type> suggest = new ArrayList<>();

    public static void main(String[] args) {
        Subscriber subscriber = null;
        Subscription subscription = null;

        int price = 0;
        int choice = 10;
        Actor[] ac1 = new Actor[2];
        ac1[0] = new Actor(10, "Macaulay acaulkin", 5);
        ac1[1] = new Actor(50, "Joe Pesci", 10);

        Actor[] ac2 = new Actor[2];
        ac2[0] = new Actor(20, "Marlon Brando", 7);
        ac2[1] = new Actor(40, "James Caan", 6);

        Actor[] ac3 = new Actor[2];
        ac3[0] = new Actor(35, "heath ledger", 3);
        ac3[1] = new Actor(30, "christian pale", 7);

        Actor[] ac4 = new Actor[2];
        ac4[0] = new Actor(20, "Henry Fonda", 9);
        ac4[1] = new Actor(34, "martin balsam", 4);

        Actor[] ac5 = new Actor[2];
        ac5[0] = new Actor(30, "Andy Samberg", 12);
        ac5[1] = new Actor(30, "stephanie beatriz", 14);

        Actor[] ac6 = new Actor[2];
        ac6[0] = new Actor(60, "Matthew Perry", 25);
        ac6[1] = new Actor(30, "Daivid Schwimmer", 12);

        Actor[] ac7 = new Actor[2];
        ac7[0] = new Actor(70, "julie bowen", 20);
        ac7[1] = new Actor(40, "Ty Burrell", 16);

        Actor[] ac8 = new Actor[2];
        ac8[0] = new Actor(45, "Gabriel Macht", 20);
        ac8[1] = new Actor(30, "meghan markle", 10);
        // movies lists 
        ArrayList<Type> M = new ArrayList<>();
        M.add(new Movie("home alone", "comedy", new Cast("Chris Columbus", ac1), 124));
        M.add(new Movie("the Godfather", "crime", new Cast("Francis Ford Coppola", ac2), 200));
        M.add(new Movie("the Dark Knight", "crime", new Cast("Chistopher Nolan", ac3), 134));
        M.add(new Movie("Angry Men", "Drama", new Cast("sedney Lumet", ac4), 102));

        // series list
        M.add(new Series("Brooklyn nine nine ", "comedy", new Cast("Dan Goor", ac5), 9, 100));
        M.add(new Series("Friends ", "comedy", new Cast("Daivid Schwimmer", ac6), 10, 200));
        M.add(new Series("Modern family ", "drama", new Cast("Steven Levitan", ac7), 11, 250));
        M.add(new Series("Suits ", "Action", new Cast("Kevin Bray", ac8), 9, 94));
        try {
            while (choice != 0) {
                System.out.println(".....................................");
                System.out.println(".  Welcome to streaming servises    .");
                System.out.println(".  1.View available content         .");
                System.out.println(".  2.Create a user                  .");
                System.out.println(".  3.Suscribe a service             .");
                System.out.println(".  4.View all subscription          .");
                System.out.println(".  5.Our actors                     .");
                System.out.println(".  6.Cancel Subscription            .");
                System.out.println(".  7.To Suggest series              .");
                System.out.println(".  8.Our suggestion for you         .");
                System.out.println(".  9.Old style movies               .");
                System.out.println(".  10.Read Text File                .");
                System.out.println(".  11.Save In Text Files            .");
                System.out.println(".  0.Exit                          .");
                System.out.println(".....................................");

                Scanner read = new Scanner(System.in);
                boolean rep = true;

                do {
                    try {
                        choice = read.nextInt(); // if user enters wrong input it will display (wrong input)
                        rep = false;
                    } catch (InputMismatchException ex) {
                        System.err.println("inviled choice! , Try again");
                        read.nextLine();
                    }
                } while (rep == true);
                switch (choice) {

                    case 1:
                        System.out.println("...........................");
                        System.out.println(".  1. available movies    .");
                        System.out.println(".  2. available series    .");
                        System.out.println("...........................");
                        rep = true;
                        int secChoice = 0;
                        do {
                            try {
                                secChoice = read.nextInt(); // if user enters wrong input it will display (wrong input)
                                rep = false;
                            } catch (InputMismatchException ex) {
                                System.err.println("inviled choice! , Try again");
                                read.nextLine();
                            }
                        } while (rep == true);
                        if (secChoice == 1) {
                            System.out.println(".........................");
                            System.out.println("movie list:");

                            for (Type t : M) {
                                if (t instanceof Movie) {

                                    System.out.println(t.toString());

                                }
                            }
                            System.out.println(".........................");
                        } else if (secChoice == 2) {
                            System.out.println(".........................");
                            System.out.println("Series list:");

                            for (Type t : M) {
                                if (t instanceof Series) {

                                    System.out.println(t.toString());

                                }
                            }
                            System.out.println(".........................");
                        } else {
                            System.out.println("Wrong number");

                        }
                        break;
                    case 2:
                        System.out.println("enter your age ");
                        rep = true;
                        int age = 0;
                        do {
                            try {
                                age = read.nextInt(); // if user enters wrong input it will display (wrong input)
                                rep = false;
                            } catch (InputMismatchException ex) {
                                System.err.println("Wrong input! , Try again");
                                read.nextLine();
                            }
                        } while (rep == true);

                        if (age < 16) {
                            System.out.println("your not allowed to have an account");
                            System.out.println();
                        } else {
                            System.out.println("enter your name:");

                            String name = read.next();

                            System.out.println("enter your e-mail");
                            String email = read.next();

                            System.out.println("enter your password:(without spaces) ");
                            String password = read.next();

                            System.out.println("enter your phone number: ");
                            rep = true;
                            int phoneNumber = 0;
                            do {
                                try {
                                    phoneNumber = read.nextInt(); // if user enters wrong input it will display (wrong input)
                                    rep = false;
                                } catch (InputMismatchException ex) {
                                    System.err.println("Wrong input! , Try again");
                                    read.nextLine();
                                }
                            } while (rep == true);

                            System.out.println("enter a username: ");
                            String userName = read.next();

                            System.out.println("enter your ID: ");
                            rep = true;
                            int ID = 0;
                            do {
                                try {
                                    ID = read.nextInt(); // if user enters wrong input it will display (wrong input)
                                    rep = false;
                                } catch (InputMismatchException ex) {
                                    System.err.println("Wrong input! , Try again");
                                    read.nextLine();
                                }
                            } while (rep == true);

                            subscriber = new Subscriber(age, name, email, password, phoneNumber, userName, ID);
                            System.out.println();
                        }
                        break;
                    case 3:

                        if (subscriber == null) {
                            System.out.println("Please create a user ");
                            break;
                        }
                        System.out.println("what servise you like to subscribe?");
                        System.out.println("1. movies " + 500 + "$ " + " per year");
                        System.out.println("2. series " + 500 + "$ " + " per year");
                        rep = true;
                        int CChoice = 0;
                        do {
                            try {
                                CChoice = read.nextInt(); // if user enters wrong input it will display (wrong input)
                                rep = false;
                            } catch (InputMismatchException ex) {
                                System.err.println("Invalid Choice! , Try again");
                                read.nextLine();
                            }
                        } while (rep == true);

                        System.out.println("how would you like to pay? (visa, mada, or Apple Pay");
                        String paymentMethod = read.next();

                        System.out.println("when would you like to start your subscription?");
                        System.out.println("Day: ");
                        rep = true;
                        int day = 0;
                        do {
                            try {
                                day = read.nextInt(); // if user enters wrong input it will display (wrong input)
                                rep = false;
                            } catch (InputMismatchException ex) {
                                System.err.println("Wrong input! , Try again");
                                read.nextLine();
                            }
                        } while (rep == true);

                        System.out.println("month: ");
                        rep = true;
                        int month = 0;
                        do {
                            try {
                                month = read.nextInt(); // if user enters wrong input it will display (wrong input)
                                rep = false;
                            } catch (InputMismatchException ex) {
                                System.err.println("Wrong input! , Try again");
                                read.nextLine();
                            }
                        } while (rep == true);

                        System.out.println("year: ");
                        rep = true;
                        int year = 0;
                        do {
                            try {
                                year = read.nextInt(); // if user enters wrong input it will display (wrong input)
                                rep = false;
                            } catch (InputMismatchException ex) {
                                System.err.println("Wrong input! , Try again");
                                read.nextLine();
                            }
                        } while (rep == true);

                        System.out.println("for how many years you would like to subscribe ");
                        rep = true;
                        int plan = 0;
                        do {
                            try {
                                plan = read.nextInt(); // if user enters wrong input it will display (wrong input)
                                rep = false;
                            } catch (InputMismatchException ex) {
                                System.err.println("Wrong input! , Try again");
                                read.nextLine();
                            }
                        } while (rep == true);

                        switch (CChoice) {
                            case 1:
                                Subscription s1 = new Subscription();
                                price = s1.endPrice(plan);
                                break;
                            case 2:
                                Subscription s2 = new Subscription();
                                price = s2.endPrice(plan);
                                break;
                            default:
                                System.out.println("Wrong number");
                                break;
                        }
                        System.out.println("confirm your subscription by writing (Y/N) ");
                        char st = read.next().charAt(0);
                        if (st == 'Y' || st == 'y') {
                            Purchases payment = new Purchases(paymentMethod);
                            Date date = new Date(day, month, year);
                            subscription = new Subscription(subscriber, plan, payment, date, price);
                            subscription.setStatus("Active");
                            subscription.print();
                            // Ù†Ø±Ø¬Ø¹ Ù„Ù‡Ø§ 
                            System.out.print("expiry date: ");
                            Date expiryDate = date.expiryDate(plan);
                            System.out.println(expiryDate.toString());
                            System.out.println("we have confirmed your suscription");
                        } else {
                            System.out.println("we have cancelled your suscription");
                        }

                        break;
                    case 4:
                        if (subscription == null) {
                            System.out.println("You don't have any subscription yet!");
                        } else {
                            subscription.print();
                        }
                        break;
                    case 5:
                        if (subscriber == null) {
                            System.out.println("Please create a user ");
                            break;
                        }
                        System.out.println("---------------------------------");
                        for (Actor e : ac1) {
                            System.out.println(e);
                            System.out.println();
                        }
                        for (Actor e : ac2) {
                            System.out.println(e);
                            System.out.println();
                        }
                        for (Actor e : ac3) {
                            System.out.println(e);
                            System.out.println();
                        }
                        for (Actor e : ac4) {
                            System.out.println(e);
                            System.out.println();
                        }
                        for (Actor e : ac5) {
                            System.out.println(e);
                            System.out.println();
                        }
                        for (Actor e : ac6) {
                            System.out.println(e);
                            System.out.println();
                        }
                        for (Actor e : ac7) {
                            System.out.println(e);
                            System.out.println();
                        }
                        for (Actor e : ac8) {
                            System.out.println(e);
                            System.out.println();
                        }
                        System.out.println("------------------------------");

                        break;
                    case 6:
                        if (subscription != null) {
                            System.out.println("Do you want to cancel your subscription? (Y/N) ");
                            st = read.next().charAt(0);
                            if (st == 'Y' || st == 'y') {
                                subscription.setStatus("Cancelled");
                                subscription.print();
                                System.out.println("you have succesfully cancelled your subscription");
                            } else {
                                System.out.println("Thank you, Enjoy your subscription");
                            }
                        } else {
                            System.out.println("your not subscribed yet");
                        }
                        break;

                    case 7:
                        Streaming_Services_GUI.main(null);

                        break;

                    case 8:
                        if (subscriber == null) {
                            System.out.println("Please create a user ");
                            break;
                        }
                        System.out.println("what do you want a suggestion for? ");
                        System.out.println("1. Movies");
                        System.out.println("2. Series");
                        rep = true;
                        int suggestionPick = 0;
                        do {
                            try {
                                suggestionPick = read.nextInt(); // if user enters wrong input it will display (wrong input)
                                rep = false;
                            } catch (InputMismatchException ex) {
                                System.err.println("Wrong input! , Try again");
                                read.nextLine();
                            }
                        } while (rep == true);

                        if (suggestionPick == 1) {
                            System.out.println("Here's a suggestion for you:");
                            Movie suggestedMovie = selectRandomMovie(M);
                            System.out.println(suggestedMovie.toString());
                            break;
                        } else if (suggestionPick == 2) {
                            System.out.println("Here's a suggestion for you:");
                            Series suggestedSeries = selectRandomSeries(M);
                            System.out.println(suggestedSeries.toString());
                            break;
                        } else {
                            System.out.println("wrong number");
                        }
                    case 9:
                        System.out.println("how would you like to pay? (visa, mada, Apple Pay, Or Cash)");
                        String paymentMETHOD = read.next();

                        System.out.println("what is your street name?");
                        String street = read.next();
                        street = read.nextLine();
                        System.out.println("what is your city?");
                        String city = read.next();
                        city = read.nextLine();
                        System.out.println("what is your state?");
                        String state = read.next();
                        state = read.nextLine();
                        System.out.println("what is your zip code? ");
                        String zipCode = read.next();

                        System.out.println("what is your house number?");
                        rep = true;
                        int houseNumber = 0;
                        do {
                            try {
                                houseNumber = read.nextInt(); // if user enters wrong input it will display (wrong input)
                                rep = false;
                            } catch (InputMismatchException ex) {
                                System.err.println("Wrong input! , Try again");
                                read.nextLine();
                            }
                        } while (rep == true);

                        System.out.println("how would you like to receve your cast in hardesk or tape?");
                        String castType = read.next();
                        System.out.println("confirm your purcheses by writing (Y/N) ");
                        char ST = read.next().charAt(0);
                        if (ST == 'Y' || ST == 'y') {
                            Purchases purchases = new Purchases(paymentMETHOD);
                            OldStyle oldStyle = new OldStyle(new Address(street, city, state, zipCode, houseNumber), castType);
                            subscription = new Subscription(subscriber, purchases, 50, oldStyle);
                            subscription.setStatus("Active");
                            System.out.println("we have confirmed your shipment");
                            subscription.printOldStyleInfo();

                        } else {
                            System.out.println("we have cancelled your shipment");
                        }

                        break;
                    case 10:
                        ReadTextFile re = new ReadTextFile();
                        re.openTextFile("StreamigServices.txt");
                        re.readFromFile();
                        re.closeFile();
                        break;
                    case 11:
                        WriteTextFile wr = new WriteTextFile();
                        wr.openTextFile("StreamigServices.txt");

                        for (Type ty : M) {
                            wr.writeToFile(ty);
                        }
                        wr.closeFile();
                        System.out.println("YOUR DATA HAS BEEN SAVED");
                        break;
                    case 0:
                        System.out.println("Thank You For Testing Our Program ");
                        System.out.println("We Hope You Loved it");
                        break;
                    default:
                        System.out.println("wrong number");
                        break;

                }
            }
        } catch (InputMismatchException ex) {
            System.err.println("Wrong input ");
            System.err.println("Try again!!");
        } catch (NullPointerException ex) {
            System.err.println("Invalid object!");
        } catch (ClassCastException ex) { // we used instincof so Exception wont happen
            System.err.println("Invalid Downcasting");
        }//we dont need array exception bec our indexes number is known
         catch (Exception ex){
            System.err.println("there is an error");
        }// to handle any other problems
        
    }

    public static Series selectRandomSeries(ArrayList<Type> M) {
        ArrayList<Series> seriesList = new ArrayList<>();
        for (Type t : M) {
            if (t instanceof Series) {
                Series series = (Series) t;
                seriesList.add(series);
            }
        }
        int randomSeries = (int) (Math.random() * seriesList.size());
        return seriesList.get(randomSeries);
    }

    public static Movie selectRandomMovie(ArrayList<Type> M) {
        ArrayList<Movie> movieList = new ArrayList<>();
        for (Type t : M) {
            if (t instanceof Movie) {
                Movie movie = (Movie) t;
                movieList.add(movie);
            }
        }
        int randomMovie = (int) (Math.random() * movieList.size());
        return movieList.get(randomMovie);
    }

}
