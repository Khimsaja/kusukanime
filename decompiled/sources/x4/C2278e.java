package x4;

import java.util.Collection;
import java.util.List;
import l5.C1467t;
import r4.AbstractC1880i;
import u4.InterfaceC2102h;

/* renamed from: x4.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2278e implements n5.M {
    public final /* synthetic */ AbstractC2279f a;

    public C2278e(AbstractC2279f abstractC2279f) {
        this.a = abstractC2279f;
    }

    @Override // n5.M
    public final AbstractC1880i d() {
        return d5.e.e(this.a);
    }

    @Override // n5.M
    public final boolean e() {
        return true;
    }

    @Override // n5.M
    public final InterfaceC2102h f() {
        return this.a;
    }

    @Override // n5.M
    public final Collection g() {
        Collection collectionG = ((C1467t) this.a).P0().t0().g();
        kotlin.jvm.internal.l.e("getSupertypes(...)", collectionG);
        return collectionG;
    }

    @Override // n5.M
    public final List getParameters() {
        List list = ((C1467t) this.a).f12840z;
        if (list != null) {
            return list;
        }
        kotlin.jvm.internal.l.l("typeConstructorParameters");
        throw null;
    }

    public final String toString() {
        return "[typealias " + this.a.getName().b() + ']';
    }
}
