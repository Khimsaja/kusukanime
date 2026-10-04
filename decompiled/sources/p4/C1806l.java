package p4;

import java.lang.reflect.Field;

/* renamed from: p4.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1806l extends AbstractC1807m {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f14387e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1806l(Field field, boolean z7, int i7) {
        super(field, z7);
        this.f14387e = i7;
    }

    @Override // p4.x
    public void d(Object[] objArr) {
        switch (this.f14387e) {
            case 1:
                kotlin.jvm.internal.l.f("args", objArr);
                super.d(objArr);
                e(P3.m.i0(objArr));
                break;
            default:
                super.d(objArr);
                break;
        }
    }
}
