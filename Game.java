
/**
 * Write a description of class Game here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Game
{
    // instance variables - repla ce the example below with your own
    private String title;
    private Genre genre;
    private platform platform;
    private AgeRating ageRating;
    private int totalScore;
    private int numRatings;
    

    /**
     * Constructor for objects of class Game
     */
    public Game(String title, Genre genre, platform platform, AgeRating ageRating)
    {
        // initialise instance variables
        this.title = title;
        this.genre = genre;
        this.platform = platform;
        this.ageRating = ageRating;
        totalScore = 0;
        numRatings = 0;
        
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
    public double getRating(){
        if(numRatings == 0) {
            return 0.0;
        }
        return (double) totalScore / numRatings;
    }
}