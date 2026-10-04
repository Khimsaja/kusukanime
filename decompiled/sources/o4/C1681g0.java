package o4;

import io.ktor.http.ContentDisposition;
import java.lang.reflect.Member;
import l4.InterfaceC1438q;
import l4.InterfaceC1441t;
import l4.InterfaceC1442u;
import x4.C2263I;

/* renamed from: o4.g0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1681g0 extends q0 implements InterfaceC1442u {

    /* renamed from: y, reason: collision with root package name */
    public final Object f13707y;

    /* renamed from: z, reason: collision with root package name */
    public final Object f13708z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1681g0(AbstractC1654H abstractC1654H, String str, String str2, Object obj) {
        super(abstractC1654H, str, str2, obj);
        kotlin.jvm.internal.l.f("container", abstractC1654H);
        kotlin.jvm.internal.l.f(ContentDisposition.Parameters.Name, str);
        kotlin.jvm.internal.l.f("signature", str2);
        O3.j jVar = O3.j.f7525k;
        this.f13707y = z1.c.B(jVar, new C1677e0(this, 0));
        this.f13708z = z1.c.B(jVar, new C1677e0(this, 1));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [O3.i, java.lang.Object] */
    @Override // l4.InterfaceC1442u
    public final Object get(Object obj) {
        return ((C1679f0) this.f13707y.getValue()).call(obj);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [O3.i, java.lang.Object] */
    @Override // l4.InterfaceC1442u
    public final Object getDelegate(Object obj) {
        return u((Member) this.f13708z.getValue(), obj);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [O3.i, java.lang.Object] */
    @Override // l4.InterfaceC1443v
    public final InterfaceC1438q getGetter() {
        return (C1679f0) this.f13707y.getValue();
    }

    @Override // e4.k
    public final Object invoke(Object obj) {
        return get(obj);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [O3.i, java.lang.Object] */
    @Override // o4.q0
    public final n0 w() {
        return (C1679f0) this.f13707y.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [O3.i, java.lang.Object] */
    @Override // l4.InterfaceC1443v
    public final InterfaceC1441t getGetter() {
        return (C1679f0) this.f13707y.getValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1681g0(AbstractC1654H abstractC1654H, C2263I c2263i) {
        super(abstractC1654H, c2263i);
        kotlin.jvm.internal.l.f("container", abstractC1654H);
        kotlin.jvm.internal.l.f("descriptor", c2263i);
        O3.j jVar = O3.j.f7525k;
        this.f13707y = z1.c.B(jVar, new C1677e0(this, 0));
        this.f13708z = z1.c.B(jVar, new C1677e0(this, 1));
    }
}
