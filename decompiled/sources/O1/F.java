package O1;

import B1.InterfaceC0021h;
import java.io.IOException;

/* loaded from: classes.dex */
public final /* synthetic */ class F implements InterfaceC0021h {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ K1.e f7264k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C0544s f7265l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0549x f7266m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ IOException f7267n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f7268o;

    public /* synthetic */ F(K1.e eVar, C0544s c0544s, C0549x c0549x, IOException iOException, boolean z7) {
        this.f7264k = eVar;
        this.f7265l = c0544s;
        this.f7266m = c0549x;
        this.f7267n = iOException;
        this.f7268o = z7;
    }

    @Override // B1.InterfaceC0021h
    public final void c(Object obj) {
        H h7 = (H) obj;
        K1.e eVar = this.f7264k;
        h7.c(eVar.a, eVar.f4459b, this.f7265l, this.f7266m, this.f7267n, this.f7268o);
    }
}
