package z5;

import java.nio.charset.Charset;

/* renamed from: z5.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2496a {
    public static final C2496a a = new C2496a();

    /* renamed from: b, reason: collision with root package name */
    public static final Charset f19036b;

    /* renamed from: c, reason: collision with root package name */
    public static final Charset f19037c;

    static {
        Charset charsetForName = Charset.forName("UTF-8");
        kotlin.jvm.internal.l.e("forName(...)", charsetForName);
        f19036b = charsetForName;
        kotlin.jvm.internal.l.e("forName(...)", Charset.forName("UTF-16"));
        kotlin.jvm.internal.l.e("forName(...)", Charset.forName("UTF-16BE"));
        kotlin.jvm.internal.l.e("forName(...)", Charset.forName("UTF-16LE"));
        kotlin.jvm.internal.l.e("forName(...)", Charset.forName("US-ASCII"));
        Charset charsetForName2 = Charset.forName("ISO-8859-1");
        kotlin.jvm.internal.l.e("forName(...)", charsetForName2);
        f19037c = charsetForName2;
    }
}
