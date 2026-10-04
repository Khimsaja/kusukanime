package G2;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class L extends M {
    @Override // G2.M
    public final Object a(String str, Bundle bundle) {
        Object objC = A6.b.c(bundle, "bundle", str, "key", str);
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type kotlin.Float", objC);
        return (Float) objC;
    }

    @Override // G2.M
    public final String b() {
        return "float";
    }

    @Override // G2.M
    public final Object c(String str) {
        return Float.valueOf(Float.parseFloat(str));
    }

    @Override // G2.M
    public final void e(Bundle bundle, String str, Object obj) {
        float fFloatValue = ((Number) obj).floatValue();
        kotlin.jvm.internal.l.f("key", str);
        bundle.putFloat(str, fFloatValue);
    }
}
