package Z5;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class q0 extends AbstractC0638h0 {
    public short[] a;

    /* renamed from: b, reason: collision with root package name */
    public int f10350b;

    @Override // Z5.AbstractC0638h0
    public final Object a() {
        short[] sArrCopyOf = Arrays.copyOf(this.a, this.f10350b);
        kotlin.jvm.internal.l.e("copyOf(...)", sArrCopyOf);
        return sArrCopyOf;
    }

    @Override // Z5.AbstractC0638h0
    public final void b(int i7) {
        short[] sArr = this.a;
        if (sArr.length < i7) {
            int length = sArr.length * 2;
            if (i7 < length) {
                i7 = length;
            }
            short[] sArrCopyOf = Arrays.copyOf(sArr, i7);
            kotlin.jvm.internal.l.e("copyOf(...)", sArrCopyOf);
            this.a = sArrCopyOf;
        }
    }

    @Override // Z5.AbstractC0638h0
    public final int d() {
        return this.f10350b;
    }
}
