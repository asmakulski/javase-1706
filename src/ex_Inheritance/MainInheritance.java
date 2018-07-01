package ex_Inheritance;

public class MainInheritance {

    public static void main(String[] args) {

        //pokazanie dostepu do metod ktore dziecko dziedziczy po rodzicu
        System.out.print("This is a parent object Animal and "); Animal.eat();
        System.out.print("This is a child object Dog and ");Dog.eat();
        System.out.print("This is a child object Dog and ");Dog.bark();
        System.out.print("This is a child object Bear and ");Bear.eat();
        System.out.print("This is a child object Bear and ");Bear.roar();
    }
}
