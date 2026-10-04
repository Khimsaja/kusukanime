package l6;

import f6.C0922t;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class c extends a {

    /* renamed from: n, reason: collision with root package name */
    public final C0922t f12851n;

    /* renamed from: o, reason: collision with root package name */
    public long f12852o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f12853p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Q4.b f12854q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Q4.b bVar, C0922t c0922t) {
        super(bVar);
        l.f("url", c0922t);
        this.f12854q = bVar;
        this.f12851n = c0922t;
        this.f12852o = -1L;
        this.f12853p = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00ed, code lost:
    
        if (r18.f12853p == false) goto L52;
     */
    @Override // l6.a, w6.H
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long F(w6.C2224i r19, long r20) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l6.c.F(w6.i, long):long");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f12846l) {
            return;
        }
        if (this.f12853p) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            if (!g6.b.h(this)) {
                ((j6.l) this.f12854q.f8006d).k();
                b();
            }
        }
        this.f12846l = true;
    }
}
