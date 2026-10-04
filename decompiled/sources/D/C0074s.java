package D;

/* renamed from: D.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0074s extends kotlin.jvm.internal.m implements e4.k {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f1284l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ H.S f1285m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0074s(H.S s7, int i7) {
        super(1);
        this.f1284l = i7;
        this.f1285m = s7;
    }

    @Override // e4.k
    public final Object invoke(Object obj) {
        switch (this.f1284l) {
            case 0:
                return new r(0, this.f1285m);
            default:
                long j7 = ((g0.c) obj).a;
                this.f1285m.o();
                return O3.C.a;
        }
    }
}
