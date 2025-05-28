package util.helpers;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;

import java.util.Random;

public class RandomDataGenerator {

    public static int createRandomWholeNumber(final int minValue, final int maxValue) {
        return RandomUtils.nextInt(minValue, maxValue);
    }
    public static String createRandomStringAlphanumericWithLen(final int len) {
        return RandomStringUtils.randomAlphanumeric(len);
    }

    public static Boolean createRandomBoolean(){
        Random random = new Random();
        return random.nextBoolean();
    }

    public static String createRandomEmailWithPrefixLen(final int len) {
        final StringBuilder stringBuilder = new StringBuilder(createRandomStringAlphanumericWithLen(len));
        stringBuilder.append("@");
        stringBuilder.append(createRandomStringAlphanumericWithLen(10));
        stringBuilder.append(".");
        stringBuilder.append(createRandomStringAlphanumericWithLen(3));
        return stringBuilder.toString();
    }
}
