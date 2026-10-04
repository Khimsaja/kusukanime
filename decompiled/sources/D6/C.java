package D6;

import f6.AbstractC0897K;
import f6.C0925w;
import w6.InterfaceC2226k;

/* loaded from: classes.dex */
public final class C extends AbstractC0897K {

    /* renamed from: k, reason: collision with root package name */
    public final C0925w f1642k;

    /* renamed from: l, reason: collision with root package name */
    public final long f1643l;

    public C(C0925w c0925w, long j7) {
        this.f1642k = c0925w;
        this.f1643l = j7;
    }

    @Override // f6.AbstractC0897K
    public final long b() {
        return this.f1643l;
    }

    @Override // f6.AbstractC0897K
    public final C0925w e() {
        return this.f1642k;
    }

    @Override // f6.AbstractC0897K
    public final InterfaceC2226k g() {
        throw new IllegalStateException("Cannot read raw response body of a converted body.");
    }
}
