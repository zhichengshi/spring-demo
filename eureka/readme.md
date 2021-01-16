这里实现了一个简单的Eureka生产者和消费者的案例，可以通过消费者暴露的API调用生产者的逻辑。运行该项目需要同时启动三个模块，Eureka Consumer、Eureka Provider以及
Eureka-Server。
测试时，在浏览器中输入：localhost:9002/hello?name=cheng 即可得到测试结果，不过要稍等一会儿，已运行测试会包500内部错误，我还调了好久，原来是有延迟
 