# JOrderMatching
Prototype of Order Matching Engine with Basic FIX Gateway using Java

This is a prototype project extracted from my Msc dissertation project "High-throughput And Low-latency Trading System using Java" in HKU.

Only JDK 1.8 is required to run the main project. <b>No third party library is needed.</b>

## 后续任务
* system.out.print 统一由 logger 替代
* 交易的事务处理
* login using username and password
* symbol 如何初始化

### run java code
> 启动代码
```
java -cp target/core-0.0.1-SNAPSHOT.jar application.ApplicationMain
```
> 启动debug代码
```
java -agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=8000 -cp target/core-0.0.1-SNAPSHOT.jar application.ApplicationMain
```


