package controller;

import model.Game;
import java.util.ArrayList;

public class GameController {
    
    private ArrayList<Game> gameList;

    public GameController() {
        gameList = new ArrayList<>();
        cargarBaseDatos();
    }

    public void addGame(Game game) {
        gameList.add(game);
    }

    public Game searchGame(int id) {
        Game tempGame = null;
        for (Game game : gameList) {
            if (game.getIdGame() == id) { 
                tempGame = game;
                break;
            }
        }
        return tempGame;
    }

    public void modifyGame(Game game) {
        int index = gameList.indexOf(game);
        if (index != -1) {
            gameList.set(index, game);
        }
    }

    public void deleteGame(Game game) {
        gameList.remove(game);
    }

    private void cargarBaseDatos() {
       
    }

    public ArrayList<Game> getGameList() {
        return gameList;
    }

    public void setGameList(ArrayList<Game> gameList) {
        this.gameList = gameList;
    }
}
