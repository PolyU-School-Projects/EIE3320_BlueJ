
//hw4-2 WU Xiaotao 21097724D
//Tool: blueJ

public class VideoGame extends Item
{
    private String title;
    private String platform;
    private int numberOfPlayers;
    private int playingTime;
    
    public VideoGame(String theTitle, String thePlatform, int theNumberOfPlayers, int time){
        super(theTitle, time);
        
        platform = thePlatform;
        numberOfPlayers = theNumberOfPlayers;
        
    }
    
    
    public void print(){
        System.out.println("VideoGame");
        System.out.println("Title: " + getTitle());
        if(getOwn()) {
            System.out.println("Got it: Yes");
        } else {
            System.out.println("Got it: No");
        }
        System.out.println("Playing time: " + getPlayingTime());
        System.out.println("Comment: " + getComment());
        System.out.println("Platform: " + platform);
        System.out.println("No. of players: " + numberOfPlayers);
    };
}
