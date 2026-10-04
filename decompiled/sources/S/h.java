package S;

import P3.m;
import P3.r;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class h extends b {

    /* renamed from: l, reason: collision with root package name */
    public static final h f8701l = new h(new Object[0]);

    /* renamed from: k, reason: collision with root package name */
    public final Object[] f8702k;

    public h(Object[] objArr) {
        this.f8702k = objArr;
    }

    @Override // P3.AbstractC0560a
    public final int a() {
        return this.f8702k.length;
    }

    @Override // java.util.List
    public final Object get(int i7) {
        r.j(i7, a());
        return this.f8702k[i7];
    }

    @Override // S.b
    public final b h(int i7, Object obj) {
        Object[] objArr = this.f8702k;
        r.l(i7, objArr.length);
        if (i7 == objArr.length) {
            return j(obj);
        }
        if (objArr.length < 32) {
            Object[] objArr2 = new Object[objArr.length + 1];
            m.Z(0, i7, 6, objArr, objArr2);
            m.W(i7 + 1, i7, objArr.length, objArr, objArr2);
            objArr2[i7] = obj;
            return new h(objArr2);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        l.e("copyOf(this, size)", objArrCopyOf);
        m.W(i7 + 1, i7, objArr.length - 1, objArr, objArrCopyOf);
        objArrCopyOf[i7] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = objArr[31];
        return new d(objArrCopyOf, objArr3, objArr.length + 1, 0);
    }

    @Override // P3.AbstractC0564e, java.util.List
    public final int indexOf(Object obj) {
        return m.l0(obj, this.f8702k);
    }

    @Override // S.b
    public final b j(Object obj) {
        Object[] objArr = this.f8702k;
        if (objArr.length >= 32) {
            Object[] objArr2 = new Object[32];
            objArr2[0] = obj;
            return new d(objArr, objArr2, objArr.length + 1, 0);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length + 1);
        l.e("copyOf(this, newSize)", objArrCopyOf);
        objArrCopyOf[objArr.length] = obj;
        return new h(objArrCopyOf);
    }

    @Override // P3.AbstractC0564e, java.util.List
    public final int lastIndexOf(Object obj) {
        return m.p0(obj, this.f8702k);
    }

    @Override // P3.AbstractC0564e, java.util.List
    public final ListIterator listIterator(int i7) {
        Object[] objArr = this.f8702k;
        r.l(i7, objArr.length);
        return new c(objArr, i7, objArr.length);
    }

    @Override // S.b
    public final b m(Collection collection) {
        Object[] objArr = this.f8702k;
        if (collection.size() + objArr.length > 32) {
            e eVarO = o();
            eVarO.addAll(collection);
            return eVarO.j();
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, collection.size() + objArr.length);
        l.e("copyOf(this, newSize)", objArrCopyOf);
        int length = objArr.length;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            objArrCopyOf[length] = it.next();
            length++;
        }
        return new h(objArrCopyOf);
    }

    @Override // S.b
    public final e o() {
        return new e(this, null, this.f8702k, 0);
    }

    @Override // S.b
    public final b p(a aVar) {
        Object[] objArr = this.f8702k;
        int length = objArr.length;
        int length2 = objArr.length;
        Object[] objArrCopyOf = objArr;
        boolean z7 = false;
        for (int i7 = 0; i7 < length2; i7++) {
            Object obj = objArr[i7];
            if (((Boolean) aVar.invoke(obj)).booleanValue()) {
                if (!z7) {
                    objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
                    l.e("copyOf(this, size)", objArrCopyOf);
                    z7 = true;
                    length = i7;
                }
            } else if (z7) {
                objArrCopyOf[length] = obj;
                length++;
            }
        }
        return length == objArr.length ? this : length == 0 ? f8701l : new h(m.b0(objArrCopyOf, 0, length));
    }

    @Override // S.b
    public final b q(int i7) {
        Object[] objArr = this.f8702k;
        r.j(i7, objArr.length);
        if (objArr.length == 1) {
            return f8701l;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length - 1);
        l.e("copyOf(this, newSize)", objArrCopyOf);
        m.W(i7, i7 + 1, objArr.length, objArr, objArrCopyOf);
        return new h(objArrCopyOf);
    }

    @Override // S.b
    public final b r(int i7, Object obj) {
        Object[] objArr = this.f8702k;
        r.j(i7, objArr.length);
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        l.e("copyOf(this, size)", objArrCopyOf);
        objArrCopyOf[i7] = obj;
        return new h(objArrCopyOf);
    }
}
