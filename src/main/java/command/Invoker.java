package command;

/**
 * Created by cpekl-ddim-2 on 11/30/17.
 */
public class Invoker {
    private AbstractCommand concreteCommand;
    private CommandQueue commandQueue;

    public void setCommandQueue(CommandQueue commandQueue) {
        this.commandQueue = commandQueue;
    }

    public void setConcreteCommond(ConcreteCommandA concreteCommond) {
        this.concreteCommand = concreteCommond;
    }

    public void calls(){
        commandQueue.execute();
    }

    public void call(){
        concreteCommand.execute();
    }
}
