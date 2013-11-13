jmus
====

Java Cmus Client

A simple Cmus client written in Java with a focus on code readability and 
minimal dependcies for use in Android etc.


Example usage
```java
CmusClient client = new  CmusClient("192.168.3.99", 9898, "foobar");
client.issueCommand(Volume.UP);
client.issueCommand(Volume.DOWN);
client.issueCommand(Playback.PLAY);
client.issueCommand(Playback.PAUSE);
CmusResponse response = client.issueCommand(Meta.STATUS);
```


