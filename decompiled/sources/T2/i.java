package T2;

import K5.InterfaceC0330i;
import O3.C;
import kotlin.jvm.internal.C1401a;

/* loaded from: classes.dex */
public final /* synthetic */ class i implements InterfaceC0330i, kotlin.jvm.internal.g {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ o f9002k;

    public i(o oVar) {
        this.f9002k = oVar;
    }

    @Override // K5.InterfaceC0330i
    public final Object emit(Object obj, S3.c cVar) {
        this.f9002k.k((g) obj);
        C c2 = C.a;
        T3.a aVar = T3.a.f9048k;
        return c2;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof InterfaceC0330i) && (obj instanceof kotlin.jvm.internal.g)) {
            return getFunctionDelegate().equals(((kotlin.jvm.internal.g) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.g
    public final O3.e getFunctionDelegate() {
        return new C1401a(2, 4, o.class, this.f9002k, "updateState", "updateState(Lcoil/compose/AsyncImagePainter$State;)V");
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
