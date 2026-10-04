package C2;

import java.util.Arrays;
import y1.C2392n;

/* renamed from: C2.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0033f implements InterfaceC0037j {

    /* renamed from: x, reason: collision with root package name */
    public static final byte[] f717x = {73, 68, 51};
    public final boolean a;

    /* renamed from: d, reason: collision with root package name */
    public final String f720d;

    /* renamed from: e, reason: collision with root package name */
    public final int f721e;

    /* renamed from: f, reason: collision with root package name */
    public final String f722f;

    /* renamed from: g, reason: collision with root package name */
    public String f723g;

    /* renamed from: h, reason: collision with root package name */
    public V1.G f724h;

    /* renamed from: i, reason: collision with root package name */
    public V1.G f725i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f729m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f730n;

    /* renamed from: q, reason: collision with root package name */
    public int f733q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f734r;

    /* renamed from: t, reason: collision with root package name */
    public int f736t;

    /* renamed from: v, reason: collision with root package name */
    public V1.G f738v;

    /* renamed from: w, reason: collision with root package name */
    public long f739w;

    /* renamed from: b, reason: collision with root package name */
    public final B1.A f718b = new B1.A(new byte[7], 7);

    /* renamed from: c, reason: collision with root package name */
    public final B1.B f719c = new B1.B(Arrays.copyOf(f717x, 10));

    /* renamed from: o, reason: collision with root package name */
    public int f731o = -1;

    /* renamed from: p, reason: collision with root package name */
    public int f732p = -1;

    /* renamed from: s, reason: collision with root package name */
    public long f735s = -9223372036854775807L;

    /* renamed from: u, reason: collision with root package name */
    public long f737u = -9223372036854775807L;

    /* renamed from: j, reason: collision with root package name */
    public int f726j = 0;

    /* renamed from: k, reason: collision with root package name */
    public int f727k = 0;

    /* renamed from: l, reason: collision with root package name */
    public int f728l = 256;

    public C0033f(int i7, String str, String str2, boolean z7) {
        this.a = z7;
        this.f720d = str;
        this.f721e = i7;
        this.f722f = str2;
    }

    @Override // C2.InterfaceC0037j
    public final void a() {
        this.f737u = -9223372036854775807L;
        this.f730n = false;
        this.f726j = 0;
        this.f727k = 0;
        this.f728l = 256;
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x0236, code lost:
    
        r2 = -1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v4 */
    @Override // C2.InterfaceC0037j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(B1.B r24) {
        /*
            Method dump skipped, instructions count: 848
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: C2.C0033f.b(B1.B):void");
    }

    @Override // C2.InterfaceC0037j
    public final void d(int i7, long j7) {
        this.f737u = j7;
    }

    @Override // C2.InterfaceC0037j
    public final void e(V1.p pVar, K k7) {
        k7.a();
        k7.b();
        this.f723g = k7.f689e;
        k7.b();
        V1.G gM = pVar.m(k7.f688d, 1);
        this.f724h = gM;
        this.f738v = gM;
        if (!this.a) {
            this.f725i = new V1.m();
            return;
        }
        k7.a();
        k7.b();
        V1.G gM2 = pVar.m(k7.f688d, 5);
        this.f725i = gM2;
        C2392n c2392n = new C2392n();
        k7.b();
        c2392n.a = k7.f689e;
        c2392n.f18073l = y1.D.m(this.f722f);
        c2392n.f18074m = y1.D.m("application/id3");
        A6.b.r(c2392n, gM2);
    }

    @Override // C2.InterfaceC0037j
    public final void c(boolean z7) {
    }
}
