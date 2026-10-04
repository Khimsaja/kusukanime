package O1;

import io.ktor.utils.io.ByteChannelKt;
import y1.C2401x;

/* loaded from: classes.dex */
public final class U implements A {
    public final E1.g a;

    /* renamed from: b, reason: collision with root package name */
    public final C2.G f7350b;

    /* renamed from: c, reason: collision with root package name */
    public final C0.a f7351c;

    /* renamed from: d, reason: collision with root package name */
    public final R1.i f7352d;

    /* renamed from: e, reason: collision with root package name */
    public final int f7353e;

    public U(E1.g gVar, V1.q qVar) {
        C2.G g4 = new C2.G(13, qVar);
        C0.a aVar = new C0.a();
        R1.i iVar = new R1.i(0);
        this.a = gVar;
        this.f7350b = g4;
        this.f7351c = aVar;
        this.f7352d = iVar;
        this.f7353e = ByteChannelKt.CHANNEL_MAX_SIZE;
    }

    @Override // O1.A
    public final AbstractC0527a d(C2401x c2401x) {
        c2401x.f18138b.getClass();
        E1.g gVar = this.a;
        C2.G g4 = this.f7350b;
        this.f7351c.getClass();
        c2401x.f18138b.getClass();
        c2401x.f18138b.getClass();
        return new V(c2401x, gVar, g4, K1.i.a, this.f7352d, this.f7353e, null);
    }
}
