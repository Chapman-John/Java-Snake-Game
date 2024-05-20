public class SnakeGame {

    public static void main(String[] args) {
        new GameFrame(
                new GamePanel(
                        new Snake(),
                        new Food(),
                        new Score()));
    }
}