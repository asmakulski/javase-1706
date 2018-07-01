package Ex_Inheritance;

public class MainInheritance {

    public static void main(String[] args) {

        //pokazanie dostepu do metod ktore dziecko dziedziczy po rodzicu
        System.out.print("To jest obiekt rodzic Animal i "); Animal.eat();
        System.out.print("To jest obiekt dziecko Dog i ");Dog.eat();
        System.out.print("To jest obiekt dziecko Dog i ");Dog.bark();
        System.out.print("To jest obiekt dziecko Bear i ");Bear.eat();
        System.out.print("To jest obiekt dziecko Bear i ");Bear.roar();
    }
}
