package data.provider;

import models.request.CreateSearchRequest;

import java.util.ArrayList;

import static util.helpers.RandomDataGenerator.*;

public class SearchProvider {
    public static CreateSearchRequest generateSearchRequest(){
        ArrayList<Integer> countryIds = new ArrayList<>();
        countryIds.add(createRandomWholeNumber(1,10));
        countryIds.add(createRandomWholeNumber(1,10));

        ArrayList<String> additionsWords = new ArrayList<>();
        additionsWords.add(createRandomStringAlphanumericWithLen(7));
        additionsWords.add(createRandomStringAlphanumericWithLen(7));

        ArrayList<Integer> socMediaIds = new ArrayList<>();
        countryIds.add(createRandomWholeNumber(1,10));
        countryIds.add(createRandomWholeNumber(1,10));

        return new CreateSearchRequest(
                createRandomStringAlphanumericWithLen(10),
                createRandomStringAlphanumericWithLen(10),
                createRandomStringAlphanumericWithLen(10),
                createRandomEmailWithPrefixLen(10),
                createRandomWholeNumber(1,10000000),
                countryIds,
                createRandomBoolean(),
                createRandomBoolean(),
                additionsWords,
                socMediaIds
        );
    }

}
