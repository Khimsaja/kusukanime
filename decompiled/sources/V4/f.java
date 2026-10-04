package V4;

import P3.A;
import P3.B;
import P3.C;
import P3.F;
import P3.o;
import P3.q;
import P3.r;
import U4.h;
import U4.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class f implements T4.g {

    /* renamed from: d, reason: collision with root package name */
    public static final List f9486d;
    public final String[] a;

    /* renamed from: b, reason: collision with root package name */
    public final Set f9487b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f9488c;

    static {
        String strY0 = q.y0(r.I('k', 'o', 't', 'l', 'i', 'n'), "", null, null, null, 62);
        List listI = r.I(A6.b.h(strY0, "/Any"), A6.b.h(strY0, "/Nothing"), A6.b.h(strY0, "/Unit"), A6.b.h(strY0, "/Throwable"), A6.b.h(strY0, "/Number"), A6.b.h(strY0, "/Byte"), A6.b.h(strY0, "/Double"), A6.b.h(strY0, "/Float"), A6.b.h(strY0, "/Int"), A6.b.h(strY0, "/Long"), A6.b.h(strY0, "/Short"), A6.b.h(strY0, "/Boolean"), A6.b.h(strY0, "/Char"), A6.b.h(strY0, "/CharSequence"), A6.b.h(strY0, "/String"), A6.b.h(strY0, "/Comparable"), A6.b.h(strY0, "/Enum"), A6.b.h(strY0, "/Array"), A6.b.h(strY0, "/ByteArray"), A6.b.h(strY0, "/DoubleArray"), A6.b.h(strY0, "/FloatArray"), A6.b.h(strY0, "/IntArray"), A6.b.h(strY0, "/LongArray"), A6.b.h(strY0, "/ShortArray"), A6.b.h(strY0, "/BooleanArray"), A6.b.h(strY0, "/CharArray"), A6.b.h(strY0, "/Cloneable"), A6.b.h(strY0, "/Annotation"), A6.b.h(strY0, "/collections/Iterable"), A6.b.h(strY0, "/collections/MutableIterable"), A6.b.h(strY0, "/collections/Collection"), A6.b.h(strY0, "/collections/MutableCollection"), A6.b.h(strY0, "/collections/List"), A6.b.h(strY0, "/collections/MutableList"), A6.b.h(strY0, "/collections/Set"), A6.b.h(strY0, "/collections/MutableSet"), A6.b.h(strY0, "/collections/Map"), A6.b.h(strY0, "/collections/MutableMap"), A6.b.h(strY0, "/collections/Map.Entry"), A6.b.h(strY0, "/collections/MutableMap.MutableEntry"), A6.b.h(strY0, "/collections/Iterator"), A6.b.h(strY0, "/collections/MutableIterator"), A6.b.h(strY0, "/collections/ListIterator"), A6.b.h(strY0, "/collections/MutableListIterator"));
        f9486d = listI;
        o oVarY0 = q.Y0(listI);
        int I = F.I(r.p(oVarY0, 10));
        if (I < 16) {
            I = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(I);
        Iterator it = oVarY0.iterator();
        while (true) {
            C c2 = (C) it;
            if (!c2.f7740l.hasNext()) {
                return;
            }
            B b4 = (B) c2.next();
            linkedHashMap.put((String) b4.f7738b, Integer.valueOf(b4.a));
        }
    }

    public f(i iVar, String[] strArr) {
        l.f("strings", strArr);
        List list = iVar.f9294m;
        Set setX0 = list.isEmpty() ? A.f7737k : q.X0(list);
        List<h> list2 = iVar.f9293l;
        l.e("getRecordList(...)", list2);
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(list2.size());
        for (h hVar : list2) {
            int i7 = hVar.f9280m;
            for (int i8 = 0; i8 < i7; i8++) {
                arrayList.add(hVar);
            }
        }
        arrayList.trimToSize();
        this.a = strArr;
        this.f9487b = setX0;
        this.f9488c = arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003f  */
    @Override // T4.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String a(int r10) {
        /*
            r9 = this;
            java.util.ArrayList r0 = r9.f9488c
            java.lang.Object r0 = r0.get(r10)
            U4.h r0 = (U4.h) r0
            int r1 = r0.f9279l
            r2 = r1 & 4
            r3 = 2
            r4 = 4
            if (r2 != r4) goto L29
            java.lang.Object r10 = r0.f9282o
            boolean r1 = r10 instanceof java.lang.String
            if (r1 == 0) goto L19
            java.lang.String r10 = (java.lang.String) r10
            goto L43
        L19:
            X4.e r10 = (X4.AbstractC0608e) r10
            java.lang.String r1 = r10.w()
            boolean r10 = r10.q()
            if (r10 == 0) goto L27
            r0.f9282o = r1
        L27:
            r10 = r1
            goto L43
        L29:
            r1 = r1 & r3
            if (r1 != r3) goto L3f
            java.util.List r1 = V4.f.f9486d
            int r2 = r1.size()
            int r4 = r0.f9281n
            if (r4 < 0) goto L3f
            if (r4 >= r2) goto L3f
            java.lang.Object r10 = r1.get(r4)
            java.lang.String r10 = (java.lang.String) r10
            goto L43
        L3f:
            java.lang.String[] r1 = r9.a
            r10 = r1[r10]
        L43:
            java.util.List r1 = r0.f9284q
            int r1 = r1.size()
            java.lang.String r2 = "substring(...)"
            r4 = 0
            r5 = 1
            if (r1 < r3) goto L89
            java.util.List r1 = r0.f9284q
            kotlin.jvm.internal.l.c(r1)
            java.lang.Object r6 = r1.get(r4)
            java.lang.Integer r6 = (java.lang.Integer) r6
            java.lang.Object r1 = r1.get(r5)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r7 = r6.intValue()
            if (r7 < 0) goto L89
            int r7 = r6.intValue()
            int r8 = r1.intValue()
            if (r7 > r8) goto L89
            int r7 = r1.intValue()
            int r8 = r10.length()
            if (r7 > r8) goto L89
            int r6 = r6.intValue()
            int r1 = r1.intValue()
            java.lang.String r10 = r10.substring(r6, r1)
            kotlin.jvm.internal.l.e(r2, r10)
        L89:
            java.util.List r1 = r0.f9286s
            int r1 = r1.size()
            if (r1 < r3) goto Lb3
            java.util.List r1 = r0.f9286s
            kotlin.jvm.internal.l.c(r1)
            java.lang.Object r4 = r1.get(r4)
            java.lang.Integer r4 = (java.lang.Integer) r4
            java.lang.Object r1 = r1.get(r5)
            java.lang.Integer r1 = (java.lang.Integer) r1
            kotlin.jvm.internal.l.c(r10)
            int r4 = r4.intValue()
            char r4 = (char) r4
            int r1 = r1.intValue()
            char r1 = (char) r1
            java.lang.String r10 = z5.AbstractC2517v.Q(r10, r4, r1)
        Lb3:
            U4.g r0 = r0.f9283p
            if (r0 != 0) goto Lb9
            U4.g r0 = U4.g.NONE
        Lb9:
            int r0 = r0.ordinal()
            if (r0 == 0) goto Leb
            r1 = 46
            r4 = 36
            if (r0 == r5) goto Le4
            if (r0 != r3) goto Lde
            int r0 = r10.length()
            if (r0 < r3) goto Ld9
            int r0 = r10.length()
            int r0 = r0 - r5
            java.lang.String r10 = r10.substring(r5, r0)
            kotlin.jvm.internal.l.e(r2, r10)
        Ld9:
            java.lang.String r10 = z5.AbstractC2517v.Q(r10, r4, r1)
            goto Leb
        Lde:
            D6.r r10 = new D6.r
            r10.<init>()
            throw r10
        Le4:
            kotlin.jvm.internal.l.c(r10)
            java.lang.String r10 = z5.AbstractC2517v.Q(r10, r4, r1)
        Leb:
            kotlin.jvm.internal.l.c(r10)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: V4.f.a(int):java.lang.String");
    }

    @Override // T4.g
    public final boolean b(int i7) {
        return this.f9487b.contains(Integer.valueOf(i7));
    }

    @Override // T4.g
    public final String c(int i7) {
        return a(i7);
    }
}
