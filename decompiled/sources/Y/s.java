package Y;

import O.C0486d;
import e4.InterfaceC0821a;

/* loaded from: classes.dex */
public abstract class s {
    public static final Object a = new Object();

    public static final void a(int i7, int i8) {
        if (i7 < 0 || i7 >= i8) {
            throw new IndexOutOfBoundsException("index (" + i7 + ") is out of bound of [0, " + i8 + ')');
        }
    }

    public static final int b(int[] iArr, int i7) {
        int length = iArr.length - 1;
        int i8 = 0;
        while (i8 <= length) {
            int i9 = (i8 + length) >>> 1;
            int i10 = iArr[i9];
            if (i7 > i10) {
                i8 = i9 + 1;
            } else {
                if (i7 >= i10) {
                    return i9;
                }
                length = i9 - 1;
            }
        }
        return -(i8 + 1);
    }

    public static h c() {
        return (h) o.a.s();
    }

    public static h d(h hVar) {
        if (hVar instanceof z) {
            z zVar = (z) hVar;
            if (zVar.f10046t == C0486d.z()) {
                zVar.f10044r = null;
                return hVar;
            }
        }
        if (hVar instanceof A) {
            A a7 = (A) hVar;
            if (a7.f9958h == C0486d.z()) {
                a7.f9957g = null;
                return hVar;
            }
        }
        h hVarH = o.h(hVar, null, false);
        hVarH.j();
        return hVarH;
    }

    public static Object e(InterfaceC0821a interfaceC0821a, e4.k kVar) {
        h zVar;
        if (kVar == null) {
            return interfaceC0821a.invoke();
        }
        h hVar = (h) o.a.s();
        if (hVar instanceof z) {
            z zVar2 = (z) hVar;
            if (zVar2.f10046t == C0486d.z()) {
                e4.k kVar2 = zVar2.f10044r;
                e4.k kVar3 = zVar2.f10045s;
                try {
                    ((z) hVar).f10044r = o.l(kVar, kVar2, true);
                    ((z) hVar).f10045s = kVar3;
                    return interfaceC0821a.invoke();
                } finally {
                    zVar2.f10044r = kVar2;
                    zVar2.f10045s = kVar3;
                }
            }
        }
        if (hVar == null || (hVar instanceof d)) {
            zVar = new z(hVar instanceof d ? (d) hVar : null, kVar, null, true, false);
        } else {
            if (kVar == null) {
                return interfaceC0821a.invoke();
            }
            zVar = hVar.t(kVar);
        }
        try {
            h hVarJ = zVar.j();
            try {
                Object objInvoke = interfaceC0821a.invoke();
                h.p(hVarJ);
                return objInvoke;
            } catch (Throwable th) {
                h.p(hVarJ);
                throw th;
            }
        } finally {
            zVar.c();
        }
    }

    public static void f(h hVar, h hVar2, e4.k kVar) {
        if (hVar != hVar2) {
            hVar2.getClass();
            h.p(hVar);
            hVar2.c();
        } else if (hVar instanceof z) {
            ((z) hVar).f10044r = kVar;
        } else if (hVar instanceof A) {
            ((A) hVar).f9957g = kVar;
        } else {
            throw new IllegalStateException(("Non-transparent snapshot was reused: " + hVar).toString());
        }
    }

    public static final void g() {
        throw new UnsupportedOperationException();
    }
}
