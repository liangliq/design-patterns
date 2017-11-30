package command;

/**
 * Created by cpekl-ddim-2 on 11/30/17.
 */
public class ConcreteCommandB extends AbstractCommand {
    private Receiver receiver;

    public void setReceiver(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.sayname();
    }
}
