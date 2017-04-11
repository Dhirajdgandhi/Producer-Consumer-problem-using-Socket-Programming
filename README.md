# Producer-Consumer-problem-using-Socket-Programming
Contains the implementation of Producer-Consumer problem using Socket Programming in JAVA

Files :
Producer.java - The producer class
Consumer.java - The consumer class
Monitor.java - This class monitors the producer and consumer.

Explanation of the problem :
Implement producer consumer example. The problem describes two processes, the
producer and the consumer, who share a common, fixed-size buffer used as a queue. The
producer&#39;s job is to generate data, put it into the buffer, and start again. At the same time,
the consumer is consuming the data (i.e., removing it from the buffer), one piece at a
time. The problem is to make sure that the producer won&#39;t try to add data into the buffer if
it&#39;s full and that the consumer won&#39;t try to remove data from an empty buffer. The
solution for the producer is to either go to sleep or discard data if the buffer is full. The
next time the consumer removes an item from the buffer, it notifies the producer, who
starts to fill the buffer again. In the same way, the consumer can go to sleep if it finds the
buffer to be empty. The next time the producer puts data into the buffer, it wakes up the
sleeping consumer. The solution can be reached by means of inter-process
communication, typically using semaphores. An inadequate solution could result in a
deadlock where both processes are waiting to be awakened.
Write a server client program, where producer and consumer are client processes and the
server program has to monitor these.
