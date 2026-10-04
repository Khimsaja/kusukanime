package z1;

import B1.K;
import b1.AbstractC0703b;
import java.util.Objects;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: e, reason: collision with root package name */
    public static final e f18959e = new e(-1, -1, -1);
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public final int f18960b;

    /* renamed from: c, reason: collision with root package name */
    public final int f18961c;

    /* renamed from: d, reason: collision with root package name */
    public final int f18962d;

    public e(int i7, int i8, int i9) {
        this.a = i7;
        this.f18960b = i8;
        this.f18961c = i9;
        this.f18962d = K.C(i9) ? K.q(i9) * i8 : -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.a == eVar.a && this.f18960b == eVar.f18960b && this.f18961c == eVar.f18961c;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), Integer.valueOf(this.f18960b), Integer.valueOf(this.f18961c));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioFormat[sampleRate=");
        sb.append(this.a);
        sb.append(", channelCount=");
        sb.append(this.f18960b);
        sb.append(", encoding=");
        return AbstractC0703b.l(sb, this.f18961c, ']');
    }
}
