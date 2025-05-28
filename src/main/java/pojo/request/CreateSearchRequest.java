package pojo.request;

import io.qameta.allure.internal.shadowed.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class CreateSearchRequest {
    @JsonProperty("first_name")
    private String firstName;

    @JsonProperty("last_name")
    private String lastName;

    @JsonProperty("date_of_birth")
    private String dateOfBirth;

    @JsonProperty("email")
    private String email;

    @JsonProperty("phone_number")
    private String phoneNumber;

    @JsonProperty("country_ids")
    private Integer[] countryIds;

    @JsonProperty("soc_media")
    private Boolean soc_media;

    @JsonProperty("news")
    private Boolean news;

    @JsonProperty("additions_words")
    private String[] additionsWords;

    @JsonProperty("social_media_ids")
    private Integer[] socialMediaIds;
}
