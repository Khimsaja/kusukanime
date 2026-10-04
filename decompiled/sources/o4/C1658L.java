package o4;

import io.ktor.http.ContentDisposition;
import l4.InterfaceC1429h;
import l4.InterfaceC1430i;
import l4.InterfaceC1431j;
import x4.C2263I;

/* renamed from: o4.L, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1658L extends C1675d0 implements InterfaceC1431j {

    /* renamed from: z, reason: collision with root package name */
    public final Object f13648z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1658L(AbstractC1654H abstractC1654H, C2263I c2263i) {
        super(abstractC1654H, c2263i);
        kotlin.jvm.internal.l.f("container", abstractC1654H);
        kotlin.jvm.internal.l.f("descriptor", c2263i);
        this.f13648z = z1.c.B(O3.j.f7525k, new H4.u(18, this));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [O3.i, java.lang.Object] */
    @Override // l4.InterfaceC1434m
    public final InterfaceC1429h getSetter() {
        return (C1657K) this.f13648z.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [O3.i, java.lang.Object] */
    @Override // l4.InterfaceC1431j, l4.InterfaceC1434m
    public final InterfaceC1430i getSetter() {
        return (C1657K) this.f13648z.getValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1658L(AbstractC1654H abstractC1654H, String str, String str2, Object obj) {
        super(abstractC1654H, str, str2, obj);
        kotlin.jvm.internal.l.f("container", abstractC1654H);
        kotlin.jvm.internal.l.f(ContentDisposition.Parameters.Name, str);
        kotlin.jvm.internal.l.f("signature", str2);
        this.f13648z = z1.c.B(O3.j.f7525k, new H4.u(18, this));
    }
}
