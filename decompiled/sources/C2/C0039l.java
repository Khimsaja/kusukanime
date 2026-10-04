package C2;

import B1.AbstractC0015b;

/* renamed from: C2.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0039l implements InterfaceC0037j {

    /* renamed from: r, reason: collision with root package name */
    public static final double[] f768r = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    public String a;

    /* renamed from: b, reason: collision with root package name */
    public V1.G f769b;

    /* renamed from: c, reason: collision with root package name */
    public final F.w f770c;

    /* renamed from: d, reason: collision with root package name */
    public final String f771d;

    /* renamed from: e, reason: collision with root package name */
    public final B1.B f772e;

    /* renamed from: f, reason: collision with root package name */
    public final y f773f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f774g = new boolean[4];

    /* renamed from: h, reason: collision with root package name */
    public final C0038k f775h;

    /* renamed from: i, reason: collision with root package name */
    public long f776i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f777j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f778k;

    /* renamed from: l, reason: collision with root package name */
    public long f779l;

    /* renamed from: m, reason: collision with root package name */
    public long f780m;

    /* renamed from: n, reason: collision with root package name */
    public long f781n;

    /* renamed from: o, reason: collision with root package name */
    public long f782o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f783p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f784q;

    public C0039l(F.w wVar, String str) {
        this.f770c = wVar;
        this.f771d = str;
        C0038k c0038k = new C0038k();
        c0038k.f767d = new byte[128];
        this.f775h = c0038k;
        if (wVar != null) {
            this.f773f = new y(178);
            this.f772e = new B1.B();
        } else {
            this.f773f = null;
            this.f772e = null;
        }
        this.f780m = -9223372036854775807L;
        this.f782o = -9223372036854775807L;
    }

    @Override // C2.InterfaceC0037j
    public final void a() {
        C1.r.b(this.f774g);
        C0038k c0038k = this.f775h;
        c0038k.a = false;
        c0038k.f765b = 0;
        c0038k.f766c = 0;
        y yVar = this.f773f;
        if (yVar != null) {
            yVar.g();
        }
        this.f776i = 0L;
        this.f777j = false;
        this.f780m = -9223372036854775807L;
        this.f782o = -9223372036854775807L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:65:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x021c  */
    @Override // C2.InterfaceC0037j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(B1.B r31) {
        /*
            Method dump skipped, instructions count: 548
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: C2.C0039l.b(B1.B):void");
    }

    @Override // C2.InterfaceC0037j
    public final void c(boolean z7) {
        AbstractC0015b.i(this.f769b);
        if (z7) {
            boolean z8 = this.f783p;
            this.f769b.b(this.f782o, z8 ? 1 : 0, (int) (this.f776i - this.f781n), 0, null);
        }
    }

    @Override // C2.InterfaceC0037j
    public final void d(int i7, long j7) {
        this.f780m = j7;
    }

    @Override // C2.InterfaceC0037j
    public final void e(V1.p pVar, K k7) {
        k7.a();
        k7.b();
        this.a = k7.f689e;
        k7.b();
        this.f769b = pVar.m(k7.f688d, 2);
        F.w wVar = this.f770c;
        if (wVar != null) {
            wVar.u(pVar, k7);
        }
    }
}
