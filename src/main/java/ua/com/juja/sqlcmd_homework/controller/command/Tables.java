package ua.com.juja.sqlcmd_homework.controller.command;


import ua.com.juja.sqlcmd_homework.model.DatabaseManager;
import ua.com.juja.sqlcmd_homework.view.View;
import java.util.Set;

/**
 * Created by Sims on 12/10/2015.
 */
public class Tables implements Command{

    private View view;
    private DatabaseManager manager;

    public Tables(DatabaseManager manager, View view) {
        this.manager = manager;
        this.view = view;
    }

    @Override
    public boolean canProcess(String command) {
        return command.equals("list");//TODO replace command "list" => "tables"
    }

    @Override
    public void process(String command) {
        Set<String> tableNames = manager.getTableNames();
        String message = tableNames.toString();
        view.write(message);
    }
}
