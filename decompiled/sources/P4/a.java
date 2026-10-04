package P4;

/* loaded from: classes.dex */
public final class a implements e4.n {

    /* renamed from: l, reason: collision with root package name */
    public static final a f7781l = new a(0);

    /* renamed from: m, reason: collision with root package name */
    public static final a f7782m = new a(1);

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f7783k;

    public /* synthetic */ a(int i7) {
        this.f7783k = i7;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        c cVar = (c) obj;
        o oVar = (o) obj2;
        switch (this.f7783k) {
            case 0:
                kotlin.jvm.internal.l.f("$this$loadConstantFromProperty", cVar);
                kotlin.jvm.internal.l.f("it", oVar);
                return cVar.f7789c.get(oVar);
            default:
                kotlin.jvm.internal.l.f("$this$loadConstantFromProperty", cVar);
                kotlin.jvm.internal.l.f("it", oVar);
                return cVar.f7788b.get(oVar);
        }
    }
}
