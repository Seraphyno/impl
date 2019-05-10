package impl;

import api.IUser;
import org.junit.Test;

public class UserDinImplTest {
    IUser user = new UserDinImpl();
    
    @Test
    public void getUsername() {
        assert "Ion".equals(user.getUsername());
    }
    
    @Test
    public void getPassword() {
        "1234".equals(user.getPassword());
    }
}