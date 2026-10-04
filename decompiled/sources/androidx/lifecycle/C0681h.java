package androidx.lifecycle;

import io.ktor.util.GzipHeaderFlags;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.List;

/* renamed from: androidx.lifecycle.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0681h implements InterfaceC0692t {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f10733k = 1;

    /* renamed from: l, reason: collision with root package name */
    public final Object f10734l;

    /* renamed from: m, reason: collision with root package name */
    public final Object f10735m;

    public C0681h(InterfaceC0679f interfaceC0679f, InterfaceC0692t interfaceC0692t) {
        kotlin.jvm.internal.l.f("defaultLifecycleObserver", interfaceC0679f);
        this.f10734l = interfaceC0679f;
        this.f10735m = interfaceC0692t;
    }

    @Override // androidx.lifecycle.InterfaceC0692t
    public final void b(InterfaceC0694v interfaceC0694v, EnumC0688o enumC0688o) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        switch (this.f10733k) {
            case 0:
                int i7 = AbstractC0680g.a[enumC0688o.ordinal()];
                InterfaceC0679f interfaceC0679f = (InterfaceC0679f) this.f10734l;
                switch (i7) {
                    case 1:
                        interfaceC0679f.onCreate(interfaceC0694v);
                        break;
                    case 2:
                        interfaceC0679f.onStart(interfaceC0694v);
                        break;
                    case 3:
                        interfaceC0679f.onResume(interfaceC0694v);
                        break;
                    case GzipHeaderFlags.EXTRA /* 4 */:
                        interfaceC0679f.onPause(interfaceC0694v);
                        break;
                    case 5:
                        interfaceC0679f.onStop(interfaceC0694v);
                        break;
                    case 6:
                        interfaceC0679f.onDestroy(interfaceC0694v);
                        break;
                    case 7:
                        throw new IllegalArgumentException("ON_ANY must not been send by anybody");
                    default:
                        throw new D6.r();
                }
                InterfaceC0692t interfaceC0692t = (InterfaceC0692t) this.f10735m;
                if (interfaceC0692t != null) {
                    interfaceC0692t.b(interfaceC0694v, enumC0688o);
                    return;
                }
                return;
            case 1:
                if (enumC0688o == EnumC0688o.ON_START) {
                    ((AbstractC0690q) this.f10734l).c(this);
                    ((F.w) this.f10735m).N();
                    return;
                }
                return;
            default:
                HashMap map = ((C0675b) this.f10735m).a;
                List list = (List) map.get(enumC0688o);
                InterfaceC0693u interfaceC0693u = (InterfaceC0693u) this.f10734l;
                C0675b.a(list, interfaceC0694v, enumC0688o, interfaceC0693u);
                C0675b.a((List) map.get(EnumC0688o.ON_ANY), interfaceC0694v, enumC0688o, interfaceC0693u);
                return;
        }
    }

    public C0681h(InterfaceC0693u interfaceC0693u) {
        this.f10734l = interfaceC0693u;
        C0677d c0677d = C0677d.f10729c;
        Class<?> cls = interfaceC0693u.getClass();
        C0675b c0675b = (C0675b) c0677d.a.get(cls);
        this.f10735m = c0675b == null ? c0677d.a(cls, null) : c0675b;
    }

    public C0681h(F.w wVar, AbstractC0690q abstractC0690q) {
        this.f10734l = abstractC0690q;
        this.f10735m = wVar;
    }
}
