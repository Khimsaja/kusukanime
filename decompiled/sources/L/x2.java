package L;

import h0.InterfaceC0999v;

/* loaded from: classes.dex */
public final /* synthetic */ class x2 implements InterfaceC0999v, kotlin.jvm.internal.g {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C0425v1 f5940k;

    public x2(C0425v1 c0425v1) {
        this.f5940k = c0425v1;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof InterfaceC0999v) || !(obj instanceof kotlin.jvm.internal.g)) {
            return false;
        }
        return this.f5940k.equals(((kotlin.jvm.internal.g) obj).getFunctionDelegate());
    }

    @Override // kotlin.jvm.internal.g
    public final O3.e getFunctionDelegate() {
        return this.f5940k;
    }

    public final int hashCode() {
        return this.f5940k.hashCode();
    }
}
