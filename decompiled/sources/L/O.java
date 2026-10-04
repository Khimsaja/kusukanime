package L;

import e4.InterfaceC0821a;
import h0.C0998u;
import io.ktor.util.GzipHeaderFlags;
import java.util.UUID;

/* loaded from: classes.dex */
public final class O extends kotlin.jvm.internal.m implements InterfaceC0821a {

    /* renamed from: m, reason: collision with root package name */
    public static final O f5270m = new O(0, 0);

    /* renamed from: n, reason: collision with root package name */
    public static final O f5271n = new O(0, 1);

    /* renamed from: o, reason: collision with root package name */
    public static final O f5272o = new O(0, 2);

    /* renamed from: p, reason: collision with root package name */
    public static final O f5273p = new O(0, 3);

    /* renamed from: q, reason: collision with root package name */
    public static final O f5274q = new O(0, 4);

    /* renamed from: r, reason: collision with root package name */
    public static final O f5275r = new O(0, 5);

    /* renamed from: s, reason: collision with root package name */
    public static final O f5276s = new O(0, 6);

    /* renamed from: t, reason: collision with root package name */
    public static final O f5277t = new O(0, 7);

    /* renamed from: u, reason: collision with root package name */
    public static final O f5278u = new O(0, 8);

    /* renamed from: v, reason: collision with root package name */
    public static final O f5279v = new O(0, 9);

    /* renamed from: w, reason: collision with root package name */
    public static final O f5280w = new O(0, 10);

    /* renamed from: x, reason: collision with root package name */
    public static final O f5281x = new O(0, 11);

    /* renamed from: y, reason: collision with root package name */
    public static final O f5282y = new O(0, 12);

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f5283l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ O(int i7, int i8) {
        super(i7);
        this.f5283l = i8;
    }

    @Override // e4.InterfaceC0821a
    public final Object invoke() {
        switch (this.f5283l) {
            case 0:
                return P.e(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -1, 15);
            case 1:
                return Boolean.TRUE;
            case 2:
                return new C0998u(C0998u.f11829b);
            case 3:
                return Boolean.TRUE;
            case GzipHeaderFlags.EXTRA /* 4 */:
                return new T0.e(48);
            case 5:
                return Boolean.FALSE;
            case 6:
                return UUID.randomUUID();
            case 7:
                return new R1();
            case 8:
                return Boolean.FALSE;
            case 9:
                return new C0370f2(AbstractC0366e2.a, AbstractC0366e2.f5519b, AbstractC0366e2.f5520c, AbstractC0366e2.f5521d, AbstractC0366e2.f5522e);
            case 10:
                return new T0.e(0);
            case 11:
                return N.w.a;
            default:
                return new M2(null, null, null, null, null, null, null, null, null, null, null, null, 32767);
        }
    }
}
