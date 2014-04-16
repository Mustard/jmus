jmus
====

Java Cmus Client

A simple Cmus client written in Java with a focus on code readability and 
minimal dependcies for use in Android etc.


Example usage
```java
CmusClient client = new  CmusClient("192.168.3.99", 9898, "foobar");
client.command(Volume.UP);
client.command(Volume.DOWN);
client.command(Playback.PLAY);
client.command(Playback.PAUSE);
CmusResponse response = client.issueCommand(Meta.STATUS);
```


[![Build Status](https://travis-ci.org/Mustard/jmus.svg?branch=master)](https://travis-ci.org/Mustard/jmus)
