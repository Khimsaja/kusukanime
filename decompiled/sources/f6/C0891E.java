package f6;

import w6.InterfaceC2225j;

/* renamed from: f6.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0891E extends AbstractC0893G {
    public final /* synthetic */ C0925w a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f11480b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ byte[] f11481c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f11482d;

    public C0891E(C0925w c0925w, byte[] bArr, int i7, int i8) {
        this.a = c0925w;
        this.f11480b = i7;
        this.f11481c = bArr;
        this.f11482d = i8;
    }

    @Override // f6.AbstractC0893G
    public final long contentLength() {
        return this.f11480b;
    }

    @Override // f6.AbstractC0893G
    public final C0925w contentType() {
        return this.a;
    }

    @Override // f6.AbstractC0893G
    public final void writeTo(InterfaceC2225j interfaceC2225j) {
        interfaceC2225j.write(this.f11481c, this.f11482d, this.f11480b);
    }
}
