# virtual-thread-test

A java virtual thread test that compares the performance of
- Blocking Messenger
- Concurrent Messenger with virtual threads

The messeneger receives data from RabbitMQ. For every message it receives, it will go through a fake IO task.

#### How to run

`mvn install`

`Press run on com.messenger.BlockingMessenger` or ``

#### Result

I find the concurrrent messenger indeed have significant speed up.

#### To do:

- It currently uses all my CPU cores. Is it possible to force it to only use 1 platform thread?

- I have to rely on pressing `run` on IDE to run this. `bm.sh` and `cm.sh` were working but now they suddenly do not work?

- A maintainable maven / folder structure if I want to add more examples?