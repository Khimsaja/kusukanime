package p;

import M.C0458p;
import M.C0460s;
import android.content.Context;
import android.view.View;
import f6.AbstractC0905c;
import h0.C0963H;
import h0.C0975U;
import h0.C0987j;
import i1.AbstractC1061n;
import i1.AbstractC1067u;
import io.ktor.util.GzipHeaderFlags;
import j0.InterfaceC1298d;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import s.C1904b;
import s.C1918i;
import s.C1939t;
import s.C1943v;
import s.EnumC1903a0;
import s.e1;
import t0.C2031a;
import t0.C2032b;
import t0.C2033c;
import x.C2228b;
import y.C2315O;
import y0.AbstractC2359f;
import y0.C2351F;
import z0.AbstractC2455l0;
import z0.S0;

/* renamed from: p.K, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1724K extends kotlin.jvm.internal.m implements e4.k {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f13887l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f13888m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f13889n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1724K(int i7, Object obj, Object obj2) {
        super(1);
        this.f13887l = i7;
        this.f13888m = obj;
        this.f13889n = obj2;
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.List] */
    @Override // e4.k
    public final Object invoke(Object obj) {
        O3.C c2 = O3.C.a;
        Object obj2 = this.f13889n;
        Object obj3 = this.f13888m;
        switch (this.f13887l) {
            case 0:
                C1723J c1723j = (C1723J) obj3;
                C1720G c1720g = (C1720G) obj2;
                c1723j.a.b(c1720g);
                c1723j.f13884b.setValue(Boolean.TRUE);
                return new D.z0(3, c1723j, c1720g);
            case 1:
                H5.B b4 = H5.B.f3790k;
                H5.D.x((M5.c) obj3, null, new t0((u0) obj2, null), 1);
                return new H2.t(1);
            case 2:
                u0 u0Var = (u0) obj3;
                u0 u0Var2 = (u0) obj2;
                u0Var.f14142j.add(u0Var2);
                return new D.z0(4, u0Var, u0Var2);
            case 3:
                return new D.z0(5, (u0) obj3, (p0) obj2);
            case GzipHeaderFlags.EXTRA /* 4 */:
                u0 u0Var3 = (u0) obj3;
                s0 s0Var = (s0) obj2;
                u0Var3.f14141i.add(s0Var);
                return new D.z0(6, u0Var3, s0Var);
            case 5:
                C2351F c2351f = (C2351F) obj;
                c2351f.b();
                InterfaceC1298d.e0(c2351f, ((C0963H) obj3).a, (C0975U) obj2, 0.0f, null, 60);
                return c2;
            case 6:
                C2351F c2351f2 = (C2351F) obj;
                c2351f2.b();
                InterfaceC1298d.e0(c2351f2, (C0987j) obj3, (C0975U) obj2, 0.0f, null, 60);
                return c2;
            case 7:
                ((u.k) obj3).c((u.i) obj2);
                return c2;
            case 8:
                return ((io.ktor.network.sockets.b) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case 9:
                ((C1904b) obj3).a.m((C1918i) obj2);
                return c2;
            case 10:
                C2033c c2033c = (C2033c) obj3;
                AbstractC0905c.d(c2033c, (s0.r) obj);
                s.P p7 = (s.P) obj2;
                float fA = ((S0) AbstractC2359f.i(p7, AbstractC2455l0.f18798q)).a();
                long jG = n6.m.g(fA, fA);
                if (T0.o.b(jG) <= 0.0f || T0.o.c(jG) <= 0.0f) {
                    AbstractC0905c.C("maximumVelocity should be a positive value. You specified=" + ((Object) T0.o.f(jG)));
                    throw null;
                }
                float fB = T0.o.b(jG);
                C2032b c2032b = c2033c.a;
                float fB2 = c2032b.b(fB);
                float fC = T0.o.c(jG);
                C2032b c2032b2 = c2033c.f15886b;
                long jG2 = n6.m.g(fB2, c2032b2.b(fC));
                C2031a[] c2031aArr = (C2031a[]) c2032b.f15882c;
                P3.m.c0(c2031aArr, 0, c2031aArr.length);
                c2032b.f15881b = 0;
                C2031a[] c2031aArr2 = (C2031a[]) c2032b2.f15882c;
                P3.m.c0(c2031aArr2, 0, c2031aArr2.length);
                c2032b2.f15881b = 0;
                c2033c.f15887c = 0L;
                J5.e eVar = p7.f15195D;
                if (eVar != null) {
                    s.Q q6 = s.S.a;
                    eVar.mo2trySendJP2dKIU(new C1943v(n6.m.g(Float.isNaN(T0.o.b(jG2)) ? 0.0f : T0.o.b(jG2), Float.isNaN(T0.o.c(jG2)) ? 0.0f : T0.o.c(jG2))));
                }
                return c2;
            case 11:
                long j7 = ((C1939t) obj).a;
                s.W w7 = (s.W) obj2;
                w7.getClass();
                long jI = g0.c.i(1.0f, j7);
                EnumC1903a0 enumC1903a0 = w7.I;
                s.Q q7 = s.S.a;
                float fE = enumC1903a0 == EnumC1903a0.f15259k ? g0.c.e(jI) : g0.c.d(jI);
                C0460s c0460s = ((M.r) obj3).a;
                C0458p.a(c0460s.f6344n, c0460s.e(fE));
                return c2;
            case 12:
                long j8 = ((C1939t) obj).a;
                long jA = ((s.D0) obj2).f15100d == EnumC1903a0.f15260l ? g0.c.a(j8, 0.0f, 1) : g0.c.a(j8, 0.0f, 2);
                s.D0 d02 = ((s.A0) obj3).a;
                d02.f15103g = 1;
                q.e0 e0Var = d02.f15098b;
                if (e0Var == null || !(d02.a.c() || d02.a.a())) {
                    s.D0.a(d02, d02.f15104h, jA, 1);
                } else {
                    e0Var.f(jA, d02.f15103g, d02.f15106j);
                }
                return c2;
            case 13:
                ((Number) obj).longValue();
                e1 e1Var = (e1) obj3;
                float f5 = e1Var.f15297e;
                e1Var.f15297e = 0.0f;
                ((e4.k) obj2).invoke(Float.valueOf(f5));
                return c2;
            case 14:
                return ((io.ktor.network.sockets.b) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case 15:
                return ((s3.T) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case 16:
                return ((s3.T) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case 17:
                return ((s3.T) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case 18:
                return ((s3.T) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case 19:
                return ((s3.T) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case 20:
                v.n0 n0Var = (v.n0) obj3;
                View view = (View) obj2;
                if (n0Var.f16489t == 0) {
                    Field field = AbstractC1067u.a;
                    v.P p8 = n0Var.f16490u;
                    AbstractC1061n.b(view, p8);
                    if (view.isAttachedToWindow()) {
                        view.requestApplyInsets();
                    }
                    view.addOnAttachStateChangeListener(p8);
                    AbstractC1067u.c(view, p8);
                }
                n0Var.f16489t++;
                return new D.z0(8, n0Var, view);
            case 21:
                return ((s3.T) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case 22:
                return ((s3.T) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case 23:
                return ((s3.T) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case 24:
                return ((s3.T) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case 25:
                return ((s3.T) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case 26:
                F5.o oVarB = ((x.s) obj3).b(((Number) obj).intValue());
                ?? r52 = oVarB.f2542m;
                ArrayList arrayList = new ArrayList(r52.size());
                int size = r52.size();
                int i7 = oVarB.f2541l;
                int i8 = 0;
                for (int i9 = 0; i9 < size; i9++) {
                    int i10 = (int) ((C2228b) r52.get(i9)).a;
                    arrayList.add(new O3.l(Integer.valueOf(i7), new T0.a(((C2032b) obj2).c(i8, i10))));
                    i7++;
                    i8 += i10;
                }
                return arrayList;
            case 27:
                C2315O c2315o = (C2315O) obj3;
                c2315o.f17597c.remove(obj2);
                return new D.z0(12, c2315o, obj2);
            case 28:
                Context context = (Context) obj3;
                z0.Q q8 = (z0.Q) obj2;
                context.getApplicationContext().registerComponentCallbacks(q8);
                return new D.z0(15, context, q8);
            default:
                Context context2 = (Context) obj3;
                z0.S s7 = (z0.S) obj2;
                context2.getApplicationContext().registerComponentCallbacks(s7);
                return new D.z0(16, context2, s7);
        }
    }
}
