package j3;

import b1.AbstractC0703b;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;

/* renamed from: j3.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1339z extends W implements Serializable {

    /* renamed from: k, reason: collision with root package name */
    public final Comparator[] f12397k;

    public C1339z(C1330p c1330p, C1330p c1330p2) {
        this.f12397k = new Comparator[]{c1330p, c1330p2};
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i7 = 0;
        while (true) {
            Comparator[] comparatorArr = this.f12397k;
            if (i7 >= comparatorArr.length) {
                return 0;
            }
            int iCompare = comparatorArr[i7].compare(obj, obj2);
            if (iCompare != 0) {
                return iCompare;
            }
            i7++;
        }
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1339z) {
            return Arrays.equals(this.f12397k, ((C1339z) obj).f12397k);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f12397k);
    }

    public final String toString() {
        return AbstractC0703b.m(new StringBuilder("Ordering.compound("), Arrays.toString(this.f12397k), ")");
    }
}
