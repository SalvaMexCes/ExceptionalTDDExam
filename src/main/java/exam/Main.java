package exam;

public class Main {
    public static void main(String[] args) {

        SocialHandler socialHandler = new SocialHandler();
        System.out.println(socialHandler.checkHandle("SalvaMexCes"));
        socialHandler.addHandle("Mike Jones");
        socialHandler.addHandle("Mike Jones");
        socialHandler.addHandle("Mike Jones");

    }
}
