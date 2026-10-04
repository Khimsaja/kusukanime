package F5;

import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.B;

/* loaded from: classes.dex */
public class g extends e {

    /* renamed from: o, reason: collision with root package name */
    public final f f2526o;

    /* renamed from: p, reason: collision with root package name */
    public Object f2527p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f2528q;

    /* renamed from: r, reason: collision with root package name */
    public int f2529r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(f fVar, q[] qVarArr) {
        super(fVar.f2522m, qVarArr);
        kotlin.jvm.internal.l.f("builder", fVar);
        this.f2526o = fVar;
        this.f2529r = fVar.f2524o;
    }

    public final void h(int i7, p pVar, Object obj, int i8, int i9, boolean z7) {
        int i10;
        int i11 = i8 * 5;
        q[] qVarArr = (q[]) this.f2519n;
        if (i11 <= 30) {
            int iQ = 1 << n6.m.Q(i7, i11);
            if (!pVar.i(iQ)) {
                int iT = pVar.t(iQ);
                p pVarS = pVar.s(iT);
                q qVar = qVarArr[i8];
                Object[] objArr = pVar.f2546d;
                int iBitCount = Integer.bitCount(pVar.a) * 2;
                qVar.getClass();
                kotlin.jvm.internal.l.f("buffer", objArr);
                qVar.f2548l = objArr;
                qVar.f2549m = iBitCount;
                qVar.f2550n = iT;
                h(i7, pVarS, obj, i8 + 1, i9, z7);
                return;
            }
            int iF = pVar.f(iQ);
            if (iQ == (z7 ? 1 << n6.m.Q(i9, i11) : 0) && i8 < (i10 = this.f2517l)) {
                q qVar2 = qVarArr[i10];
                Object[] objArr2 = pVar.f2546d;
                Object[] objArr3 = {objArr2[iF], objArr2[iF + 1]};
                qVar2.getClass();
                qVar2.f2548l = objArr3;
                qVar2.f2549m = 2;
                qVar2.f2550n = 0;
                return;
            }
            q qVar3 = qVarArr[i8];
            Object[] objArr4 = pVar.f2546d;
            int iBitCount2 = Integer.bitCount(pVar.a) * 2;
            qVar3.getClass();
            kotlin.jvm.internal.l.f("buffer", objArr4);
            qVar3.f2548l = objArr4;
            qVar3.f2549m = iBitCount2;
            qVar3.f2550n = iF;
            this.f2517l = i8;
            return;
        }
        q qVar4 = qVarArr[i8];
        Object[] objArr5 = pVar.f2546d;
        int length = objArr5.length;
        qVar4.getClass();
        qVar4.f2548l = objArr5;
        qVar4.f2549m = length;
        qVar4.f2550n = 0;
        while (true) {
            q qVar5 = qVarArr[i8];
            if (kotlin.jvm.internal.l.a(qVar5.f2548l[qVar5.f2550n], obj)) {
                this.f2517l = i8;
                return;
            } else {
                qVarArr[i8].f2550n += 2;
            }
        }
    }

    @Override // F5.e, java.util.Iterator
    public final Object next() {
        if (this.f2526o.f2524o != this.f2529r) {
            throw new ConcurrentModificationException();
        }
        if (!this.f2518m) {
            throw new NoSuchElementException();
        }
        q qVar = ((q[]) this.f2519n)[this.f2517l];
        this.f2527p = qVar.f2548l[qVar.f2550n];
        this.f2528q = true;
        return super.next();
    }

    @Override // F5.e, java.util.Iterator
    public final void remove() {
        g gVar;
        if (!this.f2528q) {
            throw new IllegalStateException();
        }
        boolean z7 = this.f2518m;
        f fVar = this.f2526o;
        if (!z7) {
            gVar = this;
            B.c(fVar).remove(gVar.f2527p);
        } else {
            if (!z7) {
                throw new NoSuchElementException();
            }
            q qVar = ((q[]) this.f2519n)[this.f2517l];
            Object obj = qVar.f2548l[qVar.f2550n];
            B.c(fVar).remove(this.f2527p);
            int iHashCode = obj != null ? obj.hashCode() : 0;
            p pVar = fVar.f2522m;
            Object obj2 = this.f2527p;
            gVar = this;
            gVar.h(iHashCode, pVar, obj, 0, obj2 != null ? obj2.hashCode() : 0, true);
        }
        gVar.f2527p = null;
        gVar.f2528q = false;
        gVar.f2529r = fVar.f2524o;
    }
}
