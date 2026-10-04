package s;

import O.C0486d;
import O.InterfaceC0501k0;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* renamed from: s.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1912f extends kotlin.jvm.internal.m implements e4.k {

    /* renamed from: m, reason: collision with root package name */
    public static final C1912f f15298m = new C1912f(1, 0);

    /* renamed from: n, reason: collision with root package name */
    public static final C1912f f15299n = new C1912f(1, 1);

    /* renamed from: o, reason: collision with root package name */
    public static final C1912f f15300o = new C1912f(1, 2);

    /* renamed from: p, reason: collision with root package name */
    public static final C1912f f15301p = new C1912f(1, 3);

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f15302l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1912f(int i7, int i8) {
        super(i7);
        this.f15302l = i8;
    }

    @Override // e4.k
    public final Object invoke(Object obj) {
        switch (this.f15302l) {
            case 0:
                InterfaceC0501k0 interfaceC0501k0 = (InterfaceC0501k0) obj;
                O.S0 s02 = AndroidCompositionLocals_androidKt.f10669b;
                interfaceC0501k0.getClass();
                if (((Context) C0486d.L(interfaceC0501k0, s02)).getPackageManager().hasSystemFeature("android.software.leanback")) {
                    return AbstractC1916h.f15306b;
                }
                InterfaceC1910e.a.getClass();
                return C1908d.f15281c;
            case 1:
                return Boolean.TRUE;
            case 2:
                return Boolean.valueOf(!(((s0.r) obj).f15476i == 2));
            default:
                ((Number) obj).floatValue();
                return O3.C.a;
        }
    }
}
