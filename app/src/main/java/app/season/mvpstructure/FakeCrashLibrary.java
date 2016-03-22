package app.season.mvpstructure;

/**
 * Not a real crash reporting library!
 *
 * @author Season
 * @version 0.1
 *          Created by Season on 2016/3/22.
 */
public final class FakeCrashLibrary {
    public static void log(int priority, String tag, String message) {
        // TODO add log entry to circular buffer.
    }

    public static void logWarning(Throwable t) {
        // TODO report non-fatal warning.
    }

    public static void logError(Throwable t) {
        // TODO report non-fatal error.
    }

    private FakeCrashLibrary() {
        throw new AssertionError("No instances.");
    }
}
