package H;

import H5.u0;
import d.C0777k;
import d.C0778l;
import e4.InterfaceC0821a;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import m.AbstractC1475E;
import m.C1492m;
import m.C1504y;
import o5.InterfaceC1703c;
import u4.InterfaceC2096b;
import u4.InterfaceC2102h;

/* loaded from: classes.dex */
public final class N implements InterfaceC1703c {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2900b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f2901c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f2902d;

    public /* synthetic */ N(int i7, Object obj, Object obj2, boolean z7) {
        this.a = i7;
        this.f2900b = z7;
        this.f2901c = obj;
        this.f2902d = obj2;
    }

    public static final void b(N n7) {
        ((C1504y) n7.f2901c).a();
        int i7 = 0;
        n7.f2900b = false;
        Q.d dVar = (Q.d) n7.f2902d;
        int i8 = dVar.f7829m;
        if (i8 > 0) {
            Object[] objArr = dVar.f7827k;
            do {
                ((InterfaceC0821a) objArr[i7]).invoke();
                i7++;
            } while (i7 < i8);
        }
        dVar.g();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(H.N r15) {
        /*
            java.lang.Object r0 = r15.f2901c
            m.y r0 = (m.C1504y) r0
            java.lang.Object[] r1 = r0.f12940b
            long[] r2 = r0.a
            int r3 = r2.length
            int r3 = r3 + (-2)
            r4 = 0
            if (r3 < 0) goto L63
            r5 = r4
        Lf:
            r6 = r2[r5]
            long r8 = ~r6
            r10 = 7
            long r8 = r8 << r10
            long r8 = r8 & r6
            r10 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r8 = r8 & r10
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 == 0) goto L5e
            int r8 = r5 - r3
            int r8 = ~r8
            int r8 = r8 >>> 31
            r9 = 8
            int r8 = 8 - r8
            r10 = r4
        L29:
            if (r10 >= r8) goto L5c
            r11 = 255(0xff, double:1.26E-321)
            long r11 = r11 & r6
            r13 = 128(0x80, double:6.32E-322)
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 >= 0) goto L58
            int r11 = r5 << 3
            int r11 = r11 + r10
            r11 = r1[r11]
            f0.s r11 = (f0.C0866s) r11
            r11.getClass()
            H.N r12 = f0.AbstractC0851d.E(r11)
            java.lang.Object r12 = r12.f2901c
            m.y r12 = (m.C1504y) r12
            java.lang.Object r12 = r12.e(r11)
            f0.r r12 = (f0.EnumC0865r) r12
            if (r12 == 0) goto L51
            r11.f11426z = r12
            goto L58
        L51:
            java.lang.String r15 = "committing a node that was not updated in the current transaction"
            f6.AbstractC0905c.D(r15)
            r15 = 0
            throw r15
        L58:
            long r6 = r6 >> r9
            int r10 = r10 + 1
            goto L29
        L5c:
            if (r8 != r9) goto L63
        L5e:
            if (r5 == r3) goto L63
            int r5 = r5 + 1
            goto Lf
        L63:
            r0.a()
            r15.f2900b = r4
            java.lang.Object r15 = r15.f2902d
            Q.d r15 = (Q.d) r15
            r15.g()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: H.N.c(H.N):void");
    }

    @Override // o5.InterfaceC1703c
    public boolean a(n5.M m7, n5.M m8) {
        kotlin.jvm.internal.l.f("c1", m7);
        kotlin.jvm.internal.l.f("c2", m8);
        if (m7.equals(m8)) {
            return true;
        }
        InterfaceC2102h interfaceC2102hF = m7.f();
        InterfaceC2102h interfaceC2102hF2 = m8.f();
        if (!(interfaceC2102hF instanceof u4.Q) || !(interfaceC2102hF2 instanceof u4.Q)) {
            return false;
        }
        return Z4.c.a.d((u4.Q) interfaceC2102hF, (u4.Q) interfaceC2102hF2, this.f2900b, new Z4.b((InterfaceC2096b) this.f2901c, (InterfaceC2096b) this.f2902d));
    }

    public boolean d(long j7) {
        Object obj;
        ArrayList arrayList = (ArrayList) ((n5.P) this.f2902d).f13378l;
        int size = arrayList.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i7);
            if (s0.q.a(((s0.t) obj).a, j7)) {
                break;
            }
            i7++;
        }
        s0.t tVar = (s0.t) obj;
        if (tVar != null) {
            return tVar.f15489h;
        }
        return false;
    }

    public void e() {
        ((J5.e) this.f2901c).g(new CancellationException("onBack cancelled"), true);
        ((u0) this.f2902d).e(null);
    }

    public int f() {
        B1.s sVar = (B1.s) this.f2902d;
        int i7 = sVar.f358b;
        int i8 = sVar.f359c;
        if (i7 < i8) {
            return 2;
        }
        return i7 > i8 ? 1 : 3;
    }

    public String toString() {
        switch (this.a) {
            case 0:
                StringBuilder sb = new StringBuilder("SingleSelectionLayout(isStartHandle=");
                sb.append(this.f2900b);
                sb.append(", crossed=");
                int iF = f();
                sb.append(iF != 1 ? iF != 2 ? iF != 3 ? "null" : "COLLAPSED" : "NOT_CROSSED" : "CROSSED");
                sb.append(", info=\n\t");
                sb.append((B1.s) this.f2902d);
                sb.append(')');
                return sb.toString();
            case 1:
                return "JavaTypeEnhancementState(jsr305=" + ((H4.v) this.f2901c) + ", getReportLevelForAnnotation=" + ((A4.j) this.f2902d) + ')';
            default:
                return super.toString();
        }
    }

    public N(H4.v vVar, A4.j jVar) {
        this.a = 1;
        this.f2901c = vVar;
        this.f2902d = jVar;
        this.f2900b = vVar.f3753d || jVar.invoke(H4.r.a) == H4.B.f3682l;
    }

    public N(C1492m c1492m, n5.P p7) {
        this.a = 5;
        this.f2901c = c1492m;
        this.f2902d = p7;
    }

    public N() {
        this.a = 4;
        long[] jArr = AbstractC1475E.a;
        this.f2901c = new C1504y();
        this.f2902d = new Q.d(new InterfaceC0821a[16]);
    }

    public N(M5.c cVar, boolean z7, e4.n nVar, C0778l c0778l) {
        this.a = 3;
        this.f2900b = z7;
        this.f2901c = P3.F.a(-2, 4, J5.c.f4299k);
        this.f2902d = H5.D.x(cVar, null, new C0777k(c0778l, nVar, this, null), 3);
    }
}
