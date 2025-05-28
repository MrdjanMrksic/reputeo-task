package pojo.response;

import io.qameta.allure.internal.shadowed.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class CreateSearchResponse {
    @JsonProperty("news")
    private NewsAndSocialMedia[] newsAndSocialMedia;

    @JsonProperty("social_media")
    private NewsAndSocialMedia[] socialMedia;
}
