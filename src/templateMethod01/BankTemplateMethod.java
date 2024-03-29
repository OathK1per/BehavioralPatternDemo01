package templateMethod01;

public abstract class BankTemplateMethod {
    //具体方法
    public void takeNumber(){
        System.out.println("取号排队");
    }
    public abstract void transact(); //办理具体的业务//钩子方法

    public void evaluate(){
        System.out.println("反馈评分");
    }
    public final void process(){
        this.takeNumber();
        this.transact();
        this.evaluate();
    }
}

class Reposit extends BankTemplateMethod {

    @Override
    public void transact() {
        System.out.println("存钱");
    }
}

class PayUtils extends BankTemplateMethod {

    @Override
    public void transact() {
        System.out.println("缴纳水电气费");
    }
}