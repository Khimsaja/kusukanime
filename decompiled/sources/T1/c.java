package T1;

import B1.D;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import y1.C2392n;
import y1.C2393o;

/* loaded from: classes.dex */
public final class c {
    public final s a;

    /* renamed from: b, reason: collision with root package name */
    public final D f8852b;

    /* renamed from: c, reason: collision with root package name */
    public final w f8853c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayDeque f8854d;

    /* renamed from: e, reason: collision with root package name */
    public final C2393o f8855e;

    /* renamed from: f, reason: collision with root package name */
    public long f8856f;

    /* renamed from: g, reason: collision with root package name */
    public final z f8857g;

    /* renamed from: h, reason: collision with root package name */
    public final Executor f8858h;

    /* renamed from: i, reason: collision with root package name */
    public q f8859i;

    public c(s sVar, D d4) {
        this.a = sVar;
        sVar.f8956l = d4;
        this.f8852b = d4;
        this.f8853c = new w(new L2.e(this), sVar);
        this.f8854d = new ArrayDeque();
        this.f8855e = new C2393o(new C2392n());
        this.f8856f = -9223372036854775807L;
        this.f8857g = z.a;
        this.f8858h = new I2.c(1);
        this.f8859i = new C0595a();
    }

    public final void a(long j7, long j8) {
        if (j7 != this.f8856f) {
            w wVar = this.f8853c;
            long j9 = wVar.f8986g;
            wVar.f8984e.a(j9 == -9223372036854775807L ? 0L : j9 + 1, Long.valueOf(j7));
            this.f8856f = j7;
        }
    }
}
