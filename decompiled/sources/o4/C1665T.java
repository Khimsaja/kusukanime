package o4;

import e4.InterfaceC0821a;
import f6.AbstractC0905c;

/* renamed from: o4.T, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1665T implements InterfaceC0821a {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f13655k;

    /* renamed from: l, reason: collision with root package name */
    public final X f13656l;

    public /* synthetic */ C1665T(X x7, int i7) {
        this.f13655k = i7;
        this.f13656l = x7;
    }

    @Override // e4.InterfaceC0821a
    public final Object invoke() {
        switch (this.f13655k) {
            case 0:
                return new W(this.f13656l);
            default:
                return AbstractC0905c.h(this.f13656l.f13668l);
        }
    }
}
