package D2;

import O1.S;
import V1.G;
import V1.k;
import V1.n;
import V1.o;
import V1.p;
import l4.AbstractC1420H;

/* loaded from: classes.dex */
public final class d implements n {
    public S a;

    /* renamed from: b, reason: collision with root package name */
    public G f1408b;

    /* renamed from: e, reason: collision with root package name */
    public b f1411e;

    /* renamed from: c, reason: collision with root package name */
    public int f1409c = 0;

    /* renamed from: d, reason: collision with root package name */
    public long f1410d = -1;

    /* renamed from: f, reason: collision with root package name */
    public int f1412f = -1;

    /* renamed from: g, reason: collision with root package name */
    public long f1413g = -1;

    @Override // V1.n
    public final boolean b(o oVar) {
        return AbstractC1420H.n((k) oVar);
    }

    @Override // V1.n
    public final void d(p pVar) {
        S s7 = (S) pVar;
        this.a = s7;
        this.f1408b = s7.m(0, 1);
        s7.b();
    }

    @Override // V1.n
    public final void e(long j7, long j8) {
        this.f1409c = j7 == 0 ? 0 : 4;
        b bVar = this.f1411e;
        if (bVar != null) {
            bVar.c(j8);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x018b, code lost:
    
        if (r12 != 65534) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:60:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01b4  */
    @Override // V1.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int i(V1.o r25, V1.r r26) throws y1.E, java.io.EOFException, java.io.InterruptedIOException {
        /*
            Method dump skipped, instructions count: 573
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: D2.d.i(V1.o, V1.r):int");
    }

    @Override // V1.n
    public final void a() {
    }
}
