package O;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import s.AbstractC1916h;
import s.C1908d;
import s.C1912f;
import s.InterfaceC1910e;

/* renamed from: O.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0526z implements U0 {
    @Override // O.U0
    public final Object a(InterfaceC0501k0 interfaceC0501k0) {
        S0 s02 = AndroidCompositionLocals_androidKt.f10669b;
        interfaceC0501k0.getClass();
        if (((Context) C0486d.L(interfaceC0501k0, s02)).getPackageManager().hasSystemFeature("android.software.leanback")) {
            return AbstractC1916h.f15306b;
        }
        InterfaceC1910e.a.getClass();
        return C1908d.f15281c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0526z)) {
            return false;
        }
        Object obj2 = C1912f.f15298m;
        ((C0526z) obj).getClass();
        return obj2.equals(obj2);
    }

    public final int hashCode() {
        return C1912f.f15298m.hashCode();
    }

    public final String toString() {
        return "ComputedValueHolder(compute=" + C1912f.f15298m + ')';
    }
}
