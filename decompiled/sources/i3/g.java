package i3;

import C2.H;
import X4.y;
import f6.AbstractC0915m;
import java.util.Iterator;
import java.util.NoSuchElementException;
import p.AbstractC1755i;

/* loaded from: classes.dex */
public final class g implements Iterator {

    /* renamed from: l, reason: collision with root package name */
    public String f12009l;

    /* renamed from: m, reason: collision with root package name */
    public final CharSequence f12010m;

    /* renamed from: n, reason: collision with root package name */
    public final C1074c f12011n;

    /* renamed from: p, reason: collision with root package name */
    public int f12013p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ y f12014q;

    /* renamed from: k, reason: collision with root package name */
    public int f12008k = 2;

    /* renamed from: o, reason: collision with root package name */
    public int f12012o = 0;

    public g(y yVar, H h7, CharSequence charSequence) {
        this.f12014q = yVar;
        this.f12011n = (C1074c) h7.f667m;
        this.f12013p = h7.f666l;
        this.f12010m = charSequence;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        String string;
        int i7 = this.f12008k;
        if (i7 == 4) {
            throw new IllegalStateException();
        }
        int iB = AbstractC1755i.b(i7);
        if (iB == 0) {
            return true;
        }
        if (iB == 2) {
            return false;
        }
        this.f12008k = 4;
        int i8 = this.f12012o;
        while (true) {
            int length = this.f12012o;
            if (length == -1) {
                this.f12008k = 3;
                string = null;
                break;
            }
            C1073b c1073b = (C1073b) this.f12014q.f9916l;
            CharSequence charSequence = this.f12010m;
            int length2 = charSequence.length();
            AbstractC0915m.i(length, length2);
            while (true) {
                if (length >= length2) {
                    length = -1;
                    break;
                }
                if (c1073b.a(charSequence.charAt(length))) {
                    break;
                }
                length++;
            }
            if (length == -1) {
                length = charSequence.length();
                this.f12012o = -1;
            } else {
                this.f12012o = length + 1;
            }
            int i9 = this.f12012o;
            if (i9 == i8) {
                int i10 = i9 + 1;
                this.f12012o = i10;
                if (i10 > charSequence.length()) {
                    this.f12012o = -1;
                }
            } else {
                C1074c c1074c = this.f12011n;
                if (i8 < length) {
                    charSequence.charAt(i8);
                    c1074c.getClass();
                }
                if (length > i8) {
                    charSequence.charAt(length - 1);
                    c1074c.getClass();
                }
                int i11 = this.f12013p;
                if (i11 == 1) {
                    length = charSequence.length();
                    this.f12012o = -1;
                    if (length > i8) {
                        charSequence.charAt(length - 1);
                        c1074c.getClass();
                    }
                } else {
                    this.f12013p = i11 - 1;
                }
                string = charSequence.subSequence(i8, length).toString();
            }
        }
        this.f12009l = string;
        if (this.f12008k == 3) {
            return false;
        }
        this.f12008k = 1;
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f12008k = 2;
        String str = this.f12009l;
        this.f12009l = null;
        return str;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
