package B;

import F0.i;
import F0.q;
import F0.s;
import F0.t;
import e4.k;
import l4.InterfaceC1443v;
import q.C1839v;
import q.S;

/* loaded from: classes.dex */
public final class f extends C1839v {

    /* renamed from: R, reason: collision with root package name */
    public boolean f272R;

    /* renamed from: S, reason: collision with root package name */
    public k f273S;

    /* renamed from: T, reason: collision with root package name */
    public final e f274T;

    public f(boolean z7, u.k kVar, S s7, F0.f fVar, k kVar2) {
        super(kVar, s7, true, null, fVar, new d(z7, 0, kVar2));
        this.f272R = z7;
        this.f273S = kVar2;
        this.f274T = new e(0, this);
    }

    @Override // q.C1839v
    public final void J0(i iVar) {
        G0.a aVar = this.f272R ? G0.a.f2595k : G0.a.f2596l;
        InterfaceC1443v[] interfaceC1443vArr = s.a;
        t tVar = q.f2123B;
        InterfaceC1443v interfaceC1443v = s.a[22];
        tVar.a(iVar, aVar);
    }
}
