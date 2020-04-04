package com.vsc.oop.notes;

public class NotesList {

    private static final int DEFAULT_INITIAL_SIZE = 4;

    private String[] notes;
    private int size;

    public NotesList() {
        notes = new String[DEFAULT_INITIAL_SIZE];
    }

    public NotesList(String[] notes) {
        this.notes = notes;
        size = notes.length;
    }

    public int add(String element) {
        if (size == notes.length) {
            extendArray();
        }

        notes[size] = element;
        size++;

        return size;
    }

    private void extendArray() {
        String[] newArray = new String[notes.length * 2];
        for (int i = 0; i < notes.length; i++) {
            newArray[i] = notes[i];
        }

        notes = newArray;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void clear() {
        notes = new String[notes.length];
        size = 0;
    }

    public String get(int index) {
        validateIndex(index);

        return notes[index];
    }

    public int indexOf(String element) {
        for (int i = 0; i < size; i++) {
            String note = notes[i];

            if (note.equals(element)) {
                return i;
            }
        }

        return -1;
    }

    public int remove(String element) {
        int index = indexOf(element);
        if (index == -1) {
            return index;
        }

        shiftElements(index);
        return index;
    }

    public String remove(int index) {
        validateIndex(index);

        String elementValue = notes[index];
        shiftElements(index);

        return elementValue;
    }

    private void shiftElements(int index) {
        for (int i = index; i < size; i++) {
            notes[i] = notes[i + 1];
        }

        size--;
    }

    private void  validateIndex(int index) {
        if (index < 0) {
            throw new IllegalArgumentException("Cannot use negative index");
        }

        if (index >= size) {
            throw new IndexOutOfBoundsException("Size: " + size + "; Index: " + index);
        }
    }

    /**
     * @param startIndex
     * @param endIndex exclusiv
     * @return
     */
    public NotesList sublist(int startIndex, int endIndex) {
        validateIndex(startIndex);
        validateIndex(endIndex);

        if (startIndex >= endIndex) {
            throw new IllegalArgumentException("Start index must be before end index");
        }

        String[] subNotes = new String[endIndex - startIndex];
        for (int i = startIndex; i < endIndex; i++) {
            subNotes[i - startIndex] = notes[i];
        }

        return new NotesList(subNotes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");

        for (int i = 0; i < size; i++) {
            String note = notes[i];
            sb.append(note);
            sb.append(", ");
        }

        if (size > 0) {
            sb.setLength(sb.length() - 2);
        }

        sb.append("]");
        return sb.toString();
    }

//    public void testPrint() {
//        System.out.println(Arrays.toString(notes));
//    }
}
