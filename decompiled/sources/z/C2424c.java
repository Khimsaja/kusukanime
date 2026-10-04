package z;

import f6.C0918p;
import java.util.List;

/* renamed from: z.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2424c extends kotlin.jvm.internal.m implements e4.k {

    /* renamed from: m, reason: collision with root package name */
    public static final C2424c f18444m = new C2424c(1, 0);

    /* renamed from: n, reason: collision with root package name */
    public static final C2424c f18445n = new C2424c(1, 1);

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f18446l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2424c(int i7, int i8) {
        super(i7);
        this.f18446l = i8;
    }

    @Override // e4.k
    public final Object invoke(Object obj) {
        switch (this.f18446l) {
            case 0:
                List list = (List) obj;
                Object obj2 = list.get(0);
                kotlin.jvm.internal.l.d("null cannot be cast to non-null type kotlin.Int", obj2);
                int iIntValue = ((Integer) obj2).intValue();
                Object obj3 = list.get(1);
                kotlin.jvm.internal.l.d("null cannot be cast to non-null type kotlin.Float", obj3);
                return new C2425d(iIntValue, ((Float) obj3).floatValue(), new C0918p(1, list));
            default:
                return O3.C.a;
        }
    }
}
