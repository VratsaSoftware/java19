package com.vsc.oop.notes;

import java.util.ArrayList;

public class Program {

    public static void main(String[] args) {
        NotesList notesList = new NotesList();
        notesList.add("TODO");
        notesList.add("TODO2");
        notesList.add("TODO3");
        notesList.add("TODO4");
        notesList.add("TODO5");
        notesList.add("TODO6");

        // TODO add with index
        // TODO contains
        // TODO sublist
        // TODO trimToSize
        // TODO removeAll

        System.out.println(notesList);

        NotesList sublist = notesList.sublist(4, 5);
        System.out.println(sublist);
    }

}
