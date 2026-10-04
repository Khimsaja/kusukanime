package q2;

import B1.B;
import B1.K;
import O1.S;
import V1.AbstractC0597b;
import V1.n;
import V1.o;
import V1.p;
import y1.E;

/* loaded from: classes.dex */
public final class e implements n {
    public S a;

    /* renamed from: b, reason: collision with root package name */
    public j f14693b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f14694c;

    @Override // V1.n
    public final boolean b(o oVar) {
        try {
            return c((V1.k) oVar);
        } catch (E unused) {
            return false;
        }
    }

    public final boolean c(V1.k kVar) {
        boolean zW;
        g gVar = new g();
        if (gVar.a(kVar, true) && (gVar.a & 2) == 2) {
            int iMin = Math.min(gVar.f14702e, 8);
            B b4 = new B(iMin);
            kVar.h(b4.a, 0, iMin, false);
            b4.F(0);
            if (b4.a() >= 5 && b4.t() == 127 && b4.v() == 1179402563) {
                this.f14693b = new C1849c();
                return true;
            }
            b4.F(0);
            try {
                zW = AbstractC0597b.w(1, b4, true);
            } catch (E unused) {
                zW = false;
            }
            if (zW) {
                this.f14693b = new k();
            } else {
                b4.F(0);
                if (i.e(b4, i.f14705o)) {
                    this.f14693b = new i();
                }
            }
            return true;
        }
        return false;
    }

    @Override // V1.n
    public final void d(p pVar) {
        this.a = (S) pVar;
    }

    @Override // V1.n
    public final void e(long j7, long j8) {
        j jVar = this.f14693b;
        if (jVar != null) {
            f fVar = jVar.a;
            g gVar = fVar.a;
            gVar.a = 0;
            gVar.f14699b = 0L;
            gVar.f14700c = 0;
            gVar.f14701d = 0;
            gVar.f14702e = 0;
            fVar.f14695b.C(0);
            fVar.f14696c = -1;
            fVar.f14698e = false;
            if (j7 == 0) {
                jVar.d(!jVar.f14718l);
                return;
            }
            if (jVar.f14714h != 0) {
                long j9 = (jVar.f14715i * j8) / 1000000;
                jVar.f14711e = j9;
                h hVar = jVar.f14710d;
                int i7 = K.a;
                hVar.j(j9);
                jVar.f14714h = 2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x017b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x017c  */
    @Override // V1.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int i(V1.o r20, V1.r r21) throws y1.E {
        /*
            Method dump skipped, instructions count: 396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q2.e.i(V1.o, V1.r):int");
    }

    @Override // V1.n
    public final void a() {
    }
}
