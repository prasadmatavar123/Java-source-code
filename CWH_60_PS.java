abstract class Pen {
    abstract void write();

    abstract void refil();
}

class FountainPen extends Pen {
    void write() {
        System.out.println("write");
    }

    void refil() {
        System.out.println("refil");
    }

    void changeNib() {
        System.out.println("Changing the nib");
    }
}

class Monkey {
    void jump() {
        System.out.println("jump");
    }

    void bite() {
        System.out.println("bite");
    }
}

interface BasicAnimal {
    void eat();

    void sleep();
}

class Human extends Monkey implements BasicAnimal {
    void speak() {
        System.out.println("Hello sir");
    }

    public void eat() {
        System.out.println("Eatting");
    }

    public void sleep() {
        System.out.println("sleeping");
    }
}

public class CWH_60_PS {
    public static void main(String[] args) {
        FountainPen pen = new FountainPen();
        pen.changeNib();
        Human harry = new Human();
        harry.sleep();
        // Monkey m1 = new Human();
        // m1.speak(); ----> can not use speak methods because the referance is monkey which does not have speak methods 
        BasicAnimal lovish = new Human();
        // lovish.speak(); 
        lovish.eat();
        lovish.sleep();

    }

}
