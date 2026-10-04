package t3;

import H5.A;
import O.Z;
import O3.C;
import P3.r;
import java.util.List;

/* loaded from: classes.dex */
public final class i extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ String f16000k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ p f16001l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Z f16002m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(String str, p pVar, Z z7, S3.c cVar) {
        super(2, cVar);
        this.f16000k = str;
        this.f16001l = pVar;
        this.f16002m = z7;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        return new i(this.f16000k, this.f16001l, this.f16002m, cVar);
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        i iVar = (i) create((A) obj, (S3.c) obj2);
        C c2 = C.a;
        iVar.invokeSuspend(c2);
        return c2;
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        r.Y(obj);
        String str = this.f16000k;
        if (str != null && !((List) this.f16002m.getValue()).isEmpty()) {
            p pVar = this.f16001l;
            if (!kotlin.jvm.internal.l.a(pVar.f16033m, str)) {
                pVar.f(str);
            }
        }
        return C.a;
    }
}
