package B1;

import C2.C0034g;
import D4.f0;
import D4.g0;
import D4.h0;
import D6.AbstractC0112f;
import D6.AbstractC0119m;
import D6.InterfaceC0113g;
import D6.InterfaceC0120n;
import H0.AbstractC0215g;
import H0.C0212d;
import H0.C0214f;
import H1.C0242x;
import K2.C0297a;
import K2.C0321z;
import K5.Y;
import O3.EnumC0555d;
import a3.C0662a;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Looper;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import androidx.recyclerview.widget.RecyclerView;
import b5.C0719a;
import c.C0743e;
import f6.C0922t;
import f6.InterfaceC0907e;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.text.Bidi;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import s2.InterfaceC1976d;
import v4.InterfaceC2154b;
import y2.C2404a;
import y2.C2406c;
import y2.C2409f;
import z5.AbstractC2510o;

/* renamed from: B1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0017d implements H0.r, P4.l, InterfaceC1976d {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f317k;

    /* renamed from: l, reason: collision with root package name */
    public Object f318l;

    /* renamed from: m, reason: collision with root package name */
    public Object f319m;

    /* renamed from: n, reason: collision with root package name */
    public Object f320n;

    /* renamed from: o, reason: collision with root package name */
    public Object f321o;

    /* renamed from: p, reason: collision with root package name */
    public Object f322p;

    public /* synthetic */ C0017d() {
        this.f317k = 1;
    }

    public int A(int i7, int i8) {
        while (i7 > i8) {
            char cCharAt = ((Layout) this.f318l).getText().charAt(i7 - 1);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != 5760 && ((kotlin.jvm.internal.l.g(cCharAt, 8192) < 0 || kotlin.jvm.internal.l.g(cCharAt, 8202) > 0 || cCharAt == 8199) && cCharAt != 8287 && cCharAt != 12288)) {
                return i7;
            }
            i7--;
        }
        return i7;
    }

    public C0297a B(int i7, int i8, int i9) {
        C0297a c0297a = (C0297a) ((F5.o) this.f318l).b();
        if (c0297a != null) {
            c0297a.a = i7;
            c0297a.f4547b = i8;
            c0297a.f4548c = i9;
            return c0297a;
        }
        C0297a c0297a2 = new C0297a();
        c0297a2.a = i7;
        c0297a2.f4547b = i8;
        c0297a2.f4548c = i9;
        return c0297a2;
    }

    public void C(C0297a c0297a) {
        ((ArrayList) this.f320n).add(c0297a);
        int i7 = c0297a.a;
        C0321z c0321z = (C0321z) this.f321o;
        if (i7 == 1) {
            c0321z.d(c0297a.f4547b, c0297a.f4548c);
            return;
        }
        if (i7 == 2) {
            int i8 = c0297a.f4547b;
            int i9 = c0297a.f4548c;
            RecyclerView recyclerView = c0321z.a;
            recyclerView.K(i8, i9, false);
            recyclerView.f10859q0 = true;
            return;
        }
        if (i7 == 4) {
            c0321z.c(c0297a.f4547b, c0297a.f4548c);
        } else if (i7 == 8) {
            c0321z.e(c0297a.f4547b, c0297a.f4548c);
        } else {
            throw new IllegalArgumentException("Unknown update op type for " + c0297a);
        }
    }

    public void D(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            C0297a c0297a = (C0297a) arrayList.get(i7);
            c0297a.getClass();
            ((F5.o) this.f318l).t(c0297a);
        }
        arrayList.clear();
    }

    public InterfaceC0120n E(Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr2, "methodAnnotations == null");
        List list = (List) this.f321o;
        int iIndexOf = list.indexOf(null) + 1;
        int size = list.size();
        for (int i7 = iIndexOf; i7 < size; i7++) {
            InterfaceC0120n interfaceC0120nA = ((AbstractC0119m) list.get(i7)).a(type, annotationArr);
            if (interfaceC0120nA != null) {
                return interfaceC0120nA;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate RequestBody converter for ");
        sb.append(type);
        sb.append(".\n  Tried:");
        int size2 = list.size();
        while (iIndexOf < size2) {
            sb.append("\n   * ");
            sb.append(((AbstractC0119m) list.get(iIndexOf)).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public InterfaceC0120n F(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        List list = (List) this.f321o;
        int iIndexOf = list.indexOf(null) + 1;
        int size = list.size();
        for (int i7 = iIndexOf; i7 < size; i7++) {
            InterfaceC0120n interfaceC0120nB = ((AbstractC0119m) list.get(i7)).b(type, annotationArr, this);
            if (interfaceC0120nB != null) {
                return interfaceC0120nB;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate ResponseBody converter for ");
        sb.append(type);
        sb.append(".\n  Tried:");
        int size2 = list.size();
        while (iIndexOf < size2) {
            sb.append("\n   * ");
            sb.append(((AbstractC0119m) list.get(iIndexOf)).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public void G(String str, Object obj) {
        kotlin.jvm.internal.l.f("key", str);
        ((LinkedHashMap) this.f318l).put(str, obj);
        K5.G g4 = (K5.G) ((LinkedHashMap) this.f320n).get(str);
        if (g4 != null) {
            ((Y) g4).h(obj);
        }
        K5.G g7 = (K5.G) ((LinkedHashMap) this.f321o).get(str);
        if (g7 != null) {
            ((Y) g7).h(obj);
        }
    }

    public void H(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        List list = (List) this.f321o;
        int size = list.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((AbstractC0119m) list.get(i7)).getClass();
        }
    }

    public int I(int i7, int i8) {
        int i9;
        int i10;
        ArrayList arrayList = (ArrayList) this.f320n;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C0297a c0297a = (C0297a) arrayList.get(size);
            int i11 = c0297a.a;
            if (i11 == 8) {
                int i12 = c0297a.f4547b;
                int i13 = c0297a.f4548c;
                if (i12 < i13) {
                    i10 = i12;
                    i9 = i13;
                } else {
                    i9 = i12;
                    i10 = i13;
                }
                if (i7 < i10 || i7 > i9) {
                    if (i7 < i12) {
                        if (i8 == 1) {
                            c0297a.f4547b = i12 + 1;
                            c0297a.f4548c = i13 + 1;
                        } else if (i8 == 2) {
                            c0297a.f4547b = i12 - 1;
                            c0297a.f4548c = i13 - 1;
                        }
                    }
                } else if (i10 == i12) {
                    if (i8 == 1) {
                        c0297a.f4548c = i13 + 1;
                    } else if (i8 == 2) {
                        c0297a.f4548c = i13 - 1;
                    }
                    i7++;
                } else {
                    if (i8 == 1) {
                        c0297a.f4547b = i12 + 1;
                    } else if (i8 == 2) {
                        c0297a.f4547b = i12 - 1;
                    }
                    i7--;
                }
            } else {
                int i14 = c0297a.f4547b;
                if (i14 <= i7) {
                    if (i11 == 1) {
                        i7 -= c0297a.f4548c;
                    } else if (i11 == 2) {
                        i7 += c0297a.f4548c;
                    }
                } else if (i8 == 1) {
                    c0297a.f4547b = i14 + 1;
                } else if (i8 == 2) {
                    c0297a.f4547b = i14 - 1;
                }
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            C0297a c0297a2 = (C0297a) arrayList.get(size2);
            int i15 = c0297a2.a;
            F5.o oVar = (F5.o) this.f318l;
            if (i15 == 8) {
                int i16 = c0297a2.f4548c;
                if (i16 == c0297a2.f4547b || i16 < 0) {
                    arrayList.remove(size2);
                    oVar.t(c0297a2);
                }
            } else if (c0297a2.f4548c <= 0) {
                arrayList.remove(size2);
                oVar.t(c0297a2);
            }
        }
        return i7;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [O3.i, java.lang.Object] */
    @Override // H0.r
    public float a() {
        return ((Number) this.f321o.getValue()).floatValue();
    }

    @Override // H0.r
    public boolean b() {
        ArrayList arrayList = (ArrayList) this.f320n;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            if (((H0.q) arrayList.get(i7)).a.b()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [O3.i, java.lang.Object] */
    @Override // H0.r
    public float c() {
        return ((Number) this.f322p.getValue()).floatValue();
    }

    @Override // s2.InterfaceC1976d
    public int d(long j7) {
        long[] jArr = (long[]) this.f319m;
        int iA = K.a(jArr, j7, false);
        if (iA < jArr.length) {
            return iA;
        }
        return -1;
    }

    @Override // s2.InterfaceC1976d
    public long e(int i7) {
        return ((long[]) this.f319m)[i7];
    }

    @Override // P4.l, P4.m
    public void f() {
        ((E4.h) this.f319m).f();
        C0719a c0719a = new C0719a((InterfaceC2154b) P3.q.K0((ArrayList) this.f322p));
        ((HashMap) ((E4.h) this.f320n).f1942m).put((W4.e) this.f321o, c0719a);
    }

    @Override // P4.l
    public void g(W4.e eVar, b5.f fVar) {
        ((E4.h) this.f318l).g(eVar, fVar);
    }

    public void h(X2.f fVar, Class cls) {
        ((ArrayList) this.f321o).add(new O3.l(fVar, cls));
    }

    @Override // s2.InterfaceC1976d
    public List i(long j7) {
        C2406c c2406c = (C2406c) this.f318l;
        ArrayList arrayList = new ArrayList();
        c2406c.g(j7, c2406c.f18182h, arrayList);
        TreeMap treeMap = new TreeMap();
        c2406c.i(j7, false, c2406c.f18182h, treeMap);
        HashMap map = (HashMap) this.f321o;
        c2406c.h(j7, (Map) this.f320n, map, c2406c.f18182h, treeMap);
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            String str = (String) ((HashMap) this.f322p).get(pair.second);
            if (str != null) {
                byte[] bArrDecode = Base64.decode(str, 0);
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                C2409f c2409f = (C2409f) map.get(pair.first);
                c2409f.getClass();
                arrayList2.add(new A1.b(null, null, null, bitmapDecodeByteArray, c2409f.f18200c, 0, c2409f.f18202e, c2409f.f18199b, 0, Integer.MIN_VALUE, -3.4028235E38f, c2409f.f18203f, c2409f.f18204g, false, -16777216, c2409f.f18207j, 0.0f));
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            C2409f c2409f2 = (C2409f) map.get(entry.getKey());
            c2409f2.getClass();
            A1.a aVar = (A1.a) entry.getValue();
            CharSequence charSequence = aVar.a;
            charSequence.getClass();
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequence;
            for (C2404a c2404a : (C2404a[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), C2404a.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(c2404a), spannableStringBuilder.getSpanEnd(c2404a), (CharSequence) "");
            }
            for (int i7 = 0; i7 < spannableStringBuilder.length(); i7++) {
                if (spannableStringBuilder.charAt(i7) == ' ') {
                    int i8 = i7 + 1;
                    int i9 = i8;
                    while (i9 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i9) == ' ') {
                        i9++;
                    }
                    int i10 = i9 - i8;
                    if (i10 > 0) {
                        spannableStringBuilder.delete(i7, i10 + i7);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
                spannableStringBuilder.delete(0, 1);
            }
            for (int i11 = 0; i11 < spannableStringBuilder.length() - 1; i11++) {
                if (spannableStringBuilder.charAt(i11) == '\n') {
                    int i12 = i11 + 1;
                    if (spannableStringBuilder.charAt(i12) == ' ') {
                        spannableStringBuilder.delete(i12, i11 + 2);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            for (int i13 = 0; i13 < spannableStringBuilder.length() - 1; i13++) {
                if (spannableStringBuilder.charAt(i13) == ' ') {
                    int i14 = i13 + 1;
                    if (spannableStringBuilder.charAt(i14) == '\n') {
                        spannableStringBuilder.delete(i13, i14);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == '\n') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            aVar.f41e = c2409f2.f18200c;
            aVar.f42f = c2409f2.f18201d;
            aVar.f43g = c2409f2.f18202e;
            aVar.f44h = c2409f2.f18199b;
            aVar.f48l = c2409f2.f18203f;
            aVar.f47k = c2409f2.f18206i;
            aVar.f46j = c2409f2.f18205h;
            aVar.f52p = c2409f2.f18207j;
            arrayList2.add(aVar.a());
        }
        return arrayList2;
    }

    @Override // P4.l
    public void j(W4.e eVar, W4.b bVar, W4.e eVar2) {
        ((E4.h) this.f318l).j(eVar, bVar, eVar2);
    }

    @Override // P4.l
    public void k(W4.e eVar, Object obj) {
        ((E4.h) this.f318l).k(eVar, obj);
    }

    @Override // P4.l
    public P4.m l(W4.e eVar) {
        return ((E4.h) this.f318l).l(eVar);
    }

    @Override // s2.InterfaceC1976d
    public int m() {
        return ((long[]) this.f319m).length;
    }

    @Override // P4.l
    public P4.l n(W4.b bVar, W4.e eVar) {
        return ((E4.h) this.f318l).n(bVar, eVar);
    }

    public void o(C0662a c0662a, Class cls) {
        ((ArrayList) this.f319m).add(new O3.l(c0662a, cls));
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.text.Bidi p(int r14) {
        /*
            r13 = this;
            java.lang.Object r0 = r13.f321o
            boolean[] r0 = (boolean[]) r0
            boolean r1 = r0[r14]
            java.lang.Object r2 = r13.f320n
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            if (r1 == 0) goto L13
            java.lang.Object r14 = r2.get(r14)
            java.text.Bidi r14 = (java.text.Bidi) r14
            return r14
        L13:
            java.lang.Object r1 = r13.f319m
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            r3 = 0
            if (r14 != 0) goto L1c
            r4 = r3
            goto L28
        L1c:
            int r4 = r14 + (-1)
            java.lang.Object r4 = r1.get(r4)
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
        L28:
            java.lang.Object r1 = r1.get(r14)
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            int r10 = r1 - r4
            java.lang.Object r5 = r13.f322p
            char[] r5 = (char[]) r5
            if (r5 == 0) goto L40
            int r6 = r5.length
            if (r6 >= r10) goto L3e
            goto L40
        L3e:
            r6 = r5
            goto L43
        L40:
            char[] r5 = new char[r10]
            goto L3e
        L43:
            java.lang.Object r5 = r13.f318l
            android.text.Layout r5 = (android.text.Layout) r5
            java.lang.CharSequence r7 = r5.getText()
            android.text.TextUtils.getChars(r7, r4, r1, r6, r3)
            boolean r1 = java.text.Bidi.requiresBidi(r6, r3, r10)
            r4 = 1
            r12 = 0
            if (r1 == 0) goto L76
            int r1 = r13.z(r14)
            int r1 = r5.getLineForOffset(r1)
            int r1 = r5.getParagraphDirection(r1)
            r5 = -1
            if (r1 != r5) goto L67
            r11 = r4
            goto L68
        L67:
            r11 = r3
        L68:
            java.text.Bidi r5 = new java.text.Bidi
            r9 = 0
            r7 = 0
            r8 = 0
            r5.<init>(r6, r7, r8, r9, r10, r11)
            int r1 = r5.getRunCount()
            if (r1 != r4) goto L77
        L76:
            r5 = r12
        L77:
            r2.set(r14, r5)
            r0[r14] = r4
            if (r5 == 0) goto L87
            java.lang.Object r14 = r13.f322p
            char[] r14 = (char[]) r14
            if (r6 != r14) goto L86
            r6 = r12
            goto L87
        L86:
            r6 = r14
        L87:
            r13.f322p = r6
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: B1.C0017d.p(int):java.text.Bidi");
    }

    public InterfaceC0113g q(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "returnType == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        List list = (List) this.f322p;
        int iIndexOf = list.indexOf(null) + 1;
        int size = list.size();
        for (int i7 = iIndexOf; i7 < size; i7++) {
            InterfaceC0113g interfaceC0113gA = ((AbstractC0112f) list.get(i7)).a(type, annotationArr);
            if (interfaceC0113gA != null) {
                return interfaceC0113gA;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate call adapter for ");
        sb.append(type);
        sb.append(".\n  Tried:");
        int size2 = list.size();
        while (iIndexOf < size2) {
            sb.append("\n   * ");
            sb.append(((AbstractC0112f) list.get(iIndexOf)).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public boolean r(int i7) {
        ArrayList arrayList = (ArrayList) this.f320n;
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            C0297a c0297a = (C0297a) arrayList.get(i8);
            int i9 = c0297a.a;
            if (i9 != 8) {
                if (i9 == 1) {
                    int i10 = c0297a.f4547b;
                    int i11 = c0297a.f4548c + i10;
                    while (i10 < i11) {
                        if (v(i10, i8 + 1) == i7) {
                            return true;
                        }
                        i10++;
                    }
                } else {
                    continue;
                }
            } else {
                if (v(c0297a.f4548c, i8 + 1) == i7) {
                    return true;
                }
            }
        }
        return false;
    }

    public void s() {
        ArrayList arrayList = (ArrayList) this.f320n;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((C0321z) this.f321o).a((C0297a) arrayList.get(i7));
        }
        D(arrayList);
        ArrayList arrayList2 = (ArrayList) this.f319m;
        int size2 = arrayList2.size();
        for (int i8 = 0; i8 < size2; i8++) {
            C0297a c0297a = (C0297a) arrayList2.get(i8);
            int i9 = c0297a.a;
            C0321z c0321z = (C0321z) this.f321o;
            if (i9 == 1) {
                c0321z.a(c0297a);
                c0321z.d(c0297a.f4547b, c0297a.f4548c);
            } else if (i9 == 2) {
                c0321z.a(c0297a);
                int i10 = c0297a.f4547b;
                int i11 = c0297a.f4548c;
                RecyclerView recyclerView = c0321z.a;
                recyclerView.K(i10, i11, true);
                recyclerView.f10859q0 = true;
                recyclerView.f10853n0.f4500b += i11;
            } else if (i9 == 4) {
                c0321z.a(c0297a);
                c0321z.c(c0297a.f4547b, c0297a.f4548c);
            } else if (i9 == 8) {
                c0321z.a(c0297a);
                c0321z.e(c0297a.f4547b, c0297a.f4548c);
            }
        }
        D(arrayList2);
    }

    public void t(C0297a c0297a) {
        int i7;
        F5.o oVar;
        int i8 = c0297a.a;
        if (i8 == 1 || i8 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int I = I(c0297a.f4547b, i8);
        int i9 = c0297a.f4547b;
        int i10 = c0297a.a;
        if (i10 == 2) {
            i7 = 0;
        } else {
            if (i10 != 4) {
                throw new IllegalArgumentException("op should be remove or update." + c0297a);
            }
            i7 = 1;
        }
        int i11 = 1;
        int i12 = 1;
        while (true) {
            int i13 = c0297a.f4548c;
            oVar = (F5.o) this.f318l;
            if (i11 >= i13) {
                break;
            }
            int I6 = I((i7 * i11) + c0297a.f4547b, c0297a.a);
            int i14 = c0297a.a;
            if (i14 == 2 ? I6 != I : !(i14 == 4 && I6 == I + 1)) {
                C0297a c0297aB = B(i14, I, i12);
                u(c0297aB, i9);
                oVar.t(c0297aB);
                if (c0297a.a == 4) {
                    i9 += i12;
                }
                i12 = 1;
                I = I6;
            } else {
                i12++;
            }
            i11++;
        }
        oVar.t(c0297a);
        if (i12 > 0) {
            C0297a c0297aB2 = B(c0297a.a, I, i12);
            u(c0297aB2, i9);
            oVar.t(c0297aB2);
        }
    }

    public String toString() {
        String str;
        switch (this.f317k) {
            case 1:
                StringBuilder sb = new StringBuilder("KmVersionRequirement(kind=");
                h0 h0Var = (h0) this.f318l;
                if (h0Var == null) {
                    kotlin.jvm.internal.l.l("kind");
                    throw null;
                }
                sb.append(h0Var);
                sb.append(", level=");
                g0 g0Var = (g0) this.f319m;
                if (g0Var == null) {
                    kotlin.jvm.internal.l.l("level");
                    throw null;
                }
                sb.append(g0Var);
                sb.append(", version=");
                f0 f0Var = (f0) this.f322p;
                if (f0Var == null) {
                    kotlin.jvm.internal.l.l("version");
                    throw null;
                }
                sb.append(f0Var);
                sb.append(", errorCode=");
                sb.append((Integer) this.f320n);
                sb.append(", message=");
                return A6.b.j(sb, (String) this.f321o, ')');
            case 8:
                StringBuilder sb2 = new StringBuilder("since ");
                sb2.append((T4.j) this.f318l);
                sb2.append(' ');
                sb2.append((EnumC0555d) this.f320n);
                String str2 = "";
                Integer num = (Integer) this.f321o;
                if (num != null) {
                    str = " error " + num.intValue();
                } else {
                    str = "";
                }
                sb2.append(str);
                String str3 = (String) this.f322p;
                if (str3 != null) {
                    str2 = ": " + str3;
                }
                sb2.append(str2);
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public void u(C0297a c0297a, int i7) {
        C0321z c0321z = (C0321z) this.f321o;
        c0321z.a(c0297a);
        int i8 = c0297a.a;
        if (i8 != 2) {
            if (i8 != 4) {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            c0321z.c(i7, c0297a.f4548c);
        } else {
            int i9 = c0297a.f4548c;
            RecyclerView recyclerView = c0321z.a;
            recyclerView.K(i7, i9, true);
            recyclerView.f10859q0 = true;
            recyclerView.f10853n0.f4500b += i9;
        }
    }

    public int v(int i7, int i8) {
        ArrayList arrayList = (ArrayList) this.f320n;
        int size = arrayList.size();
        while (i8 < size) {
            C0297a c0297a = (C0297a) arrayList.get(i8);
            int i9 = c0297a.a;
            if (i9 == 8) {
                int i10 = c0297a.f4547b;
                if (i10 == i7) {
                    i7 = c0297a.f4548c;
                } else {
                    if (i10 < i7) {
                        i7--;
                    }
                    if (c0297a.f4548c <= i7) {
                        i7++;
                    }
                }
            } else {
                int i11 = c0297a.f4547b;
                if (i11 > i7) {
                    continue;
                } else if (i9 == 2) {
                    int i12 = c0297a.f4548c;
                    if (i7 < i11 + i12) {
                        return -1;
                    }
                    i7 -= i12;
                } else if (i9 == 1) {
                    i7 += c0297a.f4548c;
                }
            }
            i8++;
        }
        return i7;
    }

    public float w(int i7, boolean z7) {
        Layout layout = (Layout) this.f318l;
        int lineEnd = layout.getLineEnd(layout.getLineForOffset(i7));
        if (i7 > lineEnd) {
            i7 = lineEnd;
        }
        return z7 ? layout.getPrimaryHorizontal(i7) : layout.getSecondaryHorizontal(i7);
    }

    public float x(int i7, boolean z7, boolean z8) {
        int i8;
        int i9;
        int iA = i7;
        if (!z8) {
            return w(i7, z7);
        }
        Layout layout = (Layout) this.f318l;
        int iC = I0.t.c(layout, iA, z8);
        int lineStart = layout.getLineStart(iC);
        int lineEnd = layout.getLineEnd(iC);
        if (iA != lineStart && iA != lineEnd) {
            return w(i7, z7);
        }
        if (iA == 0 || iA == layout.getText().length()) {
            return w(i7, z7);
        }
        int iY = y(iA, z8);
        boolean z9 = layout.getParagraphDirection(layout.getLineForOffset(z(iY))) == -1;
        int iA2 = A(lineEnd, lineStart);
        int iZ = z(iY);
        int i10 = lineStart - iZ;
        int i11 = iA2 - iZ;
        Bidi bidiP = p(iY);
        Bidi bidiCreateLineBidi = bidiP != null ? bidiP.createLineBidi(i10, i11) : null;
        if (bidiCreateLineBidi == null || bidiCreateLineBidi.getRunCount() == 1) {
            boolean zIsRtlCharAt = layout.isRtlCharAt(lineStart);
            if (z7 || z9 == zIsRtlCharAt) {
                z9 = !z9;
            }
            return iA == lineStart ? z9 : !z9 ? layout.getLineLeft(iC) : layout.getLineRight(iC);
        }
        int runCount = bidiCreateLineBidi.getRunCount();
        I0.l[] lVarArr = new I0.l[runCount];
        for (int i12 = 0; i12 < runCount; i12++) {
            lVarArr[i12] = new I0.l(bidiCreateLineBidi.getRunStart(i12) + lineStart, bidiCreateLineBidi.getRunLimit(i12) + lineStart, bidiCreateLineBidi.getRunLevel(i12) % 2 == 1);
        }
        int runCount2 = bidiCreateLineBidi.getRunCount();
        byte[] bArr = new byte[runCount2];
        for (int i13 = 0; i13 < runCount2; i13++) {
            bArr[i13] = (byte) bidiCreateLineBidi.getRunLevel(i13);
        }
        Bidi.reorderVisually(bArr, 0, lVarArr, 0, runCount);
        if (iA == lineStart) {
            int i14 = 0;
            while (true) {
                if (i14 >= runCount) {
                    i9 = -1;
                    break;
                }
                if (lVarArr[i14].a == iA) {
                    i9 = i14;
                    break;
                }
                i14++;
            }
            boolean z10 = (z7 || z9 == lVarArr[i9].f3899c) ? !z9 : z9;
            return (i9 == 0 && z10) ? layout.getLineLeft(iC) : (i9 != runCount - 1 || z10) ? z10 ? layout.getPrimaryHorizontal(lVarArr[i9 - 1].a) : layout.getPrimaryHorizontal(lVarArr[i9 + 1].a) : layout.getLineRight(iC);
        }
        if (iA > iA2) {
            iA = A(iA, lineStart);
        }
        int i15 = 0;
        while (true) {
            if (i15 >= runCount) {
                i8 = -1;
                break;
            }
            if (lVarArr[i15].f3898b == iA) {
                i8 = i15;
                break;
            }
            i15++;
        }
        boolean z11 = (z7 || z9 == lVarArr[i8].f3899c) ? z9 : !z9;
        return (i8 == 0 && z11) ? layout.getLineLeft(iC) : (i8 != runCount - 1 || z11) ? z11 ? layout.getPrimaryHorizontal(lVarArr[i8 - 1].f3898b) : layout.getPrimaryHorizontal(lVarArr[i8 + 1].f3898b) : layout.getLineRight(iC);
    }

    public int y(int i7, boolean z7) {
        ArrayList arrayList = (ArrayList) this.f319m;
        int iG = P3.r.g(arrayList, Integer.valueOf(i7));
        int i8 = iG < 0 ? -(iG + 1) : iG + 1;
        if (z7 && i8 > 0) {
            int i9 = i8 - 1;
            if (i7 == ((Number) arrayList.get(i9)).intValue()) {
                return i9;
            }
        }
        return i8;
    }

    public int z(int i7) {
        if (i7 == 0) {
            return 0;
        }
        return ((Number) ((ArrayList) this.f319m).get(i7 - 1)).intValue();
    }

    public C0017d(T4.j jVar, R4.f0 f0Var, EnumC0555d enumC0555d, Integer num, String str) {
        this.f317k = 8;
        kotlin.jvm.internal.l.f("kind", f0Var);
        this.f318l = jVar;
        this.f319m = f0Var;
        this.f320n = enumC0555d;
        this.f321o = num;
        this.f322p = str;
    }

    public C0017d(Map map) {
        this.f317k = 9;
        kotlin.jvm.internal.l.f("initialState", map);
        this.f318l = P3.E.t0(map);
        this.f319m = new LinkedHashMap();
        this.f320n = new LinkedHashMap();
        this.f321o = new LinkedHashMap();
        this.f322p = new C0743e(1, this);
    }

    public C0017d(Layout layout) {
        this.f317k = 4;
        this.f318l = layout;
        ArrayList arrayList = new ArrayList();
        int length = 0;
        do {
            int iD0 = AbstractC2510o.d0(((Layout) this.f318l).getText(), '\n', length, 4);
            length = iD0 < 0 ? ((Layout) this.f318l).getText().length() : iD0 + 1;
            arrayList.add(Integer.valueOf(length));
        } while (length < ((Layout) this.f318l).getText().length());
        this.f319m = arrayList;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i7 = 0; i7 < size; i7++) {
            arrayList2.add(null);
        }
        this.f320n = arrayList2;
        this.f321o = new boolean[((ArrayList) this.f319m).size()];
        ((ArrayList) this.f319m).size();
    }

    public C0017d(C2406c c2406c, HashMap map, HashMap map2, HashMap map3) {
        this.f317k = 10;
        this.f318l = c2406c;
        this.f321o = map2;
        this.f322p = map3;
        this.f320n = Collections.unmodifiableMap(map);
        TreeSet treeSet = new TreeSet();
        int i7 = 0;
        c2406c.d(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i7] = ((Long) it.next()).longValue();
            i7++;
        }
        this.f319m = jArr;
    }

    public C0017d(C0214f c0214f, H0.I i7, List list, T0.b bVar, M0.i iVar) {
        H0.s sVar;
        String strSubstring;
        int i8;
        int i9;
        C0214f c0214f2 = c0214f;
        H0.I i10 = i7;
        int i11 = 1;
        this.f317k = 3;
        this.f318l = c0214f2;
        this.f319m = list;
        O3.j jVar = O3.j.f7526l;
        this.f321o = z1.c.B(jVar, new H0.o(this, i11));
        this.f322p = z1.c.B(jVar, new H0.o(this, 0));
        C0214f c0214f3 = AbstractC0215g.a;
        int length = c0214f2.a.length();
        List list2 = c0214f2.f3111c;
        list2 = list2 == null ? P3.y.f7779k : list2;
        ArrayList arrayList = new ArrayList();
        int size = list2.size();
        int i12 = 0;
        int i13 = 0;
        while (true) {
            sVar = i10.f3094b;
            if (i12 >= size) {
                break;
            }
            C0212d c0212d = (C0212d) list2.get(i12);
            H0.s sVar2 = (H0.s) c0212d.a;
            int i14 = c0212d.f3107b;
            if (i14 != i13) {
                arrayList.add(new C0212d(i13, i14, sVar));
            }
            H0.s sVarA = sVar.a(sVar2);
            int i15 = c0212d.f3108c;
            arrayList.add(new C0212d(i14, i15, sVarA));
            i12++;
            i13 = i15;
        }
        if (i13 != length) {
            arrayList.add(new C0212d(i13, length, sVar));
        }
        if (arrayList.isEmpty()) {
            arrayList.add(new C0212d(0, 0, sVar));
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        int i16 = 0;
        while (i16 < size2) {
            C0212d c0212d2 = (C0212d) arrayList.get(i16);
            int i17 = c0212d2.f3107b;
            int i18 = c0212d2.f3108c;
            if (i17 != i18) {
                strSubstring = c0214f2.a.substring(i17, i18);
                kotlin.jvm.internal.l.e("this as java.lang.String…ing(startIndex, endIndex)", strSubstring);
            } else {
                strSubstring = "";
            }
            C0214f c0214f4 = new C0214f(strSubstring, AbstractC0215g.b(c0214f2, i17, i18), null, null);
            H0.s sVar3 = (H0.s) c0212d2.a;
            int i19 = i11;
            H0.I i20 = new H0.I(i10.a, sVar.a(sVar3.f3145b == Integer.MIN_VALUE ? new H0.s(sVar3.a, sVar.f3145b, sVar3.f3146c, sVar3.f3147d, sVar3.f3148e, sVar3.f3149f, sVar3.f3150g, sVar3.f3151h, sVar3.f3152i) : sVar3));
            List listA = c0214f4.a();
            List list3 = (List) this.f319m;
            ArrayList arrayList3 = new ArrayList(list3.size());
            int size3 = list3.size();
            int i21 = 0;
            while (true) {
                i8 = c0212d2.f3107b;
                if (i21 >= size3) {
                    break;
                }
                H0.I i22 = i20;
                Object obj = list3.get(i21);
                List list4 = list3;
                C0212d c0212d3 = (C0212d) obj;
                int i23 = size2;
                if (AbstractC0215g.c(i8, i18, c0212d3.f3107b, c0212d3.f3108c)) {
                    arrayList3.add(obj);
                }
                i21++;
                list3 = list4;
                i20 = i22;
                size2 = i23;
            }
            H0.I i24 = i20;
            int i25 = size2;
            ArrayList arrayList4 = new ArrayList(arrayList3.size());
            int i26 = 0;
            for (int size4 = arrayList3.size(); i26 < size4; size4 = size4) {
                C0212d c0212d4 = (C0212d) arrayList3.get(i26);
                int i27 = c0212d4.f3107b;
                if (i8 <= i27 && (i9 = c0212d4.f3108c) <= i18) {
                    arrayList4.add(new C0212d(i27 - i8, i9 - i8, c0212d4.a));
                    i26++;
                } else {
                    throw new IllegalArgumentException("placeholder can not overlap with paragraph.");
                }
            }
            arrayList2.add(new H0.q(new P0.c(strSubstring, i24, listA, arrayList4, iVar, bVar), i8, i18));
            i16++;
            c0214f2 = c0214f;
            i10 = i7;
            i11 = i19;
            size2 = i25;
        }
        this.f320n = arrayList2;
    }

    public C0017d(C0321z c0321z) {
        this.f317k = 5;
        this.f318l = new F5.o(30);
        this.f319m = new ArrayList();
        this.f320n = new ArrayList();
        this.f321o = c0321z;
        this.f322p = new C0034g(15, this);
    }

    public C0017d(Object obj, Looper looper, Looper looper2, D d4, C0242x c0242x) {
        this.f317k = 0;
        this.f318l = d4.a(looper, null);
        this.f319m = d4.a(looper2, null);
        this.f321o = obj;
        this.f322p = obj;
        this.f320n = c0242x;
    }

    public C0017d(InterfaceC0907e interfaceC0907e, C0922t c0922t, List list, List list2) {
        this.f317k = 2;
        this.f318l = new ConcurrentHashMap();
        this.f319m = interfaceC0907e;
        this.f320n = c0922t;
        this.f321o = list;
        this.f322p = list2;
    }

    public C0017d(S2.b bVar) {
        this.f317k = 7;
        this.f318l = P3.q.U0(bVar.a);
        this.f319m = P3.q.U0(bVar.f8728b);
        this.f320n = P3.q.U0(bVar.f8729c);
        this.f321o = P3.q.U0(bVar.f8730d);
        this.f322p = P3.q.U0(bVar.f8731e);
    }

    public C0017d(E4.h hVar, E4.h hVar2, W4.e eVar, ArrayList arrayList) {
        this.f317k = 6;
        this.f319m = hVar;
        this.f320n = hVar2;
        this.f321o = eVar;
        this.f322p = arrayList;
        this.f318l = hVar;
    }
}
