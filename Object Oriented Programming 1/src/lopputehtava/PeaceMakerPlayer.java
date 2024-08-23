package lopputehtava;

public class PeaceMakerPlayer extends Player {
    private static final String CLAN_GREETING1 = "Pitkää ikää, toveri!";
    private static final String CLAN_GREETING2 = "Rauhaa!";
    private Boolean smile = true;
    private String team = "Earth Protectors";
    public void goodHealthGreeting() {
        System.out.println(CLAN_GREETING1);
    }

    public void peaceGreeting() {
        System.out.println(CLAN_GREETING2);
    }

    // Override customGreeting to use the subclass's specific greetings
    @Override
    public void customGreeting() {
        switch (getClan()) {
            case "PeaceMaker":
                goodHealthGreeting();
                peaceGreeting();
                break;
            default:
                super.customGreeting();  // Use the default implementation if not a PeaceMaker
                break;
        }
    }
}