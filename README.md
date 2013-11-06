jmus
====

Java Cmus Client

A simple Cmus client written in Java with a focus on code readability and 
minimal dependcies for use in Android etc.


Example usage
```java
CmusClient clinet = new CmusClient("localhost", 8888, "password");
client.issueCommand(Volume.UP);
```


