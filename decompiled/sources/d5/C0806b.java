package d5;

import e4.k;
import kotlin.jvm.internal.l;
import u4.InterfaceC2097c;
import u4.InterfaceC2105k;

/* renamed from: d5.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0806b implements k {

    /* renamed from: l, reason: collision with root package name */
    public static final C0806b f11325l = new C0806b(0);

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f11326k;

    public /* synthetic */ C0806b(int i7) {
        this.f11326k = i7;
    }

    @Override // e4.k
    public final Object invoke(Object obj) {
        switch (this.f11326k) {
            case 0:
                InterfaceC2105k interfaceC2105k = (InterfaceC2105k) obj;
                int i7 = e.a;
                l.f("it", interfaceC2105k);
                return interfaceC2105k.k();
            default:
                InterfaceC2097c interfaceC2097c = (InterfaceC2097c) obj;
                l.c(interfaceC2097c);
                return e.l(interfaceC2097c);
        }
    }
}
