package W;

import D.C0064m;
import H.C0184a;
import L.C0375h;
import O.C0509o0;
import O.C0510p;
import e4.InterfaceC0822b;
import e4.InterfaceC0823c;
import e4.InterfaceC0824d;
import e4.InterfaceC0825e;
import e4.InterfaceC0826f;
import e4.InterfaceC0827g;
import e4.InterfaceC0828h;
import e4.InterfaceC0829i;
import e4.InterfaceC0830j;
import e4.l;
import e4.m;
import e4.n;
import e4.o;
import e4.p;
import e4.q;
import e4.r;
import e4.s;
import e4.t;
import e4.u;
import java.util.ArrayList;
import kotlin.jvm.internal.B;

/* loaded from: classes.dex */
public final class a implements n, o, p, q, r, s, t, u, InterfaceC0822b, InterfaceC0823c, InterfaceC0824d, InterfaceC0825e, InterfaceC0826f, InterfaceC0827g, InterfaceC0828h, InterfaceC0829i, InterfaceC0830j, l, m {

    /* renamed from: k, reason: collision with root package name */
    public final int f9500k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f9501l;

    /* renamed from: m, reason: collision with root package name */
    public Object f9502m;

    /* renamed from: n, reason: collision with root package name */
    public C0509o0 f9503n;

    /* renamed from: o, reason: collision with root package name */
    public ArrayList f9504o;

    public a(boolean z7, int i7, Object obj) {
        this.f9500k = i7;
        this.f9501l = z7;
        this.f9502m = obj;
    }

    public final Object a(Object obj, C0510p c0510p, int i7) {
        c0510p.T(this.f9500k);
        d(c0510p);
        int iA = c0510p.f(this) ? f.a(2, 1) : f.a(1, 1);
        Object obj2 = this.f9502m;
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>", obj2);
        B.e(3, obj2);
        Object objInvoke = ((o) obj2).invoke(obj, c0510p, Integer.valueOf(iA | i7));
        C0509o0 c0509o0S = c0510p.s();
        if (c0509o0S != null) {
            c0509o0S.f7111d = new C0064m(this, obj, i7);
        }
        return objInvoke;
    }

    public final Object b(Object obj, Object obj2, C0510p c0510p, int i7) {
        c0510p.T(this.f9500k);
        d(c0510p);
        int iA = c0510p.f(this) ? f.a(2, 2) : f.a(1, 2);
        Object obj3 = this.f9502m;
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type kotlin.Function4<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>", obj3);
        B.e(4, obj3);
        Object objInvoke = ((p) obj3).invoke(obj, obj2, c0510p, Integer.valueOf(iA | i7));
        C0509o0 c0509o0S = c0510p.s();
        if (c0509o0S != null) {
            c0509o0S.f7111d = new C0184a(this, obj, obj2, i7);
        }
        return objInvoke;
    }

    public final Object c(Object obj, Object obj2, Object obj3, C0510p c0510p, int i7) {
        c0510p.T(this.f9500k);
        d(c0510p);
        int iA = c0510p.f(this) ? f.a(2, 3) : f.a(1, 3);
        Object obj4 = this.f9502m;
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type kotlin.Function5<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'p3')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>", obj4);
        B.e(5, obj4);
        Object objInvoke = ((q) obj4).invoke(obj, obj2, obj3, c0510p, Integer.valueOf(iA | i7));
        C0509o0 c0509o0S = c0510p.s();
        if (c0509o0S != null) {
            c0509o0S.f7111d = new C0375h(this, obj, obj2, obj3, i7);
        }
        return objInvoke;
    }

    public final void d(C0510p c0510p) {
        C0509o0 c0509o0W;
        if (!this.f9501l || (c0509o0W = c0510p.w()) == null) {
            return;
        }
        c0510p.getClass();
        c0509o0W.a |= 1;
        if (f.c(this.f9503n, c0509o0W)) {
            this.f9503n = c0509o0W;
            return;
        }
        ArrayList arrayList = this.f9504o;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList();
            this.f9504o = arrayList2;
            arrayList2.add(c0509o0W);
            return;
        }
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            if (f.c((C0509o0) arrayList.get(i7), c0509o0W)) {
                arrayList.set(i7, c0509o0W);
                return;
            }
        }
        arrayList.add(c0509o0W);
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        C0510p c0510p = (C0510p) obj;
        int iIntValue = ((Number) obj2).intValue();
        c0510p.T(this.f9500k);
        d(c0510p);
        int iA = iIntValue | (c0510p.f(this) ? f.a(2, 0) : f.a(1, 0));
        Object obj3 = this.f9502m;
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type kotlin.Function2<@[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>", obj3);
        B.e(2, obj3);
        Object objInvoke = ((n) obj3).invoke(c0510p, Integer.valueOf(iA));
        C0509o0 c0509o0S = c0510p.s();
        if (c0509o0S != null) {
            B.e(2, this);
            c0509o0S.f7111d = this;
        }
        return objInvoke;
    }

    @Override // e4.o
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return a(obj, (C0510p) obj2, ((Number) obj3).intValue());
    }

    @Override // e4.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        return b(obj, obj2, (C0510p) obj3, ((Number) obj4).intValue());
    }

    @Override // e4.q
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return c(obj, obj2, obj3, (C0510p) obj4, ((Number) obj5).intValue());
    }
}
