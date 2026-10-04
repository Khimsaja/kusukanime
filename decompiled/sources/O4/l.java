package O4;

import O3.C;
import io.ktor.util.GzipHeaderFlags;

/* loaded from: classes.dex */
public final class l implements e4.k {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f7572k;

    /* renamed from: l, reason: collision with root package name */
    public final String f7573l;

    public /* synthetic */ l(String str, int i7) {
        this.f7572k = i7;
        this.f7573l = str;
    }

    @Override // e4.k
    public final Object invoke(Object obj) {
        p pVar = (p) obj;
        switch (this.f7572k) {
            case 0:
                kotlin.jvm.internal.l.f("$this$function", pVar);
                pVar.c(this.f7573l, m.f7574b);
                break;
            case 1:
                kotlin.jvm.internal.l.f("$this$function", pVar);
                e eVar = m.f7574b;
                pVar.c(this.f7573l, eVar, eVar);
                break;
            case 2:
                kotlin.jvm.internal.l.f("$this$function", pVar);
                e eVar2 = m.f7574b;
                pVar.a(this.f7573l, eVar2, eVar2);
                break;
            case 3:
                kotlin.jvm.internal.l.f("$this$function", pVar);
                pVar.a(this.f7573l, m.f7574b);
                break;
            case GzipHeaderFlags.EXTRA /* 4 */:
                kotlin.jvm.internal.l.f("$this$function", pVar);
                pVar.a(this.f7573l, m.f7574b);
                break;
            case 5:
                kotlin.jvm.internal.l.f("$this$function", pVar);
                pVar.c(this.f7573l, m.f7574b);
                break;
            default:
                kotlin.jvm.internal.l.f("$this$function", pVar);
                pVar.c(this.f7573l, m.f7574b);
                break;
        }
        return C.a;
    }
}
