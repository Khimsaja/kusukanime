package y5;

import b1.AbstractC0703b;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class n implements h, c {
    public final h a;

    /* renamed from: b, reason: collision with root package name */
    public final int f18390b;

    /* renamed from: c, reason: collision with root package name */
    public final int f18391c;

    public n(h hVar, int i7, int i8) {
        this.a = hVar;
        this.f18390b = i7;
        this.f18391c = i8;
        if (i7 < 0) {
            throw new IllegalArgumentException(AbstractC0703b.g(i7, "startIndex should be non-negative, but is ").toString());
        }
        if (i8 < 0) {
            throw new IllegalArgumentException(AbstractC0703b.g(i8, "endIndex should be non-negative, but is ").toString());
        }
        if (i8 < i7) {
            throw new IllegalArgumentException(A6.b.e(i8, i7, "endIndex should be not less than startIndex, but was ", " < ").toString());
        }
    }

    @Override // y5.c
    public final h a(int i7) {
        int i8 = this.f18391c;
        int i9 = this.f18390b;
        if (i7 >= i8 - i9) {
            return this;
        }
        return new n(this.a, i9, i7 + i9);
    }

    @Override // y5.c
    public final h b(int i7) {
        int i8 = this.f18391c;
        int i9 = this.f18390b;
        if (i7 >= i8 - i9) {
            return d.a;
        }
        return new n(this.a, i9 + i7, i8);
    }

    @Override // y5.h
    public final Iterator iterator() {
        return new U.c(this);
    }
}
