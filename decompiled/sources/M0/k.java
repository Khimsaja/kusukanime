package M0;

import C2.C0034g;
import D.C0042b;
import io.ktor.client.utils.CIOKt;

/* loaded from: classes.dex */
public final class k implements i {
    public final C0468a a;

    /* renamed from: b, reason: collision with root package name */
    public final C0469b f6401b;

    /* renamed from: c, reason: collision with root package name */
    public final L2.e f6402c;

    /* renamed from: d, reason: collision with root package name */
    public final p f6403d;

    /* renamed from: e, reason: collision with root package name */
    public final C0034g f6404e;

    /* renamed from: f, reason: collision with root package name */
    public final C0042b f6405f;

    public k(C0468a c0468a, C0469b c0469b) {
        L2.e eVar = l.a;
        p pVar = new p(l.f6406b);
        C0034g c0034g = new C0034g(18);
        this.a = c0468a;
        this.f6401b = c0469b;
        this.f6402c = eVar;
        this.f6403d = pVar;
        this.f6404e = c0034g;
        this.f6405f = new C0042b(14, this);
    }

    public final H a(E e7) {
        L2.e eVar = this.f6402c;
        A3.t tVar = new A3.t(17, this, e7);
        synchronized (((A.e) eVar.f6045l)) {
            H h7 = (H) ((L0.b) eVar.f6046m).a(e7);
            if (h7 != null) {
                if (h7.b()) {
                    return h7;
                }
            }
            try {
                H h8 = (H) tVar.invoke(new A3.t(18, eVar, e7));
                synchronized (((A.e) eVar.f6045l)) {
                    if (((L0.b) eVar.f6046m).a(e7) == null && h8.b()) {
                        ((L0.b) eVar.f6046m).b(e7, h8);
                    }
                }
                return h8;
            } catch (Exception e8) {
                throw new IllegalStateException("Could not load font", e8);
            }
        }
    }

    public final H b(j jVar, u uVar, int i7, int i8) {
        C0469b c0469b = this.f6401b;
        c0469b.getClass();
        int i9 = c0469b.f6385k;
        u uVar2 = (i9 == 0 || i9 == Integer.MAX_VALUE) ? uVar : new u(e3.c.k(uVar.f6419k + i9, 1, CIOKt.DEFAULT_HTTP_POOL_SIZE));
        this.a.getClass();
        return a(new E(jVar, uVar2, i7, i8, null));
    }
}
