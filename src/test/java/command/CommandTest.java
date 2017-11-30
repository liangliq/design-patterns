package command;

import org.junit.Test;

/**
 * Created by cpekl-ddim-2 on 11/30/17.
 */
public class CommandTest {

    @Test
    public void test(){

        ConcreteCommandA commandA = new ConcreteCommandA();
        ConcreteCommandB commandB = new ConcreteCommandB();
        Receiver receiverA = new Receiver("A");


        CommandQueue commandQueue = new CommandQueue();

        commandQueue.addCommand(commandA);
        commandQueue.addCommand(commandB);

        commandA.setReceiver(receiverA);
        commandB.setReceiver(receiverA);
        Invoker invoker = new Invoker();
        invoker.setConcreteCommond(commandA);
        invoker.call();
        System.out.println("*********");
        invoker.setCommandQueue(commandQueue);
        invoker.calls();

    }

}