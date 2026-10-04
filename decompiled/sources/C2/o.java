package C2;

import B1.AbstractC0015b;

/* loaded from: classes.dex */
public final class o implements InterfaceC0037j {

    /* renamed from: l, reason: collision with root package name */
    public static final float[] f797l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};
    public final F.w a;

    /* renamed from: b, reason: collision with root package name */
    public final B1.B f798b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean[] f799c = new boolean[4];

    /* renamed from: d, reason: collision with root package name */
    public final m f800d;

    /* renamed from: e, reason: collision with root package name */
    public final y f801e;

    /* renamed from: f, reason: collision with root package name */
    public n f802f;

    /* renamed from: g, reason: collision with root package name */
    public long f803g;

    /* renamed from: h, reason: collision with root package name */
    public String f804h;

    /* renamed from: i, reason: collision with root package name */
    public V1.G f805i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f806j;

    /* renamed from: k, reason: collision with root package name */
    public long f807k;

    public o(F.w wVar) {
        this.a = wVar;
        m mVar = new m();
        mVar.f789e = new byte[128];
        this.f800d = mVar;
        this.f807k = -9223372036854775807L;
        this.f801e = new y(178);
        this.f798b = new B1.B();
    }

    @Override // C2.InterfaceC0037j
    public final void a() {
        C1.r.b(this.f799c);
        m mVar = this.f800d;
        mVar.a = false;
        mVar.f787c = 0;
        mVar.f786b = 0;
        n nVar = this.f802f;
        if (nVar != null) {
            nVar.f790b = false;
            nVar.f791c = false;
            nVar.f792d = false;
            nVar.f793e = -1;
        }
        y yVar = this.f801e;
        if (yVar != null) {
            yVar.g();
        }
        this.f803g = 0L;
        this.f807k = -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0256  */
    @Override // C2.InterfaceC0037j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(B1.B r23) {
        /*
            Method dump skipped, instructions count: 627
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: C2.o.b(B1.B):void");
    }

    @Override // C2.InterfaceC0037j
    public final void c(boolean z7) {
        AbstractC0015b.i(this.f802f);
        if (z7) {
            this.f802f.b(0, this.f803g, this.f806j);
            n nVar = this.f802f;
            nVar.f790b = false;
            nVar.f791c = false;
            nVar.f792d = false;
            nVar.f793e = -1;
        }
    }

    @Override // C2.InterfaceC0037j
    public final void d(int i7, long j7) {
        this.f807k = j7;
    }

    @Override // C2.InterfaceC0037j
    public final void e(V1.p pVar, K k7) {
        k7.a();
        k7.b();
        this.f804h = k7.f689e;
        k7.b();
        V1.G gM = pVar.m(k7.f688d, 2);
        this.f805i = gM;
        this.f802f = new n(gM);
        this.a.u(pVar, k7);
    }
}
