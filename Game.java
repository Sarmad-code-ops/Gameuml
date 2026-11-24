
/**
 * Write a description of class Game here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Game
{
    // instance variables - repla ce the example below with your own
    private int x;
    private Genre genre;
    private platform platform;
    private AgeRating ageRating;
    private int totalScore;
    private int numRatings;
    

    /**
     * Constructor for objects of class Game
     */
    public Game(String title, Genre genre, Platform platform)
    {
        // initialise instance variables
        This.title = title;
        This.genre = genre;
        This.platform = platform;
        This.ageRating = ageRating;
        totalScore = 0;
        numRating = 0;
        
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public String getTitle()
    {
        // put your code here
        return title;
    }
    public Genre getGenre(){
        return genre;
    }
    public String getDetails(){
        return title + "|" + genre + "|" + platform +"|" + ageRating + " | Rating" + getRating();
    }
}