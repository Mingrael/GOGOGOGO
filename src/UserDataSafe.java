/**
 * Created by Миша on 03.04.2017.
 */

public class UserDataSafe {
    private String username;
    private String hashpass;
    private String salt;


    public UserDataSafe(String username, String hashpass, String salt) {
        this.username = username;
        this.hashpass = hashpass;
        this.salt = salt;
    }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getHashpass() {
            return hashpass;
        }

        public void setHashpass(String hashpass) {
            this.hashpass = hashpass;
        }

        public String getSalt() {
            return salt;
        }

        public void setSalt(String salt) {
            this.salt = salt;
        }
}
