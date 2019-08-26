package iterator01;

import java.util.ArrayList;
import java.util.List;

public class MyAggregator {
    private List<Object> list = new ArrayList<>();

    public void add(Object obj) {
        list.add(obj);
    }

    public MyIterator getIterator() {
        return new MyConcreteIterator();
    }

    class MyConcreteIterator implements MyIterator {

        private int iterator = 0;

        @Override
        public void first() {
            iterator = 0;
        }

        @Override
        public void last() {
            iterator = list.size() - 1;
        }

        @Override
        public void next() {
            iterator += 1;
        }

        @Override
        public boolean hasNext() {
            return (iterator < list.size() - 1);
        }

        @Override
        public boolean isFirst() {
            return (iterator == 0);
        }

        @Override
        public boolean isLast() {
            return (iterator == list.size() - 1);
        }

        @Override
        public Object curObject() {
            return list.get(iterator);
        }
    }
}
