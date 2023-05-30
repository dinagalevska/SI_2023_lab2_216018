import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class SILab2Test {
    private List<User> userList;

    private void initializeUserList() {
        userList = new ArrayList<>();
        userList.add(new User("Bojana", "bojana123", "bojana@gmail.com"));
        userList.add(new User("dina@gmail.com", "mesec123$", "dina@gmail.com"));
    }
    @Test
    public void everyBranchTest() {
        initializeUserList();

        RuntimeException exception;
        exception = assertThrows(RuntimeException.class, () -> SILab2.function(null, new ArrayList<>()));
        assertTrue(exception.getMessage().contains("Mandatory information missing!"));

        assertFalse(SILab2.function(new User("Dina", "mesec", "dinagmail.com"), userList));

        assertFalse(SILab2.function(new User(null, "mesec 1234", "dina@gmail.com"), userList));

        assertFalse(SILab2.function(new User(null, "mesec1234", "dina@gmail.com"), userList));

        assertFalse(SILab2.function(new User(null, "mesec123$", "dina@gmail.com"), userList));
    }

    @Test
    public void multipleConditionTEst() {
        initializeUserList();

        RuntimeException exception;
        exception = assertThrows(RuntimeException.class, () -> SILab2.function(null, new ArrayList<>()));
        assertTrue(exception.getMessage().contains("Mandatory information missing!"));

        exception = assertThrows(RuntimeException.class, () -> SILab2.function(new User("Dina", null, "whatever"), new ArrayList<>()));
        assertTrue(exception.getMessage().contains("Mandatory information missing!"));

        exception = assertThrows(RuntimeException.class, () -> SILab2.function(new User("Dina", "finki123/!", null), new ArrayList<>()));
        assertTrue(exception.getMessage().contains("Mandatory information missing!"));

        assertFalse(SILab2.function(new User(null, "mesec 123$", "dina@gmail.com"), userList));
    }
}