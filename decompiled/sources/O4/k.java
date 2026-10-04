package O4;

import O3.C;
import io.ktor.util.GzipHeaderFlags;

/* loaded from: classes.dex */
public final class k implements e4.k {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f7569k;

    /* renamed from: l, reason: collision with root package name */
    public final String f7570l;

    /* renamed from: m, reason: collision with root package name */
    public final String f7571m;

    public /* synthetic */ k(String str, String str2, int i7) {
        this.f7569k = i7;
        this.f7570l = str;
        this.f7571m = str2;
    }

    @Override // e4.k
    public final Object invoke(Object obj) {
        p pVar = (p) obj;
        switch (this.f7569k) {
            case 0:
                kotlin.jvm.internal.l.f("$this$function", pVar);
                e eVar = m.f7574b;
                String str = this.f7570l;
                pVar.a(str, eVar);
                e eVar2 = m.a;
                pVar.a(this.f7571m, eVar, eVar, eVar2, eVar2);
                pVar.c(str, eVar2);
                break;
            case 1:
                kotlin.jvm.internal.l.f("$this$function", pVar);
                e eVar3 = m.f7574b;
                String str2 = this.f7570l;
                pVar.a(str2, eVar3);
                pVar.a(this.f7571m, eVar3, eVar3, eVar3);
                pVar.c(str2, eVar3);
                break;
            case 2:
                kotlin.jvm.internal.l.f("$this$function", pVar);
                e eVar4 = m.f7574b;
                String str3 = this.f7570l;
                pVar.a(str3, eVar4);
                e eVar5 = m.f7575c;
                e eVar6 = m.a;
                pVar.a(this.f7571m, eVar4, eVar4, eVar5, eVar6);
                pVar.c(str3, eVar6);
                break;
            case 3:
                kotlin.jvm.internal.l.f("$this$function", pVar);
                e eVar7 = m.f7574b;
                String str4 = this.f7570l;
                pVar.a(str4, eVar7);
                e eVar8 = m.f7575c;
                pVar.a(str4, eVar8);
                e eVar9 = m.a;
                pVar.a(this.f7571m, eVar7, eVar8, eVar8, eVar9);
                pVar.c(str4, eVar9);
                break;
            case GzipHeaderFlags.EXTRA /* 4 */:
                kotlin.jvm.internal.l.f("$this$function", pVar);
                e eVar10 = m.f7575c;
                pVar.a(this.f7570l, eVar10);
                pVar.c(this.f7571m, m.f7574b, eVar10);
                break;
            default:
                kotlin.jvm.internal.l.f("$this$function", pVar);
                pVar.a(this.f7570l, m.a);
                pVar.c(this.f7571m, m.f7574b, m.f7575c);
                break;
        }
        return C.a;
    }
}
