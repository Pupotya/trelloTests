import core.BrowserFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MainPage;
import pages.TeamPage;

public class TeamMemberTest extends BrowserFactory {

    private MainPage mainPage = new MainPage();
    private TeamPage teamPage = new TeamPage();


    @Test(priority = 4)
    public void addMember() {
        mainPage.openAsLoginedUser();
        teamPage.openMember();
        //String nameOfAddedMember = teamPage.getNameOfAddedMember();
        //Assert.assertEquals(nameOfAddedMember, "@max83796153");  //TODO fix assert for correct checking
    }

    @Test(priority = 5)
    public void deleteMember() {
        mainPage.openAsLoginedUser();
        teamPage.deleteMember();
        //String nameOfAddedMember = teamPage.getNameOfAddedMember();
        //Assert.assertEquals(nameOfAddedMember, "@testuser604");        //TODO fix assert for correct checking
    }

}

