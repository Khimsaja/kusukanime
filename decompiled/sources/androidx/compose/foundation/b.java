package androidx.compose.foundation;

import F0.f;
import O.C0502l;
import O.C0510p;
import a0.n;
import a0.q;
import e4.InterfaceC0821a;
import e4.o;
import kotlin.jvm.internal.m;
import q.M;
import u.k;

/* loaded from: classes.dex */
public final class b extends m implements o {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ M f10559l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f10560m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ String f10561n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ f f10562o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0821a f10563p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(M m7, boolean z7, String str, f fVar, InterfaceC0821a interfaceC0821a) {
        super(3);
        this.f10559l = m7;
        this.f10560m = z7;
        this.f10561n = str;
        this.f10562o = fVar;
        this.f10563p = interfaceC0821a;
    }

    @Override // e4.o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C0510p c0510p = (C0510p) obj2;
        ((Number) obj3).intValue();
        c0510p.R(-1525724089);
        Object objH = c0510p.H();
        if (objH == C0502l.a) {
            objH = new k();
            c0510p.b0(objH);
        }
        k kVar = (k) objH;
        q qVarK = d.a(n.a, kVar, this.f10559l).k(new ClickableElement(kVar, null, this.f10560m, this.f10561n, this.f10562o, this.f10563p));
        c0510p.p(false);
        return qVarK;
    }
}
