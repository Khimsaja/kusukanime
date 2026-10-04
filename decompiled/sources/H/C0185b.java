package H;

import e4.InterfaceC0821a;
import e5.AbstractC0832b;

/* renamed from: H.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0185b extends kotlin.jvm.internal.m implements InterfaceC0821a {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f2951l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0196m f2952m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0185b(InterfaceC0196m interfaceC0196m, int i7) {
        super(0);
        this.f2951l = i7;
        this.f2952m = interfaceC0196m;
    }

    @Override // e4.InterfaceC0821a
    public final Object invoke() {
        switch (this.f2951l) {
        }
        return Boolean.valueOf(AbstractC0832b.x(this.f2952m.a()));
    }
}
