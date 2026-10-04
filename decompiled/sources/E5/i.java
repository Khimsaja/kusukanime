package E5;

import P3.m;
import P3.r;
import e4.k;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class i extends c {

    /* renamed from: l, reason: collision with root package name */
    public static final i f1971l = new i(new Object[0]);

    /* renamed from: k, reason: collision with root package name */
    public final Object[] f1972k;

    public i(Object[] objArr) {
        this.f1972k = objArr;
    }

    @Override // P3.AbstractC0560a
    public final int a() {
        return this.f1972k.length;
    }

    @Override // java.util.List, D5.b
    public final D5.b add(int i7, Object obj) {
        Object[] objArr = this.f1972k;
        r.k(i7, objArr.length);
        if (i7 == objArr.length) {
            return add(obj);
        }
        if (objArr.length < 32) {
            Object[] objArr2 = new Object[objArr.length + 1];
            m.Z(0, i7, 6, objArr, objArr2);
            m.W(i7 + 1, i7, objArr.length, objArr, objArr2);
            objArr2[i7] = obj;
            return new i(objArr2);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        l.e("copyOf(...)", objArrCopyOf);
        m.W(i7 + 1, i7, objArr.length - 1, objArr, objArrCopyOf);
        objArrCopyOf[i7] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = objArr[31];
        return new e(objArrCopyOf, objArr3, objArr.length + 1, 0);
    }

    @Override // E5.c, java.util.List, D5.b
    public final D5.b addAll(int i7, Collection collection) {
        l.f("c", collection);
        Object[] objArr = this.f1972k;
        r.k(i7, objArr.length);
        if (collection.isEmpty()) {
            return this;
        }
        if (collection.size() + objArr.length > 32) {
            f fVarG = g();
            fVarG.addAll(i7, collection);
            return fVarG.j();
        }
        Object[] objArr2 = new Object[collection.size() + objArr.length];
        m.Z(0, i7, 6, objArr, objArr2);
        m.W(collection.size() + i7, i7, objArr.length, objArr, objArr2);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            objArr2[i7] = it.next();
            i7++;
        }
        return new i(objArr2);
    }

    @Override // D5.b
    public final D5.b f(int i7) {
        Object[] objArr = this.f1972k;
        r.i(i7, objArr.length);
        if (objArr.length == 1) {
            return f1971l;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length - 1);
        l.e("copyOf(...)", objArrCopyOf);
        m.W(i7, i7 + 1, objArr.length, objArr, objArrCopyOf);
        return new i(objArrCopyOf);
    }

    @Override // D5.b
    public final f g() {
        return new f(this, null, this.f1972k, 0);
    }

    @Override // java.util.List
    public final Object get(int i7) {
        r.i(i7, a());
        return this.f1972k[i7];
    }

    @Override // P3.AbstractC0564e, java.util.List
    public final int indexOf(Object obj) {
        return m.l0(obj, this.f1972k);
    }

    @Override // P3.AbstractC0564e, java.util.List
    public final int lastIndexOf(Object obj) {
        return m.p0(obj, this.f1972k);
    }

    @Override // P3.AbstractC0564e, java.util.List
    public final ListIterator listIterator(int i7) {
        Object[] objArr = this.f1972k;
        r.k(i7, objArr.length);
        return new d(objArr, i7, objArr.length);
    }

    @Override // D5.b
    public final D5.b n(k kVar) {
        Object[] objArr = this.f1972k;
        int length = objArr.length;
        int length2 = objArr.length;
        int i7 = 0;
        for (int i8 = 0; i8 < length2; i8++) {
            if (((Boolean) kVar.invoke(objArr[i8])).booleanValue()) {
                length--;
                i7 |= 1 << i8;
            }
        }
        if (length == objArr.length) {
            return this;
        }
        if (length == 0) {
            return f1971l;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, length);
        l.e("copyOf(...)", objArrCopyOf);
        int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(i7);
        int length3 = objArr.length;
        for (int i9 = iNumberOfTrailingZeros + 1; i9 < length3; i9++) {
            if (((i7 >>> i9) & 1) == 0) {
                objArrCopyOf[iNumberOfTrailingZeros] = objArr[i9];
                iNumberOfTrailingZeros++;
            }
        }
        return new i(objArrCopyOf);
    }

    @Override // P3.AbstractC0564e, java.util.List, D5.b
    public final D5.b set(int i7, Object obj) {
        Object[] objArr = this.f1972k;
        r.i(i7, objArr.length);
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        l.e("copyOf(...)", objArrCopyOf);
        objArrCopyOf[i7] = obj;
        return new i(objArrCopyOf);
    }

    @Override // E5.c, java.util.Collection, java.util.List, D5.b
    public final D5.b addAll(Collection collection) {
        l.f("elements", collection);
        if (collection.isEmpty()) {
            return this;
        }
        Object[] objArr = this.f1972k;
        if (collection.size() + objArr.length <= 32) {
            Object[] objArrCopyOf = Arrays.copyOf(objArr, collection.size() + objArr.length);
            l.e("copyOf(...)", objArrCopyOf);
            int length = objArr.length;
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                objArrCopyOf[length] = it.next();
                length++;
            }
            return new i(objArrCopyOf);
        }
        f fVarG = g();
        fVarG.addAll(collection);
        return fVarG.j();
    }

    @Override // java.util.Collection, java.util.List, D5.b
    public final D5.b add(Object obj) {
        Object[] objArr = this.f1972k;
        if (objArr.length < 32) {
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length + 1);
            l.e("copyOf(...)", objArrCopyOf);
            objArrCopyOf[objArr.length] = obj;
            return new i(objArrCopyOf);
        }
        Object[] objArr2 = new Object[32];
        objArr2[0] = obj;
        return new e(objArr, objArr2, objArr.length + 1, 0);
    }
}
