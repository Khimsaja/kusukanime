package z5;

import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: z5.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2508m implements Serializable {

    /* renamed from: k, reason: collision with root package name */
    public final Pattern f19061k;

    public C2508m(String str) {
        kotlin.jvm.internal.l.f("pattern", str);
        Pattern patternCompile = Pattern.compile(str);
        kotlin.jvm.internal.l.e("compile(...)", patternCompile);
        this.f19061k = patternCompile;
    }

    public final C2506k a(String str) {
        kotlin.jvm.internal.l.f("input", str);
        Matcher matcher = this.f19061k.matcher(str);
        kotlin.jvm.internal.l.e("matcher(...)", matcher);
        if (matcher.find(0)) {
            return new C2506k(matcher, str);
        }
        return null;
    }

    public final boolean b(String str) {
        kotlin.jvm.internal.l.f("input", str);
        return this.f19061k.matcher(str).matches();
    }

    public final String c(String str, e4.k kVar) {
        kotlin.jvm.internal.l.f("input", str);
        C2506k c2506kA = a(str);
        if (c2506kA == null) {
            return str.toString();
        }
        int length = str.length();
        StringBuilder sb = new StringBuilder(length);
        int i7 = 0;
        do {
            sb.append((CharSequence) str, i7, c2506kA.a().f12672k);
            sb.append((CharSequence) kVar.invoke(c2506kA));
            i7 = c2506kA.a().f12673l + 1;
            c2506kA = c2506kA.b();
            if (i7 >= length) {
                break;
            }
        } while (c2506kA != null);
        if (i7 < length) {
            sb.append((CharSequence) str, i7, length);
        }
        String string = sb.toString();
        kotlin.jvm.internal.l.e("toString(...)", string);
        return string;
    }

    public final String toString() {
        String string = this.f19061k.toString();
        kotlin.jvm.internal.l.e("toString(...)", string);
        return string;
    }

    public C2508m(String str, int i7) {
        EnumC2509n[] enumC2509nArr = EnumC2509n.f19062k;
        Pattern patternCompile = Pattern.compile(str, 66);
        kotlin.jvm.internal.l.e("compile(...)", patternCompile);
        this.f19061k = patternCompile;
    }
}
