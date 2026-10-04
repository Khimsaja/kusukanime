package P;

import O.B0;
import O.C0484c;
import O.C0517t;
import O.D0;
import io.ktor.http.LinkHeader;

/* loaded from: classes.dex */
public final class n extends C {

    /* renamed from: c, reason: collision with root package name */
    public static final n f7679c = new n(0, 2, 1);

    @Override // P.C
    public final void a(B1.s sVar, B2.l lVar, D0 d02, C0517t c0517t) {
        B0 b02 = (B0) sVar.e(1);
        C0484c c0484c = (C0484c) sVar.e(0);
        d02.d();
        c0484c.getClass();
        d02.t(b02, b02.a(c0484c));
        d02.j();
    }

    @Override // P.C
    public final String c(int i7) {
        return i7 == 0 ? LinkHeader.Parameters.Anchor : i7 == 1 ? "from" : super.c(i7);
    }
}
