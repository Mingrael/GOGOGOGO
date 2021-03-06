/**
 * Created by Миша on 05.04.2017.
 */
//Здесь хранятся засоленные и захэшированные пароли пользователей
public class UsersPaswords {

        int id;
        String name, login, pass, salt;

        public User(int id, String name, String login, String pass) {
            this.id = id;
            this.name = name;
            this.login = login;
            this.salt = Hash.salt();
            this.pass = Hash.hash(Hash.hash(pass) + salt);
        }

        public User(User u) {
            this.id = u.id;
            this.name = u.name;
            this.login = u.login;
            this.pass = u.pass;
            this.salt = u.salt;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getLogin() {
            return login;
        }

        public void setLogin(String login) {
            this.login = login;
        }

        public String getPass() {
            return pass;
        }

        public void setPass(String pass) {
            this.pass = pass;
        }

        public String getSalt() {
            return salt;
        }

        public void setSalt(String salt) {
            this.salt = salt;
        }
    }

}
