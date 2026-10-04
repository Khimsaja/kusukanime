package z0;

import O.C0510p;
import android.graphics.Matrix;
import android.view.View;

/* renamed from: z0.i0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2449i0 extends kotlin.jvm.internal.m implements e4.n {

    /* renamed from: m, reason: collision with root package name */
    public static final C2449i0 f18768m = new C2449i0(2, 0);

    /* renamed from: n, reason: collision with root package name */
    public static final C2449i0 f18769n = new C2449i0(2, 1);

    /* renamed from: o, reason: collision with root package name */
    public static final C2449i0 f18770o = new C2449i0(2, 2);

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f18771l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2449i0(int i7, int i8) {
        super(i7);
        this.f18771l = i8;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f18771l) {
            case 0:
                C0510p c0510p = (C0510p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0510p.y()) {
                    c0510p.M();
                }
                break;
            case 1:
                ((InterfaceC2459n0) obj).K((Matrix) obj2);
                break;
            default:
                ((Matrix) obj2).set(((View) obj).getMatrix());
                break;
        }
        return O3.C.a;
    }
}
