package Q3;

import P3.AbstractC0568i;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class i extends AbstractC0568i implements Serializable {

    /* renamed from: l, reason: collision with root package name */
    public static final i f7992l;

    /* renamed from: k, reason: collision with root package name */
    public final g f7993k;

    static {
        g gVar = g.f7976x;
        f7992l = new i(g.f7976x);
    }

    public i(g gVar) {
        l.f("backing", gVar);
        this.f7993k = gVar;
    }

    @Override // P3.AbstractC0568i
    public final int a() {
        return this.f7993k.f7985s;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        return this.f7993k.a(obj) >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        l.f("elements", collection);
        this.f7993k.c();
        return super.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f7993k.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f7993k.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f7993k.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        g gVar = this.f7993k;
        gVar.getClass();
        return new d(gVar, 1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        g gVar = this.f7993k;
        gVar.c();
        int iK = gVar.k(obj);
        if (iK < 0) {
            return false;
        }
        gVar.q(iK);
        return true;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        l.f("elements", collection);
        this.f7993k.c();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        l.f("elements", collection);
        this.f7993k.c();
        return super.retainAll(collection);
    }
}
