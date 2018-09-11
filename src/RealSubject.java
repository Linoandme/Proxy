//RealSubject定义了Proxy所代表的真实实体
public class RealSubject implements Subject {
    @Override
    public void request() {
        System.out.println("真实的请求。。。。。");
    }
}
