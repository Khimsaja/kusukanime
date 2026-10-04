package v;

import androidx.compose.foundation.layout.LayoutWeightElement;

/* loaded from: classes.dex */
public final class h0 implements g0 {
    public static final h0 a = new h0();

    @Override // v.g0
    public final a0.q a(a0.q qVar) {
        if (1.0f > 0.0d) {
            return qVar.k(new LayoutWeightElement(1.0f, true));
        }
        throw new IllegalArgumentException("invalid weight 1.0; must be greater than zero".toString());
    }
}
