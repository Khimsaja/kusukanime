package Z5;

import java.util.Arrays;

/* renamed from: Z5.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0631e extends AbstractC0638h0 {
    public boolean[] a;

    /* renamed from: b, reason: collision with root package name */
    public int f10320b;

    @Override // Z5.AbstractC0638h0
    public final Object a() {
        boolean[] zArrCopyOf = Arrays.copyOf(this.a, this.f10320b);
        kotlin.jvm.internal.l.e("copyOf(...)", zArrCopyOf);
        return zArrCopyOf;
    }

    @Override // Z5.AbstractC0638h0
    public final void b(int i7) {
        boolean[] zArr = this.a;
        if (zArr.length < i7) {
            int length = zArr.length * 2;
            if (i7 < length) {
                i7 = length;
            }
            boolean[] zArrCopyOf = Arrays.copyOf(zArr, i7);
            kotlin.jvm.internal.l.e("copyOf(...)", zArrCopyOf);
            this.a = zArrCopyOf;
        }
    }

    @Override // Z5.AbstractC0638h0
    public final int d() {
        return this.f10320b;
    }
}
