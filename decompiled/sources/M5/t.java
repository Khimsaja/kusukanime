package M5;

import H5.T;
import H5.U;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes.dex */
public class t {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f6601b = AtomicIntegerFieldUpdater.newUpdater(t.class, "_size$volatile");
    private volatile /* synthetic */ int _size$volatile;
    public T[] a;

    public final void a(T t7) {
        t7.b((U) this);
        T[] tArr = this.a;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f6601b;
        if (tArr == null) {
            tArr = new T[4];
            this.a = tArr;
        } else if (atomicIntegerFieldUpdater.get(this) >= tArr.length) {
            Object[] objArrCopyOf = Arrays.copyOf(tArr, atomicIntegerFieldUpdater.get(this) * 2);
            kotlin.jvm.internal.l.e("copyOf(...)", objArrCopyOf);
            tArr = (T[]) objArrCopyOf;
            this.a = tArr;
        }
        int i7 = atomicIntegerFieldUpdater.get(this);
        atomicIntegerFieldUpdater.set(this, i7 + 1);
        tArr[i7] = t7;
        t7.f3822l = i7;
        c(i7);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final H5.T b(int r9) {
        /*
            r8 = this;
            H5.T[] r0 = r8.a
            kotlin.jvm.internal.l.c(r0)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = M5.t.f6601b
            int r2 = r1.get(r8)
            r3 = -1
            int r2 = r2 + r3
            r1.set(r8, r2)
            int r2 = r1.get(r8)
            if (r9 >= r2) goto L7a
            int r2 = r1.get(r8)
            r8.d(r9, r2)
            int r2 = r9 + (-1)
            int r2 = r2 / 2
            if (r9 <= 0) goto L3a
            r4 = r0[r9]
            kotlin.jvm.internal.l.c(r4)
            r5 = r0[r2]
            kotlin.jvm.internal.l.c(r5)
            int r4 = r4.compareTo(r5)
            if (r4 >= 0) goto L3a
            r8.d(r9, r2)
            r8.c(r2)
            goto L7a
        L3a:
            int r2 = r9 * 2
            int r4 = r2 + 1
            int r5 = r1.get(r8)
            if (r4 < r5) goto L45
            goto L7a
        L45:
            H5.T[] r5 = r8.a
            kotlin.jvm.internal.l.c(r5)
            int r2 = r2 + 2
            int r6 = r1.get(r8)
            if (r2 >= r6) goto L63
            r6 = r5[r2]
            kotlin.jvm.internal.l.c(r6)
            r7 = r5[r4]
            kotlin.jvm.internal.l.c(r7)
            int r6 = r6.compareTo(r7)
            if (r6 >= 0) goto L63
            goto L64
        L63:
            r2 = r4
        L64:
            r4 = r5[r9]
            kotlin.jvm.internal.l.c(r4)
            r5 = r5[r2]
            kotlin.jvm.internal.l.c(r5)
            int r4 = r4.compareTo(r5)
            if (r4 > 0) goto L75
            goto L7a
        L75:
            r8.d(r9, r2)
            r9 = r2
            goto L3a
        L7a:
            int r9 = r1.get(r8)
            r9 = r0[r9]
            kotlin.jvm.internal.l.c(r9)
            r2 = 0
            r9.b(r2)
            r9.f3822l = r3
            int r1 = r1.get(r8)
            r0[r1] = r2
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: M5.t.b(int):H5.T");
    }

    public final void c(int i7) {
        while (i7 > 0) {
            T[] tArr = this.a;
            kotlin.jvm.internal.l.c(tArr);
            int i8 = (i7 - 1) / 2;
            T t7 = tArr[i8];
            kotlin.jvm.internal.l.c(t7);
            T t8 = tArr[i7];
            kotlin.jvm.internal.l.c(t8);
            if (t7.compareTo(t8) <= 0) {
                return;
            }
            d(i7, i8);
            i7 = i8;
        }
    }

    public final void d(int i7, int i8) {
        T[] tArr = this.a;
        kotlin.jvm.internal.l.c(tArr);
        T t7 = tArr[i8];
        kotlin.jvm.internal.l.c(t7);
        T t8 = tArr[i7];
        kotlin.jvm.internal.l.c(t8);
        tArr[i7] = t7;
        tArr[i8] = t8;
        t7.f3822l = i7;
        t8.f3822l = i8;
    }
}
