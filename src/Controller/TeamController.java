package controller;

import model.Team;
import java.util.ArrayList;

public class TeamController {
    
    private ArrayList<Team> teamList;

    public TeamController() {
        teamList = new ArrayList<>();
        cargarBaseDatos();
    }

    public void addTeam(Team team) {
        teamList.add(team);
    }

    public Team searchTeam(int id) {
        Team tempTeam = null;
        for (Team team : teamList) {
            if (team.getIdTeam() == id) { // Asegúrate de que el método en Team sea getIdTeam() o getId()
                tempTeam = team;
                break;
            }
        }
        return tempTeam;
    }

    public void modifyTeam(Team team) {
        int index = teamList.indexOf(team);
        if (index != -1) {
            teamList.set(index, team);
        }
    }

    public void deleteTeam(Team team) {
        teamList.remove(team);
    }

    private void cargarBaseDatos() {
        // Agrega objetos de prueba si lo necesitas
        // teamList.add(new Team(1, "Alpha Team"));
    }

    public ArrayList<Team> getTeamList() {
        return teamList;
    }

    public void setTeamList(ArrayList<Team> teamList) {
        this.teamList = teamList;
    }
}

