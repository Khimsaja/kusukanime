package O3;

import f6.C0887A;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class f implements i, Serializable {

    /* renamed from: k, reason: collision with root package name */
    public final C0887A f7520k;

    public f(C0887A c0887a) {
        this.f7520k = c0887a;
    }

    @Override // O3.i
    public final boolean a() {
        return true;
    }

    @Override // O3.i
    public final Object getValue() {
        return this.f7520k;
    }

    public final String toString() {
        return String.valueOf(this.f7520k);
    }
}
