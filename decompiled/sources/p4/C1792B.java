package p4;

import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.List;

/* renamed from: p4.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1792B implements InterfaceC1801g {
    public static final C1792B a = new C1792B();

    @Override // p4.InterfaceC1801g
    public final List a() {
        return P3.y.f7779k;
    }

    @Override // p4.InterfaceC1801g
    public final /* bridge */ /* synthetic */ Member b() {
        return null;
    }

    @Override // p4.InterfaceC1801g
    public final /* bridge */ boolean c() {
        return false;
    }

    @Override // p4.InterfaceC1801g
    public final Object call(Object[] objArr) {
        kotlin.jvm.internal.l.f("args", objArr);
        throw new UnsupportedOperationException("call/callBy are not supported for this declaration.");
    }

    @Override // p4.InterfaceC1801g
    public final Type getReturnType() {
        Class cls = Void.TYPE;
        kotlin.jvm.internal.l.e("TYPE", cls);
        return cls;
    }
}
