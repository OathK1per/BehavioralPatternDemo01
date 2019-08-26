package chainOfResponsibility01;

public class NormalTeacher implements Teacher {
    Teacher next;

    public NormalTeacher() {
        super();
    }

    @Override
    public void setNext(Teacher next) {
        this.next = next;
    }

    @Override
    public void check(DayOff dayOff) {
        if (dayOff.getDays() < 2) {
            System.out.println("带课老师已同意" + dayOff.getName() + "的请假请求");
        } else {
            next.check(dayOff);
        }
    }
}

class HeadTeacher implements Teacher {
    Teacher next;

    public HeadTeacher() {
        super();
    }

    @Override
    public void setNext(Teacher next) {
        this.next = next;
    }

    @Override
    public void check(DayOff dayOff) {
        if (dayOff.getDays() < 5) {
            System.out.println("班主任老师已同意" + dayOff.getName() + "的请假请求");
        } else {
            next.check(dayOff);
        }
    }
}

class ClassManager implements Teacher {
    Teacher next;

    public ClassManager() {
        super();
    }

    @Override
    public void setNext(Teacher next) {
        this.next = next;
    }

    @Override
    public void check(DayOff dayOff) {
        if (dayOff.getDays() < 10) {
            System.out.println("年纪组长已同意" + dayOff.getName() + "的请假请求");
        } else {
            System.out.println("不允许请假");
        }
    }
}
