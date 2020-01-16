import com.mysql.cj.x.protobuf.MysqlxDatatypes;

public class Team_1_13 {
    private String name;   // private, public, protected
    private int  wins;
    private int  loss;
    public String  conf;
    public Team_1_13(String name, int wins, int loss, String conf) {
        this.name = name;
        this.wins = wins;
        this.loss = loss;
        if ( conf.equalsIgnoreCase("north") || conf.equalsIgnoreCase("south")) {
                this.conf = conf;
          } else {
            System.out.printf("Illegal conference value c:%s", conf);
          }
      }
    public String getName() { return name; }
    public int getWins() { return wins; }
    public int getLoss() { return loss; }
    public String getConf() { return conf; }
    public double getWinPerc() {
            double wp = (double) wins/ (wins+loss) * 100;
            return wp;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append( "name:" +name);
        sb.append( ", wins:" +wins);
        sb.append( ", loss:" + loss);
        sb.append( ", WPerc:" + getWinPerc());
        sb.append( ", Conf:" + conf);
        return sb.toString();
    }
    // Show how setters protect data
}
