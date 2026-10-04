package D4;

import O.C0486d;
import e5.AbstractC0832b;
import f6.C0920r;
import io.ktor.http.ContentDisposition;
import io.ktor.util.GzipHeaderFlags;
import j3.AbstractC1331q;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import n0.C1541h;
import n0.C1542i;
import n0.C1543j;
import n0.C1544k;
import n0.C1545l;
import n0.C1546m;
import n0.C1548o;
import n0.C1549p;
import n0.C1550q;
import n0.C1552s;
import n0.C1553t;
import n0.C1554u;
import p.AbstractC1766r;
import p.C1717D;
import p.InterfaceC1716C;
import p.InterfaceC1767s;
import s2.C1973a;
import z5.AbstractC2510o;

/* loaded from: classes.dex */
public final class S implements P1.a, InterfaceC1767s {

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f1530k;

    public S(int i7) {
        this.f1530k = new ArrayList(i7);
    }

    public void A(float f5) {
        this.f1530k.add(new C1553t(f5));
    }

    @Override // P1.a
    public j3.G a(long j7) {
        int iP = p(j7);
        if (iP == 0) {
            j3.E e7 = j3.G.f12277l;
            return j3.X.f12304o;
        }
        C1973a c1973a = (C1973a) this.f1530k.get(iP - 1);
        long j8 = c1973a.f15510d;
        if (j8 == -9223372036854775807L || j7 < j8) {
            return c1973a.a;
        }
        j3.E e8 = j3.G.f12277l;
        return j3.X.f12304o;
    }

