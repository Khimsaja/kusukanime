package u4;

import java.util.List;

/* renamed from: u4.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2086B {
    public final W4.b a;

    /* renamed from: b, reason: collision with root package name */
    public final List f16285b;

    public C2086B(W4.b bVar, List list) {
        kotlin.jvm.internal.l.f("classId", bVar);
        this.a = bVar;
        this.f16285b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2086B)) {
            return false;
        }
        C2086B c2086b = (C2086B) obj;
        return kotlin.jvm.internal.l.a(this.a, c2086b.a) && kotlin.jvm.internal.l.a(this.f16285b, c2086b.f16285b);
    }

    public final int hashCode() {
        return this.f16285b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ClassRequest(classId=" + this.a + ", typeParametersCount=" + this.f16285b + ')';
    }
}
