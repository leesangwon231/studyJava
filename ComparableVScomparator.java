import java.util.ArrayList;

public class ComparableVScomparator{
    
    private String name;
    private int score;


    public ComparableVScomparator(){

    }

    public ComparableVScomparator(String name, int score){
        this.name = name;
        this.score = score;
    }

    public int getScore(){
        return score;
    }

    
    public static void main(String[] args) {
        
        
        ArrayList<ComparableVScomparator> players = new ArrayList<>();
        players.add(new ComparableVScomparator("Alice", 899));
        players.add(new ComparableVScomparator("Bob", 982));
        players.add(new ComparableVScomparator("Chloe", 1090));
        players.add(new ComparableVScomparator("Dale", 982));  
        
        int max = players.get(0).getScore();
        
        for (ComparableVScomparator player : players) {
            if(player){
                max = player.getScore();
            }
        }
    
    
        }

        
        
        

            

}


