package O1;

import B1.AbstractC0015b;
import android.net.Uri;
import java.util.Collections;
import java.util.List;
import y1.C2380b;
import y1.C2396s;
import y1.C2397t;
import y1.C2398u;
import y1.C2399v;
import y1.C2401x;

/* loaded from: classes.dex */
public final class d0 extends y1.P {

    /* renamed from: g, reason: collision with root package name */
    public static final Object f7425g = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final long f7426b;

    /* renamed from: c, reason: collision with root package name */
    public final long f7427c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f7428d;

    /* renamed from: e, reason: collision with root package name */
    public final C2401x f7429e;

    /* renamed from: f, reason: collision with root package name */
    public final C2397t f7430f;

    static {
        V1.r rVar = new V1.r();
        j3.E e7 = j3.G.f12277l;
        j3.X x7 = j3.X.f12304o;
        List list = Collections.EMPTY_LIST;
        j3.X x8 = j3.X.f12304o;
        C2396s c2396s = new C2396s();
        C2399v c2399v = C2399v.a;
        Uri uri = Uri.EMPTY;
        if (uri != null) {
            new C2398u(uri, null, null, list, x8, -9223372036854775807L);
        }
        rVar.b();
        c2396s.a();
        y1.A a = y1.A.f17903B;
    }

    public d0(long j7, boolean z7, boolean z8, C2401x c2401x) {
        C2397t c2397t = z8 ? c2401x.f18139c : null;
        this.f7426b = j7;
        this.f7427c = j7;
        this.f7428d = z7;
        c2401x.getClass();
        this.f7429e = c2401x;
        this.f7430f = c2397t;
    }

    @Override // y1.P
    public final int b(Object obj) {
        return f7425g.equals(obj) ? 0 : -1;
    }

    @Override // y1.P
    public final y1.N f(int i7, y1.N n7, boolean z7) {
        AbstractC0015b.f(i7, 1);
        Object obj = z7 ? f7425g : null;
        n7.getClass();
        n7.h(null, obj, 0, this.f7426b, 0L, C2380b.f18024c, false);
        return n7;
    }

    @Override // y1.P
    public final int h() {
        return 1;
    }

    @Override // y1.P
    public final Object l(int i7) {
        AbstractC0015b.f(i7, 1);
        return f7425g;
    }

    @Override // y1.P
    public final y1.O m(int i7, y1.O o7, long j7) {
        AbstractC0015b.f(i7, 1);
        Object obj = y1.O.f17953p;
        o7.b(this.f7429e, this.f7428d, false, this.f7430f, 0L, this.f7427c);
        return o7;
    }

    @Override // y1.P
    public final int o() {
        return 1;
    }
}
