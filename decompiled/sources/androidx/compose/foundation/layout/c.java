package androidx.compose.foundation.layout;

import D.S;
import L.C0;
import a0.h;
import a0.i;
import a0.q;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public abstract class c {
    public static final FillElement a = new FillElement(1.0f, 2);

    /* renamed from: b, reason: collision with root package name */
    public static final FillElement f10590b = new FillElement(1.0f, 1);

    /* renamed from: c, reason: collision with root package name */
    public static final FillElement f10591c = new FillElement(1.0f, 3);

    /* renamed from: d, reason: collision with root package name */
    public static final WrapContentElement f10592d;

    /* renamed from: e, reason: collision with root package name */
    public static final WrapContentElement f10593e;

    /* renamed from: f, reason: collision with root package name */
    public static final WrapContentElement f10594f;

    /* renamed from: g, reason: collision with root package name */
    public static final WrapContentElement f10595g;

    static {
        h hVar = a0.b.f10391u;
        f10592d = new WrapContentElement(1, new S(20, hVar), hVar);
        h hVar2 = a0.b.f10390t;
        f10593e = new WrapContentElement(1, new S(20, hVar2), hVar2);
        i iVar = a0.b.f10385o;
        f10594f = new WrapContentElement(3, new S(21, iVar), iVar);
        i iVar2 = a0.b.f10381k;
        f10595g = new WrapContentElement(3, new S(21, iVar2), iVar2);
    }

    public static final q a(q qVar, float f5, float f7) {
        return qVar.k(new UnspecifiedConstraintsElement(f5, f7));
    }

    public static /* synthetic */ q b(q qVar, float f5, float f7, int i7) {
        if ((i7 & 1) != 0) {
            f5 = Float.NaN;
        }
        if ((i7 & 2) != 0) {
            f7 = Float.NaN;
        }
        return a(qVar, f5, f7);
    }

    public static final q c(q qVar, float f5) {
        return qVar.k(f5 == 1.0f ? f10590b : new FillElement(f5, 1));
    }

    public static final q d(q qVar, float f5) {
        return qVar.k(f5 == 1.0f ? a : new FillElement(f5, 2));
    }

    public static final q e(q qVar, float f5) {
        return qVar.k(new SizeElement(0.0f, f5, 0.0f, f5, 5));
    }

    public static final q f(q qVar, float f5, float f7) {
        return qVar.k(new SizeElement(0.0f, f5, 0.0f, f7, 5));
    }

    public static /* synthetic */ q g(q qVar, float f5, float f7, int i7) {
        if ((i7 & 1) != 0) {
            f5 = Float.NaN;
        }
        if ((i7 & 2) != 0) {
            f7 = Float.NaN;
        }
        return f(qVar, f5, f7);
    }

    public static final q h(q qVar, float f5, float f7) {
        return qVar.k(new SizeElement(f5, f7, f5, f7, false));
    }

    public static q i(q qVar, float f5, float f7, float f8, float f9, int i7) {
        return qVar.k(new SizeElement(f5, (i7 & 2) != 0 ? Float.NaN : f7, (i7 & 4) != 0 ? Float.NaN : f8, (i7 & 8) != 0 ? Float.NaN : f9, false));
    }

    public static final q j(q qVar, float f5) {
        return qVar.k(new SizeElement(f5, f5, f5, f5, true));
    }

    public static final q k(q qVar, float f5, float f7) {
        return qVar.k(new SizeElement(f5, f7, f5, f7, true));
    }

    public static final q l(q qVar, float f5, float f7, float f8, float f9) {
        return qVar.k(new SizeElement(f5, f7, f8, f9, true));
    }

    public static /* synthetic */ q m(q qVar, float f5, float f7, int i7) {
        float f8 = C0.f4976b;
        if ((i7 & 2) != 0) {
            f8 = Float.NaN;
        }
        return l(qVar, f5, f8, f7, Float.NaN);
    }

    public static final q n(float f5) {
        return new SizeElement(f5, 0.0f, f5, 0.0f, 10);
    }

    public static q o(q qVar, float f5) {
        return qVar.k(new SizeElement(Float.NaN, 0.0f, f5, 0.0f, 10));
    }

    public static q p(q qVar) {
        h hVar = a0.b.f10391u;
        return qVar.k(l.a(hVar, hVar) ? f10592d : l.a(hVar, a0.b.f10390t) ? f10593e : new WrapContentElement(1, new S(20, hVar), hVar));
    }

    public static q q(q qVar) {
        i iVar = a0.b.f10385o;
        return qVar.k(iVar.equals(iVar) ? f10594f : iVar.equals(a0.b.f10381k) ? f10595g : new WrapContentElement(3, new S(21, iVar), iVar));
    }
}
