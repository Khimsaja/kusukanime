package D;

import H0.C0214f;
import N0.C0476a;
import O.C0509o0;
import O.C0519u;
import f0.InterfaceC0854g;
import io.ktor.util.GzipHeaderFlags;
import java.util.List;
import l4.AbstractC1420H;
import z0.C2457m0;

/* loaded from: classes.dex */
public final class A extends kotlin.jvm.internal.m implements e4.k {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f971l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0053g0 f972m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ A(C0053g0 c0053g0, int i7) {
        super(1);
        this.f971l = i7;
        this.f972m = c0053g0;
    }

    @Override // e4.k
    public final Object invoke(Object obj) {
        z0.N0 n02;
        boolean z7 = false;
        O3.C c2 = null;
        O3.C c4 = O3.C.a;
        C0053g0 c0053g0 = this.f972m;
        switch (this.f971l) {
            case 0:
                w0.r rVar = (w0.r) obj;
                N0 n0D = c0053g0.d();
                if (n0D != null) {
                    n0D.f1081c = rVar;
                }
                return c4;
            case 1:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                c0053g0.f1158q.setValue(bool);
                return c4;
            case 2:
                List list = (List) obj;
                if (c0053g0.d() != null) {
                    N0 n0D2 = c0053g0.d();
                    kotlin.jvm.internal.l.c(n0D2);
                    list.add(n0D2.a);
                    z7 = true;
                }
                return Boolean.valueOf(z7);
            case 3:
                C0214f c0214f = (C0214f) obj;
                N0.B b4 = c0053g0.f1146e;
                A a = c0053g0.f1161t;
                if (b4 != null) {
                    N0.w wVarA1 = c0053g0.f1145d.a1(P3.r.I(new N0.f(), new C0476a(c0214f, 1)));
                    b4.a(null, wVarA1);
                    a.invoke(wVarA1);
                    c2 = c4;
                }
                if (c2 == null) {
                    String str = c0214f.a;
                    int length = str.length();
                    a.invoke(new N0.w(str, AbstractC1420H.c(length, length), 4));
                }
                return Boolean.TRUE;
            case GzipHeaderFlags.EXTRA /* 4 */:
                int i7 = ((N0.k) obj).a;
                B2.l lVar = c0053g0.f1159r;
                lVar.getClass();
                if (i7 == 7 || i7 == 2 || i7 == 6 || i7 == 5 || i7 == 3 || i7 == 4) {
                    lVar.y();
                } else if (i7 != 1 && i7 != 0) {
                    throw new IllegalStateException("invalid ImeAction");
                }
                if (i7 == 6) {
                    InterfaceC0854g interfaceC0854g = (InterfaceC0854g) lVar.f418n;
                    if (interfaceC0854g == null) {
                        kotlin.jvm.internal.l.l("focusManager");
                        throw null;
                    }
                    ((androidx.compose.ui.focus.b) interfaceC0854g).d(1);
                } else if (i7 == 5) {
                    InterfaceC0854g interfaceC0854g2 = (InterfaceC0854g) lVar.f418n;
                    if (interfaceC0854g2 == null) {
                        kotlin.jvm.internal.l.l("focusManager");
                        throw null;
                    }
                    ((androidx.compose.ui.focus.b) interfaceC0854g2).d(2);
                } else if (i7 == 7 && (n02 = (z0.N0) lVar.f416l) != null) {
                    ((C2457m0) n02).a();
                }
                return c4;
            default:
                N0.w wVar = (N0.w) obj;
                String str2 = wVar.a.a;
                C0214f c0214f2 = c0053g0.f1151j;
                if (!kotlin.jvm.internal.l.a(str2, c0214f2 != null ? c0214f2.a : null)) {
                    c0053g0.f1152k.setValue(W.f1107k);
                }
                long j7 = H0.H.f3091b;
                c0053g0.f(j7);
                c0053g0.e(j7);
                c0053g0.f1160s.invoke(wVar);
                C0509o0 c0509o0 = c0053g0.f1143b;
                C0519u c0519u = c0509o0.f7109b;
                if (c0519u != null) {
                    c0519u.p(c0509o0, null);
                }
                return c4;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(C0053g0 c0053g0, F0.i iVar) {
        super(1);
        this.f971l = 3;
        this.f972m = c0053g0;
    }
}
