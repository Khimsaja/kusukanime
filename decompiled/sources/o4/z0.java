package o4;

import e4.InterfaceC0821a;
import java.lang.ref.SoftReference;
import u4.InterfaceC2097c;

/* loaded from: classes.dex */
public final class z0 implements InterfaceC0821a {

    /* renamed from: m, reason: collision with root package name */
    public static final A0 f13795m = new A0();

    /* renamed from: k, reason: collision with root package name */
    public final InterfaceC0821a f13796k;

    /* renamed from: l, reason: collision with root package name */
    public volatile SoftReference f13797l;

    public z0(InterfaceC2097c interfaceC2097c, InterfaceC0821a interfaceC0821a) {
        if (interfaceC0821a == null) {
            throw new IllegalArgumentException("Argument for @NotNull parameter 'initializer' of kotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal.<init> must not be null");
        }
        this.f13797l = null;
        this.f13796k = interfaceC0821a;
        if (interfaceC2097c != null) {
            this.f13797l = new SoftReference(interfaceC2097c);
        }
    }

    @Override // e4.InterfaceC0821a
    public final Object invoke() {
        Object obj;
        SoftReference softReference = this.f13797l;
        Object obj2 = f13795m;
        if (softReference != null && (obj = softReference.get()) != null) {
            if (obj == obj2) {
                return null;
            }
            return obj;
        }
        Object objInvoke = this.f13796k.invoke();
        if (objInvoke != null) {
            obj2 = objInvoke;
        }
        this.f13797l = new SoftReference(obj2);
        return objInvoke;
    }
}
