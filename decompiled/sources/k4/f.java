package k4;

import P3.D;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class f extends D {

    /* renamed from: k, reason: collision with root package name */
    public final int f12675k;

    /* renamed from: l, reason: collision with root package name */
    public final int f12676l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f12677m;

    /* renamed from: n, reason: collision with root package name */
    public int f12678n;

    public f(int i7, int i8, int i9) {
        this.f12675k = i9;
        this.f12676l = i8;
        boolean z7 = false;
        if (i9 <= 0 ? i7 >= i8 : i7 <= i8) {
            z7 = true;
        }
        this.f12677m = z7;
        this.f12678n = z7 ? i7 : i8;
    }

    @Override // P3.D
    public final int a() {
        int i7 = this.f12678n;
        if (i7 != this.f12676l) {
            this.f12678n = this.f12675k + i7;
            return i7;
        }
        if (!this.f12677m) {
            throw new NoSuchElementException();
        }
        this.f12677m = false;
        return i7;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f12677m;
    }
}
