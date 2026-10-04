package o4;

import A4.AbstractC0011d;
import e4.InterfaceC0821a;
import java.lang.reflect.Type;

/* loaded from: classes.dex */
public final class u0 implements InterfaceC0821a {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f13760k;

    /* renamed from: l, reason: collision with root package name */
    public final v0 f13761l;

    public /* synthetic */ u0(v0 v0Var, int i7) {
        this.f13760k = i7;
        this.f13761l = v0Var;
    }

    @Override // e4.InterfaceC0821a
    public final Object invoke() {
        switch (this.f13760k) {
            case 0:
                v0 v0Var = this.f13761l;
                return v0Var.d(v0Var.f13766k);
            default:
                z0 z0Var = this.f13761l.f13768m;
                Type type = z0Var != null ? (Type) z0Var.invoke() : null;
                kotlin.jvm.internal.l.c(type);
                return AbstractC0011d.c(type);
        }
    }
}
