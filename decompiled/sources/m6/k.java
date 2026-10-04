package m6;

import java.io.IOException;
import w6.C2224i;

/* loaded from: classes.dex */
public final class k extends i6.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n f13028e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f13029f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C2224i f13030g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f13031h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(String str, n nVar, int i7, C2224i c2224i, int i8, boolean z7) {
        super(str, true);
        this.f13028e = nVar;
        this.f13029f = i7;
        this.f13030g = c2224i;
        this.f13031h = i8;
    }

    @Override // i6.a
    public final long a() {
        try {
            z zVar = this.f13028e.f13056u;
            C2224i c2224i = this.f13030g;
            int i7 = this.f13031h;
            zVar.getClass();
            c2224i.n(i7);
            this.f13028e.f13044G.s(this.f13029f, 9);
            synchronized (this.f13028e) {
                this.f13028e.I.remove(Integer.valueOf(this.f13029f));
            }
            return -1L;
        } catch (IOException unused) {
            return -1L;
        }
    }
}
