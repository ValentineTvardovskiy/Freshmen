package com.company;

public class ClassLead extends Student {

    private boolean presence;


    public ClassLead(String group, String name, Qualities... p) {
        super(group, name, p);
    }

    @Override
    public boolean isPresence() {
        return presence;
    }

    @Override
    public void setPresence(boolean presence) {
        this.presence = presence;
    }
}
