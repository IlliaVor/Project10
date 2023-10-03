package part2Sopranos;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        SopranosCollection episodeCollection = new SopranosCollection(50);

        System.out.println("Welcome to 'The Sopranos' episode database!");
        while (true) {
            System.out.println("\nChoose an option to proceed:");
            System.out.println("1 - Add an episode to the collection");
            System.out.println("2 - Print all episodes");
            System.out.println("3 - Print details of a single episode");
            System.out.println("4 - Sort episodes by episode number");
            System.out.println("5 - Search episodes by title or year");
            System.out.println("0 - Exit the program");

            int choice = in.nextInt();
            in.nextLine();

            switch (choice) {
                case 1:
                    inputItems(in, episodeCollection);
                    break;
                case 2:
                    episodeCollection.print();
                    break;
                case 3:
                    printSingleEpisode(in, episodeCollection);
                    break;
                case 4:
                    episodeCollection.sort();
                    System.out.println("Episodes sorted by episode number.");
                    episodeCollection.print();
                    break;
                case 5:
                    search(in, episodeCollection);
                    break;
                case 0:
                    System.out.println("Goodbye!");
                    in.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }

    public static void inputItems(Scanner in, SopranosCollection episodeCollection) {
        System.out.println("Enter episode details (title, season, episode number, year) or 'stop' to exit:");

        while (true) {
            System.out.print("Title: ");
            String title = in.nextLine();

            if (title.equalsIgnoreCase("stop")) {
                break;
            }

            System.out.print("Season: ");
            int season = in.nextInt();
            in.nextLine();

            System.out.print("Episode Number: ");
            int episodeNumber = in.nextInt();
            in.nextLine();

            System.out.print("Year: ");
            int year = in.nextInt();
            in.nextLine();

            Sopranos episode = new Sopranos(title, season, episodeNumber, year);
            episodeCollection.add(episode);
            System.out.println("Episode added to the collection.");
        }
    }
    public static void printSingleEpisode(Scanner in, SopranosCollection episodeCollection) {
        System.out.print("Enter the index of the episode to print: ");
        int index = in.nextInt();
        in.nextLine();

        episodeCollection.printOne(index);
    }

    public static void search(Scanner in, SopranosCollection episodeCollection) {
        System.out.println("Enter a keyword to search for episodes:");
        String searchEp = in.nextLine();
        System.out.println("Matching: ");

        episodeCollection.find(searchEp);
    }
}


