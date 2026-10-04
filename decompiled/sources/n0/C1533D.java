package n0;

import b1.AbstractC0703b;
import h0.C0975U;
import java.util.ArrayList;
import p.AbstractC1755i;

/* renamed from: n0.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1533D extends AbstractC1531B {

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f13123k;

    /* renamed from: l, reason: collision with root package name */
    public final C0975U f13124l;

    public C1533D(ArrayList arrayList, C0975U c0975u) {
        this.f13123k = arrayList;
        this.f13124l = c0975u;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1533D.class != obj.getClass()) {
            return false;
        }
        C1533D c1533d = (C1533D) obj;
        return this.f13124l.equals(c1533d.f13124l) && kotlin.jvm.internal.l.a(this.f13123k, c1533d.f13123k);
    }

    public final int hashCode() {
        return Integer.hashCode(0) + AbstractC0703b.b(0.0f, AbstractC0703b.b(1.0f, AbstractC0703b.b(0.0f, AbstractC0703b.b(1.0f, AbstractC1755i.a(2, AbstractC1755i.a(0, AbstractC0703b.b(1.0f, AbstractC0703b.b(1.0f, AbstractC0703b.b(1.0f, (this.f13124l.hashCode() + (this.f13123k.hashCode() * 31)) * 31, 961), 31), 31), 31), 31), 31), 31), 31), 31);
    }
}
