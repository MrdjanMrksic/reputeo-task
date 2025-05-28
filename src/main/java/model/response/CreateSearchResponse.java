package model.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import io.qameta.allure.internal.shadowed.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.ArrayList;

@Data
public class CreateSearchResponse {
    @SerializedName("news")
    @Expose
    private ArrayList<NewsAndSocialMedia> news;

    @SerializedName("social_media")
    @Expose
    private ArrayList<NewsAndSocialMedia> socialMedia;

    public ArrayList<NewsAndSocialMedia> getNews() {
        return news;
    }

    public ArrayList<NewsAndSocialMedia> getSocialMedia() {
        return socialMedia;
    }
}
