package demo.boot.service.impl;



import org.springframework.stereotype.Component;

import demo.boot.service.CustomerIdGenerator;

import java.util.concurrent.atomic.AtomicInteger;

@Component
public class CustomerIdGeneratorImpl implements CustomerIdGenerator {
    private static final AtomicInteger SEQUENCE = new AtomicInteger();

    @Override
    public int generateNextId() {
        return SEQUENCE.incrementAndGet();
    }
}
