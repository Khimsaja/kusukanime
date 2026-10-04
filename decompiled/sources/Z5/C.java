package Z5;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class C extends AbstractC0638h0 {
    public float[] a;

    /* renamed from: b, reason: collision with root package name */
    public int f10283b;

    @Override // Z5.AbstractC0638h0
    public final Object a() {
        float[] fArrCopyOf = Arrays.copyOf(this.a, this.f10283b);
        kotlin.jvm.internal.l.e("copyOf(...)", fArrCopyOf);
        return fArrCopyOf;
    }

    @Override // Z5.AbstractC0638h0
    public final void b(int i7) {
        float[] fArr = this.a;
        if (fArr.length < i7) {
            int length = fArr.length * 2;
            if (i7 < length) {
                i7 = length;
            }
            float[] fArrCopyOf = Arrays.copyOf(fArr, i7);
            kotlin.jvm.internal.l.e("copyOf(...)", fArrCopyOf);
            this.a = fArrCopyOf;
        }
    }

    @Override // Z5.AbstractC0638h0
    public final int d() {
        return this.f10283b;
    }
}
