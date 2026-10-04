package t;

import O3.C;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;

/* renamed from: t.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2023c extends m implements e4.k {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f15846l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ u f15847m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ m f15848n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C2023c(u uVar, e4.k kVar, int i7) {
        super(1);
        this.f15846l = i7;
        switch (i7) {
            case 1:
                this.f15847m = uVar;
                this.f15848n = (m) kVar;
                super(1);
                break;
            default:
                this.f15847m = uVar;
                this.f15848n = (m) kVar;
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [e4.k, kotlin.jvm.internal.m] */
    /* JADX WARN: Type inference failed for: r0v4, types: [e4.k, kotlin.jvm.internal.m] */
    @Override // e4.k
    public final Object invoke(Object obj) {
        switch (this.f15846l) {
            case 0:
                float fFloatValue = ((Number) obj).floatValue();
                u uVar = this.f15847m;
                float f5 = uVar.f12717k - fFloatValue;
                uVar.f12717k = f5;
                this.f15848n.invoke(Float.valueOf(f5));
                break;
            default:
                float fFloatValue2 = ((Number) obj).floatValue();
                u uVar2 = this.f15847m;
                float f7 = uVar2.f12717k - fFloatValue2;
                uVar2.f12717k = f7;
                this.f15848n.invoke(Float.valueOf(f7));
                break;
        }
        return C.a;
    }
}
