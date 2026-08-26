package model;

public class Game {
    private int idGame;
    private String name;
    private String genre;
    private int minLevel;

    public Game() {}

    public Game(int idGame, String name, String genre, int minLevel) {
        this.idGame = idGame;
        this.name = name;
        this.genre = genre;
        this.minLevel = minLevel;
    }

    public int getIdGame() { return idGame; }
    public void setIdGame(int idGame) { this.idGame = idGame; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getGenre() { return genre; }
    public void setGenre(String genre) { this.genre = genre; }

    public int getMinLevel() { return minLevel; }
    public void setMinLevel(int minLevel) { this.minLevel = minLevel; }

    @Override
    public String toString() {
        return "Game [ID=" + idGame + ", Nombre=" + name + ", Género=" + genre + ", Nivel Mínimo=" + minLevel + "]";
    }
}
