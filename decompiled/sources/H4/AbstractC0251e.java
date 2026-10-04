package H4;

import u4.InterfaceC2112s;
import x4.AbstractC2287n;

/* renamed from: H4.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0251e extends G {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f3729l = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public static final InterfaceC2112s a(InterfaceC2112s interfaceC2112s) {
        kotlin.jvm.internal.l.f("functionDescriptor", interfaceC2112s);
        W4.e name = ((AbstractC2287n) interfaceC2112s).getName();
        kotlin.jvm.internal.l.e("getName(...)", name);
        if (b(name)) {
            return (InterfaceC2112s) d5.e.b(interfaceC2112s, C0250d.f3721l);
        }
        return null;
    }

    public static boolean b(W4.e eVar) {
        kotlin.jvm.internal.l.f("<this>", eVar);
        return G.f3704e.contains(eVar);
    }
}
