package Z5;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class y0 extends AbstractC0638h0 {
    public int[] a;

    /* renamed from: b, reason: collision with root package name */
    public int f10373b;

    @Override // Z5.AbstractC0638h0
    public final Object a() {
        int[] iArrCopyOf = Arrays.copyOf(this.a, this.f10373b);
        kotlin.jvm.internal.l.e("copyOf(...)", iArrCopyOf);
        return new O3.w(iArrCopyOf);
    }

    @Override // Z5.AbstractC0638h0
    public final void b(int i7) {
        int[] iArr = this.a;
        if (iArr.length < i7) {
            int length = iArr.length * 2;
            if (i7 < length) {
                i7 = length;
            }
            int[] iArrCopyOf = Arrays.copyOf(iArr, i7);
            kotlin.jvm.internal.l.e("copyOf(...)", iArrCopyOf);
            this.a = iArrCopyOf;
        }
    }

    @Override // Z5.AbstractC0638h0
    public final int d() {
        return this.f10373b;
    }
}
