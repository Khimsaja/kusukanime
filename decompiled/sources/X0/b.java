package X0;

import O3.C;
import io.ktor.util.GzipHeaderFlags;
import l4.InterfaceC1443v;

/* loaded from: classes.dex */
public final class b extends kotlin.jvm.internal.m implements e4.k {

    /* renamed from: m, reason: collision with root package name */
    public static final b f9694m = new b(1, 0);

    /* renamed from: n, reason: collision with root package name */
    public static final b f9695n = new b(1, 1);

    /* renamed from: o, reason: collision with root package name */
    public static final b f9696o = new b(1, 2);

    /* renamed from: p, reason: collision with root package name */
    public static final b f9697p = new b(1, 3);

    /* renamed from: q, reason: collision with root package name */
    public static final b f9698q = new b(1, 4);

    /* renamed from: r, reason: collision with root package name */
    public static final b f9699r = new b(1, 5);

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f9700l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i7, int i8) {
        super(i7);
        this.f9700l = i8;
    }

    @Override // e4.k
    public final Object invoke(Object obj) {
        C c2 = C.a;
        switch (this.f9700l) {
            case 0:
                InterfaceC1443v[] interfaceC1443vArr = F0.s.a;
                ((F0.i) obj).j(F0.q.f2145r, c2);
                break;
            case 1:
                ((Number) obj).longValue();
                break;
            case 2:
                break;
            case 3:
                InterfaceC1443v[] interfaceC1443vArr2 = F0.s.a;
                ((F0.i) obj).j(F0.q.f2144q, c2);
                break;
            case GzipHeaderFlags.EXTRA /* 4 */:
                break;
            default:
                v vVar = (v) obj;
                if (vVar.isAttachedToWindow()) {
                    vVar.o();
                    break;
                }
                break;
        }
        return c2;
    }
}
