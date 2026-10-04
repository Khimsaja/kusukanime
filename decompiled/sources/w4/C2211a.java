package w4;

import P3.y;
import io.ktor.http.ContentDisposition;
import java.util.Collection;
import kotlin.jvm.internal.l;
import l5.C1466s;
import u4.InterfaceC2099e;

/* renamed from: w4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2211a implements InterfaceC2212b, InterfaceC2214d {

    /* renamed from: b, reason: collision with root package name */
    public static final C2211a f17092b = new C2211a(0);

    /* renamed from: c, reason: collision with root package name */
    public static final C2211a f17093c = new C2211a(1);

    /* renamed from: d, reason: collision with root package name */
    public static final C2211a f17094d = new C2211a(2);
    public final /* synthetic */ int a;

    public /* synthetic */ C2211a(int i7) {
        this.a = i7;
    }

    @Override // w4.InterfaceC2214d
    public boolean a(InterfaceC2099e interfaceC2099e, C1466s c1466s) {
        switch (this.a) {
            case 1:
                l.f("classDescriptor", interfaceC2099e);
                return true;
            default:
                l.f("classDescriptor", interfaceC2099e);
                return !c1466s.getAnnotations().d(AbstractC2215e.a);
        }
    }

    @Override // w4.InterfaceC2212b
    public Collection b(W4.e eVar, InterfaceC2099e interfaceC2099e) {
        l.f(ContentDisposition.Parameters.Name, eVar);
        l.f("classDescriptor", interfaceC2099e);
        return y.f7779k;
    }

    @Override // w4.InterfaceC2212b
    public Collection c(InterfaceC2099e interfaceC2099e) {
        l.f("classDescriptor", interfaceC2099e);
        return y.f7779k;
    }

    @Override // w4.InterfaceC2212b
    public Collection d(InterfaceC2099e interfaceC2099e) {
        l.f("classDescriptor", interfaceC2099e);
        return y.f7779k;
    }

    @Override // w4.InterfaceC2212b
    public Collection e(InterfaceC2099e interfaceC2099e) {
        l.f("classDescriptor", interfaceC2099e);
        return y.f7779k;
    }
}
