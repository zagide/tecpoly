package com.zagi.rabbitmq;

import org.springframework.stereotype.Component;

import java.util.concurrent.CountDownLatch;


@Component
public class Receiver {

    private CountDownLatch latch = new CountDownLatch(1);

    public void recevieMessage(String message) {
        System.out.println("Receiver <" + message + ">");
        latch.countDown();
    }

    public CountDownLatch getLatch() {
        return latch;
    }
}
