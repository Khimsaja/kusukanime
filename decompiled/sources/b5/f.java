package b5;

/* loaded from: classes.dex */
public final class f {
    public final W4.b a;

    /* renamed from: b, reason: collision with root package name */
    public final int f10948b;

    public f(W4.b bVar, int i7) {
        this.a = bVar;
        this.f10948b = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return kotlin.jvm.internal.l.a(this.a, fVar.a) && this.f10948b == fVar.f10948b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f10948b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        int i7;
        StringBuilder sb = new StringBuilder();
        int i8 = 0;
        while (true) {
            i7 = this.f10948b;
            if (i8 >= i7) {
                break;
            }
            sb.append("kotlin/Array<");
            i8++;
        }
        sb.append(this.a);
        for (int i9 = 0; i9 < i7; i9++) {
            sb.append(">");
        }
        return sb.toString();
    }
}
