package j2;

import B1.AbstractC0015b;
import j3.G;
import j3.X;
import java.util.ArrayList;
import java.util.Objects;

/* loaded from: classes.dex */
public final class n extends i {

    /* renamed from: b, reason: collision with root package name */
    public final String f12262b;

    /* renamed from: c, reason: collision with root package name */
    public final G f12263c;

    public n(String str, String str2, X x7) {
        super(str);
        AbstractC0015b.c(!x7.isEmpty());
        this.f12262b = str2;
        G gS = G.s(x7);
        this.f12263c = gS;
    }

    public static ArrayList d(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(8, 10))));
                return arrayList;
            }
            if (str.length() >= 7) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                return arrayList;
            }
            if (str.length() >= 4) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
            }
            return arrayList;
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0011  */
    @Override // y1.B
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(y1.C2403z r10) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 752
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j2.n.c(y1.z):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && n.class == obj.getClass()) {
            n nVar = (n) obj;
            if (Objects.equals(this.a, nVar.a) && Objects.equals(this.f12262b, nVar.f12262b) && this.f12263c.equals(nVar.f12263c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iB = A6.b.b(this.a, 527, 31);
        String str = this.f12262b;
        return this.f12263c.hashCode() + ((iB + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // j2.i
    public final String toString() {
        return this.a + ": description=" + this.f12262b + ": values=" + this.f12263c;
    }
}
