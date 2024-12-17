package io.github.sbslc2000.cor;

public class ConcreteHandler2 extends Handler {
    @Override
    public void handleRequest(int request) {
        if (request >= 10 && request < 20) {
            System.out.println("ConcreteHandler2 handled request " + request);
        } else if (successor != null) {
            successor.handleRequest(request);
        }
    }
}
