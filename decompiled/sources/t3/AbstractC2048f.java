package t3;

import B3.C0026b;
import H0.I;
import L.F1;
import L.H2;
import L.M2;
import L.N;
import L.N2;
import L.P;
import M0.u;
import O.C0486d;
import O.C0502l;
import O.C0509o0;
import O.C0510p;
import O.InterfaceC0501k0;
import O.S0;
import O.T;
import O.Z;
import O3.C;
import P3.F;
import a0.q;
import android.content.Context;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.InterfaceC0684k;
import androidx.lifecycle.W;
import b1.AbstractC0703b;
import com.kusukanime.data.AzItem;
import e4.InterfaceC0821a;
import f.AbstractC0847h;
import f1.AbstractC0871d;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.y;
import n0.C1538e;
import r3.C1871a;
import v.AbstractC2130i;
import v.AbstractC2136o;
import v.C2140t;
import v.e0;
import v.f0;
import v.r;
import v1.C2147a;
import w0.InterfaceC2173H;
import w1.AbstractC2208a;
import y0.C2361h;
import y0.C2362i;
import y0.C2363j;
import y0.InterfaceC2364k;
import z5.AbstractC2510o;

/* renamed from: t3.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2048f {
    public static final W.a a = new W.a(false, -327941620, new io.ktor.http.cio.b(20));

    /* renamed from: b, reason: collision with root package name */
    public static final W.a f15990b = new W.a(false, 2143838413, new io.ktor.http.cio.b(21));

    /* renamed from: c, reason: collision with root package name */
    public static final W.a f15991c = new W.a(false, -1580758138, new io.ktor.http.cio.b(22));

    public static final void a(AzItem azItem, InterfaceC0821a interfaceC0821a, C0510p c0510p, int i7) {
        C0510p c0510p2 = c0510p;
        c0510p2.T(2121805957);
        if (((i7 | (c0510p2.f(azItem) ? 4 : 2) | (c0510p2.h(interfaceC0821a) ? 32 : 16)) & 19) == 18 && c0510p2.y()) {
            c0510p2.M();
        } else {
            a0.n nVar = a0.n.a;
            float f5 = 12;
            q qVarI = androidx.compose.foundation.layout.a.i(androidx.compose.foundation.a.e(androidx.compose.foundation.layout.c.d(nVar, 1.0f), false, null, interfaceC0821a, 7), 16, f5);
            f0 f0VarB = e0.b(AbstractC2130i.a, a0.b.f10391u, c0510p2, 48);
            int i8 = c0510p2.f7128P;
            InterfaceC0501k0 interfaceC0501k0M = c0510p2.m();
            q qVarC = a0.a.c(c0510p2, qVarI);
            InterfaceC2364k.f17877j.getClass();
            C2362i c2362i = C2363j.f17871b;
            c0510p2.V();
            if (c0510p2.f7127O) {
                c0510p2.l(c2362i);
            } else {
                c0510p2.e0();
            }
            C2361h c2361h = C2363j.f17875f;
            C0486d.R(c0510p2, c2361h, f0VarB);
            C2361h c2361h2 = C2363j.f17874e;
            C0486d.R(c0510p2, c2361h2, interfaceC0501k0M);
            C2361h c2361h3 = C2363j.f17876g;
            if (c0510p2.f7127O || !kotlin.jvm.internal.l.a(c0510p2.H(), Integer.valueOf(i8))) {
                AbstractC0703b.u(i8, c0510p2, i8, c2361h3);
            }
            C2361h c2361h4 = C2363j.f17873d;
            C0486d.R(c0510p2, c2361h4, qVarC);
            S0 s02 = P.a;
            float f7 = 8;
            q qVarI2 = androidx.compose.foundation.layout.a.i(androidx.compose.foundation.a.b(nVar, ((N) c0510p2.k(s02)).f5230G, C.e.b(f7)), f7, 2);
            InterfaceC2173H interfaceC2173HE = AbstractC2136o.e(a0.b.f10381k, false);
            int i9 = c0510p2.f7128P;
            InterfaceC0501k0 interfaceC0501k0M2 = c0510p2.m();
            q qVarC2 = a0.a.c(c0510p2, qVarI2);
            c0510p2.V();
            if (c0510p2.f7127O) {
                c0510p2.l(c2362i);
            } else {
                c0510p2.e0();
            }
            C0486d.R(c0510p2, c2361h, interfaceC2173HE);
            C0486d.R(c0510p2, c2361h2, interfaceC0501k0M2);
            if (c0510p2.f7127O || !kotlin.jvm.internal.l.a(c0510p2.H(), Integer.valueOf(i9))) {
                AbstractC0703b.u(i9, c0510p2, i9, c2361h3);
            }
            C0486d.R(c0510p2, c2361h4, qVarC2);
            String upperCase = AbstractC2510o.I0(1, AbstractC2510o.J0(azItem.getTitle()).toString()).toUpperCase(Locale.ROOT);
            kotlin.jvm.internal.l.e("toUpperCase(...)", upperCase);
            if (AbstractC2510o.g0(upperCase)) {
                upperCase = "#";
            }
            S0 s03 = N2.a;
            H2.b(upperCase, null, ((N) c0510p2.k(s02)).a, 0L, u.f6418r, 0L, null, 0L, 0, false, 0, 0, ((M2) c0510p2.k(s03)).f5222n, c0510p, 196608, 0, 65498);
            c0510p.p(true);
            String title = azItem.getTitle();
            I i10 = ((M2) c0510p.k(s03)).f5218j;
            q qVarL = androidx.compose.foundation.layout.a.l(nVar, f5, 0.0f, 0.0f, 0.0f, 14);
            if (1.0f <= 0.0d) {
                throw new IllegalArgumentException("invalid weight 1.0; must be greater than zero");
            }
            H2.b(title, qVarL.k(new LayoutWeightElement(1.0f, true)), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, i10, c0510p, 0, 0, 65532);
            c0510p2 = c0510p;
            c0510p2.p(true);
        }
        C0509o0 c0509o0S = c0510p2.s();
        if (c0509o0S != null) {
            c0509o0S.f7111d = new A3.h(i7, 6, azItem, interfaceC0821a);
        }
    }

    public static final void b(final e4.k kVar, C2047e c2047e, C0510p c0510p, final int i7) {
        int i8;
        final C2047e c2047e2;
        final e4.k kVar2;
        final C2047e c2047e3;
        C0510p c0510p2 = c0510p;
        kotlin.jvm.internal.l.f("onOpen", kVar);
        c0510p2.T(1600017371);
        int i9 = (c0510p2.h(kVar) ? 4 : 2) | i7 | 16;
        if ((i9 & 19) == 18 && c0510p2.y()) {
            c0510p2.M();
            kVar2 = kVar;
            c2047e3 = c2047e;
        } else {
            c0510p2.O();
            if ((i7 & 1) == 0 || c0510p2.x()) {
                W wA = AbstractC2208a.a(c0510p2);
                if (wA == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                i8 = i9 & (-113);
                c2047e2 = (C2047e) AbstractC0871d.v0(y.a.b(C2047e.class), wA, wA instanceof InterfaceC0684k ? ((InterfaceC0684k) wA).d() : C2147a.f16519b, c0510p2);
            } else {
                c0510p2.M();
                i8 = i9 & (-113);
                c2047e2 = c2047e;
            }
            c0510p2.q();
            Context context = (Context) c0510p2.k(AndroidCompositionLocals_androidKt.f10669b);
            C c2 = C.a;
            boolean zH = c0510p2.h(c2047e2) | c0510p2.h(context);
            Object objH = c0510p2.H();
            T t7 = C0502l.a;
            if (zH || objH == t7) {
                objH = new C2045c(c2047e2, context, null);
                c0510p2.b0(objH);
            }
            C0486d.e(c0510p2, (e4.n) objH, c2);
            Z zV = C0486d.v(c2047e2.f15985c, c0510p2);
            Z zV2 = C0486d.v(c2047e2.f15987e, c0510p2);
            Z zV3 = C0486d.v(c2047e2.f15989g, c0510p2);
            Object objH2 = c0510p2.H();
            if (objH2 == t7) {
                objH2 = C0486d.K("", T.f7049p);
                c0510p2.b0(objH2);
            }
            Z z7 = (Z) objH2;
            boolean zF = c0510p2.f((List) zV.getValue()) | c0510p2.f((String) z7.getValue());
            Object objH3 = c0510p2.H();
            if (zF || objH3 == t7) {
                String lowerCase = AbstractC2510o.J0((String) z7.getValue()).toString().toLowerCase(Locale.ROOT);
                kotlin.jvm.internal.l.e("toLowerCase(...)", lowerCase);
                if (lowerCase.length() == 0) {
                    objH3 = (List) zV.getValue();
                } else {
                    List list = (List) zV.getValue();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : list) {
                        String lowerCase2 = ((AzItem) obj).getTitle().toLowerCase(Locale.ROOT);
                        kotlin.jvm.internal.l.e("toLowerCase(...)", lowerCase2);
                        if (AbstractC2510o.W(lowerCase2, lowerCase, false)) {
                            arrayList.add(obj);
                        }
                    }
                    objH3 = arrayList;
                }
                c0510p2.b0(objH3);
            }
            List list2 = (List) objH3;
            if (((Boolean) zV2.getValue()).booleanValue()) {
                c0510p2.R(570987514);
                D3.f.g(null, c0510p2, 0);
                c0510p2.p(false);
                C0509o0 c0509o0S = c0510p2.s();
                if (c0509o0S != null) {
                    final int i10 = 0;
                    c0509o0S.f7111d = new e4.n(kVar, c2047e2, i7, i10) { // from class: t3.a

                        /* renamed from: k, reason: collision with root package name */
                        public final /* synthetic */ int f15972k;

                        /* renamed from: l, reason: collision with root package name */
                        public final /* synthetic */ e4.k f15973l;

                        /* renamed from: m, reason: collision with root package name */
                        public final /* synthetic */ C2047e f15974m;

                        {
                            this.f15972k = i10;
                        }

                        @Override // e4.n
                        public final Object invoke(Object obj2, Object obj3) {
                            int i11 = this.f15972k;
                            C0510p c0510p3 = (C0510p) obj2;
                            ((Integer) obj3).getClass();
                            switch (i11) {
                                case 0:
                                    int iV = C0486d.V(1);
                                    AbstractC2048f.b(this.f15973l, this.f15974m, c0510p3, iV);
                                    break;
                                default:
                                    AbstractC2048f.b(this.f15973l, this.f15974m, c0510p3, C0486d.V(1));
                                    break;
                            }
                            return C.a;
                        }
                    };
                    return;
                }
                return;
            }
            c0510p2.R(566547911);
            c0510p2.p(false);
            a0.n nVar = a0.n.a;
            FillElement fillElement = androidx.compose.foundation.layout.c.f10591c;
            C2140t c2140tA = r.a(AbstractC2130i.f16445c, a0.b.f10393w, c0510p2, 0);
            int i11 = c0510p2.f7128P;
            InterfaceC0501k0 interfaceC0501k0M = c0510p2.m();
            q qVarC = a0.a.c(c0510p2, fillElement);
            InterfaceC2364k.f17877j.getClass();
            C2362i c2362i = C2363j.f17871b;
            c0510p2.V();
            if (c0510p2.f7127O) {
                c0510p2.l(c2362i);
            } else {
                c0510p2.e0();
            }
            C0486d.R(c0510p2, C2363j.f17875f, c2140tA);
            C0486d.R(c0510p2, C2363j.f17874e, interfaceC0501k0M);
            C2361h c2361h = C2363j.f17876g;
            if (c0510p2.f7127O || !kotlin.jvm.internal.l.a(c0510p2.H(), Integer.valueOf(i11))) {
                AbstractC0703b.u(i11, c0510p2, i11, c2361h);
            }
            C0486d.R(c0510p2, C2363j.f17873d, qVarC);
            D3.f.f("Semua Anime", ((List) zV.getValue()).isEmpty() ? null : ((List) zV.getValue()).size() + " judul", null, c0510p2, 6);
            String str = (String) z7.getValue();
            Object objH4 = c0510p2.H();
            if (objH4 == t7) {
                objH4 = new C1871a(5, z7);
                c0510p2.b0(objH4);
            }
            float f5 = 12;
            C2047e c2047e4 = c2047e2;
            F1.a(str, (e4.k) objH4, androidx.compose.foundation.layout.a.i(androidx.compose.foundation.layout.c.d(nVar, 1.0f), f5, 4), false, null, null, a, f15990b, W.f.b(320651150, new C0026b(8, z7), c0510p2), null, null, false, null, null, null, true, 0, 0, C.e.b(f5), null, c0510p, 918553008, 12582912, 6159480);
            c0510p2 = c0510p;
            if (((String) zV3.getValue()) != null) {
                c0510p2.R(-396738635);
                C1538e c1538eA = F.A();
                String str2 = (String) zV3.getValue();
                if (str2 == null) {
                    str2 = "Coba lagi nanti";
                }
                D3.f.c(c1538eA, "Katalog tidak bisa dimuat", str2, null, null, null, c0510p2, 48, 56);
                c0510p2.p(false);
            } else if (list2.isEmpty()) {
                c0510p2.R(-396731988);
                D3.f.c(F.A(), "Tidak ada yang cocok", "Coba kata kunci lain", null, null, null, c0510p2, 432, 56);
                c0510p2.p(false);
            } else {
                c0510p2.R(-396725841);
                v.Z zC = androidx.compose.foundation.layout.a.c(24);
                boolean zH2 = c0510p2.h(list2) | ((i8 & 14) == 4);
                Object objH5 = c0510p2.H();
                if (zH2 || objH5 == t7) {
                    kVar2 = kVar;
                    objH5 = new C2044b(list2, kVar2, 0);
                    c0510p2.b0(objH5);
                } else {
                    kVar2 = kVar;
                }
                AbstractC0847h.a(fillElement, null, zC, null, null, null, false, (e4.k) objH5, c0510p, 390, 250);
                c0510p2 = c0510p;
                c0510p2.p(false);
                c0510p2.p(true);
                c2047e3 = c2047e4;
            }
            kVar2 = kVar;
            c0510p2.p(true);
            c2047e3 = c2047e4;
        }
        C0509o0 c0509o0S2 = c0510p2.s();
        if (c0509o0S2 != null) {
            final int i12 = 1;
            c0509o0S2.f7111d = new e4.n(kVar2, c2047e3, i7, i12) { // from class: t3.a

                /* renamed from: k, reason: collision with root package name */
                public final /* synthetic */ int f15972k;

                /* renamed from: l, reason: collision with root package name */
                public final /* synthetic */ e4.k f15973l;

                /* renamed from: m, reason: collision with root package name */
                public final /* synthetic */ C2047e f15974m;

                {
                    this.f15972k = i12;
                }

                @Override // e4.n
                public final Object invoke(Object obj2, Object obj3) {
                    int i112 = this.f15972k;
                    C0510p c0510p3 = (C0510p) obj2;
                    ((Integer) obj3).getClass();
                    switch (i112) {
                        case 0:
                            int iV = C0486d.V(1);
                            AbstractC2048f.b(this.f15973l, this.f15974m, c0510p3, iV);
                            break;
                        default:
                            AbstractC2048f.b(this.f15973l, this.f15974m, c0510p3, C0486d.V(1));
                            break;
                    }
                    return C.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x04bc  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x04d3  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0649  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0651  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(final e4.k r63, e4.InterfaceC0821a r64, java.lang.String r65, t3.p r66, O.C0510p r67, final int r68, final int r69) {
        /*
            Method dump skipped, instructions count: 1631
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t3.AbstractC2048f.c(e4.k, e4.a, java.lang.String, t3.p, O.p, int, int):void");
    }
}
