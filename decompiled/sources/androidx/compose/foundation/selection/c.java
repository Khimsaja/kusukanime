package androidx.compose.foundation.selection;

import F0.f;
import O.C0502l;
import O.C0510p;
import a0.n;
import a0.q;
import androidx.compose.foundation.d;
import e4.k;
import e4.o;
import kotlin.jvm.internal.m;
import q.M;

/* loaded from: classes.dex */
public final class c extends m implements o {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ M f10625l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f10626m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ f f10627n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ k f10628o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(M m7, boolean z7, f fVar, k kVar) {
        super(3);
        this.f10625l = m7;
        this.f10626m = z7;
        this.f10627n = fVar;
        this.f10628o = kVar;
    }

    @Override // e4.o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C0510p c0510p = (C0510p) obj2;
        ((Number) obj3).intValue();
        c0510p.R(-1525724089);
        Object objH = c0510p.H();
        if (objH == C0502l.a) {
            objH = new u.k();
            c0510p.b0(objH);
        }
        u.k kVar = (u.k) objH;
        q qVarK = d.a(n.a, kVar, this.f10625l).k(new ToggleableElement(this.f10626m, kVar, null, this.f10627n, this.f10628o));
        c0510p.p(false);
        return qVarK;
    }
}
