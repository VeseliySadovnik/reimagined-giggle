package practice_3;

public class GameSettings {
    static int maxPlayers = 5;
    final String gameName;
    int currentPlayers;

    public GameSettings(String gameName) {
        this.gameName = gameName;
        this.currentPlayers = 0;
    }

    public static void setMaxPlayers(int max) {
        maxPlayers = max;
    }

    public void addPlayer() {
        if (currentPlayers < maxPlayers) {
            currentPlayers++;
        } else {
            System.out.println("Достигнуто максимальное количество игроков!");
        }
    }
    public void printGameStatus() {
        System.out.println("Название игры: " + gameName + ", количество игроков: " + currentPlayers + ", максимальное количество игроков: " + maxPlayers);
    }
}
