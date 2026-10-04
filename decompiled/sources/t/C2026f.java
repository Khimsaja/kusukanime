package t;

/* renamed from: t.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2026f extends U3.c {

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f15858k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C2027g f15859l;

    /* renamed from: m, reason: collision with root package name */
    public int f15860m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2026f(C2027g c2027g, U3.c cVar) {
        super(cVar);
        this.f15859l = c2027g;
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) {
        this.f15858k = obj;
        this.f15860m |= Integer.MIN_VALUE;
        return C2027g.b(this.f15859l, null, 0.0f, 0.0f, null, this);
    }
}
