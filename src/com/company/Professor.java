package com.company;
import java.util.List;

public class Professor extends Human{

    private List<Group> groups ;

    public Professor(String name) {
        super(name);
    }

    public List<Group> getGroups() {
        return groups;
    }

    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }

    public void setPresenceStudent(Student s, boolean b) {
        s.setPresence(b);
    }

    public void printPresenceStudents(Group g){
        System.out.println("Today such students are present here:");
        g.getList().stream().filter(Student::isPresence).forEach(System.out::println);
    }
}
