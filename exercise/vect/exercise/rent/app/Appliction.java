package exercise.vect.exercise.rent.app;

import java.util.Locale;
import java.util.Scanner;

import exercise.vect.exercise.rent.entities.Rules;

public class Appliction {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("How many rooms will be rented? ");
        int busy = sc.nextInt();

        Rules[] rulesArray = new Rules[busy];

        sc.nextLine();
        for (int i = 0; i < rulesArray.length; i++) {

            System.out.printf("Rent #%d: ", (i + 1));
            System.out.println("Name: ");
            String name = sc.nextLine();

            System.out.println("Email: ");
            String email = sc.nextLine();

            int[] room = new int[9];

            System.out.println("Room: ");
            int chosenRoom = sc.nextInt();

            room[chosenRoom - 1] = 1;
            sc.nextLine();
            Rules rules = new Rules(name, email, room);
            rulesArray[i] = rules;
        }

        System.out.println("Busy rooms: ");
        for (int i = 0; i < rulesArray.length; i++) {
            Rules rules = rulesArray[i];
            System.out.printf("Rent #%d - Name: %s, Email: %s, Room: %s\n",
                    (i + 1), rules.getName(), rules.getEmail(), rules.getOccupiedRooms());
            sc.close();
        }
    }
}