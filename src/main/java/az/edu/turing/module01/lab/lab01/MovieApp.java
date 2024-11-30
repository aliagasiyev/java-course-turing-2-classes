package az.edu.turing.module01.lab.lab01;

import java.util.Scanner;

public class MovieApp {
    private static Movie[] movies = new Movie[3]; // Initial array for movies
    private static int count = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int choice = showMenu(scanner);

            switch (choice) {
                case 1:
                    inputMovies(scanner, 3); // Input 3 movies
                    break;
                case 2:
                    displayAllMovies(movies, count); // Display all movies
                    break;
                case 3:
                    inputMoreMovies(scanner); // Add more movies
                    break;
                case 4:
                    displayStatistics(movies, count); // Show statistics
                    break;
                case 5:
                    searchAndDisplayMovie(scanner, movies, count); // Search for a movie
                    break;
                case 6:
                    updateMovieRating(scanner, movies, count); // Update movie rating
                    break;
                case 7:
                    deleteMovie(scanner, movies, count); // Delete a movie
                    count--; // Decrease movie count after deletion
                    break;
                case 8:
                    sortMovies(movies, count); // Sort movies
                    break;
                case 0:
                    System.out.println("Exiting program.");
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    private static int showMenu(Scanner scanner) {
        System.out.println("\nMenu:");
        System.out.println("1. Input Movies");
        System.out.println("2. Display Movies");
        System.out.println("3. Input More Movies");
        System.out.println("4. Find Statistics");
        System.out.println("5. Search for a Movie");
        System.out.println("6. Update Movie Ratings");
        System.out.println("7. Delete a Movie");
        System.out.println("8. Sort Movies");
        System.out.println("0. Exit");
        System.out.print("Enter your choice: ");
        return scanner.nextInt();
    }

    private static void inputMovies(Scanner scanner, int numberOfMovies) {
        for (int i = 0; i < numberOfMovies; i++) {
            if (count >= movies.length) {
                System.out.println("Movie list is full. Add more space using option 3.");
                return;
            }
            inputSingleMovie(scanner, count);
            count++;
        }
    }

    private static void inputSingleMovie(Scanner scanner, int index) {
        System.out.print("Enter movie name: ");
        scanner.nextLine(); // Consume newline
        String name = scanner.nextLine();
        System.out.print("Enter movie rating: ");
        double rating = scanner.nextDouble();
        movies[index] = new Movie(name, rating);
    }

    private static void displayAllMovies(Movie[] movies, int count) {
        if (count == 0) {
            System.out.println("No movies available to display.");
            return;
        }
        for (int i = 0; i < count; i++) {
            System.out.println(movies[i].getName() + " - Rating: " + movies[i].getRating());
        }
    }

    private static void inputMoreMovies(Scanner scanner) {
        System.out.print("How many more movies would you like to add? ");
        int additionalMovies = scanner.nextInt();

        Movie[] newMovies = new Movie[movies.length + additionalMovies];
        for (int i = 0; i < count; i++) {
            newMovies[i] = movies[i];
        }
        movies = newMovies;

        inputMovies(scanner, additionalMovies);
    }

    // 6. Display statistics
    private static void displayStatistics(Movie[] movies, int count) {
        if (count == 0) {
            System.out.println("No movies to calculate statistics.");
            return;
        }
        System.out.println("Average Rating: " + calculateAverageRating(movies, count));
        System.out.println("Highest Rated Movie: " + findMaxRatedMovie(movies, count).getName());
        System.out.println("Lowest Rated Movie: " + findMinRatedMovie(movies, count).getName());
    }

    private static double calculateAverageRating(Movie[] movies, int count) {
        double total = 0;
        for (int i = 0; i < count; i++) {
            total += movies[i].getRating();
        }
        return total / count;
    }

    private static Movie findMaxRatedMovie(Movie[] movies, int count) {
        Movie maxMovie = movies[0];
        for (int i = 1; i < count; i++) {
            if (movies[i].getRating() > maxMovie.getRating()) {
                maxMovie = movies[i];
            }
        }
        return maxMovie;
    }

    private static Movie findMinRatedMovie(Movie[] movies, int count) {
        Movie minMovie = movies[0];
        for (int i = 1; i < count; i++) {
            if (movies[i].getRating() < minMovie.getRating()) {
                minMovie = movies[i];
            }
        }
        return minMovie;
    }

    private static void searchAndDisplayMovie(Scanner scanner, Movie[] movies, int count) {
        System.out.print("Enter movie name to search: ");
        scanner.nextLine(); // Consume newline
        String name = scanner.nextLine();
        int index = searchMovieIndex(movies, count, name);
        if (index == -1) {
            System.out.println("Movie not found.");
        } else {
            System.out.println(movies[index].getName() + " - Rating: " + movies[index].getRating());
        }
    }

    private static int searchMovieIndex(Movie[] movies, int count, String name) {
        for (int i = 0; i < count; i++) {
            if (movies[i].getName().equalsIgnoreCase(name)) {
                return i;
            }
        }
        return -1;
    }

    private static void updateMovieRating(Scanner scanner, Movie[] movies, int count) {
        System.out.print("Enter movie name to update: ");
        scanner.nextLine(); // Consume newline
        String name = scanner.nextLine();
        int index = searchMovieIndex(movies, count, name);
        if (index == -1) {
            System.out.println("Movie not found.");
        } else {
            System.out.print("Enter new rating: ");
            movies[index].setRating(scanner.nextDouble());
            System.out.println("Rating updated.");
        }
    }

    private static void deleteMovie(Scanner scanner, Movie[] movies, int count) {
        System.out.print("Enter movie name to delete: ");
        scanner.nextLine(); // Consume newline
        String name = scanner.nextLine();
        int index = searchMovieIndex(movies, count, name);
        if (index == -1) {
            System.out.println("Movie not found.");
        } else {
            shiftMoviesLeft(movies, index, count);
            System.out.println("Movie deleted.");
        }
    }

    private static void shiftMoviesLeft(Movie[] movies, int index, int count) {
        for (int i = index; i < count - 1; i++) {
            movies[i] = movies[i + 1];
        }
        movies[count - 1] = null; // Remove the last element
    }

    private static void sortMovies(Movie[] movies, int count) {
        for (int i = 0; i < count - 1; i++) {
            for (int j = 0; j < count - i - 1; j++) {
                if (movies[j].getRating() > movies[j + 1].getRating()) {
                    Movie temp = movies[j];
                    movies[j] = movies[j + 1];
                    movies[j + 1] = temp;
                }
            }
        }
        System.out.println("Movies sorted by rating:");
        displayAllMovies(movies, count);
    }
}
