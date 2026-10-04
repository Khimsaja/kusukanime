package t5;

import java.util.Arrays;
import java.util.Iterator;
import n5.C1570g;

/* loaded from: classes.dex */
public final class c extends AbstractC2061a {

    /* renamed from: k, reason: collision with root package name */
    public Object[] f16093k;

    /* renamed from: l, reason: collision with root package name */
    public int f16094l;

    @Override // t5.AbstractC2061a
    public final int a() {
        return this.f16094l;
    }

    @Override // t5.AbstractC2061a
    public final Object get(int i7) {
        Object[] objArr = this.f16093k;
        if (i7 < 0 || i7 >= objArr.length) {
            return null;
        }
        return objArr[i7];
    }

    @Override // t5.AbstractC2061a
    public final void h(int i7, C1570g c1570g) {
        Object[] objArr = this.f16093k;
        if (objArr.length <= i7) {
            int length = objArr.length;
            do {
                length *= 2;
            } while (length <= i7);
            Object[] objArrCopyOf = Arrays.copyOf(this.f16093k, length);
            kotlin.jvm.internal.l.e("copyOf(...)", objArrCopyOf);
            this.f16093k = objArrCopyOf;
        }
        Object[] objArr2 = this.f16093k;
        if (objArr2[i7] == null) {
            this.f16094l++;
        }
        objArr2[i7] = c1570g;
    }

    @Override // t5.AbstractC2061a, java.lang.Iterable
    public final Iterator iterator() {
        return new b(this);
    }
}
