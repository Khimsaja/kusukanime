package androidx.compose.foundation.lazy.layout;

import D.C0068o;
import D.C0076u;
import H.M;
import O.C0502l;
import O.C0510p;
import O.F;
import O.Z;
import O3.C;
import a0.q;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import e4.k;
import e4.n;
import e4.o;
import java.util.Arrays;
import kotlin.jvm.internal.m;
import n5.P;
import w0.X;
import w0.a0;
import y.AbstractC2307G;
import y.AbstractC2318S;
import y.C2306F;
import y.C2338s;
import y.RunnableC2320a;

/* loaded from: classes.dex */
public final class b extends m implements o {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C2306F f10607l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ q f10608m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ n f10609n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Z f10610o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(C2306F c2306f, q qVar, n nVar, Z z7) {
        super(3);
        this.f10607l = c2306f;
        this.f10608m = qVar;
        this.f10609n = nVar;
        this.f10610o = z7;
    }

    @Override // e4.o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        q qVarK;
        X.c cVar = (X.c) obj;
        C0510p c0510p = (C0510p) obj2;
        ((Number) obj3).intValue();
        Object objH = c0510p.H();
        Object obj4 = C0502l.a;
        if (objH == obj4) {
            objH = new C2338s(cVar, new C0068o(5, this.f10610o));
            c0510p.b0(objH);
        }
        C2338s c2338s = (C2338s) objH;
        Object objH2 = c0510p.H();
        if (objH2 == obj4) {
            objH2 = new a0(new P(c2338s));
            c0510p.b0(objH2);
        }
        a0 a0Var = (a0) objH2;
        C2306F c2306f = this.f10607l;
        if (c2306f != null) {
            c0510p.R(205264983);
            c0510p.R(6622915);
            Object obj5 = AbstractC2318S.a;
            if (obj5 != null) {
                c0510p.R(1213893039);
                c0510p.p(false);
            } else {
                c0510p.R(1213931944);
                View view = (View) c0510p.k(AndroidCompositionLocals_androidKt.f10673f);
                boolean zF = c0510p.f(view);
                Object objH3 = c0510p.H();
                if (zF || objH3 == obj4) {
                    objH3 = new RunnableC2320a(view);
                    c0510p.b0(objH3);
                }
                obj5 = (RunnableC2320a) objH3;
                c0510p.p(false);
            }
            Object obj6 = obj5;
            c0510p.p(false);
            Object[] objArr = {c2306f, c2338s, a0Var, obj6};
            boolean zF2 = c0510p.f(c2306f) | c0510p.h(c2338s) | c0510p.h(a0Var) | c0510p.h(obj6);
            Object objH4 = c0510p.H();
            if (zF2 || objH4 == obj4) {
                Object c0076u = new C0076u(c2306f, c2338s, a0Var, obj6, 4);
                c0510p.b0(c0076u);
                objH4 = c0076u;
            }
            k kVar = (k) objH4;
            boolean zF3 = false;
            for (Object obj7 : Arrays.copyOf(objArr, 4)) {
                zF3 |= c0510p.f(obj7);
            }
            Object objH5 = c0510p.H();
            if (zF3 || objH5 == obj4) {
                c0510p.b0(new F(kVar));
            }
            c0510p.p(false);
        } else {
            c0510p.R(205858881);
            c0510p.p(false);
        }
        int i7 = AbstractC2307G.f17578b;
        q qVar = this.f10608m;
        if (c2306f != null && (qVarK = qVar.k(new TraversablePrefetchStateModifierElement(c2306f))) != null) {
            qVar = qVarK;
        }
        boolean zF4 = c0510p.f(c2338s);
        Object obj8 = this.f10609n;
        boolean zF5 = zF4 | c0510p.f(obj8);
        Object objH6 = c0510p.H();
        if (zF5 || objH6 == obj4) {
            objH6 = new M(20, c2338s, obj8);
            c0510p.b0(objH6);
        }
        X.c(a0Var, qVar, (n) objH6, c0510p, 8);
        return C.a;
    }
}
