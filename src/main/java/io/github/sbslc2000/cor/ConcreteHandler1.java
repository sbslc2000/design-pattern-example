package io.github.sbslc2000.cor;

public class ConcreteHandler1 extends Handler{
    @Override
    public void handleRequest(int request) {
        if (request >= 0 && request < 10) {
            System.out.println("ConcreteHandler1 handled request " + request);
        } else if (successor != null) {
            successor.handleRequest(request);
        }
    }
}