    @Override // P1.a
    public long b(long j7) {
        ArrayList arrayList = this.f1530k;
        if (arrayList.isEmpty()) {
            return Long.MIN_VALUE;
        }
        if (j7 < ((C1973a) arrayList.get(0)).f15508b) {
            return ((C1973a) arrayList.get(0)).f15508b;
        }
        for (int i7 = 1; i7 < arrayList.size(); i7++) {
            C1973a c1973a = (C1973a) arrayList.get(i7);
            if (j7 < c1973a.f15508b) {
                long j8 = ((C1973a) arrayList.get(i7 - 1)).f15510d;
                long j9 = c1973a.f15508b;
                return (j8 == -9223372036854775807L || j8 <= j7 || j8 >= j9) ? j9 : j8;
            }
        }
        long j10 = ((C1973a) AbstractC1331q.g(arrayList)).f15510d;
        if (j10 == -9223372036854775807L || j7 >= j10) {
            return Long.MIN_VALUE;
        }
        return j10;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0023  */
    @Override // P1.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean c(s2.C1973a r10, long r11) {
        /*
            r9 = this;
            long r0 = r10.f15508b
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r5 = 0
            r6 = 1
            if (r4 == 0) goto Lf
            r4 = r6
            goto L10
        Lf:
            r4 = r5
        L10:
            B1.AbstractC0015b.c(r4)
            int r4 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r4 > 0) goto L23
            long r7 = r10.f15510d
            int r2 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r2 == 0) goto L21
            int r2 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r2 >= 0) goto L23
        L21:
            r2 = r6
            goto L24
        L23:
            r2 = r5
        L24:
            java.util.ArrayList r3 = r9.f1530k
            int r4 = r3.size()
            int r4 = r4 - r6
        L2b:
            if (r4 < 0) goto L4e
            java.lang.Object r7 = r3.get(r4)
            s2.a r7 = (s2.C1973a) r7
            long r7 = r7.f15508b
            int r7 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r7 < 0) goto L3e
            int r4 = r4 + r6
            r3.add(r4, r10)
            return r2
        L3e:
            java.lang.Object r7 = r3.get(r4)
            s2.a r7 = (s2.C1973a) r7
            long r7 = r7.f15508b
            int r7 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r7 > 0) goto L4b
            r2 = r5
        L4b:
            int r4 = r4 + (-1)
            goto L2b
        L4e:
            r3.add(r5, r10)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: D4.S.c(s2.a, long):boolean");
    }

    @Override // P1.a
    public void clear() {
        this.f1530k.clear();
    }

    @Override // P1.a
    public long d(long j7) {
        ArrayList arrayList = this.f1530k;
        if (arrayList.isEmpty() || j7 < ((C1973a) arrayList.get(0)).f15508b) {
            return -9223372036854775807L;
        }
        for (int i7 = 1; i7 < arrayList.size(); i7++) {
            long j8 = ((C1973a) arrayList.get(i7)).f15508b;
            if (j7 == j8) {
                return j8;
            }
            if (j7 < j8) {
                C1973a c1973a = (C1973a) arrayList.get(i7 - 1);
                long j9 = c1973a.f15510d;
                return (j9 == -9223372036854775807L || j9 > j7) ? c1973a.f15508b : j9;
            }
        }
        C1973a c1973a2 = (C1973a) AbstractC1331q.g(arrayList);
        long j10 = c1973a2.f15510d;
        return (j10 == -9223372036854775807L || j7 < j10) ? c1973a2.f15508b : j10;
    }

    @Override // P1.a
    public void e(long j7) {
        int iP = p(j7);
        if (iP == 0) {
            return;
        }
        ArrayList arrayList = this.f1530k;
        long j8 = ((C1973a) arrayList.get(iP - 1)).f15510d;
        if (j8 == -9223372036854775807L || j8 >= j7) {
            iP--;
        }
        arrayList.subList(0, iP).clear();
    }

    public void f(int i7) {
        ArrayList arrayList = this.f1530k;
        if (arrayList.isEmpty() || !(((Number) arrayList.get(0)).intValue() == i7 || ((Number) arrayList.get(arrayList.size() - 1)).intValue() == i7)) {
            int size = arrayList.size();
            arrayList.add(Integer.valueOf(i7));
            while (size > 0) {
                int i8 = ((size + 1) >>> 1) - 1;
                int iIntValue = ((Number) arrayList.get(i8)).intValue();
                if (i7 <= iIntValue) {
                    break;
                }
                arrayList.set(size, Integer.valueOf(iIntValue));
                size = i8;
            }
            arrayList.set(size, Integer.valueOf(i7));
        }
    }

    public void g(Object obj) {
        this.f1530k.add(obj);
    }

    @Override // p.InterfaceC1767s
    public InterfaceC1716C get(int i7) {
        return (C1717D) this.f1530k.get(i7);
    }

    public void h(String str, String str2) {
        kotlin.jvm.internal.l.f(ContentDisposition.Parameters.Name, str);
        kotlin.jvm.internal.l.f("value", str2);
        AbstractC0832b.j(str);
        AbstractC0832b.k(str2, str);
        i(str, str2);
    }

    public void i(String str, String str2) {
        kotlin.jvm.internal.l.f(ContentDisposition.Parameters.Name, str);
        kotlin.jvm.internal.l.f("value", str2);
        ArrayList arrayList = this.f1530k;
        arrayList.add(str);
        arrayList.add(AbstractC2510o.J0(str2).toString());
    }

    public void j(Object obj) {
        if (obj == null) {
            return;
        }
        boolean z7 = obj instanceof Object[];
        ArrayList arrayList = this.f1530k;
        if (z7) {
            Object[] objArr = (Object[]) obj;
            if (objArr.length > 0) {
                arrayList.ensureCapacity(arrayList.size() + objArr.length);
                Collections.addAll(arrayList, objArr);
                return;
            }
            return;
        }
        if (obj instanceof Collection) {
            arrayList.addAll((Collection) obj);
            return;
        }
        if (obj instanceof Iterable) {
            Iterator it = ((Iterable) obj).iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
        } else {
            if (!(obj instanceof Iterator)) {
                throw new UnsupportedOperationException("Don't know how to spread " + obj.getClass());
            }
            Iterator it2 = (Iterator) obj;
            while (it2.hasNext()) {
                arrayList.add(it2.next());
            }
        }
    }

    public void k(String str, String str2) {
        kotlin.jvm.internal.l.f(ContentDisposition.Parameters.Name, str);
        kotlin.jvm.internal.l.f("value", str2);
        if (str.length() <= 0) {
            throw new IllegalArgumentException("name is empty");
        }
        int length = str.length();
        for (int i7 = 0; i7 < length; i7++) {
            char cCharAt = str.charAt(i7);
            if ('!' > cCharAt || cCharAt >= 127) {
                throw new IllegalArgumentException(g6.b.i("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(cCharAt), Integer.valueOf(i7), str).toString());
            }
        }
        i(str, str2);
    }

    public C0920r l() {
        return new C0920r((String[]) this.f1530k.toArray(new String[0]));
    }

    public void m() {
        this.f1530k.add(C1541h.f13175b);
    }

    public void n(float f5, float f7, float f8, float f9, float f10, float f11) {
        this.f1530k.add(new C1542i(f5, f7, f8, f9, f10, f11));
    }

    public void o(float f5, float f7, float f8, float f9, float f10, float f11) {
        this.f1530k.add(new C1548o(f5, f7, f8, f9, f10, f11));
    }

    public int p(long j7) {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f1530k;
            if (i7 >= arrayList.size()) {
                return arrayList.size();
            }
            if (j7 < ((C1973a) arrayList.get(i7)).f15508b) {
                return i7;
            }
            i7++;
        }
    }

    public void q(float f5) {
        this.f1530k.add(new C1543j(f5));
    }

    public void r(float f5) {
        this.f1530k.add(new C1549p(f5));
    }

    public void s(float f5, float f7) {
        this.f1530k.add(new C1544k(f5, f7));
    }

    public void t(float f5, float f7) {
        this.f1530k.add(new C1550q(f5, f7));
    }

    public void u(float f5, float f7) {
        this.f1530k.add(new C1545l(f5, f7));
    }

    public void v(float f5, float f7, float f8, float f9) {
        this.f1530k.add(new C1546m(f5, f7, f8, f9));
    }

    public void w(float f5, float f7, float f8, float f9) {
        this.f1530k.add(new C1552s(f5, f7, f8, f9));
    }

    public void x(String str) {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f1530k;
            if (i7 >= arrayList.size()) {
                return;
            }
            if (str.equalsIgnoreCase((String) arrayList.get(i7))) {
                arrayList.remove(i7);
                arrayList.remove(i7);
                i7 -= 2;
            }
            i7 += 2;
        }
    }

    public int y() {
        int iIntValue;
        ArrayList arrayList = this.f1530k;
        if (arrayList.size() <= 0) {
            C0486d.w("Set is empty");
            throw null;
        }
        int iIntValue2 = ((Number) arrayList.get(0)).intValue();
        while (!arrayList.isEmpty() && ((Number) arrayList.get(0)).intValue() == iIntValue2) {
            arrayList.set(0, P3.q.A0(arrayList));
            arrayList.remove(arrayList.size() - 1);
            int size = arrayList.size();
            int size2 = arrayList.size() >>> 1;
            int i7 = 0;
            while (i7 < size2) {
                int iIntValue3 = ((Number) arrayList.get(i7)).intValue();
                int i8 = (i7 + 1) * 2;
                int i9 = i8 - 1;
                int iIntValue4 = ((Number) arrayList.get(i9)).intValue();
                if (i8 >= size || (iIntValue = ((Number) arrayList.get(i8)).intValue()) <= iIntValue4) {
                    if (iIntValue4 > iIntValue3) {
                        arrayList.set(i7, Integer.valueOf(iIntValue4));
                        arrayList.set(i9, Integer.valueOf(iIntValue3));
                        i7 = i9;
                    }
                } else if (iIntValue > iIntValue3) {
                    arrayList.set(i7, Integer.valueOf(iIntValue));
                    arrayList.set(i8, Integer.valueOf(iIntValue3));
                    i7 = i8;
                }
            }
        }
        return iIntValue2;
    }

    public void z(float f5) {
        this.f1530k.add(new C1554u(f5));
    }

    public S(V v5) {
        this.f1530k = new ArrayList(1);
    }

    public S(int i7, boolean z7) {
        switch (i7) {
            case 2:
                this.f1530k = new ArrayList();
                break;
            case 3:
                this.f1530k = new ArrayList();
                break;
            case GzipHeaderFlags.EXTRA /* 4 */:
                this.f1530k = new ArrayList();
                break;
            case 5:
                this.f1530k = new ArrayList(20);
                break;
            case 6:
            default:
                this.f1530k = new ArrayList();
                break;
            case 7:
                this.f1530k = new ArrayList(32);
                break;
        }
    }

    public S(float f5, float f7, AbstractC1766r abstractC1766r) {
        k4.g gVarL = e3.c.L(0, abstractC1766r.b());
        ArrayList arrayList = new ArrayList(P3.r.p(gVarL, 10));
        k4.f it = gVarL.iterator();
        while (it.f12677m) {
            arrayList.add(new C1717D(f5, f7, abstractC1766r.a(it.a())));
        }
        this.f1530k = arrayList;
    }
}
