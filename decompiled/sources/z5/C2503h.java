package z5;

import f4.InterfaceC0881a;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: z5.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2503h implements Iterator, InterfaceC0881a {

    /* renamed from: k, reason: collision with root package name */
    public final String f19051k;

    /* renamed from: l, reason: collision with root package name */
    public int f19052l;

    /* renamed from: m, reason: collision with root package name */
    public int f19053m;

    /* renamed from: n, reason: collision with root package name */
    public int f19054n;

    /* renamed from: o, reason: collision with root package name */
    public int f19055o;

    public C2503h(String str) {
        kotlin.jvm.internal.l.f("string", str);
        this.f19051k = str;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i7;
        int i8;
        int i9 = this.f19052l;
        if (i9 != 0) {
            return i9 == 1;
        }
        if (this.f19055o < 0) {
            this.f19052l = 2;
            return false;
        }
        String str = this.f19051k;
        int length = str.length();
        int length2 = str.length();
        for (int i10 = this.f19053m; i10 < length2; i10++) {
            char cCharAt = str.charAt(i10);
            if (cCharAt == '\n' || cCharAt == '\r') {
                i7 = (cCharAt == '\r' && (i8 = i10 + 1) < str.length() && str.charAt(i8) == '\n') ? 2 : 1;
                length = i10;
                this.f19052l = 1;
                this.f19055o = i7;
                this.f19054n = length;
                return true;
            }
        }
        i7 = -1;
        this.f19052l = 1;
        this.f19055o = i7;
        this.f19054n = length;
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f19052l = 0;
        int i7 = this.f19054n;
        int i8 = this.f19053m;
        this.f19053m = this.f19055o + i7;
        return this.f19051k.subSequence(i8, i7).toString();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
