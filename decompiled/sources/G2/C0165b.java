package G2;

import android.content.Context;
import android.content.ContextWrapper;
import io.ktor.util.GzipHeaderFlags;

/* renamed from: G2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0165b extends kotlin.jvm.internal.m implements e4.k {

    /* renamed from: m, reason: collision with root package name */
    public static final C0165b f2684m = new C0165b(1, 0);

    /* renamed from: n, reason: collision with root package name */
    public static final C0165b f2685n = new C0165b(1, 1);

    /* renamed from: o, reason: collision with root package name */
    public static final C0165b f2686o = new C0165b(1, 2);

    /* renamed from: p, reason: collision with root package name */
    public static final C0165b f2687p = new C0165b(1, 3);

    /* renamed from: q, reason: collision with root package name */
    public static final C0165b f2688q = new C0165b(1, 4);

    /* renamed from: r, reason: collision with root package name */
    public static final C0165b f2689r = new C0165b(1, 5);

    /* renamed from: s, reason: collision with root package name */
    public static final C0165b f2690s = new C0165b(1, 6);

    /* renamed from: t, reason: collision with root package name */
    public static final C0165b f2691t = new C0165b(1, 7);

    /* renamed from: u, reason: collision with root package name */
    public static final C0165b f2692u = new C0165b(1, 8);

    /* renamed from: v, reason: collision with root package name */
    public static final C0165b f2693v = new C0165b(1, 9);

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f2694l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0165b(int i7, int i8) {
        super(i7);
        this.f2694l = i8;
    }

    @Override // e4.k
    public final Object invoke(Object obj) {
        switch (this.f2694l) {
            case 0:
                Context context = (Context) obj;
                kotlin.jvm.internal.l.f("it", context);
                if (context instanceof ContextWrapper) {
                    break;
                }
                break;
            case 1:
                Context context2 = (Context) obj;
                kotlin.jvm.internal.l.f("it", context2);
                if (context2 instanceof ContextWrapper) {
                    break;
                }
                break;
            case 2:
                I i7 = (I) obj;
                kotlin.jvm.internal.l.f("$this$navOptions", i7);
                i7.f2671c = true;
                break;
            case 3:
                y yVar = (y) obj;
                kotlin.jvm.internal.l.f("destination", yVar);
                B b4 = yVar.f2758l;
                if (b4 == null || b4.f2622t != yVar.f2762p) {
                }
                break;
            case GzipHeaderFlags.EXTRA /* 4 */:
                y yVar2 = (y) obj;
                kotlin.jvm.internal.l.f("destination", yVar2);
                B b7 = yVar2.f2758l;
                if (b7 == null || b7.f2622t != yVar2.f2762p) {
                }
                break;
            case 5:
                y yVar3 = (y) obj;
                kotlin.jvm.internal.l.f("it", yVar3);
                break;
            case 6:
                y yVar4 = (y) obj;
                kotlin.jvm.internal.l.f("it", yVar4);
                break;
            case 7:
                y yVar5 = (y) obj;
                kotlin.jvm.internal.l.f("it", yVar5);
                if (yVar5 instanceof B) {
                    B b8 = (B) yVar5;
                    break;
                }
                break;
            case 8:
                kotlin.jvm.internal.l.f("$this$null", (Q) obj);
                break;
            default:
                I i8 = (I) obj;
                kotlin.jvm.internal.l.f("$this$navOptions", i8);
                i8.f2670b = true;
                break;
        }
        return O3.C.a;
    }
}
