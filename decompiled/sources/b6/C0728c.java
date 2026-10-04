package b6;

import z5.AbstractC2517v;

/* renamed from: b6.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0728c implements CharSequence {
    public final char[] a;

    /* renamed from: b, reason: collision with root package name */
    public int f11017b;

    public C0728c(char[] cArr) {
        this.a = cArr;
        this.f11017b = cArr.length;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i7) {
        return this.a[i7];
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f11017b;
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i7, int i8) {
        return AbstractC2517v.H(this.a, i7, Math.min(i8, this.f11017b));
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        int i7 = this.f11017b;
        return AbstractC2517v.H(this.a, 0, Math.min(i7, i7));
    }
}
