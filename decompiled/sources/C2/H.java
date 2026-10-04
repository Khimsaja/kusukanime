package C2;

import H.N;
import V1.C0602g;
import V1.InterfaceC0603h;
import android.util.SparseArray;
import android.view.MotionEvent;
import b1.AbstractC0703b;
import f.AbstractC0841b;
import f6.EnumC0888B;
import i3.C1074c;
import j3.AbstractC1314A;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import kotlinx.serialization.descriptors.SerialDescriptor;
import m.C1501v;
import n5.P;
import s0.C1963h;
import y.C2326g;
import y.InterfaceC2333n;
import y.InterfaceC2341v;
import z0.S0;

/* loaded from: classes.dex */
public final class H implements InterfaceC0603h, InterfaceC2341v {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f665k;

    /* renamed from: l, reason: collision with root package name */
    public int f666l;

    /* renamed from: m, reason: collision with root package name */
    public Object f667m;

    /* renamed from: n, reason: collision with root package name */
    public Object f668n;

    public /* synthetic */ H(int i7, byte b4) {
        this.f665k = i7;
    }

    @Override // y.InterfaceC2341v
    public int a(Object obj) {
        C1501v c1501v = (C1501v) this.f667m;
        int iC = c1501v.c(obj);
        if (iC >= 0) {
            return c1501v.f12930c[iC];
        }
        return -1;
    }

