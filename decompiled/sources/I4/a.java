package I4;

import Z4.k;
import Z4.l;
import j5.InterfaceC1358m;
import java.util.Collection;
import java.util.LinkedHashSet;
import u4.InterfaceC2097c;

/* loaded from: classes.dex */
public final class a extends l {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1358m f4046c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ LinkedHashSet f4047d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f4048e;

    public a(InterfaceC1358m interfaceC1358m, LinkedHashSet linkedHashSet, boolean z7) {
        this.f4046c = interfaceC1358m;
        this.f4047d = linkedHashSet;
        this.f4048e = z7;
    }

    public static /* synthetic */ void a(int i7) {
        Object[] objArr = new Object[3];
        if (i7 == 1) {
            objArr[0] = "fromSuper";
        } else if (i7 == 2) {
            objArr[0] = "fromCurrent";
        } else if (i7 == 3) {
            objArr[0] = "member";
        } else if (i7 != 4) {
            objArr[0] = "fakeOverride";
        } else {
            objArr[0] = "overridden";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils$1";
        if (i7 == 1 || i7 == 2) {
            objArr[2] = "conflict";
        } else if (i7 == 3 || i7 == 4) {
            objArr[2] = "setOverriddenDescriptors";
        } else {
            objArr[2] = "addFakeOverride";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // Z4.l
    public final void b(InterfaceC2097c interfaceC2097c) {
        if (interfaceC2097c == null) {
            a(0);
            throw null;
        }
        k.r(interfaceC2097c, new A4.j(4, this));
        this.f4047d.add(interfaceC2097c);
    }

    @Override // Z4.l
    public final void d(InterfaceC2097c interfaceC2097c, InterfaceC2097c interfaceC2097c2) {
        if (interfaceC2097c2 != null) {
            return;
        }
        a(2);
        throw null;
    }

    @Override // Z4.l
    public final void p(InterfaceC2097c interfaceC2097c, Collection collection) {
        if (interfaceC2097c == null) {
            a(3);
            throw null;
        }
        if (!this.f4048e || interfaceC2097c.c() == 2) {
            interfaceC2097c.W(collection);
        }
    }
}
