package y1;

/* loaded from: classes.dex */
public final class I {
    public final C2391m a;

    public I(C2391m c2391m) {
        this.a = c2391m;
    }

    public final boolean a(int... iArr) {
        C2391m c2391m = this.a;
        for (int i7 : iArr) {
            if (c2391m.a.get(i7)) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof I) {
            return this.a.equals(((I) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
