package ex_Interface;

public class MainMenu implements InterfaceMenu {
    private int number;
    private String text;

    public MainMenu() {
        number = 1;
        text = "Some text";
    }

    public MainMenu(int number) {
        this.number = number;
    }

    public MainMenu(String someText) {
        this.text = someText;
    }

    public MainMenu(int number, String text) {
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
    public void show() {
        System.out.println("This is an implementation of a show() method coming from an interface");
    }

    @Override
    public void close() {

    }

    @Override
    public void runOption(int option) {

    }
}