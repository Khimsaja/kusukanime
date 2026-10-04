package Z5;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class Q extends AbstractC0638h0 {
    public long[] a;

    /* renamed from: b, reason: collision with root package name */
    public int f10304b;

    @Override // Z5.AbstractC0638h0
    public final Object a() {
        long[] jArrCopyOf = Arrays.copyOf(this.a, this.f10304b);
        kotlin.jvm.internal.l.e("copyOf(...)", jArrCopyOf);
        return jArrCopyOf;
    }

    @Override // Z5.AbstractC0638h0
    public final void b(int i7) {
        long[] jArr = this.a;
        if (jArr.length < i7) {
            int length = jArr.length * 2;
            if (i7 < length) {
                i7 = length;
            }
            long[] jArrCopyOf = Arrays.copyOf(jArr, i7);
            kotlin.jvm.internal.l.e("copyOf(...)", jArrCopyOf);
            this.a = jArrCopyOf;
        }
    }

    @Override // Z5.AbstractC0638h0
    public final int d() {
        return this.f10304b;
    }
}
