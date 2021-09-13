package HW01.Competitors;

public class Dog extends Animal{
    public Dog(String name) {
        super("Пес", name, 1000, 4, 20);
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
