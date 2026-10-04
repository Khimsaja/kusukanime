package E0;

import O3.C;

/* loaded from: classes.dex */
public final class d extends kotlin.jvm.internal.m implements e4.k {

    /* renamed from: m, reason: collision with root package name */
    public static final d f1807m = new d(1, 0);

    /* renamed from: n, reason: collision with root package name */
    public static final d f1808n = new d(1, 1);

    /* renamed from: o, reason: collision with root package name */
    public static final d f1809o = new d(1, 2);

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f1810l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i7, int i8) {
        super(i7);
        this.f1810l = i8;
    }

    @Override // e4.k
    public final Object invoke(Object obj) {
        switch (this.f1810l) {
            case 0:
                ((Number) obj).longValue();
                return C.a;
            case 1:
                return Integer.valueOf(((m) obj).f1827b);
            default:
                return Integer.valueOf(((m) obj).f1828c.a());
        }
    }
}
