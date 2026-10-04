package O1;

import java.io.IOException;
import java.util.Objects;

/* renamed from: O1.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0535i implements H, K1.f {
    public final Object a;

    /* renamed from: b, reason: collision with root package name */
    public K1.e f7452b;

    /* renamed from: c, reason: collision with root package name */
    public K1.e f7453c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AbstractC0537k f7454d;

    public C0535i(AbstractC0537k abstractC0537k, Object obj) {
        this.f7454d = abstractC0537k;
        this.f7452b = new K1.e(abstractC0537k.f7405c.f4460c, 0, null);
        this.f7453c = new K1.e(abstractC0537k.f7406d.f4460c, 0, null);
        this.a = obj;
    }

    @Override // O1.H
    public final void C(int i7, B b4, C0549x c0549x) {
        if (a(i7, b4)) {
            K1.e eVar = this.f7452b;
            C0549x c0549xB = b(c0549x, b4);
            eVar.getClass();
            eVar.a(new I1.c(eVar, c0549xB));
        }
    }

    public final boolean a(int i7, B b4) {
        B bS;
        Object obj = this.a;
        AbstractC0537k abstractC0537k = this.f7454d;
        if (b4 != null) {
            bS = abstractC0537k.s(obj, b4);
            if (bS == null) {
                return false;
            }
        } else {
            bS = null;
        }
        int iU = abstractC0537k.u(i7, obj);
        K1.e eVar = this.f7452b;
        if (eVar.a != iU || !Objects.equals(eVar.f4459b, bS)) {
            this.f7452b = new K1.e(abstractC0537k.f7405c.f4460c, iU, bS);
        }
        K1.e eVar2 = this.f7453c;
        if (eVar2.a == iU && Objects.equals(eVar2.f4459b, bS)) {
            return true;
        }
        this.f7453c = new K1.e(abstractC0537k.f7406d.f4460c, iU, bS);
        return true;
    }

    public final C0549x b(C0549x c0549x, B b4) {
        AbstractC0537k abstractC0537k = this.f7454d;
        Object obj = this.a;
        long j7 = c0549x.f7507c;
        long jT = abstractC0537k.t(j7, obj);
        long j8 = c0549x.f7508d;
        long jT2 = abstractC0537k.t(j8, obj);
        return (jT == j7 && jT2 == j8) ? c0549x : new C0549x(c0549x.a, c0549x.f7506b, jT, jT2);
    }

    @Override // O1.H
    public final void c(int i7, B b4, C0544s c0544s, C0549x c0549x, IOException iOException, boolean z7) {
        if (a(i7, b4)) {
            K1.e eVar = this.f7452b;
            C0549x c0549xB = b(c0549x, b4);
            eVar.getClass();
            eVar.a(new F(eVar, c0544s, c0549xB, iOException, z7));
        }
    }

    @Override // O1.H
    public final void i(int i7, B b4, C0544s c0544s, C0549x c0549x, int i8) {
        if (a(i7, b4)) {
            K1.e eVar = this.f7452b;
            C0549x c0549xB = b(c0549x, b4);
            eVar.getClass();
            eVar.a(new D(eVar, c0544s, c0549xB, i8));
        }
    }

    @Override // O1.H
    public final void x(int i7, B b4, C0544s c0544s, C0549x c0549x) {
        if (a(i7, b4)) {
            K1.e eVar = this.f7452b;
            C0549x c0549xB = b(c0549x, b4);
            eVar.getClass();
            eVar.a(new E(eVar, c0544s, c0549xB, 1));
        }
    }

    @Override // O1.H
    public final void z(int i7, B b4, C0544s c0544s, C0549x c0549x) {
        if (a(i7, b4)) {
            K1.e eVar = this.f7452b;
            C0549x c0549xB = b(c0549x, b4);
            eVar.getClass();
            eVar.a(new E(eVar, c0544s, c0549xB, 0));
        }
    }
}
