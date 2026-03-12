import java.util.concurrent.atomic.AtomicInteger;

class Counter {

private AtomicInteger count = new AtomicInteger(0);

void increment( ) {

count.incrementAndGet();

}

int get( ) {

return count.get();

}

}