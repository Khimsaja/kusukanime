package s;

/* renamed from: s.x0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1948x0 extends U3.c {

    /* renamed from: k, reason: collision with root package name */
    public kotlin.jvm.internal.w f15401k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f15402l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ D0 f15403m;

    /* renamed from: n, reason: collision with root package name */
    public int f15404n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1948x0(D0 d02, U3.c cVar) {
        super(cVar);
        this.f15403m = d02;
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) {
        this.f15402l = obj;
        this.f15404n |= Integer.MIN_VALUE;
        return this.f15403m.b(0L, this);
    }
}
