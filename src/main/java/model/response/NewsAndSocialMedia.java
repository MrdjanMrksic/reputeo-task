package model.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import io.qameta.allure.internal.shadowed.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class NewsAndSocialMedia {
    @SerializedName("id")
    @Expose
    private Integer id;

    @SerializedName("url")
    @Expose
    private String url;

    @SerializedName("title")
    @Expose
    private String title;

    @SerializedName("description")
    @Expose
    private String description;

    @SerializedName("source_name")
    @Expose
    private String sourceName;

    @SerializedName("soc_media")
    @Expose
    private Boolean socMedia;

    @SerializedName("news")
    @Expose
    private Boolean news;

    public Integer getId() {
        return id;
    }

    public String getUrl() {
        return url;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getSourceName() {
        return sourceName;
    }

    public Boolean getSocMedia() {
        return socMedia;
    }

    public Boolean getNews() {
        return news;
    }
}