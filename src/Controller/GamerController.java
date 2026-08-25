package controller;

import model.Gamer;
import java.util.ArrayList;

public class GamerController {
    
    private ArrayList<Gamer> gamerList;

    public GamerController() {
        gamerList = new ArrayList<>();
        cargarBaseDatos();
    }

    public void addGamer(Gamer gamer) {
        gamerList.add(gamer);
    }

    public Gamer searchGamer(int id) {
        Gamer tempGamer = null;
        for (Gamer gamer : gamerList) {
            if (gamer.getIdGamer() == id) {
                tempGamer = gamer;
            }
        }
        return tempGamer;
    }

    public void modifyGamer(Gamer gamer) {
        int index = gamerList.indexOf(gamer);
        if (index != -1) {
            gamerList.set(index, gamer);
        }
    }

    public void deleteGamer(Gamer gamer) {
        gamerList.remove(gamer);
    }

    private void cargarBaseDatos() {
        gamerList.add(new Gamer(1, "Cruz", "123", 99));
        gamerList.add(new Gamer(2, "harry potter", "123", 45));
    }

    public ArrayList<Gamer> getGamerList() {
        return gamerList;
    }

    public void setGamerList(ArrayList<Gamer> gamerList) {
        this.gamerList = gamerList;
    }
}
