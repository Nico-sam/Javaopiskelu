package lopputehtava;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Player player = new Player();
        player.createProfile(scanner);

        System.out.println("Valitse klaani:");
        System.out.println("1: Warrior");
        System.out.println("2: PeaceMaker");
        System.out.print("Syötä valintasi (1 tai 2): ");
        int choice = scanner.nextInt();
        scanner.nextLine(); 

        Player playerProfile;
        switch (choice) {
            case 1:
                playerProfile = new WarriorPlayer();
                playerProfile.setClan("Warrior");
                break;
            case 2:
                playerProfile = new PeaceMakerPlayer();
                playerProfile.setClan("PeaceMaker");
                break;
            default:
                System.out.println("Virheellinen valinta.");
                return;
        }


        playerProfile.setUserName(player.getUserName());
        playerProfile.clanAnnounce();
        playerProfile.setPassword(player.getPassword());
        playerProfile.greeting();
        playerProfile.customGreeting();
        
    }
}