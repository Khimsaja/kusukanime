package r5;

import e4.k;
import kotlin.jvm.internal.l;
import n5.a0;
import u4.InterfaceC2102h;
import u4.P;
import u4.Q;

/* renamed from: r5.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1892a implements k {

    /* renamed from: l, reason: collision with root package name */
    public static final C1892a f15048l = new C1892a(0);

    /* renamed from: m, reason: collision with root package name */
    public static final C1892a f15049m = new C1892a(1);

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f15050k;

    public /* synthetic */ C1892a(int i7) {
        this.f15050k = i7;
    }

    @Override // e4.k
    public final Object invoke(Object obj) {
        a0 a0Var = (a0) obj;
        switch (this.f15050k) {
            case 0:
                l.f("it", a0Var);
                InterfaceC2102h interfaceC2102hF = a0Var.t0().f();
                return Boolean.valueOf(interfaceC2102hF != null && (interfaceC2102hF instanceof Q) && (((Q) interfaceC2102hF).k() instanceof P));
            default:
                l.f("it", a0Var);
                InterfaceC2102h interfaceC2102hF2 = a0Var.t0().f();
                return Boolean.valueOf(interfaceC2102hF2 != null && ((interfaceC2102hF2 instanceof P) || (interfaceC2102hF2 instanceof Q)));
        }
    }
}
