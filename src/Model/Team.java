package model;

public class Team {
    private int idTeam;
    private String teamName;
    private int foundingYear;
    private int memberCount;

    public Team() {}

    public Team(int idTeam, String teamName, int foundingYear, int memberCount) {
        this.idTeam = idTeam;
        this.teamName = teamName;
        this.foundingYear = foundingYear;
        this.memberCount = memberCount;
    }

    public int getIdTeam() { return idTeam; }
    public void setIdTeam(int idTeam) { this.idTeam = idTeam; }

    public String getTeamName() { return teamName; }
    public void setTeamName(String teamName) { this.teamName = teamName; }

    public int getFoundingYear() { return foundingYear; }
    public void setFoundingYear(int foundingYear) { this.foundingYear = foundingYear; }

    public int getMemberCount() { return memberCount; }
    public void setMemberCount(int memberCount) { this.memberCount = memberCount; }

    @Override
    public String toString() {
        return "Team [ID=" + idTeam + ", Nombre=" + teamName + ", Año de fundación=" + foundingYear + ", Miembros=" + memberCount + "]";
    }
}
