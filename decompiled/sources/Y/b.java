package Y;

import O3.C;

/* loaded from: classes.dex */
public final class b extends kotlin.jvm.internal.m implements e4.k {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f9961l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ e4.k f9962m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ e4.k f9963n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(e4.k kVar, e4.k kVar2, int i7) {
        super(1);
        this.f9961l = i7;
        this.f9962m = kVar;
        this.f9963n = kVar2;
    }

    @Override // e4.k
    public final Object invoke(Object obj) {
        int i7;
        switch (this.f9961l) {
            case 0:
                m mVar = (m) obj;
                synchronized (o.f10002b) {
                    i7 = o.f10004d;
                    o.f10004d = i7 + 1;
                }
                return new d(i7, mVar, this.f9962m, this.f9963n);
            case 1:
                this.f9962m.invoke(obj);
                this.f9963n.invoke(obj);
                return C.a;
            default:
                this.f9962m.invoke(obj);
                this.f9963n.invoke(obj);
                return C.a;
        }
    }
}
