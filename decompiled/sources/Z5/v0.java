package Z5;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class v0 extends AbstractC0638h0 {
    public byte[] a;

    /* renamed from: b, reason: collision with root package name */
    public int f10362b;

    @Override // Z5.AbstractC0638h0
    public final Object a() {
        byte[] bArrCopyOf = Arrays.copyOf(this.a, this.f10362b);
        kotlin.jvm.internal.l.e("copyOf(...)", bArrCopyOf);
        return new O3.u(bArrCopyOf);
    }

    @Override // Z5.AbstractC0638h0
    public final void b(int i7) {
        byte[] bArr = this.a;
        if (bArr.length < i7) {
            int length = bArr.length * 2;
            if (i7 < length) {
                i7 = length;
            }
            byte[] bArrCopyOf = Arrays.copyOf(bArr, i7);
            kotlin.jvm.internal.l.e("copyOf(...)", bArrCopyOf);
            this.a = bArrCopyOf;
        }
    }

    @Override // Z5.AbstractC0638h0
    public final int d() {
        return this.f10362b;
    }
}
