package model;

public class Gamer {
    private int idGamer;
    private String user;
    private String password;
    private int level;

    
    public Gamer() {}

 
    public Gamer(int idGamer, String user, String password, int level) {
        this.idGamer = idGamer;
        this.user = user;
        this.password = password;
        this.level = level;
    }

    
    public int getIdGamer() { return idGamer; }
    public void setIdGamer(int idGamer) { this.idGamer = idGamer; }

    public String getUser() { return user; }
    public void setUser(String user) { this.user = user; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public int getLevel() { return level; }
    public void setLevel(int level) { this.level = level; }

    @Override
    public String toString() {
        return "Gamer [ID=" + idGamer + ", Usuario=" + user + ", Nivel=" + level + "]";
    }
}
