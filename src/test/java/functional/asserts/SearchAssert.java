package functional.asserts;

import models.request.CreateSearchRequest;
import models.response.CreateSearchResponse;
import models.response.NewsAndSocialMedia;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class SearchAssert {
    private SoftAssert softAssert;

    public SearchAssert() {
        this.softAssert = new SoftAssert();
    }

    public void assertSearchResponse(CreateSearchRequest searchRequest, CreateSearchResponse searchResponse){
        //Assert that the response is not null
        if(searchResponse == null){
            Assert.fail("Search response is null");
        }

        //Assert that if social media is checked, it is not null
        if (searchRequest.getSocMedia()){
            softAssert.assertNotNull(searchResponse.getSocialMedia(), "Social media is null");
        }
        //Assert that if news is checked, it is not null
        if (searchRequest.getNews()){
            softAssert.assertNotNull(searchResponse.getNews(), "News is null");
        }

        //Enter each news...
        for (NewsAndSocialMedia news : searchResponse.getNews()){
            //...check that if news and social media is checked in request, it is also checked in the response...
            softAssert.assertEquals(searchRequest.getSocMedia(), news.getSocMedia(), "Request and Response booleans do not match");
            softAssert.assertEquals(searchRequest.getNews(), news.getNews(), "Request and Response booleans do not match");
            //...and then check if addition words are in the description or the title
            for (String word : searchRequest.getAdditionsWords()){
                if (!news.getDescription().contains(word) || !news.getTitle().contains(word)){
                    softAssert.fail("News description does not contain addition word");
                }
            }
        }

        //Enter each social media...
        for (NewsAndSocialMedia socialMedia : searchResponse.getSocialMedia()){
            //...check that if news and social media is checked in request, it is also checked in the response...
            softAssert.assertEquals(searchRequest.getSocMedia(), socialMedia.getSocMedia(), "Request and Response booleans do not match");
            softAssert.assertEquals(searchRequest.getNews(), socialMedia.getNews(), "Request and Response booleans do not match");
            //...and then check if addition words are in the description or the title
            for (String word : searchRequest.getAdditionsWords()){
                if (!socialMedia.getDescription().contains(word) || !socialMedia.getTitle().contains(word)){
                    softAssert.fail("Social media description does not contain addition word");
                }
            }
        }

        this.softAssert.assertAll();
    }
}
