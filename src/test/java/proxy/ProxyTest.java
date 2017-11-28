package proxy;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by cpekl-ddim-2 on 11/28/17.
 * **********
 * Proxy pattern may cause confused with decorator pattern
 * Yes, actually we can see what's the different from the client invoke
 * In proxy pattern, users only know Proxy
 * In decorator pattern, user know component and can change their component to decorator
 * **********
 */
public class ProxyTest {

    @Test
    public void test(){
        Proxy proxy = new Proxy();
        proxy.printMessage();
    }

}