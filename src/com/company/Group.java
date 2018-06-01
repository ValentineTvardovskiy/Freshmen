package com.company;

import java.util.*;

public class Group {

    private String name;
    private List< Student> list;
    private ClassLead classLead;

    public Group(String name, List< Student> list ){
        this.name = name;
        this.list = list;
    }

    public List< Student> getList() {
        return list;
    }

    public String getName() {
        return name;
    }

    public void print(){
        System.out.println("List of student group " + this.name + ":");
        list.forEach(System.out::println);
        System.out.println();
    }

    public void setClassLead() {
        int maxNumberOfQualities = list.get(0).getQualities().length;
        int next;
        int index = maxNumberOfQualities;
        for (int i = 1; i < list.size(); i++) {
            next = list.get(i).getQualities().length;
            if(next > maxNumberOfQualities) {
                maxNumberOfQualities = next;
                index = i;
            }
        }
        Student classLead = list.get(index);
        Student cl = new ClassLead(classLead.getGroup(),classLead.getName(), classLead.getQualities());
        list.set(index, cl);
    }

    public ClassLead getClassLead(){
        for(Student st : list)
            if(st.getClass() == ClassLead.class)
                return (ClassLead)st;
        return null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Group)) return false;
        Group group = (Group) o;
        return Objects.equals(name, group.name) &&
                Objects.equals(list, group.list);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, list);
    }

    @Override
    public String toString() {
        return "Group " + name;
    }
}
