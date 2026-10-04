package M;

import l4.InterfaceC1424c;
import l4.InterfaceC1430i;
import l4.InterfaceC1431j;
import l4.InterfaceC1439r;
import z0.C2471u;

/* loaded from: classes.dex */
public final /* synthetic */ class K extends kotlin.jvm.internal.p implements InterfaceC1431j {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f6221k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ K(int i7, int i8, Class cls, Object obj, String str, String str2) {
        super(obj, cls, str, str2, i7);
        this.f6221k = i8;
    }

    @Override // kotlin.jvm.internal.AbstractC1403c
    public final InterfaceC1424c computeReflected() {
        return kotlin.jvm.internal.y.a.e(this);
    }

    @Override // l4.InterfaceC1440s
    public final Object get() {
        switch (this.f6221k) {
            case 0:
                return ((O.Z) this.receiver).getValue();
            case 1:
                return Boolean.valueOf(((S5.h) this.receiver).f8797l);
            default:
                return ((C2471u) this.receiver).getLayoutDirection();
        }
    }

    @Override // e4.InterfaceC0821a
    public final Object invoke() {
        return get();
    }

    @Override // l4.InterfaceC1443v
    public final InterfaceC1439r getGetter() {
        return ((InterfaceC1431j) getReflected()).getGetter();
    }

    @Override // l4.InterfaceC1434m
    public final InterfaceC1430i getSetter() {
        return ((InterfaceC1431j) getReflected()).getSetter();
    }
}
