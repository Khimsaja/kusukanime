package L5;

import D.C0070p;

/* loaded from: classes.dex */
public final class l extends U3.c {

    /* renamed from: k, reason: collision with root package name */
    public C0070p f6180k;

    /* renamed from: l, reason: collision with root package name */
    public Object f6181l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f6182m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C0070p f6183n;

    /* renamed from: o, reason: collision with root package name */
    public int f6184o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(C0070p c0070p, S3.c cVar) {
        super(cVar);
        this.f6183n = c0070p;
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) {
        this.f6182m = obj;
        this.f6184o |= Integer.MIN_VALUE;
        return this.f6183n.emit(null, this);
    }
}
