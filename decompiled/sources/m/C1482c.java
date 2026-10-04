package m;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* renamed from: m.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1482c implements Iterator, Map.Entry {

    /* renamed from: k, reason: collision with root package name */
    public int f12883k;

    /* renamed from: l, reason: collision with root package name */
    public int f12884l = -1;

    /* renamed from: m, reason: collision with root package name */
    public boolean f12885m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C1484e f12886n;

    public C1482c(C1484e c1484e) {
        this.f12886n = c1484e;
        this.f12883k = c1484e.f12870m - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!this.f12885m) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        int i7 = this.f12884l;
        C1484e c1484e = this.f12886n;
        return kotlin.jvm.internal.l.a(key, c1484e.e(i7)) && kotlin.jvm.internal.l.a(entry.getValue(), c1484e.h(this.f12884l));
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (this.f12885m) {
            return this.f12886n.e(this.f12884l);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.f12885m) {
            return this.f12886n.h(this.f12884l);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f12884l < this.f12883k;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (!this.f12885m) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        int i7 = this.f12884l;
        C1484e c1484e = this.f12886n;
        Object objE = c1484e.e(i7);
        Object objH = c1484e.h(this.f12884l);
        return (objE == null ? 0 : objE.hashCode()) ^ (objH != null ? objH.hashCode() : 0);
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f12884l++;
        this.f12885m = true;
        return this;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f12885m) {
            throw new IllegalStateException();
        }
        this.f12886n.f(this.f12884l);
        this.f12884l--;
        this.f12883k--;
        this.f12885m = false;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (this.f12885m) {
            return this.f12886n.g(this.f12884l, obj);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
