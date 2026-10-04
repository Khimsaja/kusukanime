package T2;

import O3.C;

/* loaded from: classes.dex */
public final class a extends kotlin.jvm.internal.m implements e4.k {

    /* renamed from: m, reason: collision with root package name */
    public static final a f8994m = new a(1, 0);

    /* renamed from: n, reason: collision with root package name */
    public static final a f8995n = new a(1, 1);

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f8996l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i7, int i8) {
        super(i7);
        this.f8996l = i8;
    }

    @Override // e4.k
    public final Object invoke(Object obj) {
        switch (this.f8996l) {
            case 0:
                return C.a;
            default:
                return (g) obj;
        }
    }
}
