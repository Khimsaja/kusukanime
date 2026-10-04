package v4;

import H4.u;
import java.util.Map;
import n5.AbstractC1586x;
import r4.AbstractC1880i;
import u4.M;

/* loaded from: classes.dex */
public final class j implements InterfaceC2154b {
    public final AbstractC1880i a;

    /* renamed from: b, reason: collision with root package name */
    public final W4.c f16656b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f16657c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f16658d;

    public j(AbstractC1880i abstractC1880i, W4.c cVar, Map map) {
        kotlin.jvm.internal.l.f("builtIns", abstractC1880i);
        kotlin.jvm.internal.l.f("fqName", cVar);
        this.a = abstractC1880i;
        this.f16656b = cVar;
        this.f16657c = map;
        this.f16658d = z1.c.B(O3.j.f7525k, new u(28, this));
    }

    @Override // v4.InterfaceC2154b
    public final W4.c a() {
        return this.f16656b;
    }

    @Override // v4.InterfaceC2154b
    public final Map b() {
        return this.f16657c;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [O3.i, java.lang.Object] */
    @Override // v4.InterfaceC2154b
    public final AbstractC1586x getType() {
        Object value = this.f16658d.getValue();
        kotlin.jvm.internal.l.e("getValue(...)", value);
        return (AbstractC1586x) value;
    }

    @Override // v4.InterfaceC2154b
    public final M l() {
        return M.f16295i;
    }
}
