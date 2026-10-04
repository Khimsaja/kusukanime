package F2;

import android.text.Html;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public abstract class J {
    public static final Pattern a = Pattern.compile("(&#13;)?&#10;");

    public static String a(CharSequence charSequence) {
        return a.matcher(Html.escapeHtml(charSequence)).replaceAll("<br>");
    }
}
