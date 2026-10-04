package G3;

import java.io.Closeable;
import java.io.Flushable;

/* loaded from: classes.dex */
public abstract class p implements Closeable, Flushable {

    /* renamed from: k, reason: collision with root package name */
    public int f2824k;

    /* renamed from: l, reason: collision with root package name */
    public int[] f2825l;

    /* renamed from: m, reason: collision with root package name */
    public String[] f2826m;

    /* renamed from: n, reason: collision with root package name */
    public int[] f2827n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f2828o;

    /* renamed from: p, reason: collision with root package name */
    public int f2829p;

    public abstract o b();

    public abstract o e();

    public final String g() {
        return C.c(this.f2824k, this.f2825l, this.f2826m, this.f2827n);
    }

    public abstract o i(String str);

    public abstract o j();

    public final int m() {
        int i7 = this.f2824k;
        if (i7 != 0) {
            return this.f2825l[i7 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public abstract o s(long j7);

    public abstract o v(String str);
}
