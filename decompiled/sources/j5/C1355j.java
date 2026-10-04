package j5;

import R4.U;
import java.util.ArrayList;
import n5.AbstractC1586x;
import u4.EnumC2117x;
import u4.InterfaceC2097c;
import u4.InterfaceC2099e;

/* renamed from: j5.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1355j implements InterfaceC1357l, InterfaceC1359n, InterfaceC1358m {

    /* renamed from: l, reason: collision with root package name */
    public static final C1355j f12433l = new C1355j(0);

    /* renamed from: m, reason: collision with root package name */
    public static final C1355j f12434m = new C1355j(1);

    /* renamed from: n, reason: collision with root package name */
    public static final C1355j f12435n = new C1355j(2);

    /* renamed from: o, reason: collision with root package name */
    public static final C1355j f12436o = new C1355j(3);

    /* renamed from: p, reason: collision with root package name */
    public static final C1355j f12437p = new C1355j(4);

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f12438k;

    public /* synthetic */ C1355j(int i7) {
        this.f12438k = i7;
    }

    public static /* synthetic */ void e(int i7) {
        Object[] objArr = new Object[3];
        if (i7 != 1) {
            objArr[0] = "descriptor";
        } else {
            objArr[0] = "unresolvedSuperClasses";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/serialization/deserialization/ErrorReporter$1";
        if (i7 != 2) {
            objArr[2] = "reportIncompleteHierarchy";
        } else {
            objArr[2] = "reportCannotInferVisibility";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public static EnumC2117x f(R4.D d4) {
        int i7 = d4 == null ? -1 : x.a[d4.ordinal()];
        return i7 != 1 ? i7 != 2 ? i7 != 3 ? i7 != 4 ? EnumC2117x.f16342l : EnumC2117x.f16343m : EnumC2117x.f16345o : EnumC2117x.f16344n : EnumC2117x.f16342l;
    }

    @Override // j5.InterfaceC1358m
    public void a(InterfaceC2099e interfaceC2099e, ArrayList arrayList) {
        if (interfaceC2099e != null) {
            return;
        }
        e(0);
        throw null;
    }

    @Override // j5.InterfaceC1359n
    public AbstractC1586x b(U u5, String str, n5.B b4, n5.B b7) {
        kotlin.jvm.internal.l.f("proto", u5);
        kotlin.jvm.internal.l.f("flexibleId", str);
        kotlin.jvm.internal.l.f("lowerBound", b4);
        kotlin.jvm.internal.l.f("upperBound", b7);
        throw new IllegalArgumentException("This method should not be used.");
    }

    @Override // j5.InterfaceC1358m
    public void c(InterfaceC2097c interfaceC2097c) {
        if (interfaceC2097c != null) {
            return;
        }
        e(2);
        throw null;
    }

    @Override // j5.InterfaceC1357l
    public Boolean d() {
        switch (this.f12438k) {
            case 1:
                return null;
            default:
                return Boolean.TRUE;
        }
    }
}
