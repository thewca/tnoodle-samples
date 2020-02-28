package net.gnehzr.tnoodle.utils;

public final class GwtSafeUtils {
    private GwtSafeUtils() {}

    public static void azzert(boolean assertion) {
        azzert(assertion, "Details are unknown.");
    }

    public static void azzert(boolean assertion, String message) {
        if (!assertion) {
            throw new RuntimeException("Something went wrong! " + message);
        }
    }
}
