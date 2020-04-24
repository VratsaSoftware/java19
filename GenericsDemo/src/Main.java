public class Main {

    public static void main(String[] args) {
//        Box<Dog> dogBox = new Box<>();
//        dogBox.set(new Dog("Pesho"));
//        Dog dog = (Dog) dogBox.get();
//
//        Box<Cat> catBox = new Box<>();
//        catBox.set(new Cat("Mari"));
//
//        System.out.println(dog.getName());
//        System.out.println(catBox.get().getName());
//
//        Box<String> stringBox = new Box<>();
//        stringBox.set(new String("some text"));
//        System.out.println(stringBox.get());

//        OrderedPair<Integer, Dog> orderedPair = new OrderedPair(1, new Dog("Jonny"));
//        System.out.println(orderedPair.getKey());
//        System.out.println(orderedPair.getValue().getName());

//        Pair<Integer, Dog> p1 = new OrderedPair(1, new Dog("Jonny"));
//        Pair<Integer, Dog> p2 = new OrderedPair(2, new Dog("Pesho"));
//        boolean isSame = compare(p1, p2);
//        System.out.println(isSame);


        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello runnable");
            }
        });
        thread.start();

        Thread thread1 = new Thread(() -> {
            System.out.println("Hello lambda");
        });
        thread1.start();
    }

    public static <K, V> boolean compare(Pair<K, V> p1, Pair<K, V> p2) {
        return p1.getKey() == p2.getKey() && p1.getValue().equals(p2.getValue());
    }
}
