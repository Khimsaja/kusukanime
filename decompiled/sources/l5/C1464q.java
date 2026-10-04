package l5;

import P3.A;
import R4.F;
import R4.a0;
import R4.h0;
import e4.InterfaceC0821a;
import io.ktor.http.ContentDisposition;
import j5.C1354i;
import j5.C1356k;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import l4.AbstractC1420H;
import u4.InterfaceC2088D;
import u4.InterfaceC2102h;
import w4.InterfaceC2213c;
import x4.AbstractC2257C;

/* renamed from: l5.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1464q extends AbstractC1463p {

    /* renamed from: g, reason: collision with root package name */
    public final InterfaceC2088D f12819g;

    /* renamed from: h, reason: collision with root package name */
    public final String f12820h;

    /* renamed from: i, reason: collision with root package name */
    public final W4.c f12821i;

    public C1464q(InterfaceC2088D interfaceC2088D, F f5, T4.g gVar, T4.a aVar, P4.g gVar2, C1354i c1354i, String str, InterfaceC0821a interfaceC0821a) {
        kotlin.jvm.internal.l.f("packageDescriptor", interfaceC2088D);
        kotlin.jvm.internal.l.f("proto", f5);
        kotlin.jvm.internal.l.f("nameResolver", gVar);
        kotlin.jvm.internal.l.f("metadataVersion", aVar);
        kotlin.jvm.internal.l.f("components", c1354i);
        kotlin.jvm.internal.l.f("debugName", str);
        a0 a0Var = f5.f8159q;
        kotlin.jvm.internal.l.e("getTypeTable(...)", a0Var);
        T4.i iVar = new T4.i(a0Var);
        T4.k kVar = T4.k.f9115b;
        h0 h0Var = f5.f8160r;
        kotlin.jvm.internal.l.e("getVersionRequirementTable(...)", h0Var);
        C1356k c1356kA = c1354i.a(interfaceC2088D, gVar, iVar, AbstractC1420H.q(h0Var), aVar, gVar2);
        List list = f5.f8156n;
        kotlin.jvm.internal.l.e("getFunctionList(...)", list);
        List list2 = f5.f8157o;
        kotlin.jvm.internal.l.e("getPropertyList(...)", list2);
        List list3 = f5.f8158p;
        kotlin.jvm.internal.l.e("getTypeAliasList(...)", list3);
        super(c1356kA, list, list2, list3, interfaceC0821a);
        this.f12819g = interfaceC2088D;
        this.f12820h = str;
        this.f12821i = ((AbstractC2257C) interfaceC2088D).f17354o;
    }

    @Override // l5.AbstractC1463p, g5.p, g5.q
    public final InterfaceC2102h b(W4.e eVar, C4.a aVar) {
        kotlin.jvm.internal.l.f(ContentDisposition.Parameters.Name, eVar);
        kotlin.jvm.internal.l.f("location", aVar);
        q0.c.L(this.f12815b.a.f12421i, aVar, this.f12819g, eVar);
        return super.b(eVar, aVar);
    }

    @Override // g5.p, g5.q
    public final Collection e(g5.f fVar, e4.k kVar) {
        kotlin.jvm.internal.l.f("kindFilter", fVar);
        C4.c cVar = C4.c.f959k;
        List listI = i(fVar, kVar);
        Iterable iterable = this.f12815b.a.f12423k;
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            P3.v.e0(arrayList, ((InterfaceC2213c) it.next()).a(this.f12821i));
        }
        return P3.q.G0(listI, arrayList);
    }

    @Override // l5.AbstractC1463p
    public final W4.b l(W4.e eVar) {
        kotlin.jvm.internal.l.f(ContentDisposition.Parameters.Name, eVar);
        return new W4.b(this.f12821i, eVar);
    }

    @Override // l5.AbstractC1463p
    public final Set n() {
        return A.f7737k;
    }

    @Override // l5.AbstractC1463p
    public final Set o() {
        return A.f7737k;
    }

    @Override // l5.AbstractC1463p
    public final Set p() {
        return A.f7737k;
    }

    @Override // l5.AbstractC1463p
    public final boolean q(W4.e eVar) {
        kotlin.jvm.internal.l.f(ContentDisposition.Parameters.Name, eVar);
        if (super.q(eVar)) {
            return true;
        }
        Iterable iterable = this.f12815b.a.f12423k;
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return false;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            if (((InterfaceC2213c) it.next()).c(this.f12821i, eVar)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return this.f12820h;
    }

    @Override // l5.AbstractC1463p
    public final void h(ArrayList arrayList, e4.k kVar) {
    }
}
