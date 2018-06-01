package com.company;

public class Student extends Human{

    private String group;
    private boolean presence;
    private Qualities[] qualities;

    public Qualities[] getQualities() {
        return qualities;
    }

    public Student(String group, String name, Qualities... p) {
        super(name);
        this.group = group;
        this.qualities = new Qualities[p.length];
        for (int i = 0; i < p.length ; i++)
            this.qualities[i] = p[i];
    }

    @Override
    public String toString() {
        return super.toString() + " [Group = " + group + "]";
    }

    public void vote(Student other, Qualities ...q){

        Qualities[] newQualities = new Qualities[other.qualities.length + q.length];

        System.arraycopy(other.qualities, 0, newQualities, 0, other.qualities.length);

        for (int i = 0; i < q.length; i++) {
            newQualities[other.qualities.length + i] = q[i];
        }
        other.qualities = newQualities;
    }
    public String getGroup() {
        return group;
    }

    public boolean isPresence() {
        return presence;
    }

    public void setPresence(boolean presence) {
        this.presence = presence;
    }
}
