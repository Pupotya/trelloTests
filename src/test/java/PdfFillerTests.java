import core.BrowserFactory;
import core.CookieManager;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.PdfFillerPO;

public class PdfFillerTests extends BrowserFactory {

    PdfFillerPO pdfFillerPO = new PdfFillerPO();

    @Test
    public void logInlogOutTest() {
        pdfFillerPO.open();
        pdfFillerPO.login();
        pdfFillerPO.waitForLoader();
        pdfFillerPO.logOut();
        Assert.assertTrue(driver().getCurrentUrl().equals("https://www.pdffiller.com/en/login.htm?msg=logout"));
        CookieManager.clearCookie();
    }

    @Test
    public void duplicate() {
        pdfFillerPO.open();
        pdfFillerPO.login();
        int before = pdfFillerPO.getCountOfFiles();
        pdfFillerPO.duplicateClick();
        pdfFillerPO.clickOrangeBtn();
        int after = pdfFillerPO.getCountOfFiles();
        Assert.assertTrue(before + 1 == after);
        CookieManager.clearCookie();
    }

    @Test
    public void renameTest() {
        pdfFillerPO.open();
        pdfFillerPO.login();
        pdfFillerPO.clickRenameIcon();
        pdfFillerPO.typeToRename();
        pdfFillerPO.clickOrangeBtn();
        String fileName = pdfFillerPO.getFileName();
        Assert.assertTrue(fileName.equals("TestFile"));
        CookieManager.clearCookie();
    }
}
