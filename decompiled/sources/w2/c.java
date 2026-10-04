package w2;

import B1.AbstractC0015b;
import B1.K;
import android.graphics.PointF;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class c {
    public static final Pattern a = Pattern.compile("\\{([^}]*)\\}");

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f16916b;

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f16917c;

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f16918d;

    static {
        int i7 = K.a;
        Locale locale = Locale.US;
        f16916b = Pattern.compile(String.format(locale, "\\\\pos\\((%1$s),(%1$s)\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
        f16917c = Pattern.compile(String.format(locale, "\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
        f16918d = Pattern.compile("\\\\an(\\d+)");
    }

    public static PointF a(String str) throws NumberFormatException {
        String strGroup;
        String strGroup2;
        Matcher matcher = f16916b.matcher(str);
        Matcher matcher2 = f16917c.matcher(str);
        boolean zFind = matcher.find();
        boolean zFind2 = matcher2.find();
        if (zFind) {
            if (zFind2) {
                AbstractC0015b.q("SsaStyle.Overrides", "Override has both \\pos(x,y) and \\move(x1,y1,x2,y2); using \\pos values. override='" + str + "'");
            }
            strGroup = matcher.group(1);
            strGroup2 = matcher.group(2);
        } else {
            if (!zFind2) {
                return null;
            }
            strGroup = matcher2.group(1);
            strGroup2 = matcher2.group(2);
        }
        strGroup.getClass();
        float f5 = Float.parseFloat(strGroup.trim());
        strGroup2.getClass();
        return new PointF(f5, Float.parseFloat(strGroup2.trim()));
    }
}
