package Z5;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class L extends AbstractC0638h0 {
    public int[] a;

    /* renamed from: b, reason: collision with root package name */
    public int f10300b;

    @Override // Z5.AbstractC0638h0
    public final Object a() {
        int[] iArrCopyOf = Arrays.copyOf(this.a, this.f10300b);
        kotlin.jvm.internal.l.e("copyOf(...)", iArrCopyOf);
        return iArrCopyOf;
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
        return this.f10300b;
    }
}
