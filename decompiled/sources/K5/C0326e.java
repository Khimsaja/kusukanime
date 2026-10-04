package K5;

/* renamed from: K5.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0326e extends U3.c {

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f4808k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C0327f f4809l;

    /* renamed from: m, reason: collision with root package name */
    public int f4810m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0326e(C0327f c0327f, S3.c cVar) {
        super(cVar);
        this.f4809l = c0327f;
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) {
        this.f4808k = obj;
        this.f4810m |= Integer.MIN_VALUE;
        return this.f4809l.emit(null, this);
    }
}
