package Y4;

import h4.AbstractC1009a;
import l4.InterfaceC1443v;

/* loaded from: classes.dex */
public final class k extends AbstractC1009a {
    public final /* synthetic */ l a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(Object obj, l lVar) {
        super(obj);
        this.a = lVar;
    }

    @Override // h4.AbstractC1009a
    public final boolean beforeChange(InterfaceC1443v interfaceC1443v, Object obj, Object obj2) {
        kotlin.jvm.internal.l.f("property", interfaceC1443v);
        if (this.a.a) {
            throw new IllegalStateException("Cannot modify readonly DescriptorRendererOptions");
        }
        return true;
    }
}
