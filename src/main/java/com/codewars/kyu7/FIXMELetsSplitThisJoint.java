package com.codewars.kyu7;

/**
 * @author Zurbaevi Nika
 */
public class FIXMELetsSplitThisJoint {
    public static String[] split(final String joint) {
        return joint.isEmpty() ? new String[0] : joint.split("\\.", -1);
    }
}
