package C2;

import android.util.SparseArray;

/* loaded from: classes.dex */
public final class q {
    public final V1.G a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f823b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f824c;

    /* renamed from: f, reason: collision with root package name */
    public final B1.A f827f;

    /* renamed from: g, reason: collision with root package name */
    public byte[] f828g;

    /* renamed from: h, reason: collision with root package name */
    public int f829h;

    /* renamed from: i, reason: collision with root package name */
    public int f830i;

    /* renamed from: j, reason: collision with root package name */
    public long f831j;

    /* renamed from: l, reason: collision with root package name */
    public long f833l;

    /* renamed from: p, reason: collision with root package name */
    public long f837p;

    /* renamed from: q, reason: collision with root package name */
    public long f838q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f839r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f840s;

    /* renamed from: d, reason: collision with root package name */
    public final SparseArray f825d = new SparseArray();

    /* renamed from: e, reason: collision with root package name */
    public final SparseArray f826e = new SparseArray();

    /* renamed from: m, reason: collision with root package name */
    public p f834m = new p();

    /* renamed from: n, reason: collision with root package name */
    public p f835n = new p();

    /* renamed from: k, reason: collision with root package name */
    public boolean f832k = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f836o = false;

    public q(V1.G g4, boolean z7, boolean z8) {
        this.a = g4;
        this.f823b = z7;
        this.f824c = z8;
        byte[] bArr = new byte[128];
        this.f828g = bArr;
        this.f827f = new B1.A(bArr, 0, 0);
        p pVar = this.f835n;
        pVar.f808b = false;
        pVar.a = false;
    }
}
