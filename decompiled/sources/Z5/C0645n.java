package Z5;

import java.util.Arrays;

/* renamed from: Z5.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0645n extends AbstractC0638h0 {
    public char[] a;

    /* renamed from: b, reason: collision with root package name */
    public int f10345b;

    @Override // Z5.AbstractC0638h0
    public final Object a() {
        char[] cArrCopyOf = Arrays.copyOf(this.a, this.f10345b);
        kotlin.jvm.internal.l.e("copyOf(...)", cArrCopyOf);
        return cArrCopyOf;
    }

    @Override // Z5.AbstractC0638h0
    public final void b(int i7) {
        char[] cArr = this.a;
        if (cArr.length < i7) {
            int length = cArr.length * 2;
            if (i7 < length) {
                i7 = length;
            }
            char[] cArrCopyOf = Arrays.copyOf(cArr, i7);
            kotlin.jvm.internal.l.e("copyOf(...)", cArrCopyOf);
            this.a = cArrCopyOf;
        }
    }

    @Override // Z5.AbstractC0638h0
    public final int d() {
        return this.f10345b;
    }
}
