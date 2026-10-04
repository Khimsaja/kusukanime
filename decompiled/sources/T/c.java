package T;

import F5.q;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.B;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public class c extends F5.e {

    /* renamed from: o, reason: collision with root package name */
    public final W.c f8820o;

    /* renamed from: p, reason: collision with root package name */
    public Object f8821p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f8822q;

    /* renamed from: r, reason: collision with root package name */
    public int f8823r;

    public c(W.c cVar, q[] qVarArr) {
        super(cVar.f9506l, qVarArr);
        this.f8820o = cVar;
        this.f8823r = cVar.f9508n;
    }

    public final void h(int i7, h hVar, Object obj, int i8) {
        int i9 = i8 * 5;
        q[] qVarArr = (q[]) this.f2519n;
        if (i9 <= 30) {
            int I = 1 << n6.d.I(i7, i9);
            if (hVar.h(I)) {
                qVarArr[i8].a(hVar.f8831d, Integer.bitCount(hVar.a) * 2, hVar.f(I));
                this.f2517l = i8;
                return;
            } else {
                int iT = hVar.t(I);
                h hVarS = hVar.s(iT);
                qVarArr[i8].a(hVar.f8831d, Integer.bitCount(hVar.a) * 2, iT);
                h(i7, hVarS, obj, i8 + 1);
                return;
            }
        }
        q qVar = qVarArr[i8];
        Object[] objArr = hVar.f8831d;
        qVar.a(objArr, objArr.length, 0);
        while (true) {
            q qVar2 = qVarArr[i8];
            if (l.a(qVar2.f2548l[qVar2.f2550n], obj)) {
                this.f2517l = i8;
                return;
            } else {
                qVarArr[i8].f2550n += 2;
            }
        }
    }

    @Override // F5.e, java.util.Iterator
    public final Object next() {
        if (this.f8820o.f9508n != this.f8823r) {
            throw new ConcurrentModificationException();
        }
        if (!this.f2518m) {
            throw new NoSuchElementException();
        }
        q qVar = ((q[]) this.f2519n)[this.f2517l];
        this.f8821p = qVar.f2548l[qVar.f2550n];
        this.f8822q = true;
        return super.next();
    }

    @Override // F5.e, java.util.Iterator
    public final void remove() {
        if (!this.f8822q) {
            throw new IllegalStateException();
        }
        boolean z7 = this.f2518m;
        W.c cVar = this.f8820o;
        if (!z7) {
            B.c(cVar).remove(this.f8821p);
        } else {
            if (!z7) {
                throw new NoSuchElementException();
            }
            q qVar = ((q[]) this.f2519n)[this.f2517l];
            Object obj = qVar.f2548l[qVar.f2550n];
            B.c(cVar).remove(this.f8821p);
            h(obj != null ? obj.hashCode() : 0, cVar.f9506l, obj, 0);
        }
        this.f8821p = null;
        this.f8822q = false;
        this.f8823r = cVar.f9508n;
    }
}
