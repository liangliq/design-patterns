package command;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cpekl-ddim-2 on 11/30/17.
 */
public class CommandQueue extends AbstractCommand {
    List<AbstractCommand> commands = new ArrayList<AbstractCommand>();

    public void addCommand(AbstractCommand command){
        commands.add(command);
    }

    @Override
    public void execute() {

        for (AbstractCommand command:commands)
        {
            command.execute();

        }
    }
}
