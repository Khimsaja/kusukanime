package x4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import u4.AbstractC2115v;
import u4.InterfaceC2091G;

/* renamed from: x4.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2286m implements InterfaceC2091G {
    public final List a;

    /* renamed from: b, reason: collision with root package name */
    public final String f17444b;

    public C2286m(String str, List list) {
        kotlin.jvm.internal.l.f("debugName", str);
        this.a = list;
        this.f17444b = str;
        list.size();
        P3.q.X0(list).size();
    }

    @Override // u4.InterfaceC2091G
    public final boolean a(W4.c cVar) {
        kotlin.jvm.internal.l.f("fqName", cVar);
        List list = this.a;
        if (list != null && list.isEmpty()) {
            return true;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!AbstractC2115v.h((InterfaceC2091G) it.next(), cVar)) {
                return false;
            }
        }
        return true;
    }

    @Override // u4.InterfaceC2091G
    public final void b(W4.c cVar, ArrayList arrayList) {
        kotlin.jvm.internal.l.f("fqName", cVar);
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            AbstractC2115v.b((InterfaceC2091G) it.next(), cVar, arrayList);
        }
    }

    @Override // u4.InterfaceC2091G
    public final Collection h(W4.c cVar, e4.k kVar) {
        kotlin.jvm.internal.l.f("fqName", cVar);
        HashSet hashSet = new HashSet();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            hashSet.addAll(((InterfaceC2091G) it.next()).h(cVar, kVar));
        }
        return hashSet;
    }

    public final String toString() {
        return this.f17444b;
    }
}
