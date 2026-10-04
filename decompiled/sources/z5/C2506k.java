package z5;

import P3.I;
import java.util.regex.Matcher;

/* renamed from: z5.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2506k implements InterfaceC2505j {
    public final Matcher a;

    /* renamed from: b, reason: collision with root package name */
    public final CharSequence f19057b;

    /* renamed from: c, reason: collision with root package name */
    public final F5.n f19058c;

    /* renamed from: d, reason: collision with root package name */
    public I f19059d;

    public C2506k(Matcher matcher, CharSequence charSequence) {
        kotlin.jvm.internal.l.f("input", charSequence);
        this.a = matcher;
        this.f19057b = charSequence;
        this.f19058c = new F5.n(2, this);
    }

    public final k4.g a() {
        Matcher matcher = this.a;
        return e3.c.L(matcher.start(), matcher.end());
    }

    public final C2506k b() {
        Matcher matcher = this.a;
        int iEnd = matcher.end() + (matcher.end() == matcher.start() ? 1 : 0);
        CharSequence charSequence = this.f19057b;
        if (iEnd > charSequence.length()) {
            return null;
        }
        Matcher matcher2 = matcher.pattern().matcher(charSequence);
        kotlin.jvm.internal.l.e("matcher(...)", matcher2);
        if (matcher2.find(iEnd)) {
            return new C2506k(matcher2, charSequence);
        }
        return null;
    }
}
