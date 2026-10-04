package o4;

import io.ktor.http.ContentDisposition;
import l4.InterfaceC1438q;
import l4.InterfaceC1439r;
import l4.InterfaceC1440s;
import x4.C2263I;

/* renamed from: o4.d0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1675d0 extends q0 implements InterfaceC1440s {

    /* renamed from: y, reason: collision with root package name */
    public final Object f13701y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1675d0(AbstractC1654H abstractC1654H, C2263I c2263i) {
        super(abstractC1654H, c2263i);
        kotlin.jvm.internal.l.f("container", abstractC1654H);
        kotlin.jvm.internal.l.f("descriptor", c2263i);
        O3.j jVar = O3.j.f7525k;
        this.f13701y = z1.c.B(jVar, new C1671b0(this, 0));
        z1.c.B(jVar, new C1671b0(this, 1));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [O3.i, java.lang.Object] */
    @Override // l4.InterfaceC1440s
    public final Object get() {
        return ((C1673c0) this.f13701y.getValue()).call(new Object[0]);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [O3.i, java.lang.Object] */
    @Override // l4.InterfaceC1443v
    public final InterfaceC1438q getGetter() {
        return (C1673c0) this.f13701y.getValue();
    }

    @Override // e4.InterfaceC0821a
    public final Object invoke() {
        return get();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [O3.i, java.lang.Object] */
    @Override // o4.q0
    public final n0 w() {
        return (C1673c0) this.f13701y.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [O3.i, java.lang.Object] */
    @Override // l4.InterfaceC1443v
    public final InterfaceC1439r getGetter() {
        return (C1673c0) this.f13701y.getValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1675d0(AbstractC1654H abstractC1654H, String str, String str2, Object obj) {
        super(abstractC1654H, str, str2, obj);
        kotlin.jvm.internal.l.f("container", abstractC1654H);
        kotlin.jvm.internal.l.f(ContentDisposition.Parameters.Name, str);
        kotlin.jvm.internal.l.f("signature", str2);
        O3.j jVar = O3.j.f7525k;
        this.f13701y = z1.c.B(jVar, new C1671b0(this, 0));
        z1.c.B(jVar, new C1671b0(this, 1));
    }
}
