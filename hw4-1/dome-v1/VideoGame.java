
//hw4-1 WU Xiaotao 21097724D
//Tool: blueJ

public class VideoGame
{
    private String title;
    private String platform;
    private int numberOfPlayers;
    private int playingTime;
    private boolean gotIt;
    private String comment;
    
    public VideoGame(String theTitle, String thePlatform, int theNumberOfPlayers, int thePlayingTime){
    
        title = theTitle;
        platform = thePlatform;
        numberOfPlayers = theNumberOfPlayers;
        playingTime = thePlayingTime;
        
    }
    
    public void setComment(String comment){
        this.comment = comment;
    };
    
    String getComment(){
    return comment;
    };
    
    public void setOwn(boolean isOwn){
    gotIt = isOwn;
    };
    
    boolean getOwn(){
    return gotIt;
    };
    
    void print(){
    System.out.println("VideoGame");
        System.out.println("Title: " + title);
        if(gotIt) {
            System.out.println("Got it: Yes");
        } else {
            System.out.println("Got it: No");
        }
        System.out.println("Playing time: " + playingTime);
        System.out.println("Comment: " + comment);
        System.out.println("Platform: " + platform);
        System.out.println("No. of players: " + numberOfPlayers);
    };
}
