package O;

import e4.InterfaceC0821a;

/* renamed from: O.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0525y extends AbstractC0505m0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7244b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final Object f7245c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0525y(InterfaceC0821a interfaceC0821a) {
        super(interfaceC0821a);
        T t7 = T.f7049p;
        this.f7245c = t7;
    }

    @Override // O.AbstractC0505m0
    public final C0507n0 a(Object obj) {
        switch (this.f7244b) {
            case 0:
                return new C0507n0(this, obj, obj == null, null, true);
            default:
                return new C0507n0(this, obj, obj == null, (I0) this.f7245c, true);
        }
    }

    @Override // O.AbstractC0505m0
    public U0 b() {
        switch (this.f7244b) {
            case 0:
                return (C0526z) this.f7245c;
            default:
                return super.b();
        }
    }

    public C0525y() {
        super(C0480a.f7054n);
        this.f7245c = new C0526z();
    }
}
