package exam;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class SocialHandlerTest {



    @Test
    @DisplayName("To check if a social media handle was created successfully")
    void checkHandleTest() {
        SocialHandler socialHandler = new SocialHandler();
        String actual = socialHandler.checkHandle("salvamexces");
        String expected = "@salvamexc";
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("To check if handle was created with 9 characters or less")
    void checkHandleLessThan9CharactersTest() {
        SocialHandler socialHandler = new SocialHandler();
        String actual = socialHandler.checkHandle("salvamexces");
        String unexpected = "@salvamexces";
        assertNotEquals(unexpected, actual);
    }

    @Test // This is an example of how to test an exemption
    @DisplayName("To check if social media handle input is null")
    void checkIfNullTest() {
        SocialHandler socialHandler = new SocialHandler();
        assertThrows(NullPointerException.class, ()-> socialHandler.checkHandle(null));
    }

    @Test
    @DisplayName("To check if social media handle is empty or blank")
    void checkEmptyOrBlankCharactersTest(){
        SocialHandler socialHandler = new SocialHandler();
        assertThrows(IllegalArgumentException.class, ()-> socialHandler.checkHandle(""));
    }

    @Test
    @DisplayName("To check if handle was added despite multiple attempts")
    void addHandleTest(){
         Set<String> handleList = new HashSet<>();
        SocialHandler socialHandler = new SocialHandler();
        socialHandler.addHandle("Mike Jones");
        socialHandler.addHandle("Mike Jones");
        socialHandler.addHandle("Mike Jones");

        assertTrue(handleList.contains("Mike Jones"));
    }

}