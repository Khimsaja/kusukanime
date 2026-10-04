package L4;

import java.util.Collection;
import java.util.Set;
import u4.InterfaceC2099e;

/* loaded from: classes.dex */
public final class B extends w5.k {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f6047b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Set f6048c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e4.k f6049d;

    public B(i iVar, Set set, e4.k kVar) {
        this.f6047b = iVar;
        this.f6048c = set;
        this.f6049d = kVar;
    }

    @Override // w5.k
    public final boolean c(Object obj) {
        InterfaceC2099e interfaceC2099e = (InterfaceC2099e) obj;
        kotlin.jvm.internal.l.f("current", interfaceC2099e);
        if (interfaceC2099e == this.f6047b) {
            return true;
        }
        g5.o oVarC0 = interfaceC2099e.c0();
        kotlin.jvm.internal.l.e("getStaticScope(...)", oVarC0);
        if (!(oVarC0 instanceof D)) {
            return true;
        }
        this.f6048c.addAll((Collection) this.f6049d.invoke(oVarC0));
        return false;
    }

    @Override // w5.k
    public final /* bridge */ /* synthetic */ Object i() {
        return O3.C.a;
    }
}
