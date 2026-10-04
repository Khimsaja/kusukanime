package j5;

import R4.C0580k;
import u4.M;

/* renamed from: j5.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1349d {
    public final T4.g a;

    /* renamed from: b, reason: collision with root package name */
    public final C0580k f12408b;

    /* renamed from: c, reason: collision with root package name */
    public final T4.a f12409c;

    /* renamed from: d, reason: collision with root package name */
    public final M f12410d;

    public C1349d(T4.g gVar, C0580k c0580k, T4.a aVar, M m7) {
        kotlin.jvm.internal.l.f("nameResolver", gVar);
        kotlin.jvm.internal.l.f("classProto", c0580k);
        kotlin.jvm.internal.l.f("sourceElement", m7);
        this.a = gVar;
        this.f12408b = c0580k;
        this.f12409c = aVar;
        this.f12410d = m7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1349d)) {
            return false;
        }
        C1349d c1349d = (C1349d) obj;
        return kotlin.jvm.internal.l.a(this.a, c1349d.a) && kotlin.jvm.internal.l.a(this.f12408b, c1349d.f12408b) && kotlin.jvm.internal.l.a(this.f12409c, c1349d.f12409c) && kotlin.jvm.internal.l.a(this.f12410d, c1349d.f12410d);
    }

    public final int hashCode() {
        return this.f12410d.hashCode() + ((this.f12409c.hashCode() + ((this.f12408b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ClassData(nameResolver=" + this.a + ", classProto=" + this.f12408b + ", metadataVersion=" + this.f12409c + ", sourceElement=" + this.f12410d + ')';
    }
}
