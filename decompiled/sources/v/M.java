package v;

import O.C0486d;
import O.C0502l;
import O.C0510p;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import io.ktor.util.GzipHeaderFlags;
import java.util.WeakHashMap;
import p.C1724K;

/* loaded from: classes.dex */
public final class M implements InterfaceC2126e {

    /* renamed from: b, reason: collision with root package name */
    public static final M f16399b = new M(0);
    public final /* synthetic */ int a;

    public /* synthetic */ M(int i7) {
        this.a = i7;
    }

    public static final C2122a c(int i7, String str) {
        WeakHashMap weakHashMap = n0.f16470v;
        return new C2122a(i7, str);
    }

    public static final l0 d(int i7, String str) {
        WeakHashMap weakHashMap = n0.f16470v;
        return new l0(new T(0, 0, 0, 0), str);
    }

    public static n0 e(C0510p c0510p) {
        n0 n0Var;
        View view = (View) c0510p.k(AndroidCompositionLocals_androidKt.f10673f);
        WeakHashMap weakHashMap = n0.f16470v;
        synchronized (weakHashMap) {
            try {
                Object n0Var2 = weakHashMap.get(view);
                if (n0Var2 == null) {
                    n0Var2 = new n0(view);
                    weakHashMap.put(view, n0Var2);
                }
                n0Var = (n0) n0Var2;
            } catch (Throwable th) {
                throw th;
            }
        }
        boolean zH = c0510p.h(n0Var) | c0510p.h(view);
        Object objH = c0510p.H();
        if (zH || objH == C0502l.a) {
            objH = new C1724K(20, n0Var, view);
            c0510p.b0(objH);
        }
        C0486d.c(n0Var, (e4.k) objH, c0510p);
        return n0Var;
    }

    @Override // v.InterfaceC2126e
    public void b(T0.b bVar, int i7, int[] iArr, T0.k kVar, int[] iArr2) {
        switch (this.a) {
            case 1:
                AbstractC2130i.b(iArr, iArr2, false);
                break;
            case 2:
                AbstractC2130i.c(i7, iArr, iArr2, false);
                break;
            case 3:
                if (kVar != T0.k.f8844k) {
                    AbstractC2130i.b(iArr, iArr2, true);
                    break;
                } else {
                    AbstractC2130i.c(i7, iArr, iArr2, false);
                    break;
                }
            default:
                if (kVar != T0.k.f8844k) {
                    AbstractC2130i.c(i7, iArr, iArr2, true);
                    break;
                } else {
                    AbstractC2130i.b(iArr, iArr2, false);
                    break;
                }
        }
    }

    public String toString() {
        switch (this.a) {
            case 1:
                return "AbsoluteArrangement#Left";
            case 2:
                return "AbsoluteArrangement#Right";
            case 3:
                return "Arrangement#End";
            case GzipHeaderFlags.EXTRA /* 4 */:
                return "Arrangement#Start";
            default:
                return super.toString();
        }
    }
}
