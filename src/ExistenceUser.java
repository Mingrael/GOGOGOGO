import java.util.ArrayList;

/**
 * Created by Миша on 03.04.2017.
 */
public class ExistenceUser {
    ArrayList<UserDataSafe> users = new ArrayList<>();
    public void adduser(String username, String hashpass, String salt )
    {
        UserDataSafe user = new UserDataSafe(username,hashpass,salt);
        users.add(user);
    }
}
