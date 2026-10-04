package U;

import P3.AbstractC0569j;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class b extends AbstractC0569j implements R.a {

    /* renamed from: n, reason: collision with root package name */
    public static final b f9121n;

    /* renamed from: k, reason: collision with root package name */
    public final Object f9122k;

    /* renamed from: l, reason: collision with root package name */
    public final Object f9123l;

    /* renamed from: m, reason: collision with root package name */
    public final T.b f9124m;

    static {
        V.b bVar = V.b.a;
        f9121n = new b(bVar, bVar, T.b.f8817m);
    }

    public b(Object obj, Object obj2, T.b bVar) {
        this.f9122k = obj;
        this.f9123l = obj2;
        this.f9124m = bVar;
    }

    @Override // P3.AbstractC0560a
    public final int a() {
        return this.f9124m.c();
    }

    @Override // P3.AbstractC0560a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.f9124m.containsKey(obj);
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new c(this.f9122k, this.f9124m);
    }
}
