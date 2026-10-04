package i1;

import android.view.View;
import android.view.ViewGroup;
import f4.InterfaceC0881a;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: i1.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1058k implements Iterator, InterfaceC0881a {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f11977k;

    /* renamed from: l, reason: collision with root package name */
    public Iterator f11978l;

    /* renamed from: m, reason: collision with root package name */
    public final Object f11979m;

    public C1058k(O3.t tVar) {
        this.f11977k = 0;
        this.f11979m = new ArrayList();
        this.f11978l = tVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f11977k) {
        }
        return this.f11978l.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f11977k) {
            case 0:
                Object next = this.f11978l.next();
                View view = (View) next;
                ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
                O3.t tVar = viewGroup != null ? new O3.t(6, viewGroup) : null;
                ArrayList arrayList = (ArrayList) this.f11979m;
                if (tVar == null || !tVar.hasNext()) {
                    while (!this.f11978l.hasNext() && !arrayList.isEmpty()) {
                        this.f11978l = (Iterator) P3.q.A0(arrayList);
                        P3.v.i0(arrayList);
                    }
                } else {
                    arrayList.add(this.f11978l);
                    this.f11978l = tVar;
                }
                return next;
            default:
                return ((y5.o) this.f11979m).f18392b.invoke(this.f11978l.next());
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f11977k) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C1058k(y5.o oVar) {
        this.f11977k = 1;
        this.f11979m = oVar;
        this.f11978l = oVar.a.iterator();
    }
}
