package service.impl;

import entity.User;

/**
 * Created by AKarasev on 09.10.2015.
 */
public interface AccountService {
    User addUser(User user);
    boolean checkUser();
    User getUserByLogin(String login);
}
