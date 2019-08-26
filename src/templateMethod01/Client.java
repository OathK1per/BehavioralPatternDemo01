package templateMethod01;

/**
 * 模板方法模式：处理大致步骤在抽象类中定义好，具体细节在子类中实现
 * 抽象类中已经控制好整个流程，子类只是工具人实现单个方法，这种形式称为方法回调
 */
public class Client {

    public static void main(String[] args) {
        BankTemplateMethod bank = new Reposit();
        bank.process();
        BankTemplateMethod bank2 = new PayUtils();
        bank2.process();
    }
}
