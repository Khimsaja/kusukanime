package q2;

import B1.B;
import O1.S;
import V1.G;
import n5.P;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: b, reason: collision with root package name */
    public G f14708b;

    /* renamed from: c, reason: collision with root package name */
    public S f14709c;

    /* renamed from: d, reason: collision with root package name */
    public h f14710d;

    /* renamed from: e, reason: collision with root package name */
    public long f14711e;

    /* renamed from: f, reason: collision with root package name */
    public long f14712f;

    /* renamed from: g, reason: collision with root package name */
    public long f14713g;

    /* renamed from: h, reason: collision with root package name */
    public int f14714h;

    /* renamed from: i, reason: collision with root package name */
    public int f14715i;

    /* renamed from: k, reason: collision with root package name */
    public long f14717k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f14718l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f14719m;
    public final f a = new f();

    /* renamed from: j, reason: collision with root package name */
    public P f14716j = new P(3);

    public void a(long j7) {
        this.f14713g = j7;
    }

    public abstract long b(B b4);

    public abstract boolean c(B b4, long j7, P p7);

    public void d(boolean z7) {
        if (z7) {
            this.f14716j = new P(3);
            this.f14712f = 0L;
            this.f14714h = 0;
        } else {
            this.f14714h = 1;
        }
        this.f14711e = -1L;
        this.f14713g = 0L;
    }
}
