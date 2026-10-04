package W0;

import B1.w;
import O3.C;

/* loaded from: classes.dex */
public final class a extends kotlin.jvm.internal.m implements e4.k {

    /* renamed from: m, reason: collision with root package name */
    public static final a f9514m = new a(1, 0);

    /* renamed from: n, reason: collision with root package name */
    public static final a f9515n = new a(1, 1);

    /* renamed from: o, reason: collision with root package name */
    public static final a f9516o = new a(1, 2);

    /* renamed from: p, reason: collision with root package name */
    public static final a f9517p = new a(1, 3);

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f9518l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i7, int i8) {
        super(i7);
        this.f9518l = i8;
    }

    @Override // e4.k
    public final Object invoke(Object obj) {
        switch (this.f9518l) {
            case 0:
                i iVar = (i) obj;
                iVar.getHandler().post(new w(14, iVar.f9557x));
                break;
            case 1:
                break;
            case 2:
                break;
            default:
                break;
        }
        return C.a;
    }
}
