package F0;

import e4.InterfaceC0821a;

/* loaded from: classes.dex */
public final class g {
    public final kotlin.jvm.internal.m a;

    /* renamed from: b, reason: collision with root package name */
    public final kotlin.jvm.internal.m f2069b;

    /* JADX WARN: Multi-variable type inference failed */
    public g(InterfaceC0821a interfaceC0821a, InterfaceC0821a interfaceC0821a2) {
        this.a = (kotlin.jvm.internal.m) interfaceC0821a;
        this.f2069b = (kotlin.jvm.internal.m) interfaceC0821a2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [e4.a, kotlin.jvm.internal.m] */
    public final InterfaceC0821a a() {
        return this.f2069b;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [e4.a, kotlin.jvm.internal.m] */
    /* JADX WARN: Type inference failed for: r1v6, types: [e4.a, kotlin.jvm.internal.m] */
    public final String toString() {
        return "ScrollAxisRange(value=" + ((Number) this.a.invoke()).floatValue() + ", maxValue=" + ((Number) this.f2069b.invoke()).floatValue() + ", reverseScrolling=false)";
    }
}
