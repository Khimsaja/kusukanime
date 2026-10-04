package L5;

import K5.M;
import K5.W;

/* loaded from: classes.dex */
public final class y extends M implements W {
    @Override // K5.W
    public final Object getValue() {
        Integer numValueOf;
        synchronized (this) {
            Object[] objArr = this.f4766r;
            kotlin.jvm.internal.l.c(objArr);
            numValueOf = Integer.valueOf(((Number) objArr[((int) ((this.f4767s + ((int) ((n() + this.f4769u) - this.f4767s))) - 1)) & (objArr.length - 1)]).intValue());
        }
        return numValueOf;
    }

    public final void u(int i7) {
        synchronized (this) {
            Object[] objArr = this.f4766r;
            kotlin.jvm.internal.l.c(objArr);
            a(Integer.valueOf(((Number) objArr[((int) ((this.f4767s + ((int) ((n() + this.f4769u) - this.f4767s))) - 1)) & (objArr.length - 1)]).intValue() + i7));
        }
    }
}
