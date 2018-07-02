package ex_Abstract;

public class MainMenu2 extends AbstractMenu{
    private int number;
    private String text;

    public MainMenu2() {
        number = 1;
        text = "Some text";
    }

    public MainMenu2(int number) {
        this.number = number;
    }

    public MainMenu2(String someText) {
        this.text = someText;
    }

    public MainMenu2(int number, String text) {
        this.number = number;
        this.text = text;
    }


    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }


    @Override
    void show() {
        System.out.println("This is an implementation of a show() method coming from abstract class");

    }

    @Override
    void close() {

    }

    @Override
    void runOption(int option) {

    }
}