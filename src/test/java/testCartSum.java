import org.omg.CORBA.PUBLIC_MEMBER;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class testCartSum extends DefaultTest{
    private static final String keyword = "телевізори";
    private static final String brandName = "Philips";
    private static final int priceValidation = 62855;
    

    @Test
    public void checkPriceOfItem(){
        getMainPage().searchByCategory(keyword);
        getSearchResultPage().scrollToSidebarSearch();
        getSearchResultPage().loadElementWaiter(10, getSearchResultPage().getSidebarSearch());
        getSearchResultPage().searchByBrand(brandName);
        getSearchResultPage().loadElementWaiter(10, getSearchResultPage().getBrandCheckbox());
        getSearchResultPage().clickOnBrandCheckbox();
        getSortedPage().sortByPriceDecrease();
        getSortedPage().loadPageWaiter(20);
        getSortedPage().clickOnFirstElement();
        getProductPage().loadElementWaiter(10, getProductPage().getProductDescription());
        getProductPage().clickOnProductDescription();
        getProductPage().loadElementWaiter(10, getProductPage().getBuyButton());
        getProductPage().clickOnBuyButton();
        getProductPage().loadElementWaiter(10, getProductPage().getCartSum());
        assertEquals(getProductPage().getCartSumValue(), priceValidation);
    }

}
