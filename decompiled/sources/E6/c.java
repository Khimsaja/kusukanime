package E6;

import D6.InterfaceC0120n;
import D6.r;
import G3.j;
import G3.n;
import f6.AbstractC0897K;
import p.I0;
import w6.InterfaceC2226k;
import w6.l;

/* loaded from: classes.dex */
public final class c implements InterfaceC0120n {

    /* renamed from: l, reason: collision with root package name */
    public static final l f1978l;

    /* renamed from: k, reason: collision with root package name */
    public final j f1979k;

    static {
        l lVar = l.f17157n;
        f1978l = I0.r("EFBBBF");
    }

    public c(j jVar) {
        this.f1979k = jVar;
    }

    @Override // D6.InterfaceC0120n
    public final Object a(Object obj) {
        AbstractC0897K abstractC0897K = (AbstractC0897K) obj;
        InterfaceC2226k interfaceC2226kG = abstractC0897K.g();
        try {
            if (interfaceC2226kG.p(0L, f1978l)) {
                interfaceC2226kG.n(r1.f17158k.length);
            }
            n nVar = new n(interfaceC2226kG);
            Object objA = this.f1979k.a(nVar);
            if (nVar.J() != 10) {
                throw new r("JSON document was not fully consumed.");
            }
            abstractC0897K.close();
            return objA;
        } catch (Throwable th) {
            abstractC0897K.close();
            throw th;
        }
    }
}
