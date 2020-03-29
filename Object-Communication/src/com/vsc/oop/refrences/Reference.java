package com.vsc.oop.refrences;

public class Reference {

    public static void main(String[] args) {
        Human human = new Human();
        Human human2 = new Human();
        Human human3 = null;

        System.out.println(human3);
        if (human3 == null) {
            human3 = new Human();
        }

        System.out.println(human3);
    }

    private static void humanTalk(Human human) {
        System.out.println(human);

        human = new Human();
        System.out.println(human);
        human.talk();
    }
}
