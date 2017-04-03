/**
 * Created by Миша on 03.04.2017.
 */
public class Main {

    public static void main(String args[]) {
        Parser test = new Parser();
        test.configuration();
        test.ParsStrokee(args);
        UserData te = test.ParsStrokee(args);
        System.out.println(te.getLogin());
    }
}
