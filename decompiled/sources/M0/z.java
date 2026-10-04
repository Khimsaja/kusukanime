package M0;

import p.AbstractC1755i;

/* loaded from: classes.dex */
public final class z {
    public final u a;

    /* renamed from: b, reason: collision with root package name */
    public final t f6420b;

    public z(u uVar, t tVar) {
        this.a = uVar;
        this.f6420b = tVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        zVar.getClass();
        return kotlin.jvm.internal.l.a(this.a, zVar.a) && this.f6420b.equals(zVar.f6420b);
    }

    public final int hashCode() {
        return this.f6420b.a.hashCode() + AbstractC1755i.a(0, AbstractC1755i.a(0, (1639579648 + this.a.f6419k) * 31, 31), 31);
    }

    public final String toString() {
        return "ResourceFont(resId=2131099648, weight=" + this.a + ", style=" + ((Object) "Normal") + ", loadingStrategy=Blocking)";
    }
}
