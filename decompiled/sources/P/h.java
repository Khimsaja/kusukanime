package P;

import O.C0517t;
import O.D0;
import O.InterfaceC0512q;
import io.ktor.http.LinkHeader;

/* loaded from: classes.dex */
public final class h extends C {

    /* renamed from: c, reason: collision with root package name */
    public static final h f7669c = new h(0, 2, 1);

    @Override // P.C
    public final void a(B1.s sVar, B2.l lVar, D0 d02, C0517t c0517t) {
        ((e4.k) sVar.e(0)).invoke((InterfaceC0512q) sVar.e(1));
    }

    @Override // P.C
    public final String c(int i7) {
        return i7 == 0 ? LinkHeader.Parameters.Anchor : i7 == 1 ? "composition" : super.c(i7);
    }
}
