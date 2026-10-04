package H0;

import B1.C0017d;
import C2.C0028a;
import android.graphics.Matrix;
import android.graphics.Shader;
import android.text.Layout;
import b1.AbstractC0703b;
import e5.AbstractC0832b;
import f1.AbstractC0870c;
import h0.AbstractC0971P;
import h0.AbstractC0993p;
import h0.C0972Q;
import h0.C0975U;
import h0.C0994q;
import h0.InterfaceC0995r;
import j0.AbstractC1299e;
import java.util.ArrayList;
import java.util.List;
import l4.AbstractC1420H;

/* loaded from: classes.dex */
public final class n {
    public final C0017d a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3128b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f3129c;

    /* renamed from: d, reason: collision with root package name */
    public final float f3130d;

    /* renamed from: e, reason: collision with root package name */
    public final float f3131e;

    /* renamed from: f, reason: collision with root package name */
    public final int f3132f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f3133g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f3134h;

    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, java.util.List] */
    public n(C0017d c0017d, long j7, int i7, boolean z7) {
        boolean z8;
        int iG;
        this.a = c0017d;
        this.f3128b = i7;
        if (T0.a.j(j7) != 0 || T0.a.i(j7) != 0) {
            throw new IllegalArgumentException("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) c0017d.f320n;
        int size = arrayList2.size();
        int i8 = 0;
        int i9 = 0;
        float f5 = 0.0f;
        while (i8 < size) {
            q qVar = (q) arrayList2.get(i8);
            P0.c cVar = qVar.a;
            int iH = T0.a.h(j7);
            if (T0.a.c(j7)) {
                iG = T0.a.g(j7) - ((int) Math.ceil(f5));
                if (iG < 0) {
                    iG = 0;
                }
            } else {
                iG = T0.a.g(j7);
            }
            C0209a c0209a = new C0209a(cVar, this.f3128b - i9, z7, q0.c.b(iH, iG, 5));
            float fB = c0209a.b() + f5;
            I0.y yVar = c0209a.f3098d;
            int i10 = i9 + yVar.f3925f;
            arrayList.add(new p(c0209a, qVar.f3143b, qVar.f3144c, i9, i10, f5, fB));
            if (yVar.f3922c || (i10 == this.f3128b && i8 != P3.r.y((ArrayList) this.a.f320n))) {
                z8 = true;
                i9 = i10;
                f5 = fB;
                break;
            } else {
                i8++;
                i9 = i10;
                f5 = fB;
            }
        }
        z8 = false;
        this.f3131e = f5;
        this.f3132f = i9;
        this.f3129c = z8;
        this.f3134h = arrayList;
        this.f3130d = T0.a.h(j7);
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i11 = 0; i11 < size2; i11++) {
            p pVar = (p) arrayList.get(i11);
            ?? r7 = pVar.a.f3100f;
            ArrayList arrayList4 = new ArrayList(r7.size());
            int size3 = r7.size();
            for (int i12 = 0; i12 < size3; i12++) {
                g0.d dVar = (g0.d) r7.get(i12);
                arrayList4.add(dVar != null ? dVar.h(AbstractC0832b.e(0.0f, pVar.f3141f)) : null);
            }
            P3.v.e0(arrayList3, arrayList4);
        }
        if (arrayList3.size() < ((List) this.a.f319m).size()) {
            int size4 = ((List) this.a.f319m).size() - arrayList3.size();
            ArrayList arrayList5 = new ArrayList(size4);
            for (int i13 = 0; i13 < size4; i13++) {
                arrayList5.add(null);
            }
            arrayList3 = P3.q.G0(arrayList3, arrayList5);
        }
        this.f3133g = arrayList3;
    }

    public static void g(n nVar, InterfaceC0995r interfaceC0995r, AbstractC0993p abstractC0993p, float f5, C0972Q c0972q, S0.j jVar, AbstractC1299e abstractC1299e) {
        interfaceC0995r.l();
        ArrayList arrayList = nVar.f3134h;
        if (arrayList.size() <= 1 || (abstractC0993p instanceof C0975U)) {
            P0.j.a(nVar, interfaceC0995r, abstractC0993p, f5, c0972q, jVar, abstractC1299e);
        } else if (abstractC0993p instanceof AbstractC0971P) {
            int size = arrayList.size();
            float fMax = 0.0f;
            float fB = 0.0f;
            for (int i7 = 0; i7 < size; i7++) {
                p pVar = (p) arrayList.get(i7);
                fB += pVar.a.b();
                fMax = Math.max(fMax, pVar.a.d());
            }
            Shader shaderB = ((AbstractC0971P) abstractC0993p).b(AbstractC0870c.F(fMax, fB));
            Matrix matrix = new Matrix();
            shaderB.getLocalMatrix(matrix);
            int size2 = arrayList.size();
            for (int i8 = 0; i8 < size2; i8++) {
                p pVar2 = (p) arrayList.get(i8);
                pVar2.a.g(interfaceC0995r, new C0994q(shaderB), f5, c0972q, jVar, abstractC1299e);
                C0209a c0209a = pVar2.a;
                interfaceC0995r.f(0.0f, c0209a.b());
                matrix.setTranslate(0.0f, -c0209a.b());
                shaderB.setLocalMatrix(matrix);
            }
        }
        interfaceC0995r.i();
    }

    public final void a(long j7, float[] fArr) {
        h(H.e(j7));
        i(H.d(j7));
        kotlin.jvm.internal.v vVar = new kotlin.jvm.internal.v();
        vVar.f12718k = 0;
        android.support.v4.media.session.b.r(this.f3134h, j7, new m(j7, fArr, vVar, new kotlin.jvm.internal.u()));
    }

    public final float b(int i7) {
        j(i7);
        ArrayList arrayList = this.f3134h;
        p pVar = (p) arrayList.get(android.support.v4.media.session.b.p(i7, arrayList));
        C0209a c0209a = pVar.a;
        return c0209a.f3098d.e(i7 - pVar.f3139d) + pVar.f3141f;
    }

    public final int c(float f5) {
        ArrayList arrayList = this.f3134h;
        p pVar = (p) arrayList.get(android.support.v4.media.session.b.q(arrayList, f5));
        int i7 = pVar.f3138c - pVar.f3137b;
        int i8 = pVar.f3139d;
        if (i7 == 0) {
            return i8;
        }
        float f7 = f5 - pVar.f3141f;
        I0.y yVar = pVar.a.f3098d;
        return yVar.f3924e.getLineForVertical(((int) f7) - yVar.f3926g) + i8;
    }

    public final float d(int i7) {
        j(i7);
        ArrayList arrayList = this.f3134h;
        p pVar = (p) arrayList.get(android.support.v4.media.session.b.p(i7, arrayList));
        C0209a c0209a = pVar.a;
        return c0209a.f3098d.g(i7 - pVar.f3139d) + pVar.f3141f;
    }

    public final int e(long j7) {
        ArrayList arrayList = this.f3134h;
        p pVar = (p) arrayList.get(android.support.v4.media.session.b.q(arrayList, g0.c.e(j7)));
        int i7 = pVar.f3138c;
        int i8 = pVar.f3137b;
        if (i7 - i8 == 0) {
            return i8;
        }
        long jE = AbstractC0832b.e(g0.c.d(j7), g0.c.e(j7) - pVar.f3141f);
        C0209a c0209a = pVar.a;
        int iE = (int) g0.c.e(jE);
        I0.y yVar = c0209a.f3098d;
        int i9 = iE - yVar.f3926g;
        Layout layout = yVar.f3924e;
        int lineForVertical = layout.getLineForVertical(i9);
        return layout.getOffsetForHorizontal(lineForVertical, (yVar.b(lineForVertical) * (-1)) + g0.c.d(jE)) + i8;
    }

    public final long f(g0.d dVar, int i7, C0028a c0028a) {
        long jA;
        long j7;
        ArrayList arrayList = this.f3134h;
        int iQ = android.support.v4.media.session.b.q(arrayList, dVar.f11659b);
        float f5 = ((p) arrayList.get(iQ)).f3142g;
        float f7 = dVar.f11661d;
        if (f5 >= f7 || iQ == P3.r.y(arrayList)) {
            p pVar = (p) arrayList.get(iQ);
            return pVar.a(pVar.a.c(dVar.h(AbstractC0832b.e(0.0f, -pVar.f3141f)), i7, c0028a), true);
        }
        int iQ2 = android.support.v4.media.session.b.q(arrayList, f7);
        long jA2 = H.f3091b;
        while (true) {
            jA = H.f3091b;
            if (!H.a(jA2, jA) || iQ > iQ2) {
                break;
            }
            p pVar2 = (p) arrayList.get(iQ);
            jA2 = pVar2.a(pVar2.a.c(dVar.h(AbstractC0832b.e(0.0f, -pVar2.f3141f)), i7, c0028a), true);
            iQ++;
        }
        if (H.a(jA2, jA)) {
            return jA;
        }
        while (true) {
            j7 = H.f3091b;
            if (!H.a(jA, j7) || iQ > iQ2) {
                break;
            }
            p pVar3 = (p) arrayList.get(iQ2);
            jA = pVar3.a(pVar3.a.c(dVar.h(AbstractC0832b.e(0.0f, -pVar3.f3141f)), i7, c0028a), true);
            iQ2--;
        }
        return H.a(jA, j7) ? jA2 : AbstractC1420H.c((int) (jA2 >> 32), (int) (4294967295L & jA));
    }

    public final void h(int i7) {
        C0017d c0017d = this.a;
        if (i7 < 0 || i7 >= ((C0214f) c0017d.f318l).a.length()) {
            StringBuilder sbP = AbstractC0703b.p(i7, "offset(", ") is out of bounds [0, ");
            sbP.append(((C0214f) c0017d.f318l).a.length());
            sbP.append(')');
            throw new IllegalArgumentException(sbP.toString().toString());
        }
    }

    public final void i(int i7) {
        C0017d c0017d = this.a;
        if (i7 < 0 || i7 > ((C0214f) c0017d.f318l).a.length()) {
            StringBuilder sbP = AbstractC0703b.p(i7, "offset(", ") is out of bounds [0, ");
            sbP.append(((C0214f) c0017d.f318l).a.length());
            sbP.append(']');
            throw new IllegalArgumentException(sbP.toString().toString());
        }
    }

    public final void j(int i7) {
        int i8 = this.f3132f;
        if (i7 < 0 || i7 >= i8) {
            throw new IllegalArgumentException(("lineIndex(" + i7 + ") is out of bounds [0, " + i8 + ')').toString());
        }
    }
}
