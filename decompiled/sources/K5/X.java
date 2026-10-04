package K5;

import H5.InterfaceC0265f0;

/* loaded from: classes.dex */
public final class X extends U3.c {

    /* renamed from: k, reason: collision with root package name */
    public Y f4784k;

    /* renamed from: l, reason: collision with root package name */
    public InterfaceC0330i f4785l;

    /* renamed from: m, reason: collision with root package name */
    public Z f4786m;

    /* renamed from: n, reason: collision with root package name */
    public InterfaceC0265f0 f4787n;

    /* renamed from: o, reason: collision with root package name */
    public Object f4788o;

    /* renamed from: p, reason: collision with root package name */
    public /* synthetic */ Object f4789p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Y f4790q;

    /* renamed from: r, reason: collision with root package name */
    public int f4791r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X(Y y7, S3.c cVar) {
        super(cVar);
        this.f4790q = y7;
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        this.f4789p = obj;
        this.f4791r |= Integer.MIN_VALUE;
        this.f4790q.collect(null, this);
        return T3.a.f9048k;
    }
}
