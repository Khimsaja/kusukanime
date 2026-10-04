package z0;

import f0.AbstractC0851d;
import f0.C0849b;
import f0.C0866s;

/* renamed from: z0.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2462p extends kotlin.jvm.internal.m implements e4.k {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f18823l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0849b f18824m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2462p(C0849b c0849b, int i7) {
        super(1);
        this.f18823l = i7;
        this.f18824m = c0849b;
    }

    @Override // e4.k
    public final Object invoke(Object obj) {
        switch (this.f18823l) {
            case 0:
                Boolean boolB = AbstractC0851d.B((C0866s) obj, this.f18824m.a);
                return Boolean.valueOf(boolB != null ? boolB.booleanValue() : true);
            default:
                Boolean boolB2 = AbstractC0851d.B((C0866s) obj, this.f18824m.a);
                return Boolean.valueOf(boolB2 != null ? boolB2.booleanValue() : true);
        }
    }
}
