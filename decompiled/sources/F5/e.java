package F5;

import f4.InterfaceC0881a;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public abstract class e implements Iterator, InterfaceC0881a {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f2516k;

    /* renamed from: l, reason: collision with root package name */
    public int f2517l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f2518m;

    /* renamed from: n, reason: collision with root package name */
    public final Object[] f2519n;

    public e(T.h hVar, q[] qVarArr) {
        this.f2516k = 1;
        this.f2519n = qVarArr;
        this.f2518m = true;
        qVarArr[0].a(hVar.f8831d, Integer.bitCount(hVar.a) * 2, 0);
        this.f2517l = 0;
        a();
    }

    public void a() {
        int i7 = this.f2517l;
        q[] qVarArr = (q[]) this.f2519n;
        q qVar = qVarArr[i7];
        if (qVar.f2550n < qVar.f2549m) {
            return;
        }
        while (-1 < i7) {
            int iC = c(i7);
            if (iC == -1) {
                q qVar2 = qVarArr[i7];
                int i8 = qVar2.f2550n;
                Object[] objArr = qVar2.f2548l;
                if (i8 < objArr.length) {
                    int length = objArr.length;
                    qVar2.f2550n = i8 + 1;
                    iC = c(i7);
                }
            }
            if (iC != -1) {
                this.f2517l = iC;
                return;
            }
            if (i7 > 0) {
                q qVar3 = qVarArr[i7 - 1];
                int i9 = qVar3.f2550n;
                int length2 = qVar3.f2548l.length;
                qVar3.f2550n = i9 + 1;
            }
            qVarArr[i7].a(T.h.f8828e.f8831d, 0, 0);
            i7--;
        }
        this.f2518m = false;
    }

    public void b() {
        int i7 = this.f2517l;
        q[] qVarArr = (q[]) this.f2519n;
        q qVar = qVarArr[i7];
        if (qVar.f2550n < qVar.f2549m) {
            return;
        }
        while (-1 < i7) {
            int iE = e(i7);
            if (iE == -1) {
                q qVar2 = qVarArr[i7];
                int i8 = qVar2.f2550n;
                Object[] objArr = qVar2.f2548l;
                if (i8 < objArr.length) {
                    int length = objArr.length;
                    qVar2.f2550n = i8 + 1;
                    iE = e(i7);
                }
            }
            if (iE != -1) {
                this.f2517l = iE;
                return;
            }
            if (i7 > 0) {
                q qVar3 = qVarArr[i7 - 1];
                int i9 = qVar3.f2550n;
                int length2 = qVar3.f2548l.length;
                qVar3.f2550n = i9 + 1;
            }
            q qVar4 = qVarArr[i7];
            Object[] objArr2 = p.f2543e.f2546d;
            qVar4.getClass();
            kotlin.jvm.internal.l.f("buffer", objArr2);
            qVar4.f2548l = objArr2;
            qVar4.f2549m = 0;
            qVar4.f2550n = 0;
            i7--;
        }
        this.f2518m = false;
    }

    public int c(int i7) {
        q[] qVarArr = (q[]) this.f2519n;
        q qVar = qVarArr[i7];
        int i8 = qVar.f2550n;
        if (i8 < qVar.f2549m) {
            return i7;
        }
        Object[] objArr = qVar.f2548l;
        if (i8 >= objArr.length) {
            return -1;
        }
        int length = objArr.length;
        Object obj = objArr[i8];
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator>", obj);
        T.h hVar = (T.h) obj;
        if (i7 == 6) {
            q qVar2 = qVarArr[i7 + 1];
            Object[] objArr2 = hVar.f8831d;
            qVar2.a(objArr2, objArr2.length, 0);
        } else {
            qVarArr[i7 + 1].a(hVar.f8831d, Integer.bitCount(hVar.a) * 2, 0);
        }
        return c(i7 + 1);
    }

    public int e(int i7) {
        q[] qVarArr = (q[]) this.f2519n;
        q qVar = qVarArr[i7];
        int i8 = qVar.f2550n;
        if (i8 < qVar.f2549m) {
            return i7;
        }
        Object[] objArr = qVar.f2548l;
        if (i8 >= objArr.length) {
            return -1;
        }
        int length = objArr.length;
        Object obj = objArr[i8];
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator, V of kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator>", obj);
        p pVar = (p) obj;
        if (i7 == 6) {
            q qVar2 = qVarArr[i7 + 1];
            Object[] objArr2 = pVar.f2546d;
            int length2 = objArr2.length;
            qVar2.getClass();
            qVar2.f2548l = objArr2;
            qVar2.f2549m = length2;
            qVar2.f2550n = 0;
        } else {
            q qVar3 = qVarArr[i7 + 1];
            Object[] objArr3 = pVar.f2546d;
            int iBitCount = Integer.bitCount(pVar.a) * 2;
            qVar3.getClass();
            kotlin.jvm.internal.l.f("buffer", objArr3);
            qVar3.f2548l = objArr3;
            qVar3.f2549m = iBitCount;
            qVar3.f2550n = 0;
        }
        return e(i7 + 1);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f2516k) {
        }
        return this.f2518m;
    }

    @Override // java.util.Iterator
    public Object next() {
        switch (this.f2516k) {
            case 0:
                if (!this.f2518m) {
                    throw new NoSuchElementException();
                }
                Object next = ((q[]) this.f2519n)[this.f2517l].next();
                b();
                return next;
            default:
                if (!this.f2518m) {
                    throw new NoSuchElementException();
                }
                Object next2 = ((q[]) this.f2519n)[this.f2517l].next();
                a();
                return next2;
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        switch (this.f2516k) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public e(p pVar, q[] qVarArr) {
        this.f2516k = 0;
        kotlin.jvm.internal.l.f("node", pVar);
        this.f2519n = qVarArr;
        this.f2518m = true;
        q qVar = qVarArr[0];
        Object[] objArr = pVar.f2546d;
        int iBitCount = Integer.bitCount(pVar.a) * 2;
        qVar.getClass();
        kotlin.jvm.internal.l.f("buffer", objArr);
        qVar.f2548l = objArr;
        qVar.f2549m = iBitCount;
        qVar.f2550n = 0;
        this.f2517l = 0;
        b();
    }
}
