package p4;

import java.lang.reflect.Field;

/* renamed from: p4.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1810p extends AbstractC1811q {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f14389f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1810p(Field field, boolean z7, boolean z8, int i7) {
        super(field, z7, z8);
        this.f14389f = i7;
    }

    @Override // p4.AbstractC1811q, p4.x
    public void d(Object[] objArr) {
        switch (this.f14389f) {
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
