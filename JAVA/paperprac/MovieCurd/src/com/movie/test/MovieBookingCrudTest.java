package com.movie.test;

import com.movie.bean.Booking;
import com.movie.bean.Movie;
import com.movie.service.MovieService;
import com.movie.service.MovieServiceImpl;

import java.util.Scanner;

public class MovieBookingCrudTest {

    public static void main(String[] args) {

        MovieService service = new MovieServiceImpl();
        Scanner sc = new Scanner(System.in);

        int choice;

        do {
            System.out.println("\n====== MOVIE BOOKING SYSTEM ======");
            System.out.println("1. Add Movie");
            System.out.println("2. Add Booking");
            System.out.println("3. Find By ID");
            System.out.println("4. Update Movie");
            System.out.println("5. Delete Movie");
            System.out.println("6. List All");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");

            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {

                // -------- ADD MOVIE --------
                case 1: {
                    System.out.print("Movie ID: ");
                    int id = Integer.parseInt(sc.nextLine());

                    System.out.print("Movie Name: ");
                    String name = sc.nextLine();

                    System.out.print("Genre: ");
                    String genre = sc.nextLine();

                    System.out.print("Release Year: ");
                    int year = Integer.parseInt(sc.nextLine());

                    service.add(new Movie(id, name, genre, year));
                    System.out.println("Movie added successfully.");
                    break;
                }

                // -------- ADD BOOKING --------
                case 2: {
                    System.out.print("Movie ID: ");
                    int id = Integer.parseInt(sc.nextLine());

                    System.out.print("Movie Name: ");
                    String name = sc.nextLine();

                    System.out.print("Genre: ");
                    String genre = sc.nextLine();

                    System.out.print("Release Year: ");
                    int year = Integer.parseInt(sc.nextLine());

                    System.out.print("Customer Name: ");
                    String customer = sc.nextLine();

                    System.out.print("Seats: ");
                    int seats = Integer.parseInt(sc.nextLine());

                    service.add(new Booking(id, name, genre, year, customer, seats));
                    System.out.println("Booking added successfully.");
                    break;
                }

                // -------- FIND BY ID --------
                case 3: {
                    System.out.print("Enter ID: ");
                    int id = Integer.parseInt(sc.nextLine());

                    Movie movie = service.findById(id);
                    System.out.println(movie != null ? movie : "Record not found.");
                    break;
                }

                // -------- UPDATE --------
                case 4: {
                    System.out.print("Movie ID to Update: ");
                    int id = Integer.parseInt(sc.nextLine());

                    System.out.print("New Name: ");
                    String name = sc.nextLine();

                    System.out.print("New Genre: ");
                    String genre = sc.nextLine();

                    System.out.print("New Release Year: ");
                    int year = Integer.parseInt(sc.nextLine());

                    boolean updated = service.update(new Movie(id, name, genre, year));
                    System.out.println(updated ? "Updated successfully." : "Record not found.");
                    break;
                }

                // -------- DELETE --------
                case 5: {
                    System.out.print("Enter ID to Delete: ");
                    int id = Integer.parseInt(sc.nextLine());

                    boolean deleted = service.delete(id);
                    System.out.println(deleted ? "Deleted successfully." : "Record not found.");
                    break;
                }

                // -------- LIST ALL --------
                case 6: {
                    service.list().forEach(System.out::println);
                    break;
                }

                case 0:
                    System.out.println("Exiting system.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 0);

        sc.close();
    }
}