    public void b(int i7, InterfaceC2333n interfaceC2333n) {
        if (i7 < 0) {
            throw new IllegalArgumentException(AbstractC0703b.g(i7, "size should be >=0, but was ").toString());
        }
        if (i7 == 0) {
            return;
        }
        C2326g c2326g = new C2326g(this.f666l, i7, interfaceC2333n);
        this.f666l += i7;
        ((Q.d) this.f667m).b(c2326g);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01a3  */
    /* JADX WARN: Type inference failed for: r17v11 */
    /* JADX WARN: Type inference failed for: r17v12 */
    /* JADX WARN: Type inference failed for: r17v13 */
    /* JADX WARN: Type inference failed for: r17v4 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public j3.c0 c() {
        /*
            Method dump skipped, instructions count: 468
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: C2.H.c():j3.c0");
    }

    public void d(int i7) {
        if (i7 < 0 || i7 >= this.f666l) {
            StringBuilder sbP = AbstractC0703b.p(i7, "Index ", ", size ");
            sbP.append(this.f666l);
            throw new IndexOutOfBoundsException(sbP.toString());
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    public void e(C1963h c1963h) {
        MotionEvent motionEvent;
        ?? r02 = c1963h.a;
        int size = r02.size();
        int i7 = 0;
        while (true) {
            N n7 = c1963h.f15458b;
            s0.u uVar = (s0.u) this.f668n;
            if (i7 >= size) {
                w0.r rVar = (w0.r) this.f667m;
                if (rVar == null) {
                    throw new IllegalStateException("layoutCoordinates not set");
                }
                long jS = rVar.S(0L);
                motionEvent = n7 != null ? (MotionEvent) ((P) n7.f2902d).f13379m : null;
                if (motionEvent == null) {
                    throw new IllegalArgumentException("The PointerEvent receiver cannot have a null MotionEvent.");
                }
                int action = motionEvent.getAction();
                motionEvent.offsetLocation(-g0.c.d(jS), -g0.c.e(jS));
                if (motionEvent.getActionMasked() == 0) {
                    this.f666l = ((Boolean) ((W0.c) uVar.h()).invoke(motionEvent)).booleanValue() ? 2 : 3;
                } else {
                    ((W0.c) uVar.h()).invoke(motionEvent);
                }
                motionEvent.offsetLocation(g0.c.d(jS), g0.c.e(jS));
                motionEvent.setAction(action);
                if (this.f666l == 2) {
                    int size2 = r02.size();
                    for (int i8 = 0; i8 < size2; i8++) {
                        ((s0.r) r02.get(i8)).a();
                    }
                    if (n7 == null) {
                        return;
                    }
                    n7.f2900b = !uVar.f15494c;
                    return;
                }
                return;
            }
            if (((s0.r) r02.get(i7)).b()) {
                if (this.f666l == 2) {
                    w0.r rVar2 = (w0.r) this.f667m;
                    if (rVar2 == null) {
                        throw new IllegalStateException("layoutCoordinates not set");
                    }
                    long jS2 = rVar2.S(0L);
                    motionEvent = n7 != null ? (MotionEvent) ((P) n7.f2902d).f13379m : null;
                    if (motionEvent == null) {
                        throw new IllegalArgumentException("The PointerEvent receiver cannot have a null MotionEvent.");
                    }
                    int action2 = motionEvent.getAction();
                    motionEvent.setAction(3);
                    motionEvent.offsetLocation(-g0.c.d(jS2), -g0.c.e(jS2));
                    ((W0.c) uVar.h()).invoke(motionEvent);
                    motionEvent.offsetLocation(g0.c.d(jS2), g0.c.e(jS2));
                    motionEvent.setAction(action2);
                }
                this.f666l = 3;
                return;
            }
            i7++;
        }
    }

    public Object f(int i7) {
        SparseArray sparseArray;
        if (this.f666l == -1) {
            this.f666l = 0;
        }
        while (true) {
            int i8 = this.f666l;
            sparseArray = (SparseArray) this.f667m;
            if (i8 <= 0 || i7 >= sparseArray.keyAt(i8)) {
                break;
            }
            this.f666l--;
        }
        while (this.f666l < sparseArray.size() - 1 && i7 >= sparseArray.keyAt(this.f666l + 1)) {
            this.f666l++;
        }
        return sparseArray.valueAt(this.f666l);
    }

    public C2326g g(int i7) {
        d(i7);
        C2326g c2326g = (C2326g) this.f668n;
        if (c2326g != null) {
            int i8 = c2326g.f17621b;
            int i9 = c2326g.a;
            if (i7 < i8 + i9 && i9 <= i7) {
                return c2326g;
            }
        }
        Q.d dVar = (Q.d) this.f667m;
        C2326g c2326g2 = (C2326g) dVar.f7827k[AbstractC0841b.e(i7, dVar)];
        this.f668n = c2326g2;
        return c2326g2;
    }

    public Object h(int i7) {
        int i8 = i7 - this.f666l;
        if (i8 < 0) {
            return null;
        }
        Object[] objArr = (Object[]) this.f668n;
        kotlin.jvm.internal.l.f("<this>", objArr);
        if (i8 <= objArr.length - 1) {
            return objArr[i8];
        }
        return null;
    }

    @Override // V1.InterfaceC0603h
    public C0602g i(V1.k kVar, long j7) {
        long j8 = kVar.f9392n;
        int iMin = (int) Math.min(112800, kVar.f9391m - j8);
        B1.B b4 = (B1.B) this.f668n;
        b4.C(iMin);
        kVar.h(b4.a, 0, iMin, false);
        int i7 = b4.f289c;
        long j9 = -1;
        long j10 = -1;
        long j11 = -9223372036854775807L;
        while (b4.a() >= 188) {
            byte[] bArr = b4.a;
            int i8 = b4.f288b;
            while (i8 < i7 && bArr[i8] != 71) {
                i8++;
            }
            int i9 = i8 + 188;
            if (i9 > i7) {
                break;
            }
            long jE = android.support.v4.media.session.b.E(b4, i8, this.f666l);
            if (jE != -9223372036854775807L) {
                long jB = ((B1.H) this.f667m).b(jE);
                if (jB > j7) {
                    return j11 == -9223372036854775807L ? new C0602g(-1, jB, j8) : new C0602g(0, -9223372036854775807L, j8 + j10);
                }
                j11 = jB;
                if (100000 + j11 > j7) {
                    return new C0602g(0, -9223372036854775807L, j8 + i8);
                }
                j10 = i8;
            }
            b4.F(i9);
            j9 = i9;
        }
        return j11 != -9223372036854775807L ? new C0602g(-2, j11, j8 + j9) : C0602g.f9377d;
    }

    public String j() {
        StringBuilder sb = new StringBuilder("$");
        int i7 = this.f666l + 1;
        for (int i8 = 0; i8 < i7; i8++) {
            Object obj = ((Object[]) this.f667m)[i8];
            if (obj instanceof SerialDescriptor) {
                SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
                if (!kotlin.jvm.internal.l.a(serialDescriptor.c(), X5.j.f9952i)) {
                    int i9 = ((int[]) this.f668n)[i8];
                    if (i9 >= 0) {
                        sb.append(".");
                        sb.append(serialDescriptor.g(i9));
                    }
                } else if (((int[]) this.f668n)[i8] != -1) {
                    sb.append("[");
                    sb.append(((int[]) this.f668n)[i8]);
                    sb.append("]");
                }
            } else if (obj != b6.w.a) {
                sb.append("['");
                sb.append(obj);
                sb.append("']");
            }
        }
        return sb.toString();
    }

    public int k() {
        int i7 = this.f666l;
        if (i7 != 2) {
            return i7 != 3 ? 0 : 512;
        }
        return 2048;
    }

    @Override // V1.InterfaceC0603h
    public void l() {
        byte[] bArr = B1.K.f302c;
        B1.B b4 = (B1.B) this.f668n;
        b4.getClass();
        b4.D(bArr, bArr.length);
    }

    public void m(Object obj, Object obj2) {
        int i7 = (this.f666l + 1) * 2;
        Object[] objArr = (Object[]) this.f667m;
        if (i7 > objArr.length) {
            this.f667m = Arrays.copyOf(objArr, AbstractC1314A.e(objArr.length, i7));
        }
        if (obj == null) {
            throw new NullPointerException("null key in entry: null=" + obj2);
        }
        if (obj2 == null) {
            throw new NullPointerException("null value in entry: " + obj + "=null");
        }
        Object[] objArr2 = (Object[]) this.f667m;
        int i8 = this.f666l;
        int i9 = i8 * 2;
        objArr2[i9] = obj;
        objArr2[i9 + 1] = obj2;
        this.f666l = i8 + 1;
    }

    public void n() {
        int i7 = this.f666l * 2;
        Object[] objArrCopyOf = Arrays.copyOf((Object[]) this.f667m, i7);
        kotlin.jvm.internal.l.e("copyOf(...)", objArrCopyOf);
        this.f667m = objArrCopyOf;
        int[] iArr = new int[i7];
        for (int i8 = 0; i8 < i7; i8++) {
            iArr[i8] = -1;
        }
        P3.m.Y(0, 0, 14, (int[]) this.f668n, iArr);
        this.f668n = iArr;
    }

    public List o(CharSequence charSequence) {
        charSequence.getClass();
        X4.y yVar = (X4.y) this.f668n;
        yVar.getClass();
        i3.g gVar = new i3.g(yVar, this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (gVar.hasNext()) {
            arrayList.add((String) gVar.next());
        }
        return Collections.unmodifiableList(arrayList);
    }

    public String toString() {
        switch (this.f665k) {
            case 5:
                return j();
            case 8:
                StringBuilder sb = new StringBuilder();
                if (((EnumC0888B) this.f667m) == EnumC0888B.HTTP_1_0) {
                    sb.append("HTTP/1.0");
                } else {
                    sb.append("HTTP/1.1");
                }
                sb.append(' ');
                sb.append(this.f666l);
                sb.append(' ');
                sb.append((String) this.f668n);
                String string = sb.toString();
                kotlin.jvm.internal.l.e("StringBuilder().apply(builderAction).toString()", string);
                return string;
            default:
                return super.toString();
        }
    }

    public H(EnumC0888B enumC0888B, int i7, String str) {
        this.f665k = 8;
        this.f667m = enumC0888B;
        this.f666l = i7;
        this.f668n = str;
    }

    public H(s0.u uVar) {
        this.f665k = 9;
        this.f668n = uVar;
        this.f666l = 1;
    }

    public H(I1.e eVar) {
        this.f665k = 3;
        this.f667m = new SparseArray();
        this.f668n = eVar;
        this.f666l = -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0095 A[LOOP:1: B:13:0x0073->B:19:0x0095, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public H(k4.g r13, f1.AbstractC0871d r14) {
        /*
            r12 = this;
            r0 = 11
            r12.f665k = r0
            r12.<init>()
            C2.H r14 = r14.b0()
            int r0 = r13.f12672k
            if (r0 < 0) goto Lc6
            int r1 = r14.f666l
            int r1 = r1 + (-1)
            int r13 = r13.f12673l
            int r13 = java.lang.Math.min(r13, r1)
            if (r13 >= r0) goto L2d
            m.v r13 = m.AbstractC1473C.a
            java.lang.String r14 = "null cannot be cast to non-null type androidx.collection.ObjectIntMap<K of androidx.collection.ObjectIntMapKt.emptyObjectIntMap>"
            kotlin.jvm.internal.l.d(r14, r13)
            r12.f667m = r13
            r13 = 0
            java.lang.Object[] r14 = new java.lang.Object[r13]
            r12.f668n = r14
            r12.f666l = r13
            goto La0
        L2d:
            int r1 = r13 - r0
            int r1 = r1 + 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r12.f668n = r2
            r12.f666l = r0
            m.v r2 = new m.v
            r2.<init>(r1)
            r14.d(r0)
            r14.d(r13)
            if (r13 < r0) goto La1
            java.lang.Object r14 = r14.f667m
            Q.d r14 = (Q.d) r14
            int r1 = f.AbstractC0841b.e(r0, r14)
            java.lang.Object[] r3 = r14.f7827k
            r3 = r3[r1]
            y.g r3 = (y.C2326g) r3
            int r3 = r3.a
        L54:
            if (r3 > r13) goto L9e
            java.lang.Object[] r4 = r14.f7827k
            r4 = r4[r1]
            y.g r4 = (y.C2326g) r4
            y.n r5 = r4.f17622c
            e4.k r5 = r5.getKey()
            int r6 = r4.a
            int r7 = java.lang.Math.max(r0, r6)
            int r8 = r4.f17621b
            int r8 = r8 + r6
            int r8 = r8 + (-1)
            int r8 = java.lang.Math.min(r13, r8)
            if (r7 > r8) goto L98
        L73:
            if (r5 == 0) goto L81
            int r9 = r7 - r6
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            java.lang.Object r9 = r5.invoke(r9)
            if (r9 != 0) goto L86
        L81:
            y.e r9 = new y.e
            r9.<init>(r7)
        L86:
            r2.f(r7, r9)
            java.lang.Object r10 = r12.f668n
            java.lang.Object[] r10 = (java.lang.Object[]) r10
            int r11 = r12.f666l
            int r11 = r7 - r11
            r10[r11] = r9
            if (r7 == r8) goto L98
            int r7 = r7 + 1
            goto L73
        L98:
            int r4 = r4.f17621b
            int r3 = r3 + r4
            int r1 = r1 + 1
            goto L54
        L9e:
            r12.f667m = r2
        La0:
            return
        La1:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            java.lang.String r1 = "toIndex ("
            r14.<init>(r1)
            r14.append(r13)
            java.lang.String r13 = ") should be not smaller than fromIndex ("
            r14.append(r13)
            r14.append(r0)
            r13 = 41
            r14.append(r13)
            java.lang.String r13 = r14.toString()
            java.lang.IllegalArgumentException r14 = new java.lang.IllegalArgumentException
            java.lang.String r13 = r13.toString()
            r14.<init>(r13)
            throw r14
        Lc6:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "negative nearestRange.first"
            r13.<init>(r14)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: C2.H.<init>(k4.g, f1.d):void");
    }

    public H(int i7, B1.H h7) {
        this.f665k = 0;
        this.f666l = i7;
        this.f667m = h7;
        this.f668n = new B1.B();
    }

    public H() {
        this.f665k = 10;
        this.f667m = new Q.d(new C2326g[16]);
    }

    public H(X4.y yVar) {
        this.f665k = 6;
        this.f668n = yVar;
        this.f667m = C1074c.f12006k;
        this.f666l = Integer.MAX_VALUE;
    }

    public H(int i7, String str, int i8, ArrayList arrayList, byte[] bArr) {
        List listUnmodifiableList;
        this.f665k = 1;
        this.f666l = i8;
        if (arrayList == null) {
            listUnmodifiableList = Collections.EMPTY_LIST;
        } else {
            listUnmodifiableList = Collections.unmodifiableList(arrayList);
        }
        this.f667m = listUnmodifiableList;
        this.f668n = bArr;
    }

    public H(S0 s02) {
        this.f665k = 2;
        this.f667m = s02;
    }

    public H(int i7) {
        this.f665k = 7;
        this.f667m = new Object[i7 * 2];
        this.f666l = 0;
    }
}
