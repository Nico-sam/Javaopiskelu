package lopputehtava;

import java.util.Scanner;

public class Player {
    private String firstName;
    private String lastName;
    private String userName;
    private String password;
    private String clan;

    public static String createPassword(Scanner scanner) {
        String password1, password2;
        while (true) {
            System.out.print("Syötä salasana: ");
            password1 = scanner.nextLine();
            System.out.print("Vahvista salasana: ");
            password2 = scanner.nextLine();
            if (password1.equals(password2)) {
                return password1;
            } else {
                System.out.println("Salasanat eivät vastaa. Yritä uudelleen.");
            }
        }
    }

    public void createProfile(Scanner scanner) {
        System.out.print("Syötä käyttäjätunnus, tämä on myös sinun avatarisi nimi: ");
        this.userName = scanner.nextLine();
        this.password = createPassword(scanner);
        System.out.print("Syötä etunimesi: ");
        this.firstName = scanner.nextLine();
        System.out.print("Syötä sukunimesi: ");
        this.lastName = scanner.nextLine();
    }

    public void setClan(String clan) {
        this.clan = clan;
    }

    public String getClan() {
    	return clan;

    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void greeting() {
        System.out.println("Tervehdys, " + userName + "!");
    }
    public void customGreeting() {
    	System.out.println("Tervehdys, " +userName + "!");
    }
    public void clanAnnounce() { 
    	System.out.println (userName + " on uusi " + clan +" klaanin jäsen! ");
    }
}