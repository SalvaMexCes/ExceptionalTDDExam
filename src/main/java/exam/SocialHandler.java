package exam;
import java.util.*;

public class SocialHandler {

    private Set<String> handleList = new HashSet<>();

    public String checkHandle(String input){
        if (input == null){
            throw new NullPointerException("Invalid entry.");
        }
        if (input.isEmpty()) {
            throw new IllegalArgumentException("Invalid entry.");
        }
        if (input.length() > 9) {
            input = input.substring(0, 9);
        }
        return "@" + input.toLowerCase();
    }

    public void addHandle(String input){
        handleList.add(checkHandle(input));
        System.out.println(handleList);
    }
}
