package pages;

import core.Elem;
import core.MethodsFactory;
import org.openqa.selenium.By;

public class TeamPage extends MethodsFactory {

    private Elem memberFld = new Elem(By.cssSelector(".primary.button-link.autowrap"), "Member Field");
    private Elem findMember = new Elem(By.cssSelector(".search-member"), "Input member name");
    private Elem acceptMember = new Elem(By.cssSelector(".icon-lg.icon-check"), "submit checkbox");
    private Elem addMemberBtn = new Elem (By.cssSelector(".primary.full"), "press add member btn");
    private Elem createdMember = new Elem(By.cssSelector("quiet.u-inline-block']")," createdMemberName");
    private Elem removeBtn = new Elem(By.cssSelector(".icon-sm.icon-close"), "Remove Button");
    private Elem removeBtn2 = new Elem(By.cssSelector(".sub-name"), "Remove Button Confirm");

    public void openTeam() {
        driver().get(getProp("baseUrl") + getProp("openTeamUrl"));

    }

    public void openMember() {
        openTeam();
        memberFld.click();
        findMember.type("max83796153");
        acceptMember.click();
        addMemberBtn.click();
    }

    public void deleteMember() {
        openTeam();
        removeBtn.click();
        removeBtn2.click();
    }

    public String getNameOfAddedMember() {

        return createdMember.getText();
    }

}
