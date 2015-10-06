package sqlcmd_homework.controller;

import sqlcmd_homework.model.DatabaseManager;
import sqlcmd_homework.model.JDBCDatabaseManager;
import sqlcmd_homework.view.Console;
import sqlcmd_homework.view.View;

/**
 * Created by Sims on 06/10/2015.
 */
public class Main {

    public static void main(String[] args) {
        View view = new Console();
        DatabaseManager manager = new JDBCDatabaseManager();
        MainController controller = new MainController(view, manager);
        controller.run();
    }
}