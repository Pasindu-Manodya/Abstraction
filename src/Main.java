public class Main {
    public static void main(String args[]){
        Cricket c = new Cricket();
        Football f = new Football();

        c.play();
        f.play();
        c.setPlayers(11);
        c.setRules("played in a oval ground");
        System.out.println(c.getPlayers() + " players," + " " + c.getRules());
        f.setPlayers(11);
        f.setRules("played in a rectangilar ground");
        System.out.println(f.getPlayers() + " players," + " " + f.getRules());
    }
}