package h5;

import kotlin.jvm.internal.l;
import n5.AbstractC1586x;
import n5.B;
import u4.InterfaceC2099e;

/* renamed from: h5.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1014c implements InterfaceC1015d {

    /* renamed from: k, reason: collision with root package name */
    public final InterfaceC2099e f11856k;

    public C1014c(InterfaceC2099e interfaceC2099e) {
        l.f("classDescriptor", interfaceC2099e);
        this.f11856k = interfaceC2099e;
    }

    public final boolean equals(Object obj) {
        C1014c c1014c = obj instanceof C1014c ? (C1014c) obj : null;
        return l.a(this.f11856k, c1014c != null ? c1014c.f11856k : null);
    }

    @Override // h5.InterfaceC1015d
    public final AbstractC1586x getType() {
        B bG = this.f11856k.g();
        l.e("getDefaultType(...)", bG);
        return bG;
    }

    public final int hashCode() {
        return this.f11856k.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Class{");
        B bG = this.f11856k.g();
        l.e("getDefaultType(...)", bG);
        sb.append(bG);
        sb.append('}');
        return sb.toString();
    }
}
