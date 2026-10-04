package g5;

import java.util.ArrayList;
import u4.InterfaceC2097c;

/* loaded from: classes.dex */
public final class g extends Z4.l {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f11744c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h f11745d;

    public g(ArrayList arrayList, h hVar) {
        this.f11744c = arrayList;
        this.f11745d = hVar;
    }

    @Override // Z4.l
    public final void b(InterfaceC2097c interfaceC2097c) {
        kotlin.jvm.internal.l.f("fakeOverride", interfaceC2097c);
        Z4.k.r(interfaceC2097c, null);
        this.f11744c.add(interfaceC2097c);
    }

    @Override // Z4.l
    public final void d(InterfaceC2097c interfaceC2097c, InterfaceC2097c interfaceC2097c2) {
        kotlin.jvm.internal.l.f("fromCurrent", interfaceC2097c2);
        throw new IllegalStateException(("Conflict in scope of " + this.f11745d.f11747b + ": " + interfaceC2097c + " vs " + interfaceC2097c2).toString());
    }
}
