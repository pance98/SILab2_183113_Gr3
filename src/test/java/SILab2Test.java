import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;

import static org.junit.jupiter.api.Assertions.*;

public class SILab2Test {

    @Test
    public void testCriteriaEveryStatement() {

        assertThrows(RuntimeException.class, () -> SILab2.function(null, null));

        assertThrows(RuntimeException.class, () -> SILab2.function(new User(null,null,null),null));

        User user1 = new User("Forknife", "forkkniferrrr", null);
        assertFalse(()->SILab2.function(user1,null));

        User user2 = new User("Forknife", "fork333333", null);
        assertFalse(()->SILab2.function(user2,null));

        User user3 = new User("Forknife", "fork", null);
        assertFalse(()->SILab2.function(user3,null));


        User user4 = new User("Forknife", "ForKn!f3r", null);
        assertTrue(()->SILab2.function(user4,null));
    }

    @Test
    public void testCriteriaMultipleCondition(){

        User u0 = new User(null, null, null );
        assertThrows(RuntimeException.class, () -> SILab2.function(u0,null));

        User u1 = new User("leaguepro", null, null );
        assertThrows(RuntimeException.class, () -> SILab2.function(u1,null));

        User u2 = new User(null, "prodigy21233", null );
        assertThrows(RuntimeException.class, () -> SILab2.function(u2,null));

        User u3 = new User("Rmafan", "rma12345", null );
        assertFalse(()->SILab2.function(u3,null));

        User u4 = new User("MUFCRdd", "r3d3v!L", null );
        assertFalse(()->SILab2.function(u4,null));

        User u5 = new User("CR7GOAT", "CristianoRonaldo", null );
        assertFalse(()->SILab2.function(u5,null));

        User u6 = new User("mesigoat", "m355!goatt", null );
        assertFalse(()->SILab2.function(u6,null));

        User u7 = new User("csGoPro", "headshot555553", null );
        assertFalse(()->SILab2.function(u7,null));

        User u8 = new User("minecraaft", "d!amond5", null );
        assertFalse(()->SILab2.function(u8,null));

        User u9 = new User("ff@15", "IgiveUP", null );
        assertFalse(()->SILab2.function(u9,null));



    }

}