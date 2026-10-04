package y;

import java.util.ArrayList;
import v.c0;
import y0.C2351F;
import y0.InterfaceC2368o;

/* renamed from: y.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2334o extends a0.p implements InterfaceC2368o {

    /* renamed from: x, reason: collision with root package name */
    public androidx.compose.foundation.lazy.layout.a f17631x;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2334o) && kotlin.jvm.internal.l.a(this.f17631x, ((C2334o) obj).f17631x);
    }

    @Override // y0.InterfaceC2368o
    public final void f(C2351F c2351f) {
        ArrayList arrayList = this.f17631x.f10605h;
        if (arrayList.size() <= 0) {
            c2351f.b();
        } else {
            c0.e(arrayList.get(0));
            throw null;
        }
    }

    public final int hashCode() {
        return this.f17631x.hashCode();
    }

    public final String toString() {
        return "DisplayingDisappearingItemsNode(animator=" + this.f17631x + ')';
    }

    @Override // a0.p
    public final void y0() {
        this.f17631x.getClass();
    }

    @Override // a0.p
    public final void z0() {
        this.f17631x.d();
    }
}
