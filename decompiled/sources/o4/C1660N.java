package o4;

import io.ktor.http.ContentDisposition;
import l4.InterfaceC1429h;
import l4.InterfaceC1432k;
import l4.InterfaceC1433l;
import x4.C2263I;

/* renamed from: o4.N, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1660N extends C1681g0 implements InterfaceC1433l {

    /* renamed from: A, reason: collision with root package name */
    public final Object f13650A;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1660N(AbstractC1654H abstractC1654H, String str, String str2, Object obj) {
        super(abstractC1654H, str, str2, obj);
        kotlin.jvm.internal.l.f("container", abstractC1654H);
        kotlin.jvm.internal.l.f(ContentDisposition.Parameters.Name, str);
        kotlin.jvm.internal.l.f("signature", str2);
        this.f13650A = z1.c.B(O3.j.f7525k, new H4.u(19, this));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [O3.i, java.lang.Object] */
    @Override // l4.InterfaceC1434m
    public final InterfaceC1429h getSetter() {
        return (C1659M) this.f13650A.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [O3.i, java.lang.Object] */
    @Override // l4.InterfaceC1433l
    public final void set(Object obj, Object obj2) {
        ((C1659M) this.f13650A.getValue()).call(obj, obj2);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [O3.i, java.lang.Object] */
    @Override // l4.InterfaceC1433l, l4.InterfaceC1434m
    public final InterfaceC1432k getSetter() {
        return (C1659M) this.f13650A.getValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1660N(AbstractC1654H abstractC1654H, C2263I c2263i) {
        super(abstractC1654H, c2263i);
        kotlin.jvm.internal.l.f("container", abstractC1654H);
        kotlin.jvm.internal.l.f("descriptor", c2263i);
        this.f13650A = z1.c.B(O3.j.f7525k, new H4.u(19, this));
    }
}
