package Z5;

import java.util.Arrays;

/* renamed from: Z5.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0650t extends AbstractC0638h0 {
    public double[] a;

    /* renamed from: b, reason: collision with root package name */
    public int f10355b;

    @Override // Z5.AbstractC0638h0
    public final Object a() {
        double[] dArrCopyOf = Arrays.copyOf(this.a, this.f10355b);
        kotlin.jvm.internal.l.e("copyOf(...)", dArrCopyOf);
        return dArrCopyOf;
    }

    @Override // Z5.AbstractC0638h0
    public final void b(int i7) {
        double[] dArr = this.a;
        if (dArr.length < i7) {
            int length = dArr.length * 2;
            if (i7 < length) {
                i7 = length;
            }
            double[] dArrCopyOf = Arrays.copyOf(dArr, i7);
            kotlin.jvm.internal.l.e("copyOf(...)", dArrCopyOf);
            this.a = dArrCopyOf;
        }
    }

    @Override // Z5.AbstractC0638h0
    public final int d() {
        return this.f10355b;
    }
}
