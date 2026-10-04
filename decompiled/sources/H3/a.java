package H3;

import G3.j;
import G3.m;
import G3.p;

/* loaded from: classes.dex */
public final class a extends j {
    public final j a;

    public a(j jVar) {
        this.a = jVar;
    }

    @Override // G3.j
    public final Object a(m mVar) {
        if (mVar.J() != 9) {
            return this.a.a(mVar);
        }
        mVar.x();
        return null;
    }

    @Override // G3.j
    public final void c(p pVar, Object obj) {
        if (obj == null) {
            pVar.j();
        } else {
            this.a.c(pVar, obj);
        }
    }

    public final String toString() {
        return this.a + ".nullSafe()";
    }
}
