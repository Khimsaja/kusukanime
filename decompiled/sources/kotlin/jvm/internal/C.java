package kotlin.jvm.internal;

import java.util.Collections;
import java.util.List;
import l4.EnumC1413A;
import l4.InterfaceC1425d;
import l4.InterfaceC1445x;

/* loaded from: classes.dex */
public final class C implements InterfaceC1445x {

    /* renamed from: k, reason: collision with root package name */
    public final InterfaceC1425d f12706k;

    /* renamed from: l, reason: collision with root package name */
    public volatile List f12707l;

    public C(InterfaceC1425d interfaceC1425d) {
        EnumC1413A enumC1413A = EnumC1413A.f12731k;
        this.f12706k = interfaceC1425d;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C) {
            return l.a(this.f12706k, ((C) obj).f12706k);
        }
        return false;
    }

    @Override // l4.InterfaceC1445x
    public final String getName() {
        return "PluginConfigT";
    }

    @Override // l4.InterfaceC1445x
    public final List getUpperBounds() {
        List list = this.f12707l;
        if (list != null) {
            return list;
        }
        z zVar = y.a;
        List listH = P3.r.H(zVar.l(zVar.b(Object.class), Collections.EMPTY_LIST, true));
        this.f12707l = listH;
        return listH;
    }

    public final int hashCode() {
        InterfaceC1425d interfaceC1425d = this.f12706k;
        return ((interfaceC1425d != null ? interfaceC1425d.hashCode() : 0) * 31) + 749883007;
    }

    public final String toString() {
        EnumC1413A enumC1413A = EnumC1413A.f12731k;
        return "PluginConfigT";
    }
}
