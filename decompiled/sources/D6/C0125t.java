package D6;

import f6.InterfaceC0907e;

/* renamed from: D6.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0125t extends AbstractC0126u {

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC0113g f1761d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f1762e;

    public C0125t(U u5, InterfaceC0907e interfaceC0907e, InterfaceC0120n interfaceC0120n, InterfaceC0113g interfaceC0113g, boolean z7) {
        super(u5, interfaceC0907e, interfaceC0120n);
        this.f1761d = interfaceC0113g;
        this.f1762e = z7;
    }

    @Override // D6.AbstractC0126u
    public final Object a(D d4, Object[] objArr) {
        InterfaceC0111e interfaceC0111e = (InterfaceC0111e) this.f1761d.e(d4);
        S3.c cVar = (S3.c) objArr[objArr.length - 1];
        try {
            if (!this.f1762e) {
                return c0.b(interfaceC0111e, cVar);
            }
            kotlin.jvm.internal.l.d("null cannot be cast to non-null type retrofit2.Call<kotlin.Unit?>", interfaceC0111e);
            return c0.c(interfaceC0111e, cVar);
        } catch (LinkageError e7) {
            throw e7;
        } catch (ThreadDeath e8) {
            throw e8;
        } catch (VirtualMachineError e9) {
            throw e9;
        } catch (Throwable th) {
            c0.r(th, cVar);
            return T3.a.f9048k;
        }
    }
}
