package model;

public class Challenge {
    private int idChallenge;
    private String description;
    private int rewardPoints;
    private String difficulty;

    public Challenge() {}

    public Challenge(int idChallenge, String description, int rewardPoints, String difficulty) {
        this.idChallenge = idChallenge;
        this.description = description;
        this.rewardPoints = rewardPoints;
        this.difficulty = difficulty;
    }

    public int getIdChallenge() { return idChallenge; }
    public void setIdChallenge(int idChallenge) { this.idChallenge = idChallenge; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public int getRewardPoints() { return rewardPoints; }
    public void setRewardPoints(int rewardPoints) { this.rewardPoints = rewardPoints; }

    public String getDifficulty() { return difficulty; }
    public void setDifficulty(String difficulty) { this.difficulty = difficulty; }

    @Override
    public String toString() {
        return "Challenge [ID=" + idChallenge + ", Descripción=" + description + ", Puntos=" + rewardPoints + ", Dificultad=" + difficulty + "]";
    }
}
