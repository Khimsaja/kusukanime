package n5;

import java.util.ArrayList;
import java.util.Map;
import u4.InterfaceC2102h;

/* loaded from: classes.dex */
public final class H extends N {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f13360c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f13361d;

    public /* synthetic */ H(int i7, Object obj) {
        this.f13360c = i7;
        this.f13361d = obj;
    }

    @Override // n5.T
    public boolean a() {
        switch (this.f13360c) {
            case 1:
                return false;
            default:
                return super.a();
        }
    }

    @Override // n5.T
    public boolean e() {
        switch (this.f13360c) {
            case 1:
                return ((Map) this.f13361d).isEmpty();
            default:
                return super.e();
        }
    }

    @Override // n5.N
    public final Q g(M m7) {
        switch (this.f13360c) {
            case 0:
                kotlin.jvm.internal.l.f("key", m7);
                if (!((ArrayList) this.f13361d).contains(m7)) {
                    return null;
                }
                InterfaceC2102h interfaceC2102hF = m7.f();
                kotlin.jvm.internal.l.d("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.TypeParameterDescriptor", interfaceC2102hF);
                return Y.j((u4.Q) interfaceC2102hF);
            default:
                kotlin.jvm.internal.l.f("key", m7);
                return (Q) ((Map) this.f13361d).get(m7);
        }
    }
}
