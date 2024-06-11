
//hw4-2 WU Xiaotao 21097724D
//Tool: blueJ

public class Video extends Item
{
    private String title;
    private String director;
    private int playingTime;

    /**
     * Constructor for objects of class Video
     */
    public Video(String theTitle, String theDirector, int time)
    {
        super(theTitle, time);
        director = theDirector;
    }

    public void print()
    {
        System.out.println("Video");
        System.out.println("Title: " + getTitle());
        if(getOwn()) {
            System.out.println("Got it: Yes");
        } else {
            System.out.println("Got it: No");
        }
        System.out.println("Playing time: " + getPlayingTime());
        System.out.println("Comment: " + getComment());
        System.out.println("Director: " + director);
    }
}
