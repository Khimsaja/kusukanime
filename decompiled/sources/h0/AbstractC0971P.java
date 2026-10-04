package h0;

import H1.e0;
import android.graphics.Paint;
import android.graphics.Shader;

/* renamed from: h0.P, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0971P extends AbstractC0993p {
    public Shader a;

    /* renamed from: b, reason: collision with root package name */
    public long f11800b = 9205357640488583168L;

    @Override // h0.AbstractC0993p
    public final void a(float f5, long j7, e0 e0Var) {
        Shader shaderB = this.a;
        if (shaderB == null || !g0.f.a(this.f11800b, j7)) {
            if (g0.f.e(j7)) {
                shaderB = null;
                this.a = null;
                this.f11800b = 9205357640488583168L;
            } else {
                shaderB = b(j7);
                this.a = shaderB;
                this.f11800b = j7;
            }
        }
        long jC = AbstractC0968M.c(((Paint) e0Var.f3452b).getColor());
        long j8 = C0998u.f11829b;
        if (!C0998u.c(jC, j8)) {
            e0Var.f(j8);
        }
        if (!kotlin.jvm.internal.l.a((Shader) e0Var.f3453c, shaderB)) {
            e0Var.i(shaderB);
        }
        if (((Paint) e0Var.f3452b).getAlpha() / 255.0f == f5) {
            return;
        }
        e0Var.d(f5);
    }

    public abstract Shader b(long j7);
}
