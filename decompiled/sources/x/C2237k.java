package x;

import O3.C;
import java.util.List;

/* renamed from: x.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2237k extends kotlin.jvm.internal.m implements e4.k {

    /* renamed from: m, reason: collision with root package name */
    public static final C2237k f17218m = new C2237k(1, 0);

    /* renamed from: n, reason: collision with root package name */
    public static final C2237k f17219n = new C2237k(1, 1);

    /* renamed from: o, reason: collision with root package name */
    public static final C2237k f17220o = new C2237k(1, 2);

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f17221l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2237k(int i7, int i8) {
        super(i7);
        this.f17221l = i8;
    }

    @Override // e4.k
    public final Object invoke(Object obj) {
        switch (this.f17221l) {
            case 0:
                return C.a;
            case 1:
                List list = (List) obj;
                return new v(((Number) list.get(0)).intValue(), ((Number) list.get(1)).intValue());
            case 2:
                ((Number) obj).intValue();
                return P3.y.f7779k;
            default:
                ((Number) obj).intValue();
                return null;
        }
    }
}
