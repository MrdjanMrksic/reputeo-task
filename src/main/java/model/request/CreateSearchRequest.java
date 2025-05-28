package model.request;

import java.io.Serializable;
import java.util.ArrayList;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CreateSearchRequest implements Serializable{
    @SerializedName("first_name")
    @Expose
    private String firstName;

    @SerializedName("last_name")
    @Expose
    private String lastName;

    @SerializedName("date_of_birth")
    @Expose
    private String dateOfBirth;

    @SerializedName("email")
    @Expose
    private String email;

    @SerializedName("phone_number")
    @Expose
    private Integer phoneNumber;

    @SerializedName("country_ids")
    @Expose
    private ArrayList<Integer> countryIds;

    @SerializedName("soc_media")
    @Expose
    private Boolean socMedia;

    @SerializedName("news")
    @Expose
    private Boolean news;

    @SerializedName("additions_words")
    @Expose
    private ArrayList<String> additionsWords;

    @SerializedName("social_media_ids")
    @Expose
    private ArrayList<Integer> socialMediaIds;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Integer phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public ArrayList<Integer> getCountryIds() {
        return countryIds;
    }

    public void setCountryIds(ArrayList<Integer> countryIds) {
        this.countryIds = countryIds;
    }

    public Boolean getSocMedia() {
        return socMedia;
    }

    public void setSocMedia(Boolean socMedia) {
        this.socMedia = socMedia;
    }

    public Boolean getNews() {
        return news;
    }

    public void setNews(Boolean news) {
        this.news = news;
    }

    public ArrayList<String> getAdditionsWords() {
        return additionsWords;
    }

    public void setAdditionsWords(ArrayList<String> additionsWords) {
        this.additionsWords = additionsWords;
    }

    public ArrayList<Integer> getSocialMediaIds() {
        return socialMediaIds;
    }

    public void setSocialMediaIds(ArrayList<Integer> socialMediaIds) {
        this.socialMediaIds = socialMediaIds;
    }

    public CreateSearchRequest(String firstName, String lastName, String dateOfBirth, String email,
                               Integer phoneNumber, ArrayList<Integer> countryIds, Boolean soc_media,
                               Boolean news, ArrayList<String> additionsWords, ArrayList<Integer> socialMediaIds) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.countryIds = countryIds;
        this.socMedia = soc_media;
        this.news = news;
        this.additionsWords = additionsWords;
        this.socialMediaIds = socialMediaIds;
    }
}
