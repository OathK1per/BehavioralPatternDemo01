package iterator01;

/**
 * 迭代器模式：模仿JDK自带的迭代器，实现一个迭代器接口
 * 在聚合类里面，使用内部类定义迭代器，可以使迭代器调用外部的属性List，迭代器也可以通过外部方法获得
 */
public class Client {

    public static void main(String[] args) {
        MyAggregator number = new MyAggregator();

        number.add(5);
        number.add(10);
        number.add(13);
        number.add(23);
        number.add(54);
        number.add(103);

        MyIterator iterator = number.getIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.curObject());
            iterator.next();
        }
    }
}
