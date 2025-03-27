package src.api.task2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Clubmembers {
    private final List<String> members = new ArrayList<>();

    void membradd(String name) {
        members.add(name);
    }

    void membrdelete(String name) {
        members.remove(name);
    }

    void membrlist() {
        System.out.println("Members->" + members);
    }

    void membrrename(String oldName, String newName) {
        int index = members.indexOf(oldName);
        if (index != -1) {
            members.set(index, newName);
        }
    }

    void membrsort() {
        Collections.sort(members);
    }

    public static void main(String[] args) {
        Clubmembers club = new Clubmembers();
        club.membradd("srgs");
        club.membradd("prip");
        club.membrlist();
        club.membrrename("prip", "auhc");
        club.membrlist();
        club.membrsort();
        club.membrlist();
        club.membrdelete("prip");
    }
}