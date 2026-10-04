package D6;

import java.lang.reflect.Type;

/* renamed from: D6.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0116j implements InterfaceC0113g {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f1751k;

    /* renamed from: l, reason: collision with root package name */
    public final Type f1752l;

    public /* synthetic */ C0116j(int i7, Type type) {
        this.f1751k = i7;
        this.f1752l = type;
    }

    @Override // D6.InterfaceC0113g
    public final Object e(D d4) {
        switch (this.f1751k) {
            case 0:
                C0117k c0117k = new C0117k(d4);
                d4.m(new C0115i(c0117k, 0));
                return c0117k;
            default:
                C0117k c0117k2 = new C0117k(d4);
                d4.m(new C0115i(c0117k2, 1));
                return c0117k2;
        }
    }

    @Override // D6.InterfaceC0113g
    public final Type j() {
        switch (this.f1751k) {
        }
        return this.f1752l;
    }
}
