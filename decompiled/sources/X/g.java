package X;

import D.C0056i;
import H.C0184a;
import O.C0486d;
import O.C0502l;
import O.C0509o0;
import O.C0510p;
import O3.C;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class g implements c {

    /* renamed from: d, reason: collision with root package name */
    public static final L2.e f9684d;
    public final Map a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f9685b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public j f9686c;

    static {
        d dVar = d.f9676m;
        e eVar = e.f9679m;
        L2.e eVar2 = n.a;
        f9684d = new L2.e(12, dVar, eVar);
    }

    public g(Map map) {
        this.a = map;
    }

    @Override // X.c
    public final void a(Object obj, W.a aVar, C0510p c0510p, int i7) {
        int i8;
        c0510p.T(-1198538093);
        if ((i7 & 6) == 0) {
            i8 = (c0510p.h(obj) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        if ((i7 & 48) == 0) {
            i8 |= c0510p.h(aVar) ? 32 : 16;
        }
        if ((i7 & 384) == 0) {
            i8 |= c0510p.h(this) ? 256 : 128;
        }
        if ((i8 & 147) == 146 && c0510p.y()) {
            c0510p.M();
        } else {
            c0510p.U(obj);
            Object objH = c0510p.H();
            Object obj2 = C0502l.a;
            if (objH == obj2) {
                j jVar = this.f9686c;
                if (!(jVar != null ? jVar.b(obj) : true)) {
                    throw new IllegalArgumentException(("Type of the key " + obj + " is not supported. On Android you can only use types which can be stored inside the Bundle.").toString());
                }
                objH = new f(this, obj);
                c0510p.b0(objH);
            }
            f fVar = (f) objH;
            C0486d.a(l.a.a(fVar.f9683c), aVar, c0510p, (i8 & 112) | 8);
            C c2 = C.a;
            boolean zH = c0510p.h(this) | c0510p.h(obj) | c0510p.h(fVar);
            Object objH2 = c0510p.H();
            if (zH || objH2 == obj2) {
                objH2 = new C0056i(this, obj, fVar, 7);
                c0510p.b0(objH2);
            }
            C0486d.c(c2, (e4.k) objH2, c0510p);
            if (c0510p.f7151x && c0510p.f7120F.f6937i == c0510p.f7152y) {
                c0510p.f7152y = -1;
                c0510p.f7151x = false;
            }
            c0510p.p(false);
        }
        C0509o0 c0509o0S = c0510p.s();
        if (c0509o0S != null) {
            c0509o0S.f7111d = new C0184a(this, obj, aVar, i7, 4);
        }
    }

    @Override // X.c
    public final void e(Object obj) {
        f fVar = (f) this.f9685b.get(obj);
        if (fVar != null) {
            fVar.f9682b = false;
        } else {
            this.a.remove(obj);
        }
    }
}
