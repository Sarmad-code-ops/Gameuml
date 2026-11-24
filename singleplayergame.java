
/**
 * Write a description of class singleplayergame here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class singleplayergame extends Game
{
   private boolean hasCampaign;
   
   public SinglePlayerGame(String title, Genre genre,Platform platform, AgeRating agerating, boolean hasCampaign) {
       super(title,genre,platform,ageRating);
       this.hasCampaign = hasCampaign;
   }
   public String getDetails() {
       return super.getDetails() + " | Campaign: " + hasCampaign;
   }
}