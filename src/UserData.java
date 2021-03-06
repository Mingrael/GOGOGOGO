/**
 * Created by Миша on 03.04.2017.
 */
public class UserData {

    private String login;
    private String password;
    private String resource;
    private String role;
    private String date_start;
    private String date_end;
    private String volume;

    public UserData() {
        this.login = null;
        this.password = null;
        this.resource = null;
        this.role = null;
        this.date_start = null;
        this.date_end = null;
        this.volume = null;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getResource() {
        return resource;
    }

    public void setResource(String resource) {
        this.resource = resource;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getDate_start() {
        return date_start;
    }

    public void setDate_start(String date_start) {
        this.date_start = date_start;
    }

    public String getDate_end() {
        return date_end;
    }

    public void setDate_end(String date_end) {
        this.date_end = date_end;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }
}
