package Z5;

import java.util.Arrays;

/* renamed from: Z5.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0637h extends AbstractC0638h0 {
    public byte[] a;

    /* renamed from: b, reason: collision with root package name */
    public int f10337b;

    @Override // Z5.AbstractC0638h0
    public final Object a() {
        byte[] bArrCopyOf = Arrays.copyOf(this.a, this.f10337b);
        kotlin.jvm.internal.l.e("copyOf(...)", bArrCopyOf);
        return bArrCopyOf;
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
        return this.f10337b;
    }
}
