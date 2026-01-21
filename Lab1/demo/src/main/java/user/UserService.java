package user;

import infrastructure.InMemoryDatabase;

public class UserService {

    public void register(User user) {
        InMemoryDatabase.users.put(user.getId(), user);
    }

    public User findById(int id) {
        return InMemoryDatabase.users.get(id);
    }
}
