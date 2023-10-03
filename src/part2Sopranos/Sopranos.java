package part2Sopranos;

public class Sopranos {
    private String titile;
    private int season;
    private int episode;
    private int year;

    public Sopranos(String titile, int season, int episode, int year) {
        this.titile = titile;
        this.season = season;
        this.episode = episode;
        this.year = year;
    }

    public int getEpisode() {
        return episode;
    }

    public int getYear() {
        return year;
    }

    public String  toString() {
        return "Season: " + season + " Episode: " + episode + " Year: " + year;
    }

}
class SopranosCollection {
    private int count;
    private Sopranos[] episodes;

    public SopranosCollection(int capacity) {
        episodes = new Sopranos[capacity];
        count = 0;
    }

    public void add(Sopranos newEpisode) {
        if (count < episodes.length) {
            episodes[count++] = newEpisode;
        } else {
            System.out.println("Cannot add more episodes.");
        }
    }

    public void printOne(int i) {
        if (i >= 0 && i < count) {
            System.out.println(episodes[i]);
        } else {
            System.out.println("Ineligible index.");
        }
    }

    public void print() {
        for (int i = 0; i < count; i++) {
            System.out.println(episodes[i]. toString());
        }
    }

    public void find(String searchEp) {
        boolean found = false;
        for (int i = 0; i < count; i++) {
            if (episodes[i]. toString().toLowerCase().contains(searchEp.toLowerCase())) {
                System.out.println(episodes[i]);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No matching episodes found.");
        }

    }

    public void sort() {
        for (int i = 0; i < count - 1; i++) {
            for (int j = 0; j < count - i - 1; j++) {
                if (episodes[j].getEpisode() > episodes[j + 1].getEpisode()) {
                    swap(episodes, j, j + 1);

                    //Sopranos temp = episodes[j];
                    //episodes[j] = episodes[j + 1];
                    // episodes[j + 1] = temp;
                }
            }
        }
    }
    public static void swap(Sopranos[] episodes, int ind1, int ind2) {
        Sopranos temp = episodes[ind1];
        episodes[ind1] = episodes[ind2];
        episodes[ind2] = temp;
    }

}

