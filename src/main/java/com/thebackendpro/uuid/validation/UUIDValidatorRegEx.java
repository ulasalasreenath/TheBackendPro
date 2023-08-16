package com.thebackendpro.uuid.validation;

import java.util.regex.Pattern;

public class UUIDValidatorRegEx {

    private static Pattern REG_EX_UUID = Pattern.compile("^[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}$");

    public static void main(String[] args) {
        // Test 1
        boolean isValid = isValidUUID("00000000-0000-0000-0000-000000000000");
        if (isValid) {
            System.out.println("00000000-0000-0000-0000-000000000000 is a valid UUID");
        } else {
            System.out.println("00000000-0000-0000-0000-000000000000 is not a valid UUID");
        }

        // Test 2
        isValid = isValidUUID("0000000-000-00-000000");
        if (isValid) {
            System.out.println("0000000-000-00-000000 is a valid UUID");
        } else {
            System.out.println("0000000-000-00-000000 is not a valid UUID");
        }

        // Test 3
        isValid = isValidUUID("0-0-0-0-0");
        if (isValid) {
            System.out.println("0-0-0-0-0 is a valid UUID");
        } else {
            System.out.println("0-0-0-0-0 is not a valid UUID");
        }
    }

    private static boolean isValidUUID(String uuid) {
        return REG_EX_UUID.matcher(uuid).matches();
    }
}
