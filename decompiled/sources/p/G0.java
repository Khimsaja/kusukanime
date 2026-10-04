package p;

/* loaded from: classes.dex */
public final class G0 {
    public final AbstractC1766r a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1774z f13862b;

    public G0(AbstractC1766r abstractC1766r, InterfaceC1774z interfaceC1774z) {
        this.a = abstractC1766r;
        this.f13862b = interfaceC1774z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof G0)) {
            return false;
        }
        G0 g02 = (G0) obj;
        return kotlin.jvm.internal.l.a(this.a, g02.a) && kotlin.jvm.internal.l.a(this.f13862b, g02.f13862b);
    }

    public final int hashCode() {
        return Integer.hashCode(0) + ((this.f13862b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "VectorizedKeyframeSpecElementInfo(vectorValue=" + this.a + ", easing=" + this.f13862b + ", arcMode=ArcMode(value=0))";
    }
}
