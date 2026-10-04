package w;

import y.InterfaceC2333n;

/* renamed from: w.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2163d implements InterfaceC2333n {
    public final kotlin.jvm.internal.m a;

    /* renamed from: b, reason: collision with root package name */
    public final e4.k f16693b;

    /* renamed from: c, reason: collision with root package name */
    public final W.a f16694c;

    /* JADX WARN: Multi-variable type inference failed */
    public C2163d(e4.k kVar, e4.k kVar2, W.a aVar) {
        this.a = (kotlin.jvm.internal.m) kVar;
        this.f16693b = kVar2;
        this.f16694c = aVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [e4.k, kotlin.jvm.internal.m] */
    @Override // y.InterfaceC2333n
    public final e4.k getKey() {
        return this.a;
    }

    @Override // y.InterfaceC2333n
    public final e4.k getType() {
        return this.f16693b;
    }
}
