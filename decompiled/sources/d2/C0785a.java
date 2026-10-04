package d2;

import B1.B;
import K2.C0298b;
import O1.S;
import V1.k;
import V1.n;
import V1.o;
import V1.p;
import V1.s;
import java.io.EOFException;
import java.io.InterruptedIOException;
import k2.C1386a;

/* renamed from: d2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0785a implements n {

    /* renamed from: b, reason: collision with root package name */
    public S f11220b;

    /* renamed from: c, reason: collision with root package name */
    public int f11221c;

    /* renamed from: d, reason: collision with root package name */
    public int f11222d;

    /* renamed from: e, reason: collision with root package name */
    public int f11223e;

    /* renamed from: g, reason: collision with root package name */
    public C1386a f11225g;

    /* renamed from: h, reason: collision with root package name */
    public k f11226h;

    /* renamed from: i, reason: collision with root package name */
    public C0298b f11227i;

    /* renamed from: j, reason: collision with root package name */
    public p2.k f11228j;
    public final B a = new B(6);

    /* renamed from: f, reason: collision with root package name */
    public long f11224f = -1;

    @Override // V1.n
    public final void a() {
        p2.k kVar = this.f11228j;
        if (kVar != null) {
            kVar.getClass();
        }
    }

    @Override // V1.n
    public final boolean b(o oVar) throws EOFException, InterruptedIOException {
        k kVar = (k) oVar;
        B b4 = this.a;
        b4.C(2);
        kVar.h(b4.a, 0, 2, false);
        if (b4.z() == 65496) {
            b4.C(2);
            kVar.h(b4.a, 0, 2, false);
            int iZ = b4.z();
            this.f11222d = iZ;
            if (iZ == 65504) {
                b4.C(2);
                kVar.h(b4.a, 0, 2, false);
                kVar.b(b4.z() - 2, false);
                b4.C(2);
                kVar.h(b4.a, 0, 2, false);
                this.f11222d = b4.z();
            }
            if (this.f11222d == 65505) {
                kVar.b(2, false);
                b4.C(6);
                kVar.h(b4.a, 0, 6, false);
                if (b4.v() == 1165519206 && b4.z() == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void c() {
        S s7 = this.f11220b;
        s7.getClass();
        s7.b();
        this.f11220b.k(new s(-9223372036854775807L));
        this.f11221c = 6;
    }

    @Override // V1.n
    public final void d(p pVar) {
        this.f11220b = (S) pVar;
    }

    @Override // V1.n
    public final void e(long j7, long j8) {
        if (j7 == 0) {
            this.f11221c = 0;
            this.f11228j = null;
        } else if (this.f11221c == 5) {
            p2.k kVar = this.f11228j;
            kVar.getClass();
            kVar.e(j7, j8);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0190  */
    @Override // V1.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int i(V1.o r29, V1.r r30) throws y1.E {
        /*
            Method dump skipped, instructions count: 489
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d2.C0785a.i(V1.o, V1.r):int");
    }
}
