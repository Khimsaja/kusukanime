package P;

import O.C0484c;
import O.C0486d;
import O.C0517t;
import O.D0;
import O.x0;
import io.ktor.http.LinkHeader;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class e extends C {

    /* renamed from: c, reason: collision with root package name */
    public static final e f7666c = new e(0, 2, 1);

    @Override // P.C
    public final void a(B1.s sVar, B2.l lVar, D0 d02, C0517t c0517t) {
        C0484c c0484c = (C0484c) sVar.e(0);
        Object objE = sVar.e(1);
        if (objE instanceof x0) {
            ((ArrayList) c0517t.f7173c).add(((x0) objE).a);
        }
        if (d02.f6979n != 0) {
            C0486d.w("Can only append a slot if not current inserting");
            throw null;
        }
        int i7 = d02.f6974i;
        int i8 = d02.f6975j;
        int iC = d02.c(c0484c);
        int iF = d02.f(d02.f6967b, d02.p(iC + 1));
        d02.f6974i = iF;
        d02.f6975j = iF;
        d02.s(1, iC);
        if (i7 >= iF) {
            i7++;
            i8++;
        }
        d02.f6968c[iF] = objE;
        d02.f6974i = i7;
        d02.f6975j = i8;
    }

    @Override // P.C
    public final String c(int i7) {
        return i7 == 0 ? LinkHeader.Parameters.Anchor : i7 == 1 ? "value" : super.c(i7);
    }
}
