package s;

import u.C2063b;

/* loaded from: classes.dex */
public final class L extends U3.c {

    /* renamed from: k, reason: collision with root package name */
    public P f15156k;

    /* renamed from: l, reason: collision with root package name */
    public C1941u f15157l;

    /* renamed from: m, reason: collision with root package name */
    public C2063b f15158m;

    /* renamed from: n, reason: collision with root package name */
    public /* synthetic */ Object f15159n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ P f15160o;

    /* renamed from: p, reason: collision with root package name */
    public int f15161p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L(P p7, U3.c cVar) {
        super(cVar);
        this.f15160o = p7;
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) {
        this.f15159n = obj;
        this.f15161p |= Integer.MIN_VALUE;
        return P.K0(this.f15160o, null, this);
    }
}
