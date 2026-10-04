package w;

import O3.C;
import java.util.List;

/* loaded from: classes.dex */
public final class k extends kotlin.jvm.internal.m implements e4.k {

    /* renamed from: m, reason: collision with root package name */
    public static final k f16735m = new k(1, 0);

    /* renamed from: n, reason: collision with root package name */
    public static final k f16736n = new k(1, 1);

    /* renamed from: o, reason: collision with root package name */
    public static final k f16737o = new k(1, 2);

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f16738l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(int i7, int i8) {
        super(i7);
        this.f16738l = i8;
    }

    @Override // e4.k
    public final Object invoke(Object obj) {
        switch (this.f16738l) {
            case 0:
                return C.a;
            case 1:
                ((Number) obj).intValue();
                return null;
            case 2:
                List list = (List) obj;
                return new u(((Number) list.get(0)).intValue(), ((Number) list.get(1)).intValue());
            default:
                ((Number) obj).intValue();
                return null;
        }
    }
}
