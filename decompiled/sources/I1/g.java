package I1;

import O1.B;
import y1.O;
import y1.P;

/* loaded from: classes.dex */
public final class g {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public int f3961b;

    /* renamed from: c, reason: collision with root package name */
    public long f3962c;

    /* renamed from: d, reason: collision with root package name */
    public final B f3963d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3964e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3965f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ h f3966g;

    public g(h hVar, String str, int i7, B b4) {
        this.f3966g = hVar;
        this.a = str;
        this.f3961b = i7;
        this.f3962c = b4 == null ? -1L : b4.f7254d;
        if (b4 == null || !b4.b()) {
            return;
        }
        this.f3963d = b4;
    }

    public final boolean a(a aVar) {
        B b4 = aVar.f3939d;
        if (b4 == null) {
            return this.f3961b != aVar.f3938c;
        }
        long j7 = this.f3962c;
        if (j7 == -1) {
            return false;
        }
        if (b4.f7254d > j7) {
            return true;
        }
        B b7 = this.f3963d;
        if (b7 == null) {
            return false;
        }
        P p7 = aVar.f3937b;
        int iB = p7.b(b4.a);
        int iB2 = p7.b(b7.a);
        if (b4.f7254d < b7.f7254d || iB < iB2) {
            return false;
        }
        if (iB > iB2) {
            return true;
        }
        boolean zB = b4.b();
        int i7 = b7.f7252b;
        if (!zB) {
            int i8 = b4.f7255e;
            return i8 == -1 || i8 > i7;
        }
        int i9 = b4.f7252b;
        if (i9 > i7) {
            return true;
        }
        if (i9 == i7) {
            return b4.f7253c > b7.f7253c;
        }
        return false;
    }

    public final boolean b(P p7, P p8) {
        B b4;
        int i7 = this.f3961b;
        if (i7 < p7.o()) {
            h hVar = this.f3966g;
            p7.n(i7, hVar.a);
            O o7 = hVar.a;
            for (int i8 = o7.f17966m; i8 <= o7.f17967n; i8++) {
                int iB = p8.b(p7.l(i8));
                if (iB != -1) {
                    i7 = p8.f(iB, hVar.f3969b, false).f17948c;
                    break;
                }
            }
            i7 = -1;
        } else if (i7 >= p8.o()) {
            i7 = -1;
        }
        this.f3961b = i7;
        return i7 != -1 && ((b4 = this.f3963d) == null || p8.b(b4.a) != -1);
    }
}
