package W0;

import D6.r;
import O3.C;
import androidx.lifecycle.InterfaceC0694v;
import io.ktor.util.GzipHeaderFlags;
import y0.C2349D;

/* loaded from: classes.dex */
public final class m extends kotlin.jvm.internal.m implements e4.n {

    /* renamed from: m, reason: collision with root package name */
    public static final m f9566m = new m(2, 0);

    /* renamed from: n, reason: collision with root package name */
    public static final m f9567n = new m(2, 1);

    /* renamed from: o, reason: collision with root package name */
    public static final m f9568o = new m(2, 2);

    /* renamed from: p, reason: collision with root package name */
    public static final m f9569p = new m(2, 3);

    /* renamed from: q, reason: collision with root package name */
    public static final m f9570q = new m(2, 4);

    /* renamed from: r, reason: collision with root package name */
    public static final m f9571r = new m(2, 5);

    /* renamed from: s, reason: collision with root package name */
    public static final m f9572s = new m(2, 6);

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f9573l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(int i7, int i8) {
        super(i7);
        this.f9573l = i8;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        int i7;
        switch (this.f9573l) {
            case 0:
                androidx.compose.ui.viewinterop.a.c((C2349D) obj).setUpdateBlock((e4.k) obj2);
                return C.a;
            case 1:
                androidx.compose.ui.viewinterop.a.c((C2349D) obj).setReleaseBlock((e4.k) obj2);
                return C.a;
            case 2:
                androidx.compose.ui.viewinterop.a.c((C2349D) obj).setModifier((a0.q) obj2);
                return C.a;
            case 3:
                androidx.compose.ui.viewinterop.a.c((C2349D) obj).setDensity((T0.b) obj2);
                return C.a;
            case GzipHeaderFlags.EXTRA /* 4 */:
                androidx.compose.ui.viewinterop.a.c((C2349D) obj).setLifecycleOwner((InterfaceC0694v) obj2);
                return C.a;
            case 5:
                androidx.compose.ui.viewinterop.a.c((C2349D) obj).setSavedStateRegistryOwner((L2.f) obj2);
                return C.a;
            default:
                q qVarC = androidx.compose.ui.viewinterop.a.c((C2349D) obj);
                int iOrdinal = ((T0.k) obj2).ordinal();
                if (iOrdinal != 0) {
                    i7 = 1;
                    if (iOrdinal != 1) {
                        throw new r();
                    }
                } else {
                    i7 = 0;
                }
                qVarC.setLayoutDirection(i7);
                return C.a;
        }
    }
}
