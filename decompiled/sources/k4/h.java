package k4;

import f4.InterfaceC0881a;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class h implements Iterable, InterfaceC0881a {

    /* renamed from: k, reason: collision with root package name */
    public final long f12680k;

    /* renamed from: l, reason: collision with root package name */
    public final long f12681l;

    /* renamed from: m, reason: collision with root package name */
    public final long f12682m;

    public h(long j7, long j8) {
        this.f12680k = j7;
        if (j7 < j8) {
            long j9 = j8 % 1;
            long j10 = j7 % 1;
            long j11 = ((j9 < 0 ? j9 + 1 : j9) - (j10 < 0 ? j10 + 1 : j10)) % 1;
            j8 -= j11 < 0 ? j11 + 1 : j11;
        }
        this.f12681l = j8;
        this.f12682m = 1L;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new i(this.f12680k, this.f12681l, this.f12682m);
    }
}
