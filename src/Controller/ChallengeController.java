package controller;

import model.Challenge;
import java.util.ArrayList;

public class ChallengeController {
    
    private ArrayList<Challenge> challengeList;

    public ChallengeController() {
        challengeList = new ArrayList<>();
        cargarBaseDatos();
    }

    public void addChallenge(Challenge challenge) {
        challengeList.add(challenge);
    }

    public Challenge searchChallenge(int id) {
        Challenge tempChallenge = null;
        for (Challenge challenge : challengeList) {
            if (challenge.getIdChallenge() == id) { 
                tempChallenge = challenge;
                break;
            }
        }
        return tempChallenge;
    }

    public void modifyChallenge(Challenge challenge) {
        int index = challengeList.indexOf(challenge);
        if (index != -1) {
            challengeList.set(index, challenge);
        }
    }

    public void deleteChallenge(Challenge challenge) {
        challengeList.remove(challenge);
    }

    private void cargarBaseDatos() {
        
    }

    public ArrayList<Challenge> getChallengeList() {
        return challengeList;
    }

    public void setChallengeList(ArrayList<Challenge> challengeList) {
        this.challengeList = challengeList;
    }
}
