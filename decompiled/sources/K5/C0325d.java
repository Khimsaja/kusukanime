package K5;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: K5.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0325d extends L5.g {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f4805p = AtomicIntegerFieldUpdater.newUpdater(C0325d.class, "consumed$volatile");
    private volatile /* synthetic */ int consumed$volatile;

    /* renamed from: n, reason: collision with root package name */
    public final J5.e f4806n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f4807o;

    public /* synthetic */ C0325d(J5.e eVar, boolean z7) {
        this(eVar, z7, S3.i.f8767k, -3, J5.c.f4299k);
    }

    @Override // L5.g
    public final String c() {
        return "channel=" + this.f4806n;
    }

    @Override // L5.g, K5.InterfaceC0329h
    public final Object collect(InterfaceC0330i interfaceC0330i, S3.c cVar) throws Throwable {
        O3.C c2 = O3.C.a;
        if (this.f6170l == -3) {
            boolean z7 = this.f4807o;
            if (z7 && f4805p.getAndSet(this, 1) == 1) {
                throw new IllegalStateException("ReceiveChannel.consumeAsFlow can be collected just once");
            }
            Object objG = N.g(interfaceC0330i, this.f4806n, z7, cVar);
            if (objG == T3.a.f9048k) {
                return objG;
            }
        } else {
            Object objCollect = super.collect(interfaceC0330i, cVar);
            if (objCollect == T3.a.f9048k) {
                return objCollect;
            }
        }
        return c2;
    }

    @Override // L5.g
    public final Object d(J5.t tVar, S3.c cVar) throws Throwable {
        Object objG = N.g(new L5.w(tVar), this.f4806n, this.f4807o, cVar);
        return objG == T3.a.f9048k ? objG : O3.C.a;
    }

    @Override // L5.g
    public final L5.g e(S3.h hVar, int i7, J5.c cVar) {
        return new C0325d(this.f4806n, this.f4807o, hVar, i7, cVar);
    }

    @Override // L5.g
    public final InterfaceC0329h f() {
        return new C0325d(this.f4806n, this.f4807o);
    }

    @Override // L5.g
    public final J5.u g(H5.A a) {
        if (this.f4807o && f4805p.getAndSet(this, 1) == 1) {
            throw new IllegalStateException("ReceiveChannel.consumeAsFlow can be collected just once");
        }
        return this.f6170l == -3 ? this.f4806n : super.g(a);
    }

    public C0325d(J5.e eVar, boolean z7, S3.h hVar, int i7, J5.c cVar) {
        super(hVar, i7, cVar);
        this.f4806n = eVar;
        this.f4807o = z7;
    }
}
