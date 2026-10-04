package B2;

import B1.B;
import B1.K;
import io.ktor.sse.ServerSentEventKt;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.regex.Pattern;
import y1.E;

/* loaded from: classes.dex */
public abstract class k {
    static {
        Pattern.compile("^NOTE([ \t].*)?$");
    }

    public static float a(String str) {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    public static long b(String str) {
        int i7 = K.a;
        String[] strArrSplit = str.split("\\.", 2);
        long j7 = 0;
        for (String str2 : strArrSplit[0].split(ServerSentEventKt.COLON, -1)) {
            j7 = (j7 * 60) + Long.parseLong(str2);
        }
        long j8 = j7 * 1000;
        if (strArrSplit.length == 2) {
            String strTrim = strArrSplit[1].trim();
            if (strTrim.length() != 3) {
                throw new IllegalArgumentException("Expected 3 decimal places, got: ".concat(strTrim));
            }
            j8 += Long.parseLong(strTrim);
        }
        return j8 * 1000;
    }

    public static void c(B b4) {
        int i7 = b4.f288b;
        Charset charset = StandardCharsets.UTF_8;
        String strH = b4.h(charset);
        if (strH == null || !strH.startsWith("WEBVTT")) {
            b4.F(i7);
            throw E.a(null, "Expected WEBVTT. Got " + b4.h(charset));
        }
    }
}
