/**
 * Created by Миша on 05.04.2017.
 */
//Класс, в котором мы проверяем, действительно ли мы будем выполнять тот или иной ААА протокол.
public class CheckingPreparation extends ParserResults {


    public boolean isAuthentication() {
        if (!getLogin().equals("") && !this.getPass().equals("")
                && this.getRes().equals("") && this.getRole().equals("") && this.getVolume().equals("")
                && this.getDate_start().equals("") && this.getDate_end().equals("")) {
            return true;
        }
        return false;
    }

    public boolean isAuthorization() {
        if (!this.getLogin().equals("") && !this.getPass().equals("") && !this.getRes().equals("") && !this.getRole().equals("")
                && this.getVolume().equals("") && this.getDate_start().equals("") && this.getDate_end().equals("")) {
            return true;
        }
        return false;
    }

    public boolean isAccounting() {
        if (!this.getLogin().equals("") && !this.getPass().equals("") && !this.getRes().equals("") && !this.getRole().equals("")
                && !this.getVolume().equals("") && !this.getDate_start().equals("") && !this.getDate_end().equals("")) {
            return true;
        }
        return false;
    }
}
