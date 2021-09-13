package HW01.Competitors;

public class Cat extends Animal {
    public Cat(String name) {
        super("Кот", name, 500, 10, 0);
    }

    public void swim(int distance) {
        if (distance <=maxSwimDistance){
            System.out.println(name + " " + " успешно проплыл дистанцию");
        } else {
            System.out.println(name + " " + " не смог проплыть дистанцию");
            onDistance = false;
        }
    }

    public void showResult() {

        System.out.println(name + ": " + onDistance);
    }

}
