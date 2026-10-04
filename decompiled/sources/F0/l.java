package F0;

import O3.C;
import io.ktor.util.GzipHeaderFlags;
import l4.InterfaceC1443v;

/* loaded from: classes.dex */
public final class l extends kotlin.jvm.internal.m implements e4.k {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f2099l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f2100m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(String str, int i7) {
        super(1);
        this.f2099l = i7;
        this.f2100m = str;
    }

    @Override // e4.k
    public final Object invoke(Object obj) {
        C c2 = C.a;
        String str = this.f2100m;
        switch (this.f2099l) {
            case 0:
                s.d((i) obj, str);
                break;
            case 1:
                InterfaceC1443v[] interfaceC1443vArr = s.a;
                t tVar = q.f2131d;
                InterfaceC1443v interfaceC1443v = s.a[2];
                tVar.a((i) obj, str);
                break;
            case 2:
                s.d((i) obj, str);
                break;
            case 3:
                i iVar = (i) obj;
                s.d(iVar, str);
                s.e(iVar, 5);
                break;
            case GzipHeaderFlags.EXTRA /* 4 */:
                i iVar2 = (i) obj;
                InterfaceC1443v[] interfaceC1443vArr2 = s.a;
                t tVar2 = q.f2131d;
                InterfaceC1443v[] interfaceC1443vArr3 = s.a;
                InterfaceC1443v interfaceC1443v2 = interfaceC1443vArr3[2];
                tVar2.a(iVar2, str);
                t tVar3 = q.f2141n;
                InterfaceC1443v interfaceC1443v3 = interfaceC1443vArr3[9];
                tVar3.a(iVar2, Float.valueOf(0.0f));
                break;
            case 5:
                InterfaceC1443v[] interfaceC1443vArr4 = s.a;
                ((i) obj).j(q.f2125D, str);
                break;
            default:
                i iVar3 = (i) obj;
                s.d(iVar3, str);
                s.e(iVar3, 5);
                break;
        }
        return c2;
    }
}
