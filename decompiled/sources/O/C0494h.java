package O;

/* renamed from: O.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0494h extends kotlin.jvm.internal.m implements e4.n {

    /* renamed from: m, reason: collision with root package name */
    public static final C0494h f7076m = new C0494h(2, 0);

    /* renamed from: n, reason: collision with root package name */
    public static final C0494h f7077n = new C0494h(2, 1);

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f7078l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0494h(int i7, int i8) {
        super(i7);
        this.f7078l = i8;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f7078l) {
            case 0:
                C0510p c0510p = (C0510p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0510p.y()) {
                    c0510p.M();
                }
                break;
            default:
                C0510p c0510p2 = (C0510p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0510p2.y()) {
                    c0510p2.M();
                }
                break;
        }
        return O3.C.a;
    }
}
