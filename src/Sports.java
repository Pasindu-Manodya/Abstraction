public abstract class Sports {
    int players;
    String rules;

    public abstract void play();

    public void players(){
        System.out.println("every sport has players");
    }

    public int getPlayers() {
        return players;
    }

    public void setPlayers(int players) {
        this.players = players;
    }

    public String getRules() {
        return rules;
    }

    public void setRules(String rules) {
        this.rules = rules;
    }
}
