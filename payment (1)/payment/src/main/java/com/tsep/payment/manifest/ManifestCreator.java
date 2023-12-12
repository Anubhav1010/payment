package com.tsep.payment.manifest;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ManifestCreator {

    private static final int MERCHANT_ID_LENGTH = 20;
    private static final int DEVICE_ID_LENGTH = 24;
    private static final int AMOUNT_LENGTH = 12;
    private static final int DATE_LENGTH = 8;
    private static final String DATE_FORMAT = "MMddyyyy";

    public static String createManifestString(String merchantID, String deviceID, int amount) {

        String paddedMerchantID = padString(merchantID, MERCHANT_ID_LENGTH);
        String paddedDeviceID = padString(deviceID, DEVICE_ID_LENGTH);
        String paddedAmount = padString(String.valueOf(amount), AMOUNT_LENGTH);


        String formattedDate = formatDate(new Date());


        return paddedMerchantID + paddedDeviceID + paddedAmount + formattedDate;
    }

    private static String padString(String input, int length) {
        if (input.length() >= length) {
            return input.substring(0, length);
        } else {
            return String.format("%-" + length + "s", input);
        }
    }

    private static String formatDate(Date date) {
        SimpleDateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT);
        return dateFormat.format(date);
    }

    public static void main(String[] args) {
        // Example usage
        String merchantID = "111111111111";
        String deviceID = "11111111111101";
        int amount = 0;

        String manifestString = createManifestString(merchantID, deviceID, amount);
        System.out.println("Manifest String: " + manifestString);
    }
}
