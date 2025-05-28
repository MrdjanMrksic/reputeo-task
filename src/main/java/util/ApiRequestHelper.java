package util;

import java.util.HashMap;
import java.util.Map;

public class ApiRequestHelper {
    public static Map<String, Object> getCreateSearchApiRequest(String firstName, String lastName, String dateOfBirth,
                                                                String email, String phoneNumber, Integer[] countryIds, Boolean socMedia,
                                                                Boolean news, String[] additionsWords, Integer[] socialMediaIds) {
        Map<String, Object> requestBody = new HashMap<>();
        requestBody.put("first_name", firstName);
        requestBody.put("last_name", lastName);
        requestBody.put("date_of_birth", dateOfBirth);
        requestBody.put("email", email);
        requestBody.put("phone_number", phoneNumber);
        requestBody.put("country_ids", countryIds);
        requestBody.put("soc_media", socMedia);
        requestBody.put("news", news);
        requestBody.put("additions_words", additionsWords);
        requestBody.put("social_media_ids", socialMediaIds);

        return requestBody;
    }
}
