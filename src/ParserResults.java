/**
 * Created by Миша on 05.04.2017.
 */
//В этом классе мы будем записывать результаты парсинга
public class ParserResults {
    String login;
    String pass;
    String res;
    String role;
    String date_start;
    String date_end;
    String volume;

    public ParserResults(String login, String pass, String res, String role, String date_start, String date_end, String volume) {
        this.login = login;
        this.pass = pass;
        this.res = res;
        this.role = role;
        this.date_start = date_start;
        this.date_end = date_end;
        this.volume = volume;
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

    public String getRes() {
        return res;
    }

    public void setRes(String res) {
        this.res = res;
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

