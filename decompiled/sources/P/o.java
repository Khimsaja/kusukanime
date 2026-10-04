package P;

import O.B0;
import O.C0484c;
import O.C0486d;
import O.C0517t;
import O.D0;
import io.ktor.http.LinkHeader;

/* loaded from: classes.dex */
public final class o extends C {

    /* renamed from: c, reason: collision with root package name */
    public static final o f7680c = new o(0, 3, 1);

    @Override // P.C
    public final void a(B1.s sVar, B2.l lVar, D0 d02, C0517t c0517t) {
        B0 b02 = (B0) sVar.e(1);
        C0484c c0484c = (C0484c) sVar.e(0);
        C0558c c0558c = (C0558c) sVar.e(2);
        D0 d0M = b02.m();
        try {
            if (!c0558c.f7664j.c0()) {
                C0486d.w("FixupList has pending fixup operations that were not realized. Were there mismatched insertNode() and endNodeInsert() calls?");
                throw null;
            }
            c0558c.f7663i.b0(lVar, d0M, c0517t);
            d0M.e(true);
            d02.d();
            c0484c.getClass();
            d02.t(b02, b02.a(c0484c));
            d02.j();
        } catch (Throwable th) {
            d0M.e(false);
            throw th;
        }
    }

    @Override // P.C
    public final String c(int i7) {
        return i7 == 0 ? LinkHeader.Parameters.Anchor : i7 == 1 ? "from" : i7 == 2 ? "fixups" : super.c(i7);
    }
}
