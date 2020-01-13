public class Team_1_13 {
    private String name;   // private, public, protected
    private int  wins;
    private int  loss;
    private String  conf;
    public Team_1_13(String name, int wins, int loss, String conf) {
        this.name = name;
        this.wins = wins;
        this.loss = loss;
        this.conf = conf;
    }
    public String getName() {
        return name;
    }
    public int getWins() {
        return wins;
    }
    public int getLoss() {
        return loss;
    }
    public String getConf() {
        return conf;
    }
}
