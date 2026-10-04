package C2;

import y1.C2393o;

/* renamed from: C2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0030c implements InterfaceC0037j {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final B1.A f693b;

    /* renamed from: c, reason: collision with root package name */
    public final B1.B f694c;

    /* renamed from: d, reason: collision with root package name */
    public final String f695d;

    /* renamed from: e, reason: collision with root package name */
    public final int f696e;

    /* renamed from: f, reason: collision with root package name */
    public final String f697f;

    /* renamed from: g, reason: collision with root package name */
    public String f698g;

    /* renamed from: h, reason: collision with root package name */
    public V1.G f699h;

    /* renamed from: i, reason: collision with root package name */
    public int f700i;

    /* renamed from: j, reason: collision with root package name */
    public int f701j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f702k;

    /* renamed from: l, reason: collision with root package name */
    public long f703l;

    /* renamed from: m, reason: collision with root package name */
    public C2393o f704m;

    /* renamed from: n, reason: collision with root package name */
    public int f705n;

    /* renamed from: o, reason: collision with root package name */
    public long f706o;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0030c(String str) {
        this(0, 0, null, str);
        this.a = 0;
    }

    @Override // C2.InterfaceC0037j
    public final void a() {
        switch (this.a) {
            case 0:
                this.f700i = 0;
                this.f701j = 0;
                this.f702k = false;
                this.f706o = -9223372036854775807L;
                break;
            default:
                this.f700i = 0;
                this.f701j = 0;
                this.f702k = false;
                this.f706o = -9223372036854775807L;
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x03ed  */
    @Override // C2.InterfaceC0037j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(B1.B r23) {
        /*
            Method dump skipped, instructions count: 1274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: C2.C0030c.b(B1.B):void");
    }

    @Override // C2.InterfaceC0037j
    public final void c(boolean z7) {
        int i7 = this.a;
    }

    @Override // C2.InterfaceC0037j
    public final void d(int i7, long j7) {
        switch (this.a) {
            case 0:
                this.f706o = j7;
                break;
            default:
                this.f706o = j7;
                break;
        }
    }

    @Override // C2.InterfaceC0037j
    public final void e(V1.p pVar, K k7) {
        switch (this.a) {
            case 0:
                k7.a();
                k7.b();
                this.f698g = k7.f689e;
                k7.b();
                this.f699h = pVar.m(k7.f688d, 1);
                break;
            default:
                k7.a();
                k7.b();
                this.f698g = k7.f689e;
                k7.b();
                this.f699h = pVar.m(k7.f688d, 1);
                break;
        }
    }

    public C0030c(int i7, int i8, String str, String str2) {
        this.a = i8;
        switch (i8) {
            case 1:
                B1.A a = new B1.A(new byte[16], 16);
                this.f693b = a;
                this.f694c = new B1.B(a.f281b);
                this.f700i = 0;
                this.f701j = 0;
                this.f702k = false;
                this.f706o = -9223372036854775807L;
                this.f695d = str;
                this.f696e = i7;
                this.f697f = str2;
                break;
            default:
                B1.A a7 = new B1.A(new byte[128], 128);
                this.f693b = a7;
                this.f694c = new B1.B(a7.f281b);
                this.f700i = 0;
                this.f706o = -9223372036854775807L;
                this.f695d = str;
                this.f696e = i7;
                this.f697f = str2;
                break;
        }
    }

    private final void f(boolean z7) {
    }

    private final void g(boolean z7) {
    }
}
