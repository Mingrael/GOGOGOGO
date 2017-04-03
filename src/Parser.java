/**
 * Created by Миша on 03.04.2017.
 */
import org.apache.commons.cli.*;

public class Parser {
    public Options option;
    public void configuration()
    {
      this.option = new Options();

      option.addOption(new Option("login", "login", true, "login"));
      option.addOption(new Option("pass", "password", true, "password"));
      option.addOption(new Option("res", "ress", true, "path"));
      option.addOption(new Option("role", "role", true, "role"));
      option.addOption(new Option("ds", "date-start", true, "date start (YYYY-MM-DD)"));
      option.addOption(new Option("de", "date-end", true, "date end (YYYY-MM-DD)"));
      option.addOption(new Option("vol", "volume", true, "volume"));
      option.addOption(new Option("h", "help", false, "help")); //добавляем опции для последующего парсинга
    }

    public UserData ParsStrokee(String args[])
    {
        CommandLineParser cmdLineParser = new DefaultParser();
        UserData Vremen = new UserData();

        try {
            CommandLine cmdLine = cmdLineParser.parse(option, args);

            if (cmdLine.hasOption("login")) {//хэзопшн- проверяет наличие опции. Получаем значение по ключу
                Vremen.setLogin(cmdLine.getOptionValue("login")); //помещаем в класс значение опции, соответствующей ключу -l
            }
            if (cmdLine.hasOption("pass")) {
                Vremen.setLogin(cmdLine.getOptionValue("pass"));
            }
            if (cmdLine.hasOption("ress")) {
                Vremen.setLogin(cmdLine.getOptionValue("ress"));
            }
            if (cmdLine.hasOption("role")) {
                Vremen.setLogin(cmdLine.getOptionValue("role"));
            }
            if (cmdLine.hasOption("ds")) {
                Vremen.setLogin(cmdLine.getOptionValue("ds"));
            }
            if (cmdLine.hasOption("de")) {
                Vremen.setLogin(cmdLine.getOptionValue("de"));
            }
            if (cmdLine.hasOption("v")) {
                Vremen.setLogin(cmdLine.getOptionValue("v"));
            }

        } catch (ParseException e)
        {
            e.printStackTrace();
        }

        return Vremen;

    }

}
