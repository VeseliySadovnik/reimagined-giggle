package practice_3;

public class GameMain {
    public static void main(String[] args) {
        GameSettings game1 = new GameSettings("Шашки");
        GameSettings game2 = new GameSettings("Шахматы");

        game1.addPlayer();
        game1.addPlayer();

        game2.addPlayer();

        game1.printGameStatus();
        game2.printGameStatus();

        GameSettings.setMaxPlayers(3);
        game1.addPlayer();
        game1.addPlayer();

        game1.printGameStatus();
    }
}
