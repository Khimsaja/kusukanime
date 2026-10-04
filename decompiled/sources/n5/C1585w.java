package n5;

import f6.AbstractC0905c;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import r4.AbstractC1880i;
import u4.InterfaceC2102h;

/* renamed from: n5.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1585w implements M, q5.h {
    public AbstractC1586x a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashSet f13418b;

    /* renamed from: c, reason: collision with root package name */
    public final int f13419c;

    public C1585w(AbstractCollection abstractCollection) {
        kotlin.jvm.internal.l.f("typesToIntersect", abstractCollection);
        abstractCollection.isEmpty();
        LinkedHashSet linkedHashSet = new LinkedHashSet(abstractCollection);
        this.f13418b = linkedHashSet;
        this.f13419c = linkedHashSet.hashCode();
    }

    public final B b() {
        I.f13362l.getClass();
        return AbstractC1566c.w(I.f13363m, this, P3.y.f7779k, false, AbstractC0905c.g("member scope for intersection type", this.f13418b), new A4.j(21, this));
    }

    public final String c(e4.k kVar) {
        kotlin.jvm.internal.l.f("getProperTypeRelatedToStringify", kVar);
        return P3.q.y0(P3.q.O0(this.f13418b, new C1584v(0, kVar)), " & ", "{", "}", new A4.j(20, kVar), 24);
    }

    @Override // n5.M
    public final AbstractC1880i d() {
        AbstractC1880i abstractC1880iD = ((AbstractC1586x) this.f13418b.iterator().next()).t0().d();
        kotlin.jvm.internal.l.e("getBuiltIns(...)", abstractC1880iD);
        return abstractC1880iD;
    }

    @Override // n5.M
    public final boolean e() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1585w) {
            return kotlin.jvm.internal.l.a(this.f13418b, ((C1585w) obj).f13418b);
        }
        return false;
    }

    @Override // n5.M
    public final InterfaceC2102h f() {
        return null;
    }

    @Override // n5.M
    public final Collection g() {
        return this.f13418b;
    }

    @Override // n5.M
    public final List getParameters() {
        return P3.y.f7779k;
    }

    public final int hashCode() {
        return this.f13419c;
    }

    public final String toString() {
        return c(C1583u.f13414l);
    }
}
