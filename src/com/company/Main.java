package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        //Шановний користувач, будьте обережні, на наступних рядках ви потрапите у зону надмірного хардкоду!

        //a group of students
        Student st1 = new Student("MIT-21", "Bachynska", Qualities.RESPECTED, Qualities.CLEVER);
        Student st2 = new Student("MIT-21", "Lisnyk", Qualities.RESPECTED, Qualities.CLEVER, Qualities.HONEST);
        Student st3 = new Student("MIT-21", "Izotov", Qualities.HONEST, Qualities.CLEVER);
        Student st4 = new Student("MIT-21", "Kovsharov", Qualities.RESPECTED, Qualities.CLEVER);
        Student st5 = new Student("MIT-21", "Kostenko", Qualities.KIND, Qualities.CLEVER);
        Student st6 = new Student("MIT-21", "Naidenko", Qualities.RESPECTED, Qualities.KIND);
        Student st7 = new Student("MIT-21", "Skvortsova", Qualities.HONEST, Qualities.CLEVER);
        Student st8 = new Student("MIT-21", "Rekunenko", Qualities.CLEVER);
        Student st9 = new Student("MIT-21", "Pertsiukh", Qualities.RESPECTED, Qualities.CLEVER);
        Student st10 = new Student("MIT-21", "Hryshchuk", Qualities.KIND, Qualities.CLEVER);

        //some students vote
        st3.vote(st4, Qualities.HONEST, Qualities.KIND);
        st2.vote(st4, Qualities.CLEVER);
        st7.vote(st2, Qualities.KIND);
        st10.vote(st1, Qualities.KIND);
        st8.vote(st7, Qualities.RESPECTED);

        //add students to the list
        List<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);
        students.add(st6);
        students.add(st7);
        students.add(st8);
        students.add(st9);
        students.add(st10);

        //creating a groups
        Group group1 = new Group("MIT-21", students);

        //group1.print();

        //classlead of the group
        group1.setClassLead();
        System.out.println(group1.getClassLead());
        System.out.println();

        //add groups to the list
        List<Group> allGroups = new ArrayList<>();
        allGroups.add(group1);

        //add professor
        Professor professor = new Professor("Dudnik");
        professor.setGroups(allGroups);

        //roll-call of students in a group
        Random random = new Random();
        for (int i = 0; i < group1.getList().size(); i++) {
            professor.setPresenceStudent(group1.getList().get(i), random.nextBoolean());
        }

        //list of those present
        professor.printPresenceStudents(group1);
    }
}
