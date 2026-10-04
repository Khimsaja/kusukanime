package b6;

import b1.AbstractC0703b;
import z5.AbstractC2517v;

/* loaded from: classes.dex */
public class G extends V1.i {

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC0738m f10981f;

    /* renamed from: g, reason: collision with root package name */
    public final char[] f10982g;

    /* renamed from: h, reason: collision with root package name */
    public int f10983h = 128;

    /* renamed from: i, reason: collision with root package name */
    public final C0728c f10984i;

    public G(InterfaceC0738m interfaceC0738m, char[] cArr) {
        this.f10981f = interfaceC0738m;
        this.f10982g = cArr;
        this.f10984i = new C0728c(cArr);
        G(0);
    }

    @Override // V1.i
    public int C() {
        int iZ;
        char c2;
        int i7 = this.f9380b;
        while (true) {
            iZ = z(i7);
            if (iZ == -1 || !((c2 = this.f10984i.a[iZ]) == ' ' || c2 == '\n' || c2 == '\r' || c2 == '\t')) {
                break;
            }
            i7 = iZ + 1;
        }
        this.f9380b = iZ;
        return iZ;
    }

    @Override // V1.i
    public final String D(int i7, int i8) {
        C0728c c0728c = this.f10984i;
        return AbstractC2517v.H(c0728c.a, i7, Math.min(i8, c0728c.f11017b));
    }

    public final void G(int i7) {
        C0728c c0728c = this.f10984i;
        char[] cArr = c0728c.a;
        if (i7 != 0) {
            int i8 = this.f9380b;
            P3.m.X(cArr, cArr, 0, i8, i8 + i7);
        }
        int i9 = c0728c.f11017b;
        while (true) {
            if (i7 == i9) {
                break;
            }
            int iJ0 = this.f10981f.J0(cArr, i7, i9 - i7);
            if (iJ0 == -1) {
                c0728c.f11017b = Math.min(c0728c.a.length, i7);
                this.f10983h = -1;
                break;
            }
            i7 += iJ0;
        }
        this.f9380b = 0;
    }

    public final void H() {
        C0733h c0733h = C0733h.f11021c;
        c0733h.getClass();
        char[] cArr = this.f10982g;
        kotlin.jvm.internal.l.f("array", cArr);
        if (cArr.length == 16384) {
            c0733h.a(cArr);
        } else {
            throw new IllegalArgumentException(("Inconsistent internal invariant: unexpected array size " + cArr.length).toString());
        }
    }

    @Override // V1.i
    public final void b(int i7, int i8) {
        ((StringBuilder) this.f9383e).append(this.f10984i.a, i7, i8 - i7);
    }

    @Override // V1.i
    public boolean c() {
        o();
        int i7 = this.f9380b;
        while (true) {
            int iZ = z(i7);
            if (iZ == -1) {
                this.f9380b = iZ;
                return false;
            }
            char c2 = this.f10984i.a[iZ];
            if (c2 != ' ' && c2 != '\n' && c2 != '\r' && c2 != '\t') {
                this.f9380b = iZ;
                return V1.i.v(c2);
            }
            i7 = iZ + 1;
        }
    }

    @Override // V1.i
    public final String e() {
        char[] cArr;
        h('\"');
        int i7 = this.f9380b;
        C0728c c0728c = this.f10984i;
        int i8 = c0728c.f11017b;
        int i9 = i7;
        while (true) {
            cArr = c0728c.a;
            if (i9 >= i8) {
                i9 = -1;
                break;
            }
            if (cArr[i9] == '\"') {
                break;
            }
            i9++;
        }
        if (i9 == -1) {
            int iZ = z(i7);
            if (iZ != -1) {
                return k(c0728c, this.f9380b, iZ);
            }
            int i10 = this.f9380b;
            int i11 = i10 - 1;
            V1.i.r(this, AbstractC0703b.j("Expected quotation mark '\"', but had '", (i10 == c0728c.f11017b || i11 < 0) ? "EOF" : String.valueOf(c0728c.a[i11]), "' instead"), i11, null, 4);
            throw null;
        }
        for (int i12 = i7; i12 < i9; i12++) {
            if (cArr[i12] == '\\') {
                return k(c0728c, this.f9380b, i12);
            }
        }
        this.f9380b = i9 + 1;
        return AbstractC2517v.H(cArr, i7, Math.min(i9, c0728c.f11017b));
    }

    @Override // V1.i
    public byte f() {
        o();
        int i7 = this.f9380b;
        while (true) {
            int iZ = z(i7);
            if (iZ == -1) {
                this.f9380b = iZ;
                return (byte) 10;
            }
            int i8 = iZ + 1;
            byte bH = v.h(this.f10984i.a[iZ]);
            if (bH != 3) {
                this.f9380b = i8;
                return bH;
            }
            i7 = i8;
        }
    }

    @Override // V1.i
    public void h(char c2) {
        o();
        int i7 = this.f9380b;
        while (true) {
            int iZ = z(i7);
            if (iZ == -1) {
                this.f9380b = iZ;
                F(c2);
                throw null;
            }
            int i8 = iZ + 1;
            char c4 = this.f10984i.a[iZ];
            if (c4 != ' ' && c4 != '\n' && c4 != '\r' && c4 != '\t') {
                this.f9380b = i8;
                if (c4 == c2) {
                    return;
                }
                F(c2);
                throw null;
            }
            i7 = i8;
        }
    }

    @Override // V1.i
    public final void o() {
        int i7 = this.f10984i.f11017b - this.f9380b;
        if (i7 > this.f10983h) {
            return;
        }
        G(i7);
    }

    @Override // V1.i
    public final CharSequence t() {
        return this.f10984i;
    }

    @Override // V1.i
    public final String w(String str, boolean z7) {
        kotlin.jvm.internal.l.f("keyToMatch", str);
        return null;
    }

    @Override // V1.i
    public final int z(int i7) {
        C0728c c0728c = this.f10984i;
        if (i7 < c0728c.f11017b) {
            return i7;
        }
        this.f9380b = i7;
        o();
        return (this.f9380b != 0 || c0728c.length() == 0) ? -1 : 0;
    }
}
