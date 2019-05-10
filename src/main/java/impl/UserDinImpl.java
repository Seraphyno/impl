package impl;

import api.IUser;

public class UserDinImpl implements IUser {
    private boolean estePremium;
    
    public boolean isEstePremium() {
        return estePremium;
    }
    
    public String getUsername() {
        return "Ion";
    }
    
    public String getPassword() {
        return "1234";
    }
}
