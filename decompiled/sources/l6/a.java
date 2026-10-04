package l6;

import java.io.IOException;
import kotlin.jvm.internal.l;
import w6.C;
import w6.C2224i;
import w6.H;
import w6.J;
import w6.r;

/* loaded from: classes.dex */
public abstract class a implements H {

    /* renamed from: k, reason: collision with root package name */
    public final r f12845k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f12846l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Q4.b f12847m;

    public a(Q4.b bVar) {
        this.f12847m = bVar;
        this.f12845k = new r(((C) bVar.f8007e).f17113k.d());
    }

    @Override // w6.H
    public long F(C2224i c2224i, long j7) throws IOException {
        Q4.b bVar = this.f12847m;
        l.f("sink", c2224i);
        try {
            return ((C) bVar.f8007e).F(c2224i, j7);
        } catch (IOException e7) {
            ((j6.l) bVar.f8006d).k();
            b();
            throw e7;
        }
    }

    public final void b() {
        Q4.b bVar = this.f12847m;
        int i7 = bVar.f8004b;
        if (i7 == 6) {
            return;
        }
        if (i7 != 5) {
            throw new IllegalStateException("state: " + bVar.f8004b);
        }
        r rVar = this.f12845k;
        J j7 = rVar.f17174e;
        rVar.f17174e = J.f17126d;
        j7.a();
        j7.b();
        bVar.f8004b = 6;
    }

    @Override // w6.H
    public final J d() {
        return this.f12845k;
    }
}
