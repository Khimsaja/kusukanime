package M4;

import java.util.Set;
import kotlin.jvm.internal.l;
import n5.B;
import n5.W;

/* loaded from: classes.dex */
public final class a {
    public final W a;

    /* renamed from: b, reason: collision with root package name */
    public final b f6548b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f6549c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f6550d;

    /* renamed from: e, reason: collision with root package name */
    public final Set f6551e;

    /* renamed from: f, reason: collision with root package name */
    public final B f6552f;

    public a(W w7, b bVar, boolean z7, boolean z8, Set set, B b4) {
        this.a = w7;
        this.f6548b = bVar;
        this.f6549c = z7;
        this.f6550d = z8;
        this.f6551e = set;
        this.f6552f = b4;
    }

    public static a a(a aVar, b bVar, boolean z7, Set set, B b4, int i7) {
        W w7 = aVar.a;
        if ((i7 & 2) != 0) {
            bVar = aVar.f6548b;
        }
        b bVar2 = bVar;
        if ((i7 & 4) != 0) {
            z7 = aVar.f6549c;
        }
        boolean z8 = z7;
        boolean z9 = aVar.f6550d;
        if ((i7 & 16) != 0) {
            set = aVar.f6551e;
        }
        Set set2 = set;
        if ((i7 & 32) != 0) {
            b4 = aVar.f6552f;
        }
        aVar.getClass();
        l.f("howThisTypeIsUsed", w7);
        l.f("flexibility", bVar2);
        return new a(w7, bVar2, z8, z9, set2, b4);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(aVar.f6552f, this.f6552f) && aVar.a == this.a && aVar.f6548b == this.f6548b && aVar.f6549c == this.f6549c && aVar.f6550d == this.f6550d;
    }

    public final int hashCode() {
        B b4 = this.f6552f;
        int iHashCode = b4 != null ? b4.hashCode() : 0;
        int iHashCode2 = this.a.hashCode() + (iHashCode * 31) + iHashCode;
        int iHashCode3 = this.f6548b.hashCode() + (iHashCode2 * 31) + iHashCode2;
        int i7 = (iHashCode3 * 31) + (this.f6549c ? 1 : 0) + iHashCode3;
        return (i7 * 31) + (this.f6550d ? 1 : 0) + i7;
    }

    public final String toString() {
        return "JavaTypeAttributes(howThisTypeIsUsed=" + this.a + ", flexibility=" + this.f6548b + ", isRaw=" + this.f6549c + ", isForAnnotationParameter=" + this.f6550d + ", visitedTypeParameters=" + this.f6551e + ", defaultType=" + this.f6552f + ')';
    }

    public /* synthetic */ a(W w7, boolean z7, boolean z8, Set set, int i7) {
        this(w7, b.f6553k, (i7 & 4) != 0 ? false : z7, (i7 & 8) != 0 ? false : z8, (i7 & 16) != 0 ? null : set, null);
    }
}
