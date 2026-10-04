package J5;

import H5.D;

/* loaded from: classes.dex */
public final class s extends j implements t {
    @Override // H5.AbstractC0254a
    public final void Z(Throwable th, boolean z7) {
        if (this.f4337n.g(th, false) || z7) {
            return;
        }
        D.s(this.f3833m, th);
    }

    @Override // H5.AbstractC0254a
    public final void a0(Object obj) {
        this.f4337n.close(null);
    }
}
