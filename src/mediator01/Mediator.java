package mediator01;

import java.util.HashMap;
import java.util.Map;

public interface Mediator {

    void register(String name, Student student);

    void command(String name);
}

class Teacher implements Mediator {
    private Map<String, Student> map = new HashMap<>();

    @Override
    public void register(String name, Student student) {
        if (!map.containsKey(name)) {
            map.put(name, student);
        }
    }

    @Override
    public void command(String name) {
        Student student = map.get(name);
        if (student != null) {
            student.selfAction();
        }
    }
}
