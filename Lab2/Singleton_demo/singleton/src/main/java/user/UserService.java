package user;

import logging.LogManager;

public class UserService {

    public void login(String username) {
        LogManager logger = LogManager.getInstance();
        logger.log("User logged in: " + username);
    }
}
