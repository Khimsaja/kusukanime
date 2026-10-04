package D;

import G2.C0174k;
import H0.C0214f;
import L.C0390k2;
import L.EnumC0394l2;
import N0.C0476a;
import androidx.lifecycle.EnumC0688o;
import androidx.lifecycle.InterfaceC0692t;
import androidx.lifecycle.InterfaceC0694v;
import l4.AbstractC1420H;
import l4.InterfaceC1443v;
import z.C2425d;

/* loaded from: classes.dex */
public final class G extends kotlin.jvm.internal.m implements e4.k {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f1029l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f1030m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f1031n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f1032o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ G(int i7, Object obj, Object obj2, boolean z7) {
        super(1);
        this.f1029l = i7;
        this.f1030m = z7;
        this.f1031n = obj;
        this.f1032o = obj2;
    }

    @Override // e4.k
    public final Object invoke(Object obj) {
        O3.C c2 = O3.C.a;
        int i7 = 2;
        int i8 = 0;
        int i9 = 1;
        final boolean z7 = this.f1030m;
        Object obj2 = this.f1031n;
        Object obj3 = this.f1032o;
        switch (this.f1029l) {
            case 0:
                C0214f c0214f = (C0214f) obj;
                if (!z7) {
                    return Boolean.FALSE;
                }
                C0053g0 c0053g0 = (C0053g0) obj2;
                N0.B b4 = c0053g0.f1146e;
                A a = c0053g0.f1161t;
                if (b4 != null) {
                    N0.w wVarA1 = c0053g0.f1145d.a1(P3.r.I(new N0.j(), new C0476a(c0214f, 1)));
                    b4.a(null, wVarA1);
                    a.invoke(wVarA1);
                } else {
                    c2 = null;
                }
                if (c2 == null) {
                    N0.w wVar = (N0.w) obj3;
                    String str = wVar.a.a;
                    int i10 = H0.H.f3092c;
                    long j7 = wVar.f6896b;
                    int i11 = (int) (j7 >> 32);
                    int i12 = (int) (j7 & 4294967295L);
                    kotlin.jvm.internal.l.f("<this>", str);
                    kotlin.jvm.internal.l.f("replacement", c0214f);
                    if (i12 < i11) {
                        throw new IndexOutOfBoundsException("End index (" + i12 + ") is less than start index (" + i11 + ").");
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append((CharSequence) str, 0, i11);
                    sb.append((CharSequence) c0214f);
                    sb.append((CharSequence) str, i12, str.length());
                    String string = sb.toString();
                    int length = c0214f.a.length() + i11;
                    a.invoke(new N0.w(string, AbstractC1420H.c(length, length), 4));
                }
                return Boolean.TRUE;
            case 1:
                final C0174k c0174k = (C0174k) obj2;
                final Y.r rVar = (Y.r) obj3;
                InterfaceC0692t interfaceC0692t = new InterfaceC0692t() { // from class: H2.n
                    @Override // androidx.lifecycle.InterfaceC0692t
                    public final void b(InterfaceC0694v interfaceC0694v, EnumC0688o enumC0688o) {
                        C0174k c0174k2 = c0174k;
                        boolean z8 = z7;
                        Y.r rVar2 = rVar;
                        if (z8 && !rVar2.contains(c0174k2)) {
                            rVar2.add(c0174k2);
                        }
                        if (enumC0688o == EnumC0688o.ON_START && !rVar2.contains(c0174k2)) {
                            rVar2.add(c0174k2);
                        }
                        if (enumC0688o == EnumC0688o.ON_STOP) {
                            rVar2.remove(c0174k2);
                        }
                    }
                };
                c0174k.f2709r.a(interfaceC0692t);
                return new z0(i9, c0174k, interfaceC0692t);
            case 2:
                return new C0390k2(z7, (T0.b) obj2, (EnumC0394l2) obj, (e4.k) obj3);
            default:
                F0.i iVar = (F0.i) obj;
                M5.c cVar = (M5.c) obj3;
                C2425d c2425d = (C2425d) obj2;
                if (z7) {
                    z.p pVar = new z.p(c2425d, cVar, i8);
                    InterfaceC1443v[] interfaceC1443vArr = F0.s.a;
                    iVar.j(F0.h.f2092w, new F0.a(null, pVar));
                    iVar.j(F0.h.f2094y, new F0.a(null, new z.p(c2425d, cVar, i9)));
                } else {
                    z.p pVar2 = new z.p(c2425d, cVar, i7);
                    InterfaceC1443v[] interfaceC1443vArr2 = F0.s.a;
                    iVar.j(F0.h.f2093x, new F0.a(null, pVar2));
                    iVar.j(F0.h.f2095z, new F0.a(null, new z.p(c2425d, cVar, 3)));
                }
                return c2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(C0174k c0174k, Y.r rVar, boolean z7) {
        super(1);
        this.f1029l = 1;
        this.f1031n = c0174k;
        this.f1030m = z7;
        this.f1032o = rVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(boolean z7, C0053g0 c0053g0, F0.i iVar, N0.w wVar) {
        super(1);
        this.f1029l = 0;
        this.f1030m = z7;
        this.f1031n = c0053g0;
        this.f1032o = wVar;
    }
}
