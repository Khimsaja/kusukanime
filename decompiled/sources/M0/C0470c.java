package M0;

import java.util.List;

/* renamed from: M0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0470c extends U3.c {

    /* renamed from: k, reason: collision with root package name */
    public C0471d f6386k;

    /* renamed from: l, reason: collision with root package name */
    public List f6387l;

    /* renamed from: m, reason: collision with root package name */
    public z f6388m;

    /* renamed from: n, reason: collision with root package name */
    public int f6389n;

    /* renamed from: o, reason: collision with root package name */
    public int f6390o;

    /* renamed from: p, reason: collision with root package name */
    public /* synthetic */ Object f6391p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C0471d f6392q;

    /* renamed from: r, reason: collision with root package name */
    public int f6393r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0470c(C0471d c0471d, U3.c cVar) {
        super(cVar);
        this.f6392q = c0471d;
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) {
        this.f6391p = obj;
        this.f6393r |= Integer.MIN_VALUE;
        return this.f6392q.a(this);
    }
}
