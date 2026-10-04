package n0;

import b1.AbstractC0703b;
import f4.InterfaceC0881a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: n0.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1559z extends AbstractC1531B implements Iterable, InterfaceC0881a {

    /* renamed from: k, reason: collision with root package name */
    public final List f13224k;

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f13225l;

    public C1559z(List list, ArrayList arrayList) {
        this.f13224k = list;
        this.f13225l = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C1559z)) {
            return false;
        }
        C1559z c1559z = (C1559z) obj;
        return kotlin.jvm.internal.l.a(this.f13224k, c1559z.f13224k) && this.f13225l.equals(c1559z.f13225l);
    }

    public final int hashCode() {
        return this.f13225l.hashCode() + ((this.f13224k.hashCode() + AbstractC0703b.b(0.0f, AbstractC0703b.b(0.0f, AbstractC0703b.b(1.0f, AbstractC0703b.b(1.0f, AbstractC0703b.b(0.0f, AbstractC0703b.b(0.0f, Float.hashCode(0.0f) * 31, 31), 31), 31), 31), 31), 31)) * 31);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new F5.i(this);
    }
}
