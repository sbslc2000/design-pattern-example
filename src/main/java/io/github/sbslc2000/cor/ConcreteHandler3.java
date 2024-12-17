package io.github.sbslc2000.cor;

public class ConcreteHandler3 extends Handler {
    @Override
    public void handleRequest(int request) {
        if (request >= 20 && request < 30) {
            System.out.println("ConcreteHandler3 handled request " + request);
        } else if (successor != null) {
            successor.handleRequest(request);
        }
    }
}
