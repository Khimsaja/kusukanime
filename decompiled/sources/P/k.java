package P;

import O.C0484c;
import O.C0517t;
import O.D0;
import io.ktor.http.LinkHeader;

/* loaded from: classes.dex */
public final class k extends C {

    /* renamed from: c, reason: collision with root package name */
    public static final k f7672c;

    static {
        int i7 = 1;
        f7672c = new k(0, i7, i7);
    }

    @Override // P.C
    public final void a(B1.s sVar, B2.l lVar, D0 d02, C0517t c0517t) {
        C0484c c0484c = (C0484c) sVar.e(0);
        c0484c.getClass();
        d02.k(d02.c(c0484c));
    }

    @Override // P.C
    public final String c(int i7) {
        return i7 == 0 ? LinkHeader.Parameters.Anchor : super.c(i7);
    }
}
