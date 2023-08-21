public class Game {

    String title;

    Game() {
        title = " ";
    }

    Game(String title) {
        this.title = title;
    }

    public static void main(String args[]) {
        Game ark = new Game("Ark");
        System.out.println(ark);
    }

    public String toString() {
        return (this.title);
    }
}