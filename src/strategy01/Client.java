package strategy01;

/**
 * 策略模式：将复杂算法从条件语句中分离，然后选择使用需要的算法
 * 其实质需要预先知道究竟选用哪个算法，已知分类
 * context类将客户端和具体策略分离
 * 如果通过配置文件，可以实现依赖注入，能够实现动态策略
 */
public class Client {

    public static void main(String[] args) {
        double price = 100.0;
        Context context = new Context(new GoldenCard());
        context.print(price);
    }
}
