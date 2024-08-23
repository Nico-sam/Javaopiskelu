package lopputehtava;

public class WarriorPlayer extends Player {
    
	private String team="Luolaukkelit";
	
	
	private static final String CLAN_GREETING = "Uggabugga!";
    
    public void warriorGreeting() {
        System.out.println(CLAN_GREETING);
    }


    @Override
    public void customGreeting() {
        switch (getClan()) {
            case "Warrior":
                warriorGreeting();
                break;
            default:
                super.customGreeting();  
                break;
        }
    }
}