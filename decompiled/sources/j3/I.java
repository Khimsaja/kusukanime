package j3;

import java.util.Objects;

/* loaded from: classes.dex */
public final class I extends AbstractC1314A {
    @Override // j3.AbstractC1314A
    public final AbstractC1314A b(Object obj) {
        obj.getClass();
        a(obj);
        return this;
    }

    public final J f() {
        int i7 = this.f12266b;
        if (i7 == 0) {
            int i8 = J.f12280m;
            return d0.f12338t;
        }
        if (i7 != 1) {
            J jR = J.r(i7, this.a);
            this.f12266b = jR.size();
            this.f12267c = true;
            return jR;
        }
        Object obj = this.a[0];
        Objects.requireNonNull(obj);
        int i9 = J.f12280m;
        return new j0(obj);
    }
}
