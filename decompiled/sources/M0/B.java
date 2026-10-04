package M0;

import s0.C1967l;
import v.c0;
import y0.n0;

/* loaded from: classes.dex */
public final class B extends kotlin.jvm.internal.m implements e4.k {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f6376l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ B(int i7, Object obj) {
        super(1);
        this.f6376l = i7;
    }

    @Override // e4.k
    public final Object invoke(Object obj) {
        switch (this.f6376l) {
            case 0:
                c0.e(obj);
                throw null;
            case 1:
                d0.e eVar = (d0.e) obj;
                if (!eVar.f10402k.f10414w) {
                    return n0.f17882l;
                }
                eVar.f11198x = null;
                return n0.f17881k;
            default:
                ((C1967l) obj).getClass();
                return Boolean.TRUE;
        }
    }
}
