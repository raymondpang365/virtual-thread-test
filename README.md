# virtual-thread-test

#### Note

For educational and testing purpose only

#### Description

A java virtual thread test that compares the performance of
- Blocking Messenger
- Concurrent Messenger with virtual threads

The messeneger receives data from RabbitMQ. For every message it receives, it will go through a fake IO task.

#### How to run

`mvn install`

Press run on `com.messenger.BlockingMessenger` or `com.messenger.ConcurrentMessenger`

#### Result

I find the concurrrent messenger indeed have significant speed up.

#### To do:

- It currently uses all my CPU cores. Will force it to only use 1 platform thread.

- Now, we have to rely on pressing `run` on IDE to run this. `bm.sh` and `cm.sh` were working but now they do not work. Investigating the reason why `bm.sh` and `cm.sh` were working but now not. 

- A maintainable maven / folder structure if I want to add more examples