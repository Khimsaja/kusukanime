package m2;

import A6.b;
import f1.AbstractC0871d;
import y1.B;
import y1.C2403z;

/* renamed from: m2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1510a implements B {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final String f12967b;

    public C1510a(String str, String str2) {
        this.a = AbstractC0871d.s0(str);
        this.f12967b = str2;
    }

    @Override // y1.B
    public final void c(C2403z c2403z) {
        String str;
        String str2 = this.a;
        str2.getClass();
        str = this.f12967b;
        switch (str2) {
            case "TOTALTRACKS":
                Integer numU0 = AbstractC0871d.u0(str);
                if (numU0 != null) {
                    c2403z.f18151i = numU0;
                    break;
                }
                break;
            case "TOTALDISCS":
                Integer numU02 = AbstractC0871d.u0(str);
                if (numU02 != null) {
                    c2403z.f18164v = numU02;
                    break;
                }
                break;
            case "TRACKNUMBER":
                Integer numU03 = AbstractC0871d.u0(str);
                if (numU03 != null) {
                    c2403z.f18150h = numU03;
                    break;
                }
                break;
            case "ALBUM":
                c2403z.f18145c = str;
                break;
            case "GENRE":
                c2403z.f18165w = str;
                break;
            case "TITLE":
                c2403z.a = str;
                break;
            case "DESCRIPTION":
                c2403z.f18147e = str;
                break;
            case "DISCNUMBER":
                Integer numU04 = AbstractC0871d.u0(str);
                if (numU04 != null) {
                    c2403z.f18163u = numU04;
                    break;
                }
                break;
            case "ALBUMARTIST":
                c2403z.f18146d = str;
                break;
            case "ARTIST":
                c2403z.f18144b = str;
                break;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1510a.class == obj.getClass()) {
            C1510a c1510a = (C1510a) obj;
            if (this.a.equals(c1510a.a) && this.f12967b.equals(c1510a.f12967b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f12967b.hashCode() + b.b(this.a, 527, 31);
    }

    public final String toString() {
        return "VC: " + this.a + "=" + this.f12967b;
    }
}
