package pojo.response;

import io.qameta.allure.internal.shadowed.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class NewsAndSocialMedia {
    @JsonProperty("id")
    private Integer id;

    @JsonProperty("url")
    private String url;

    @JsonProperty("title")
    private String title;

    @JsonProperty("description")
    private String description;

    @JsonProperty("source_name")
    private String sourceName;

    @JsonProperty("soc_media")
    private Boolean socMedia;

    @JsonProperty("news")
    private Boolean news;
}