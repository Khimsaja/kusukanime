package E0;

import O3.C;
import R4.U;
import j5.C1344D;
import kotlin.jvm.internal.C1401a;

/* loaded from: classes.dex */
public final /* synthetic */ class k extends C1401a implements e4.k {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f1826k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(int i7, Object obj, Class cls, String str, String str2, int i8, int i9) {
        super(i7, i8, cls, obj, str, str2);
        this.f1826k = i9;
    }

    @Override // e4.k
    public final Object invoke(Object obj) {
        switch (this.f1826k) {
            case 0:
                ((Q.d) this.receiver).b((m) obj);
                return C.a;
            default:
                U u5 = (U) obj;
                kotlin.jvm.internal.l.f("p0", u5);
                return ((C1344D) this.receiver).d(u5, true);
        }
    }
}
