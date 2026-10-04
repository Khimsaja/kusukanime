package O;

import p.C1759k;
import p.C1762n;

/* loaded from: classes.dex */
public final class V extends kotlin.jvm.internal.m implements e4.k {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f7051l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.m f7052m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public V(int i7, e4.k kVar) {
        super(1);
        this.f7051l = i7;
        switch (i7) {
            case 1:
                this.f7052m = (kotlin.jvm.internal.m) kVar;
                super(1);
                break;
            case 2:
            default:
                this.f7052m = (kotlin.jvm.internal.m) kVar;
                break;
            case 3:
                this.f7052m = (kotlin.jvm.internal.m) kVar;
                super(1);
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [e4.k, kotlin.jvm.internal.m] */
    /* JADX WARN: Type inference failed for: r0v4, types: [e4.k, kotlin.jvm.internal.m] */
    /* JADX WARN: Type inference failed for: r0v9, types: [e4.k, kotlin.jvm.internal.m] */
    /* JADX WARN: Type inference failed for: r1v3, types: [e4.n, kotlin.jvm.internal.m] */
    @Override // e4.k
    public final Object invoke(Object obj) {
        switch (this.f7051l) {
            case 0:
                return this.f7052m.invoke(Long.valueOf(((Number) obj).longValue() / 1000000));
            case 1:
                Y.h hVar = (Y.h) this.f7052m.invoke((Y.m) obj);
                synchronized (Y.o.f10002b) {
                    Y.o.f10003c = Y.o.f10003c.o(hVar.d());
                }
                return hVar;
            case 2:
                C1759k c1759k = (C1759k) obj;
                Object value = c1759k.f14030e.getValue();
                p.B0 b02 = p.C0.a;
                this.f7052m.invoke(value, Float.valueOf(((C1762n) c1759k.f14031f).a));
                return O3.C.a;
            default:
                return this.f7052m.invoke(Long.valueOf(((Number) obj).longValue()));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public V(e4.n nVar) {
        super(1);
        this.f7051l = 2;
        p.B0 b02 = p.C0.a;
        this.f7052m = (kotlin.jvm.internal.m) nVar;
    }
}
