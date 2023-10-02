package part1Ref;

class Dota2Players {
    private String name;
    private int mmr;


    public Dota2Players(String name, int mmr) {
        this.name = name;
        this.mmr = mmr;
    }

    static void increasePlayerMmr(Dota2Players player, int amount) {
        player.increaseMmr(amount);
    }

    public String getName() {
        return name;
    }

    public int getMmr() {
        return mmr;
    }
    public void increaseMmr(int amount) {
        mmr += amount;
    }
}


public class Part1 {
    public static void main(String[] args) {
        Dota2Players player = new Dota2Players("Illia Vorobiov", 6200);


        Dota2Players player1 = player;
        Dota2Players player2 = player;


        player1.increaseMmr(100);
        player2.increaseMmr(50);


        System.out.println(player1.getName() + "'s Rank: " + player1.getMmr());
        System.out.println(player2.getName() + "'s Rank: " + player2.getMmr());


        player.increaseMmr(200);


        System.out.println(player.getName() + "'s Rank: " + player.getMmr());

    }
}




