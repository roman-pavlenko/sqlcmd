package ua.com.juja.sqlcmd_homework.controller.command;

import ua.com.juja.sqlcmd_homework.view.View;

/**
 * Created by Sims on 12/10/2015.
 */
public class Exit implements Command {
    private View view;

    public Exit(View view){
        this.view = view;
    }

    @Override
    public boolean canProcess(String command) {
        return "exit".equals(command);
    }

    @Override
    public void process(String command) {
        view.write("Bye");
        throw new ExitException();
    }
}
