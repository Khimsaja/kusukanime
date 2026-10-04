package l5;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import u4.C2109o;
import u4.InterfaceC2097c;
import x4.AbstractC2294u;

/* renamed from: l5.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1454g extends Z4.l {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f12773c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AbstractCollection f12774d;

    public /* synthetic */ C1454g(AbstractCollection abstractCollection, int i7) {
        this.f12773c = i7;
        this.f12774d = abstractCollection;
    }

    public static /* synthetic */ void a(int i7) {
        Object[] objArr = new Object[3];
        if (i7 == 1) {
            objArr[0] = "fromSuper";
        } else if (i7 != 2) {
            objArr[0] = "fakeOverride";
        } else {
            objArr[0] = "fromCurrent";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor$EnumEntryScope$4";
        if (i7 == 1 || i7 == 2) {
            objArr[2] = "conflict";
        } else {
            objArr[2] = "addFakeOverride";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // Z4.l
    public final void b(InterfaceC2097c interfaceC2097c) {
        switch (this.f12773c) {
            case 0:
                kotlin.jvm.internal.l.f("fakeOverride", interfaceC2097c);
                Z4.k.r(interfaceC2097c, null);
                ((ArrayList) this.f12774d).add(interfaceC2097c);
                return;
            default:
                if (interfaceC2097c == null) {
                    a(0);
                    throw null;
                }
                Z4.k.r(interfaceC2097c, null);
                ((LinkedHashSet) this.f12774d).add(interfaceC2097c);
                return;
        }
    }

    @Override // Z4.l
    public final void d(InterfaceC2097c interfaceC2097c, InterfaceC2097c interfaceC2097c2) {
        switch (this.f12773c) {
            case 0:
                kotlin.jvm.internal.l.f("fromCurrent", interfaceC2097c2);
                if (interfaceC2097c2 instanceof AbstractC2294u) {
                    ((AbstractC2294u) interfaceC2097c2).U0(C2109o.a, interfaceC2097c);
                    return;
                }
                return;
            default:
                if (interfaceC2097c2 != null) {
                    return;
                }
                a(2);
                throw null;
        }
    }
}
