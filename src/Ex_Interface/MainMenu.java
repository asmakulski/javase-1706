package Ex_Interface;

public class MainMenu implements Menu{
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

    }

    @Override
    public void close() {

    }

    @Override
    public void runOption(int option) {

    }
}