package iterator01;

public interface MyIterator {

    void first();
    void last();
    void next();
    boolean hasNext();

    boolean isFirst();
    boolean isLast();

    Object curObject();
}
