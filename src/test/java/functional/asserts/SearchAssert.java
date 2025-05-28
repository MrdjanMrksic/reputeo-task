package functional.asserts;

import model.request.CreateSearchRequest;
import model.response.CreateSearchResponse;
import model.response.NewsAndSocialMedia;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class SearchAssert {
    private SoftAssert softAssert;

    public SearchAssert() {
        this.softAssert = new SoftAssert();
    }

    public void assertSearchResponse(CreateSearchRequest searchRequest, CreateSearchResponse searchResponse){
        if(searchResponse == null){
            Assert.fail("Search response is null");
        }

        if (searchRequest.getSocMedia()){
            softAssert.assertNotNull(searchResponse.getSocialMedia(), "Social media is null");
        }

        if (searchRequest.getNews()){
            softAssert.assertNotNull(searchResponse.getNews(), "News is null");
        }

        for (NewsAndSocialMedia news : searchResponse.getNews()){
            softAssert.assertEquals(searchRequest.getSocMedia(), news.getSocMedia(), "Request and Response booleans do not match");
            softAssert.assertEquals(searchRequest.getNews(), news.getNews(), "Request and Response booleans do not match");

            for (String word : searchRequest.getAdditionsWords()){
                if (!news.getDescription().contains(word)){
                    softAssert.fail("News description does not contain addition word");
                }
            }
        }

        for (NewsAndSocialMedia socialMedia : searchResponse.getSocialMedia()){
            softAssert.assertEquals(searchRequest.getSocMedia(), socialMedia.getSocMedia(), "Request and Response booleans do not match");
            softAssert.assertEquals(searchRequest.getNews(), socialMedia.getNews(), "Request and Response booleans do not match");

            for (String word : searchRequest.getAdditionsWords()){
                if (!socialMedia.getDescription().contains(word)){
                    softAssert.fail("Social media description does not contain addition word");
                }
            }
        }

        this.softAssert.assertAll();
    }
}
