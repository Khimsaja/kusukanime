package t6;

import java.io.Closeable;
import java.util.zip.Deflater;
import java.util.zip.Inflater;
import w6.AbstractC2217b;
import w6.C2224i;
import w6.t;

/* loaded from: classes.dex */
public final class a implements Closeable {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f16149k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f16150l;

    /* renamed from: m, reason: collision with root package name */
    public final C2224i f16151m;

    /* renamed from: n, reason: collision with root package name */
    public final Object f16152n;

    /* renamed from: o, reason: collision with root package name */
    public final Closeable f16153o;

    public a(boolean z7, int i7) {
        this.f16149k = i7;
        switch (i7) {
            case 1:
                this.f16150l = z7;
                C2224i c2224i = new C2224i();
                this.f16151m = c2224i;
                Inflater inflater = new Inflater(true);
                this.f16152n = inflater;
                this.f16153o = new t(AbstractC2217b.c(c2224i), inflater);
                break;
            default:
                this.f16150l = z7;
                C2224i c2224i2 = new C2224i();
                this.f16151m = c2224i2;
                Deflater deflater = new Deflater(-1, true);
                this.f16152n = deflater;
                this.f16153o = new l6.e(c2224i2, deflater);
                break;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        switch (this.f16149k) {
            case 0:
                ((l6.e) this.f16153o).close();
                break;
            default:
                ((t) this.f16153o).close();
                break;
        }
    }
}
