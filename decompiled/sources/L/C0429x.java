package L;

import io.ktor.util.GzipHeaderFlags;
import l4.InterfaceC1443v;

/* renamed from: L.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0429x extends kotlin.jvm.internal.m implements e4.k {

    /* renamed from: m, reason: collision with root package name */
    public static final C0429x f5911m = new C0429x(1, 0);

    /* renamed from: n, reason: collision with root package name */
    public static final C0429x f5912n = new C0429x(1, 1);

    /* renamed from: o, reason: collision with root package name */
    public static final C0429x f5913o = new C0429x(1, 2);

    /* renamed from: p, reason: collision with root package name */
    public static final C0429x f5914p = new C0429x(1, 3);

    /* renamed from: q, reason: collision with root package name */
    public static final C0429x f5915q = new C0429x(1, 4);

    /* renamed from: r, reason: collision with root package name */
    public static final C0429x f5916r = new C0429x(1, 5);

    /* renamed from: s, reason: collision with root package name */
    public static final C0429x f5917s = new C0429x(1, 6);

    /* renamed from: t, reason: collision with root package name */
    public static final C0429x f5918t = new C0429x(1, 7);

    /* renamed from: u, reason: collision with root package name */
    public static final C0429x f5919u = new C0429x(1, 8);

    /* renamed from: v, reason: collision with root package name */
    public static final C0429x f5920v = new C0429x(1, 9);

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f5921l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0429x(int i7, int i8) {
        super(i7);
        this.f5921l = i8;
    }

    @Override // e4.k
    public final Object invoke(Object obj) {
        O3.C c2 = O3.C.a;
        switch (this.f5921l) {
            case 0:
                F0.s.e((F0.i) obj, 0);
                break;
            case 1:
                F0.s.e((F0.i) obj, 1);
                break;
            case 2:
                break;
            case 3:
                F0.s.f((F0.i) obj);
                break;
            case GzipHeaderFlags.EXTRA /* 4 */:
                break;
            case 5:
                InterfaceC1443v[] interfaceC1443vArr = F0.s.a;
                ((F0.i) obj).j(F0.q.f2145r, c2);
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            default:
                InterfaceC1443v[] interfaceC1443vArr2 = F0.s.a;
                F0.t tVar = F0.q.f2139l;
                InterfaceC1443v interfaceC1443v = F0.s.a[5];
                tVar.a((F0.i) obj, Boolean.TRUE);
                break;
        }
        return c2;
    }
}
