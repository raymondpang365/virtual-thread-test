# virtual-thread-test

A java virtual thread test that compares the performance of
- Blocking Messenger
- Concurrent Messenger with virtual threads

The messeneger receives data from RabbitMQ. For every message it receives, it will go through a fake IO task.

#### How to run

`mvn install`

Press run on `com.messenger.BlockingMessenger` or `com.messenger.ConcurrentMessenger`

#### Result

I find the concurrrent messenger indeed have significant speed up.