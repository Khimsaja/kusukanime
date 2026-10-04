package h0;

import H1.e0;
import android.graphics.Shader;

/* renamed from: h0.U, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0975U extends AbstractC0993p {
    public final long a;

    public C0975U(long j7) {
        this.a = j7;
    }

    @Override // h0.AbstractC0993p
    public final void a(float f5, long j7, e0 e0Var) {
        e0Var.d(1.0f);
        long jB = this.a;
        if (f5 != 1.0f) {
            jB = C0998u.b(C0998u.d(jB) * f5, jB);
        }
        e0Var.f(jB);
        if (((Shader) e0Var.f3453c) != null) {
            e0Var.i(null);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0975U) {
            return C0998u.c(this.a, ((C0975U) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        int i7 = C0998u.f11835h;
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return "SolidColor(value=" + ((Object) C0998u.i(this.a)) + ')';
    }
}
