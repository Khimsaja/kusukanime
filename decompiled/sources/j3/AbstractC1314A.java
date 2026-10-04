package j3;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: j3.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1314A {
    public Object[] a;

    /* renamed from: b, reason: collision with root package name */
    public int f12266b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f12267c;

    public AbstractC1314A(int i7) {
        AbstractC1331q.b(i7, "initialCapacity");
        this.a = new Object[i7];
        this.f12266b = 0;
    }

    public static int e(int i7, int i8) {
        if (i8 < 0) {
            throw new IllegalArgumentException("cannot store more than MAX_VALUE elements");
        }
        if (i8 <= i7) {
            return i7;
        }
        int iHighestOneBit = i7 + (i7 >> 1) + 1;
        if (iHighestOneBit < i8) {
            iHighestOneBit = Integer.highestOneBit(i8 - 1) << 1;
        }
        if (iHighestOneBit < 0) {
            return Integer.MAX_VALUE;
        }
        return iHighestOneBit;
    }

    public final void a(Object obj) {
        obj.getClass();
        d(1);
        Object[] objArr = this.a;
        int i7 = this.f12266b;
        this.f12266b = i7 + 1;
        objArr[i7] = obj;
    }

    public abstract AbstractC1314A b(Object obj);

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(List list) {
        if (list != 0) {
            d(list.size());
            if (list instanceof B) {
                this.f12266b = ((B) list).h(this.f12266b, this.a);
                return;
            }
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            b(it.next());
        }
    }

    public final void d(int i7) {
        Object[] objArr = this.a;
        int iE = e(objArr.length, this.f12266b + i7);
        if (iE > objArr.length || this.f12267c) {
            this.a = Arrays.copyOf(this.a, iE);
            this.f12267c = false;
        }
    }
}
