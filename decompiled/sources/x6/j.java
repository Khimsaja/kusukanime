package x6;

import java.util.logging.Logger;
import z5.AbstractC2510o;

/* loaded from: classes.dex */
public abstract class j {
    public static final Logger a = Logger.getLogger("okio.Okio");

    public static final boolean a(AssertionError assertionError) {
        if (assertionError.getCause() != null) {
            String message = assertionError.getMessage();
            if (message != null ? AbstractC2510o.W(message, "getsockname failed", false) : false) {
                return true;
            }
        }
        return false;
    }
}
