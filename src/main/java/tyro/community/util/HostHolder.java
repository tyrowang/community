package tyro.community.util;

import tyro.community.entity.User;
import org.springframework.stereotype.Component;

/**
 * 持有用户信息,用于代替session对象.
 * 考虑多线程情况，考虑线程隔离
 */
@Component
public class HostHolder {
    // 线程隔离，以线程为key
    private ThreadLocal<User> users = new ThreadLocal<>();

    public void setUser(User user) {
        users.set(user);
    }

    public User getUser() {
        return users.get();
    }

    public void clear() {
        users.remove();
    }

}
